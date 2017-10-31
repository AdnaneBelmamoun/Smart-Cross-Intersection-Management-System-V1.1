package projetsystemC;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Fenetre extends JFrame implements ChangeListener{
	public static final long serialVersionUID = 1L;
	public static Fenetre f =null;
	public static int periode;
	//public static JButton ButtonLancement=new JButton("Lancer Simulation");
	public static Container contenant=null;
	public static JPanel  pane = new JPanel();
	public static Vector<String> vectdonnee;
	//public static Cursor curseur=null;
	public static JSlider slider = new JSlider(JSlider.VERTICAL,3000,20000,4000);
	public static JTextArea echo = new JTextArea();
	public static JTextArea textArea = new JTextArea();
    
	public Fenetre(){
		super();
		
		construction();//On initialise notre fenêtre
	}
	
	private void construction(){
		 ImageIcon monIcon= new ImageIcon("iconeprojet.png");
	   	setIconImage(monIcon.getImage());
		setTitle("Simulation du Bloc de gestion des concurrences BGC"); //On donne un titre à l'application
		setSize(970,660); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On interdit le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		slider.setValue(10000);
		periode = slider.getValue();
		//slider.setValue(periode);
	    slider.addChangeListener(this);
			    
        
      //  ButtonLancement.addActionListener(this);
     
	}	
	public void stateChanged(ChangeEvent ce){
		  periode = slider.getValue();
		  System.out.print("------->"+periode);
		  //String str = Integer.toString(value);
		 // label.setText(str);
		  }
	public static Vector<String> executer(String command) {
		
		Vector<String> OutPut =new Vector<String>();
			 try {
	            Runtime runtime = Runtime.getRuntime();
	            Process process = runtime.exec(command);
	            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
	            String line = null;
	            String temp ="";
	            int i =0;
	            while ((line = input.readLine()) != null) {
	            	
	            	if(line.startsWith("Decision finale")){//i==27){
	            //System.out.println((line));//.split(" : ")[1]));//.split(" vert")[0]);
	            	OutPut.add(0, (String)(line.split(" : ")[1]));//.split(" vert")[0];
	            	
	            	System.out.println(OutPut);
	            	echo.setText(line);       	}
	            	
	            	if(i>=20){temp += line+"\n";}
	            //System.out.println("ligne "+i+" = "+line);
	                i=i+1;        }
	            //echo.setText(temp);
	            OutPut.add(1,(String)temp);
	            } catch (IOException ex) {  }
	            return OutPut; }
	
	
	public static void commanderfeux(String cmd,String res){
		String O="", E="", N="", S ="" ;
        if(cmd.contains("feux1")){O ="vert";  E ="rouge" ; 
                                     N="rouge";  S="rouge";}
        
        if(cmd.contains("feux2")){  O ="rouge" ; E ="vert" ; 
                                       N="rouge";    S="rouge";}
       
        if(cmd.contains("feux3")){   O ="rouge" ; E ="rouge" ; 
                                       N="vert";     S="rouge";}

        if(cmd.contains("feux4")){  O ="rouge" ; E ="rouge" ; 
                                      N="rouge";    S="vert";}
        
		
		pane= new FeuxTricolore(O,E,N,S);
		pane.setSize(970, 660);
		FlowLayout fl =null ;
		pane.setLayout(fl);
        
		textArea.setBounds(125, 85, 460, 250);
		textArea.setFont(new Font("Serif", Font.BOLD, 12));
	    textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);
	    textArea.setText(res);
	    textArea.setAutoscrolls(true);
	    textArea.setEditable (false);
	    textArea.setBackground(Color.BLACK);
	    textArea.setForeground(Color.RED);
	   
	   
	   

	    
/*    JScrollPane areaScrollPane = new JScrollPane(textArea);
	    areaScrollPane.setVerticalScrollBarPolicy(
	                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	   // areaScrollPane.setPreferredSize(new Dimension(250, 250)); 
	*/    
       // ButtonLancement.setBounds(730,500,150, 30);
        slider.setBounds(840, 60, 45, 360);
        echo.setBounds(230, 500, 500, 50);
        echo.setEditable (false);
        echo.setBackground(Color.green);
        echo.setLineWrap (true);
        echo.setAutoscrolls(true);
        echo.setFont(new Font("Serif", Font.BOLD, 26));
        echo.setForeground(Color.BLACK);
        
        slider.setMinorTickSpacing(100);
        slider.setMajorTickSpacing(100);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(false);
        slider.setPaintTrack(true);
        slider.setPaintLabels(false);
        slider.setToolTipText("valeur :"+periode);
       
      //pane.add(ButtonLancement);
        pane.add(slider);
        pane.add(echo);
      //  pane.add(areaScrollPane);
        pane.add(textArea);
       
        
        //f.add(ButtonLancement);
        //f.add(slider);
        
		    f.setContentPane(pane);
			f.setVisible(true);
		    
//		Pour attendre 4secondes
		try {
			Thread.sleep(periode);//4000
		} catch (InterruptedException e) {		} 

		// passage a l'orange :
		if(O=="vert"){
		pane= new FeuxTricolore("orange",E,N,S);}
		if(E=="vert"){
			pane= new FeuxTricolore(O,"orange",N,S);}
		if(N=="vert"){
			pane= new FeuxTricolore(O,E,"orange",S);}
		if(S=="vert"){
			pane= new FeuxTricolore(O,E,N,"orange");}
		chargerGUI(res);
		f.setContentPane(pane);
		f.setVisible(true);
		f.repaint();
		try {
			Thread.sleep(periode/3);//4000
		} catch (InterruptedException e) {		} 

	}
	public static Vector<String> Lirefichier(String chemin){
		Vector<String> chaine= new Vector<String>();
		String fichier =chemin;
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				//System.out.println(ligne);
				chaine.add(ligne);
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
return chaine;
	}
public static void lancersimulation(Vector<String> vect){
	
	for(int i=0;i<vect.size();i++){
 		echo.setText((String)vect.get(i)+"\n");
	System.out.print((String)vectdonnee.get(i)+"\n");		
		 String temp ="cmd /c CoeurBGC.exe ".concat((String)vect.get(i));
		 //appel a la methode executer
			Vector<String> resexecu = executer(temp);
			 //System.out.print(temp+"\n");
	        // System.out.print(rescmd+"\n");
	       
	    	   commanderfeux((String)resexecu.elementAt(0),(String)resexecu.elementAt(1));
	       //}
		}

}
public static void execution(String[] args){
	f = new Fenetre();
	vectdonnee = Lirefichier("fichier_Donnee_BGC_projet_SystemC.txt");
	System.out.print(vectdonnee+"\n");
	lancersimulation(vectdonnee);
	f.setVisible(true);
	
	
}
public static void chargerGUI(String res){
	
	pane.setSize(970, 660);
	FlowLayout fl =null ;
	pane.setLayout(fl);
    
	textArea.setBounds(125, 85, 460, 250);
	textArea.setFont(new Font("Serif", Font.BOLD, 12));
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setText(res);
    textArea.setAutoscrolls(true);
    textArea.setEditable (false);
    textArea.setBackground(Color.BLACK);
    textArea.setForeground(Color.RED);
   
   
   

    
/*    JScrollPane areaScrollPane = new JScrollPane(textArea);
    areaScrollPane.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
   // areaScrollPane.setPreferredSize(new Dimension(250, 250)); 
*/    
   // ButtonLancement.setBounds(730,500,150, 30);
    slider.setBounds(840, 60, 45, 360);
    echo.setBounds(230, 500, 500, 50);
    echo.setEditable (false);
    echo.setBackground(Color.green);
    echo.setLineWrap (true);
    echo.setAutoscrolls(true);
    echo.setFont(new Font("Serif", Font.BOLD, 26));
    echo.setForeground(Color.BLACK);
    
    slider.setMinorTickSpacing(100);
    slider.setMajorTickSpacing(100);
    slider.setPaintTicks(true);
    slider.setSnapToTicks(false);
    slider.setPaintTrack(true);
    slider.setPaintLabels(false);
    slider.setToolTipText("valeur :"+periode);
   
  //pane.add(ButtonLancement);
    pane.add(slider);
    pane.add(echo);
  //  pane.add(areaScrollPane);
    pane.add(textArea);
   
	
}
	public static void main(String[] args) throws IOException{
		
		execution(args);
			
		
		}

	

	
}

