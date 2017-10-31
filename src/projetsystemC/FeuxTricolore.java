package projetsystemC;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

	public class FeuxTricolore extends JPanel {
	    static final long serialVersionUID = 1;
	    public String  FeuxOuest;// = "vert";
	    public String  FeuxEst;// = "rouge";
	    public String  FeuxNord;// = "rouge";
	    public String  FeuxSud;// = "rouge";
	    
	   
	    
	    public FeuxTricolore(String Ouest, String Est, String Nord, String Sud) {
	    	 this.FeuxOuest = Ouest;
	    	 this.FeuxEst = Est;
	    	 this.FeuxNord = Nord;
	    	 this.FeuxSud = Sud;
	 	   
	    
	    }     

	 public void dessinerfeux(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
           	// ouest
	    	FO.drawString("Feux1 OUEST", 3, 130);
			FO.drawRect(3, 138, 50, 145);
            // est
			FE.drawString("Feux2 EST", 655, 130);
			FE.drawRect(665, 138, 50, 145);
			//nord
			FN.drawString("Feux3 NORD", 350, 65);
			FN.drawRect(293, 3, 180, 50);
			
			// sud
			FS.drawString("Feux4 SUD", 350, 350);
			FS.drawRect(293, 363, 180, 48);
			
			dessinerfeuxrougeOuest(FO,FE,FN,FS);dessinerfeuxrougeEst(FO,FE,FN,FS);
			dessinerfeuxrougeNord(FO,FE,FN,FS);dessinerfeuxrougeSud(FO,FE,FN,FS);
			
			dessinerfeuxvertOuest(FO,FE,FN,FS);dessinerfeuxvertEst(FO,FE,FN,FS);
			dessinerfeuxvertNord(FO,FE,FN,FS);dessinerfeuxvertSud(FO,FE,FN,FS);
			
			dessinerfeuxorangeOuest(FO,FE,FN,FS);dessinerfeuxorangeEst(FO,FE,FN,FS);
			dessinerfeuxorangeNord(FO,FE,FN,FS);dessinerfeuxorangeSud(FO,FE,FN,FS);
			
					   }   
	    
	    // les 3 feux Ouest
	    public void dessinerfeuxrougeOuest(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
	    	FO.setColor(Color.RED);
	    	FO.drawOval(5, 140, 40, 40);
				   }
	    public void dessinerfeuxorangeOuest(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FO.setColor(Color.ORANGE);	
			FO.drawOval(5, 190, 40, 40);
				   }
		public void dessinerfeuxvertOuest(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FO.setColor(Color.GREEN);	
			FO.drawOval(5, 240, 40, 40);
		   }
	    
		//les 3 feux Est
		public void dessinerfeuxrougeEst(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FE.setColor(Color.RED);	
			FE.drawOval(670, 140, 40, 40);
					   }
	    public void dessinerfeuxorangeEst(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FE.setColor(Color.ORANGE);	
			FE.drawOval(670, 190, 40, 40);
				   }
	    public void dessinerfeuxvertEst(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FE.setColor(Color.GREEN);	
			FE.drawOval(670, 240, 40, 40);
		   }
	    
	    // les 3 feux Nord
	    public void dessinerfeuxrougeNord(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FN.setColor(Color.RED);	
			FN.drawOval(420, 5, 40, 40);
				   }
	    public void dessinerfeuxorangeNord(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FN.setColor(Color.ORANGE);	
			FN.drawOval(360, 5, 40, 40);
						   }
	    public void dessinerfeuxvertNord(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FN.setColor(Color.GREEN);	
			FN.drawOval(300, 5, 40, 40);
		   }
	    
	    // les 3 feux Sud
	    public void dessinerfeuxrougeSud(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FS.setColor(Color.RED);	
			FS.drawOval(420, 370, 40, 40);
				   }
	    public void dessinerfeuxorangeSud(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
				FS.setColor(Color.ORANGE);	
				FS.drawOval(360, 370, 40, 40);
					   }
		public void dessinerfeuxvertSud(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
					FS.setColor(Color.GREEN);	
					FS.drawOval(300, 370, 40, 40);
				   }
			    
	    //ICI je defini les methode de changement de feux:
		
          //  les 3 feux Ouest
	    public void setfeuxrougeOuest(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
	    	FO.setColor(Color.RED);
	    	FO.fillOval(5, 140, 40, 40);
				   }
	    public void setfeuxorangeOuest(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FO.setColor(Color.ORANGE);	
			FO.fillOval(5, 190, 40, 40);
				   }
		public void setfeuxvertOuest(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FO.setColor(Color.GREEN);	
			FO.fillOval(5, 240, 40, 40);
		   }
	    
		//les 3 feux Est
		public void setfeuxrougeEst(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FE.setColor(Color.RED);	
			FE.fillOval(670, 140, 40, 40);
					   }
	    public void setfeuxorangeEst(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FE.setColor(Color.ORANGE);	
			FE.fillOval(670, 190, 40, 40);
				   }
	    public void setfeuxvertEst(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FE.setColor(Color.GREEN);	
			FE.fillOval(670, 240, 40, 40);
		   }
	    
	    // les 3 feux Nord
	    public void setfeuxrougeNord(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FN.setColor(Color.RED);	
			FN.fillOval(420, 5, 40, 40);
				   }
	    public void setfeuxorangeNord(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FN.setColor(Color.ORANGE);	
			FN.fillOval(360, 5, 40, 40);
						   }
	    public void setfeuxvertNord(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FN.setColor(Color.GREEN);	
			FN.fillOval(300, 5, 40, 40);
		   }
	    
	    // les 3 feux Sud
	    public void setfeuxrougeSud(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
			FS.setColor(Color.RED);	
			FS.fillOval(420, 370, 40, 40);
				   }
	    public void setfeuxorangeSud(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
				FS.setColor(Color.ORANGE);	
				FS.fillOval(360, 370, 40, 40);
					   }
		public void setfeuxvertSud(Graphics FO,Graphics FE,Graphics FN,Graphics FS) {
					FS.setColor(Color.GREEN);	
					FS.fillOval(300, 370, 40, 40);
				   }
		
		public void paintComponent(Graphics g) {
			if (FeuxOuest=="orange" && FeuxEst=="rouge" && FeuxNord=="rouge" && FeuxSud=="rouge" ) {
				super.paintComponent(g);
					dessinerfeux(g,g,g,g);
					setfeuxorangeOuest(g,g,g,g); setfeuxrougeEst(g,g,g,g);
					setfeuxrougeNord(g,g,g,g); setfeuxrougeSud(g,g,g,g);
						
						}
		if (FeuxOuest=="vert" && FeuxEst=="rouge" && FeuxNord=="rouge" && FeuxSud=="rouge" ) {
			super.paintComponent(g);
			dessinerfeux(g,g,g,g);
			setfeuxvertOuest(g,g,g,g); setfeuxrougeEst(g,g,g,g);
			setfeuxrougeNord(g,g,g,g); setfeuxrougeSud(g,g,g,g);
		}
		if (FeuxOuest=="rouge"&& FeuxEst=="orange" && FeuxNord=="rouge" && FeuxSud=="rouge") {
			super.paintComponent(g);
			dessinerfeux(g,g,g,g);
			setfeuxrougeOuest(g,g,g,g); setfeuxorangeEst(g,g,g,g);
			setfeuxrougeNord(g,g,g,g); setfeuxrougeSud(g,g,g,g);
			
			
		}
		
		if (FeuxOuest=="rouge"&& FeuxEst=="vert" && FeuxNord=="rouge" && FeuxSud=="rouge") {
			super.paintComponent(g);
		    dessinerfeux(g,g,g,g);
			setfeuxrougeOuest(g,g,g,g); setfeuxvertEst(g,g,g,g);
			setfeuxrougeNord(g,g,g,g); setfeuxrougeSud(g,g,g,g);
		}
        
		
		if (FeuxOuest=="rouge"&& FeuxEst=="rouge" && FeuxNord=="orange" && FeuxSud=="rouge") {
			super.paintComponent(g);
			dessinerfeux(g,g,g,g);
			setfeuxrougeOuest(g,g,g,g); setfeuxrougeEst(g,g,g,g);
			setfeuxorangeNord(g,g,g,g); setfeuxrougeSud(g,g,g,g);
			
			
		}
		if (FeuxOuest=="rouge"&& FeuxEst=="rouge" && FeuxNord=="vert" && FeuxSud=="rouge") {
			super.paintComponent(g);
			dessinerfeux(g,g,g,g);
			setfeuxrougeOuest(g,g,g,g); setfeuxrougeEst(g,g,g,g);
			setfeuxvertNord(g,g,g,g); setfeuxrougeSud(g,g,g,g);
		}
		if (FeuxOuest=="rouge"&& FeuxEst=="rouge" && FeuxNord=="rouge" && FeuxSud=="orange") {
			super.paintComponent(g);
			dessinerfeux(g,g,g,g);
			setfeuxrougeOuest(g,g,g,g); setfeuxrougeEst(g,g,g,g);
			setfeuxrougeNord(g,g,g,g); setfeuxorangeSud(g,g,g,g);
			
		}
		if (FeuxOuest=="rouge"&& FeuxEst=="rouge" && FeuxNord=="rouge" && FeuxSud=="vert") {
			super.paintComponent(g);
			dessinerfeux(g,g,g,g);
			setfeuxrougeOuest(g,g,g,g); setfeuxrougeEst(g,g,g,g);
			setfeuxrougeNord(g,g,g,g); setfeuxvertSud(g,g,g,g);
		}
		
		
	    }
	}

	


