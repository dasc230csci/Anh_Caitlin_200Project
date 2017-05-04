
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 *GUILayout class to represent GUI (Made in NetBeans) 
 *
 * @author Caitlin Harvey & Anh Tran
 * @version May 2017
 */
public class GUILayout extends javax.swing.JFrame implements ActionListener{    
    
	//-------------------------------------------------CREATE VARIABLES-------------------------------------------------------------------------------
    private javax.swing.JButton returnBtn, instructionsBtn, earthBtn, plutoBtn, cybertronBtn, displayCluesBtn, eterniaBtn, forgottenRealmBtn, gallifreyBtn, hyruleBtn,
    							iathillesBtn, kryptonBtn, blackHoleBtn, wormHoleBtn, middleEarthBtn, dagobahBtn;
    private javax.swing.JLabel itemsLbl, resourcesLbl, resourceNUMLbl, gravitybombLbl, lightsaberLbl, peaceofferingLbl, wormholekeyLbl, gravityBombNUMLbl,
    						   lightsaberNUMLbl, peaceOfferingNUMLbl, wormHoleKeyNUMLbl, imageLbl ;
    private javax.swing.JLayeredPane jLayeredPane1;
    private GameLayout theGame;
    private LocationDescription currentPlanet, nextPlanet, previousPlanet;

	
	//-------------------------------------------------CONSTRUCTOR-----------------------------------------------------------------------------------------
    /**
     * Creates new form NewJFrame
     */
    public GUILayout() {
    	 try{
         	this.theGame = new GameLayout("Planet Connection","Planet Description");
         	this.currentPlanet = this.theGame.getDescription("Earth(A)");
         	this.nextPlanet = this.theGame.getDescription("Pluto(B)");
         	this.previousPlanet = this.theGame.getDescription("Earth(A)");
             }
    	 catch(FileNotFoundException e1){
    	 
    	 }
        initComponents();
       
            
        
    }

    //-----------------------------------------------GUI CREATION------------------------------------------------------------
    /**
     * This method is called from within the constructor to initialize the form.
     * 
     * Creates the GUI
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        jLayeredPane1 = new javax.swing.JLayeredPane();
        earthBtn = new javax.swing.JButton();
        plutoBtn = new javax.swing.JButton();
        cybertronBtn = new javax.swing.JButton();
        eterniaBtn = new javax.swing.JButton();
        forgottenRealmBtn = new javax.swing.JButton();
        gallifreyBtn = new javax.swing.JButton();
        hyruleBtn = new javax.swing.JButton();
        iathillesBtn = new javax.swing.JButton();
        kryptonBtn = new javax.swing.JButton();
        blackHoleBtn = new javax.swing.JButton();
        wormHoleBtn = new javax.swing.JButton();
        middleEarthBtn = new javax.swing.JButton();
        dagobahBtn = new javax.swing.JButton();
        plutoBtn.setVisible(false);
        cybertronBtn.setVisible(false);
        eterniaBtn.setVisible(false);
        forgottenRealmBtn.setVisible(false);
        gallifreyBtn.setVisible(false);
        hyruleBtn.setVisible(false);
        iathillesBtn.setVisible(false);
        kryptonBtn.setVisible(false);
        blackHoleBtn.setVisible(false);
        wormHoleBtn.setVisible(false);
        middleEarthBtn.setVisible(false);
        dagobahBtn.setVisible(false);
        earthBtn.setVisible(false);
        imageLbl = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        itemsLbl = new javax.swing.JLabel();
        resourcesLbl = new javax.swing.JLabel();
        resourceNUMLbl = new javax.swing.JLabel();
        gravitybombLbl = new javax.swing.JLabel();
        lightsaberLbl = new javax.swing.JLabel();
        wormholekeyLbl = new javax.swing.JLabel();
        peaceofferingLbl = new javax.swing.JLabel();
        gravityBombNUMLbl = new javax.swing.JLabel();
        lightsaberNUMLbl = new javax.swing.JLabel();
        peaceOfferingNUMLbl = new javax.swing.JLabel();
        wormHoleKeyNUMLbl = new javax.swing.JLabel();
        instructionsBtn = new javax.swing.JButton();
        displayCluesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(861, 825));
        setResizable(true);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 5));
        jLayeredPane1.setForeground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        java.awt.GridBagLayout jLayeredPane1Layout = new java.awt.GridBagLayout();
        jLayeredPane1Layout.columnWidths = new int[] {0};
        jLayeredPane1Layout.rowHeights = new int[] {0};
        jLayeredPane1.setLayout(jLayeredPane1Layout);

        earthBtn.setText("Earth(A)");
        earthBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(60, 60, 0, 0);
        jLayeredPane1.add(earthBtn, gridBagConstraints);

        plutoBtn.setText("Pluto(B)");
        plutoBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(60, 3, 0, 80);
        jLayeredPane1.add(plutoBtn, gridBagConstraints);

        cybertronBtn.setText("Cybertron(C)");
        cybertronBtn.addActionListener(this);
        cybertronBtn.setToolTipText("");        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 0, 0);
        jLayeredPane1.add(cybertronBtn, gridBagConstraints);

        eterniaBtn.setText("Eternia(E)");
        eterniaBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 20, 11, 0);
        jLayeredPane1.add(eterniaBtn, gridBagConstraints);

        forgottenRealmBtn.setText("Forgotten Realm(F)");
        forgottenRealmBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 130, 320);
        jLayeredPane1.add(forgottenRealmBtn, gridBagConstraints);

        gallifreyBtn.setText("Gallifrey(G)");
        gallifreyBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(300, 0, 0, 75);
        jLayeredPane1.add(gallifreyBtn, gridBagConstraints);

        hyruleBtn.setText("Hyrule(H)");
        hyruleBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(80, 100, 260, 0);
        jLayeredPane1.add(hyruleBtn, gridBagConstraints);

        iathillesBtn.setText("Iathilles(I)");
        iathillesBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(250, 40, 6, 40);
        jLayeredPane1.add(iathillesBtn, gridBagConstraints);

        kryptonBtn.setText("Krypton(J)");
        kryptonBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(80, 4, 0, 40);
        jLayeredPane1.add(kryptonBtn, gridBagConstraints);

        blackHoleBtn.setText("Black Hole(K)");
        blackHoleBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 80, 0);
        jLayeredPane1.add(blackHoleBtn, gridBagConstraints);

        wormHoleBtn.setText("Worm Hole(L)");
        wormHoleBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 40, 5);
        jLayeredPane1.add(wormHoleBtn, gridBagConstraints);

        middleEarthBtn.setText("Middle Earth(M)");
        middleEarthBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(120, 305, 2, 71);
        jLayeredPane1.add(middleEarthBtn, gridBagConstraints);

        dagobahBtn.setText("Dagobah(D)");
        dagobahBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 200, 300);
        jLayeredPane1.add(dagobahBtn, gridBagConstraints);

        imageLbl.setLayout(new FlowLayout(FlowLayout.CENTER));
        imageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("starscape.jpg"))); // NOI18N
        imageLbl.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -1233;
        gridBagConstraints.ipady = -415;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jLayeredPane1.add(imageLbl, gridBagConstraints);

        returnBtn.setBackground(new java.awt.Color(0, 0, 0));
        returnBtn.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(0, 255, 0));
        returnBtn.setText("<html>\n<center>Start</center><br>\n\n</html>\n");
        returnBtn.setActionCommand("<html>\n<center>Return</center><br>\n(-25 Resources)\n</html>");
        returnBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        returnBtn.addActionListener(this);

        itemsLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        itemsLbl.setText("Items:");

        resourcesLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        resourcesLbl.setText("Resources:");

        resourceNUMLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        resourceNUMLbl.setForeground(Color.BLUE);
        resourceNUMLbl.setText(Integer.toString(theGame.getResources()));

        gravitybombLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        gravitybombLbl.setText("Gravity Bomb:");

        lightsaberLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lightsaberLbl.setText("Lightsaber:");

        wormholekeyLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        wormholekeyLbl.setText("Wormhole Key:");

        peaceofferingLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        peaceofferingLbl.setText("Peace Offering:");

        gravityBombNUMLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        gravityBombNUMLbl.setForeground(Color.BLUE);
        gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));

        lightsaberNUMLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        lightsaberNUMLbl.setForeground(Color.BLUE);
        lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));

        peaceOfferingNUMLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        peaceOfferingNUMLbl.setForeground(Color.BLUE);
        peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));

        wormHoleKeyNUMLbl.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        wormHoleKeyNUMLbl.setForeground(Color.BLUE);
        wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));

        instructionsBtn.setBackground(new java.awt.Color(0, 0, 0));
        instructionsBtn.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        instructionsBtn.setForeground(new java.awt.Color(0, 255, 0));
        instructionsBtn.setText("<html>\n<center>\nContinue <br>\nMission\n</center>\n</html>");
        instructionsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        instructionsBtn.setPreferredSize(new java.awt.Dimension(93, 56));
        instructionsBtn.addActionListener(this);

        displayCluesBtn.setBackground(new java.awt.Color(0, 0, 0));
        displayCluesBtn.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        displayCluesBtn.setForeground(new java.awt.Color(0, 255, 0));
        displayCluesBtn.setText("Display Clues "+this.theGame.getClueNumber());
        displayCluesBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        displayCluesBtn.addActionListener(this);
        
        //Add components to panel
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(resourceNUMLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resourcesLbl)
                        .addGap(73, 73, 73)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gravitybombLbl)
                            .addComponent(itemsLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gravityBombNUMLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lightsaberLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lightsaberNUMLbl)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(peaceofferingLbl)
                        .addGap(18, 18, 18)
                        .addComponent(peaceOfferingNUMLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wormholekeyLbl)
                        .addGap(18, 18, 18)
                        .addComponent(wormHoleKeyNUMLbl)))
                .addGap(69, 69, 69)
                .addComponent(instructionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayCluesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resourcesLbl)
                                .addGap(18, 18, 18)
                                .addComponent(resourceNUMLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(itemsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gravitybombLbl)
                                    .addComponent(gravityBombNUMLbl)
                                    .addComponent(peaceofferingLbl)
                                    .addComponent(peaceOfferingNUMLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lightsaberNUMLbl)
                                        .addComponent(wormholekeyLbl)
                                        .addComponent(wormHoleKeyNUMLbl))
                                    .addComponent(lightsaberLbl))))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayCluesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instructionsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //----------------------------------------------ACTION PERFORMED----------------------------------------------------------
    /**
     * The actionPerformed method handles the button actions.
     */
    public void actionPerformed(ActionEvent evt) {
      Object source = evt.getSource();
      
      //---------------------------------function buttons---------
      if(source == returnBtn){
    	  if(returnBtn.getText().equals("<html>\n<center>Start</center><br>\n\n</html>\n")){
    		  earthBtn.setVisible(true);
    		  returnBtn.setText("<html>\n<center>Return</center><br>\n(-25 Resources)\n</html>\n");
    		  instructionsBtn.setText("<html>\n<center>\nOption<br>\nMenu\n</center>\n</html>");
    	  }
    	  else if(returnBtn.getText().equals("<html>\n<center>Return</center><br>\n(-25 Resources)\n</html>\n")){
    	  int result = this.theGame.returnPlanet(previousPlanet.getPlanetName());
    	  currentPlanet= previousPlanet;
    	  previousPlanet = null;
    	  if (result==0){
    		  JOptionPane.showInputDialog("You encounter "+ currentPlanet.getAsteroidShower()+"\n");
    		  Object[] options = {"Use Light Saber",
                      "Use Gravity Bomb",
                      "Answer Riddle"};
    		  int userChoice = JOptionPane.showOptionDialog(null,"You meet a bad alien. What would you do?",
    				  		  "You have to make a decision",
    						  JOptionPane.YES_NO_CANCEL_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[2]);
    		  if(userChoice == JOptionPane.YES_OPTION){
    			  if(theGame.getLightSaber()==0){
    				  JOptionPane.showOptionDialog(null,"You are not a jedi yet, you don't have any light Saber",
    				  		  "You have to make a decision",
    						  JOptionPane.YES_NO_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[2]);
    			  }
    			  else if(theGame.getLightSaber()!=0){
    				  JOptionPane.showInputDialog("You sliced the alien like hot knife through butter");
    			  }
    		  }
    		  else if(userChoice == JOptionPane.NO_OPTION){
    			  if(theGame.getGBomb()==0){
    				  JOptionPane.showOptionDialog(null,"Stop being a troll, you don't have any bomb",
    				  		  "You have to make a decision",
    						  JOptionPane.YES_NO_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[2]);
    			  }
    			  else if(theGame.getGBomb()!=0){
    				  JOptionPane.showInputDialog("The alien along with the alien's hope and dream explode in front of you. Alien's babies and wife(maybe?) will forever hate you");
    			  }
    		  }
    		  else if(userChoice == JOptionPane.CANCEL_OPTION){
    		  String answer = JOptionPane.showInputDialog("Answer this to pass: "+ theGame.getRiddle());
    		  	if(theGame.checkAnswer(answer)){
    		  		JOptionPane.showMessageDialog(null, "You answer the riddle correct");
    		  	}
    		  	else if(theGame.checkAnswer(answer)==false){
    		  		JOptionPane.showMessageDialog(null, "You know you could have google the answer");
    		  		theGame.setResources(100);
    		  	}
    		  }
    	  }
    	  else if (result == -1){
    		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+ ". You have succesfully explore the planet");
    	  }
    	  
    	  else if(result == -2){
    		  JOptionPane.showMessageDialog(null, "you cannot go back");
    	  }
    	  resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
    	  gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
    	  lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
    	  peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
    	  wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
    	  }  
      }
      if (source == instructionsBtn){
    	  if(instructionsBtn.getText().equals("<html>\n<center>\nContinue <br>\nMission\n</center>\n</html>")){
    		  try {
				this.theGame = new GameLayout("Planet Connection","Saved Game");
				resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
		    	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
		    	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
		    	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
		    	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
				earthBtn.setVisible(true);
				instructionsBtn.setText("<html>\n<center>\nOption<br>\nMenu\n</center>\n</html>");
				earthBtn.setVisible(true);
	    		returnBtn.setText("<html>\n<center>Return</center><br>\n(-25 Resources)\n</html>\n");
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			}
    	  }
    	  else if(instructionsBtn.getText().equals("<html>\n<center>\nOption<br>\nMenu\n</center>\n</html>")){
    		  Object[] options = {"Save Game",
                      "View instruction", "Restart"};
    		  int n = JOptionPane.showOptionDialog(null,
    				  "You are currently at "+ currentPlanet +"What would you like to do ",
    						  "Menu Option",
    						  JOptionPane.YES_NO_CANCEL_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[2]);
    		  if(n == JOptionPane.YES_OPTION){
    			  this.theGame.saveGame("Saved Game");
    			  System.exit(0);
    		  }
    		  else if(n ==JOptionPane.NO_OPTION){
    			  JOptionPane.showMessageDialog(null, "Travel planets and reach 1000 resources to win"
							+"\n"+"Bad aliens give you riddle that you must answer to else you will lose resources. Good aliens give you cool stuffs."+"\n"+"Wormhole key is used to control the wormhole location, Gravity Bomb and Light saber is used to kill it"
							+"Some places will kill you immediately when you explore"
							+"You could only return once, you have to move in order to return again");
    		  }
    		  else if(n == JOptionPane.CANCEL_OPTION){
    			  this.main(null);
    		  }
    	  }
      }
      if (source == displayCluesBtn){
    	  JOptionPane.showMessageDialog(null, theGame.getClue());
      }
      
      //----------------------------planet buttons---------------
      
    //----------------------------earth buttons---------------
      if(source == earthBtn){
    	  this.theGame.explore("Earth(A)");
    	  resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
    	  gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
    	  lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
    	  peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
    	  wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
    	  plutoBtn.setVisible(true);
    	  
      }
      
    //----------------------------pluto buttons---------------
      if (source == plutoBtn){
    	Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
    	boolean check = false;
    	while(connections.hasNext()){
    		if (connections.next().equals("Pluto(B)")){
    			check = true;
    		}
    	}
    	if (check==false){
    		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
    	}
    	else if(check){
    	this.previousPlanet = this.currentPlanet;
    	this.currentPlanet = theGame.getDescription("Pluto(B)");
    	this.theGame.explore("Pluto(B)");
    	JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+"\n");
    	resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
   	  	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
   	  	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
   	  	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
   	  	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
   	  	plutoBtn.setVisible(true);
   	  	cybertronBtn.setVisible(true);
   	  	dagobahBtn.setVisible(true);
    	}
      }
      
    //----------------------------cybertron buttons---------------
      if (source == cybertronBtn) {
    	Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
      	boolean check = false;
      	while(connections.hasNext()){
      		if (connections.next().equals("Cybertron(C)")){
      			check = true;
      		}
      	}
      	if (check==false){
      		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
      	}
      	else if(check){
      		this.previousPlanet = this.currentPlanet;
        	this.currentPlanet = theGame.getDescription("Cybertron(C)");
    	  boolean result = this.theGame.explore("Cybertron(C)");
    	  if(result){
    		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+"\n");
    		  if(this.theGame.getOffering()!=0){
    			  JOptionPane.showMessageDialog(null, "You meet a bad alien but since you have a peace offering, it let you through");
    			  this.theGame.useOffering();
    		  }
    		  else{
    		  Object[] options = {"Use Light Saber",
                  "Use Gravity Bomb",
                  "Answer Riddle"};
		  int userChoice = JOptionPane.showOptionDialog(null,"You meet a bad alien. What would you do?",
				  		  "You have to make a decision",
						  JOptionPane.YES_NO_CANCEL_OPTION,
						  JOptionPane.QUESTION_MESSAGE,
						  null,
						  options,
						  options[2]);
		  if(userChoice == JOptionPane.YES_OPTION){
			  if(theGame.getLightSaber()==0){
				  JOptionPane.showOptionDialog(null,"You are not a jedi yet, you don't have any light Saber",
				  		  "You have to make a decision",
						  JOptionPane.YES_NO_OPTION,
						  JOptionPane.QUESTION_MESSAGE,
						  null,
						  options,
						  options[2]);
			  }
			  else if(theGame.getLightSaber()!=0){
				  JOptionPane.showInputDialog("You sliced the alien like hot knife through butter");
			  }
		  }
		  else if(userChoice == JOptionPane.NO_OPTION){
			  if(theGame.getGBomb()==0){
				  JOptionPane.showOptionDialog(null,"Stop being a troll, you don't have any bomb",
				  		  "You have to make a decision",
						  JOptionPane.YES_NO_OPTION,
						  JOptionPane.QUESTION_MESSAGE,
						  null,
						  options,
						  options[2]);
			  }
			  else if(theGame.getGBomb()!=0){
				  JOptionPane.showInputDialog("The alien along with the alien's hope and dream explode in front of you. Alien's babies and wife(maybe?) will forever hate you");
			  }
		  }
		  else if(userChoice == JOptionPane.CANCEL_OPTION){
		  String answer = JOptionPane.showInputDialog("Answer this to pass: "+ theGame.getRiddle());
		  	if(theGame.checkAnswer(answer)){
		  		JOptionPane.showMessageDialog(null, "You answer the riddle correct");
		  	}
		  	else if(theGame.checkAnswer(answer)==false){
		  		JOptionPane.showMessageDialog(null, "You know you could have google the answer");
		  		theGame.setResources(100);
		  	}
		  }
	  }	
    	  }
    	  else if(result==false){
    		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+ ". You have succesfully explore the planet");
    	  }
      	resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
   	  	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
   	  	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
   	  	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
   	  	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
   	  	plutoBtn.setVisible(true);
        gallifreyBtn.setVisible(true);
        hyruleBtn.setVisible(true);
        eterniaBtn.setVisible(true);
        dagobahBtn.setVisible(true);
      	}
      }
      
    //----------------------------dagobah buttons---------------
      if (source == dagobahBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
        	boolean check = false;
        	while(connections.hasNext()){
        		if (connections.next().equals("Dagobah(D)")){
        			check = true;
        		}
        	}
        	if (check==false){
        		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
        	}
        	else if(check){
        		this.previousPlanet = this.currentPlanet;
        		this.currentPlanet = theGame.getDescription("Dagobah(D)");
        		boolean result = this.theGame.explore("Dagobah(D)");
        		JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower() + " and "+currentPlanet.getAlien()+ 
        										". You have succesfully explore the planet");
        		eterniaBtn.setVisible(true);
        	}
      }
      
    //----------------------------eternia buttons---------------
      if (source == eterniaBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
      	boolean check = false;
      	while(connections.hasNext()){
      		if (connections.next().equals("Eternia(E)")){
      			check = true;
      		}
      	}
      	if (check==false){
      		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
      	}
      	else if(check){
      		this.previousPlanet = this.currentPlanet;
      		this.currentPlanet = theGame.getDescription("Eternia(E)");
      		boolean result = this.theGame.explore("Eternia(E)");
      		if(result){
      		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+"\n");
      		if(this.theGame.getOffering()!=0){
  			  JOptionPane.showMessageDialog(null, "You meet a bad alien but since you have a peace offering, it let you through");
  			  this.theGame.useOffering();
  		  }
      		else{
      		  Object[] options = {"Use Light Saber",
                    "Use Gravity Bomb",
                    "Answer Riddle"};
  		  int userChoice = JOptionPane.showOptionDialog(null,"You meet a bad alien. What would you do?",
  				  		  "You have to make a decision",
  						  JOptionPane.YES_NO_CANCEL_OPTION,
  						  JOptionPane.QUESTION_MESSAGE,
  						  null,
  						  options,
  						  options[2]);
  		  if(userChoice == JOptionPane.YES_OPTION){
  			  if(theGame.getLightSaber()==0){
  				  JOptionPane.showOptionDialog(null,"You are not a jedi yet, you don't have any light Saber",
  				  		  "You have to make a decision",
  						  JOptionPane.YES_NO_OPTION,
  						  JOptionPane.QUESTION_MESSAGE,
  						  null,
  						  options,
  						  options[2]);
  			  }
  			  else if(theGame.getLightSaber()!=0){
  				  JOptionPane.showInputDialog("You sliced the alien like hot knife through butter");
  			  }
  		  }
  		  else if(userChoice == JOptionPane.NO_OPTION){
  			  if(theGame.getGBomb()==0){
  				  JOptionPane.showOptionDialog(null,"Stop being a troll, you don't have any bomb",
  				  		  "You have to make a decision",
  						  JOptionPane.YES_NO_OPTION,
  						  JOptionPane.QUESTION_MESSAGE,
  						  null,
  						  options,
  						  options[2]);
  			  }
  			  else if(theGame.getGBomb()!=0){
  				  JOptionPane.showInputDialog("The alien along with the alien's hope and dream explode in front of you. Alien's babies and wife(maybe?) will forever hate you");
  			  }
  		  }
  		  else if(userChoice == JOptionPane.CANCEL_OPTION){
  		  String answer = JOptionPane.showInputDialog("Answer this to pass: "+ theGame.getRiddle());
  		  	if(theGame.checkAnswer(answer)){
  		  		JOptionPane.showMessageDialog(null, "You answer the riddle correct");
  		  	}
  		  	else if(theGame.checkAnswer(answer)==false){
  		  		JOptionPane.showMessageDialog(null, "You know you could have google the answer");
  		  		theGame.setResources(100);
  		  	}
  		  }
  	  }	
      		}
      	  else if(result==false){
      		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+  ". You have succesfully explore the planet");
      	  }
        	resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
     	  	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
     	  	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
     	  	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
     	  	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
     	  	wormHoleBtn.setVisible(true);
      	}
      }
      
    //----------------------------forgotten realm buttons---------------
      if (source == forgottenRealmBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
        	boolean check = false;
        	while(connections.hasNext()){
        		if (connections.next().equals("ForgottenRealm(F)")){
        			check = true;
        		}
        	}
        	if (check==false){
        		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
        	}
        	else if(check){
        		this.previousPlanet = this.currentPlanet;
        		this.currentPlanet = theGame.getDescription("ForgottenRealm(F)");
        		boolean result = this.theGame.explore("ForgottenRealm(F)");
        		if(result){
        		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+"\n");
        		  if(this.theGame.getOffering()!=0){
        			  JOptionPane.showMessageDialog(null, "You meet a bad alien but since you have a peace offering, it let you through");
        			  this.theGame.useOffering();
        		  }
        		  else{
        		  Object[] options = {"Use Light Saber",
                      "Use Gravity Bomb",
                      "Answer Riddle"};
    		  int userChoice = JOptionPane.showOptionDialog(null,"You meet a bad alien. What would you do?",
    				  		  "You have to make a decision",
    						  JOptionPane.YES_NO_CANCEL_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[2]);
    		  if(userChoice == JOptionPane.YES_OPTION){
    			  if(theGame.getLightSaber()==0){
    				  JOptionPane.showOptionDialog(null,"You are not a jedi yet, you don't have any light Saber",
    				  		  "You have to make a decision",
    						  JOptionPane.YES_NO_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[2]);
    			  }
    			  else if(theGame.getLightSaber()!=0){
    				  JOptionPane.showInputDialog("You sliced the alien like hot knife through butter");
    			  }
    		  }
    		  else if(userChoice == JOptionPane.NO_OPTION){
    			  if(theGame.getGBomb()==0){
    				  JOptionPane.showOptionDialog(null,"Stop being a troll, you don't have any bomb",
    				  		  "You have to make a decision",
    						  JOptionPane.YES_NO_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[2]);
    			  }
    			  else if(theGame.getGBomb()!=0){
    				  JOptionPane.showInputDialog("The alien along with the alien's hope and dream explode in front of you. Alien's babies and wife(maybe?) will forever hate you");
    			  }
    		  }
    		  else if(userChoice == JOptionPane.CANCEL_OPTION){
    		  String answer = JOptionPane.showInputDialog("Answer this to pass: "+ theGame.getRiddle());
    		  	if(theGame.checkAnswer(answer)){
    		  		JOptionPane.showMessageDialog(null, "You answer the riddle correct");
    		  	}
    		  	else if(theGame.checkAnswer(answer)==false){
    		  		JOptionPane.showMessageDialog(null, "You know you could have google the answer");
    		  		theGame.setResources(100);
    		  	}
    		  }
    	  }	
        		}
        	  else if(result==false){
        		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+  ". You have succesfully explore the planet");
        	  }
          	resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
       	  	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
       	  	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
       	  	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
       	  	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
       	  	blackHoleBtn.setVisible(true);
        	}
      }
      
    //----------------------------gallifrey buttons---------------
      if (source == gallifreyBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
      	boolean check = false;
      	while(connections.hasNext()){
      		if (connections.next().equals("Gallifrey(G)")){
      			check = true;
      		}
      	}
      	if (check==false){
      		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
      	}
      	else if(check){
      		this.previousPlanet = this.currentPlanet;
      		this.currentPlanet = theGame.getDescription("Gallifrey(G)");
      		boolean result = this.theGame.explore("Gallifrey(G)");
      		JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower() + " and "+currentPlanet.getAlien()+ 
      										". You have succesfully explore the planet");
      		forgottenRealmBtn.setVisible(true);
      	}
      }
      
    //----------------------------hyrule buttons---------------
      if (source == hyruleBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
        	boolean check = false;
        	while(connections.hasNext()){
        		if (connections.next().equals("Hyrule(H)")){
        			check = true;
        		}
        	}
        	if (check==false){
        		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
        	}
        	else if(check){
        		this.previousPlanet = this.currentPlanet;
        		this.currentPlanet = theGame.getDescription("Hyrule(H)");
        		boolean result = this.theGame.explore("Hyrule(H)");
        		JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+ 
        										". You have succesfully explore the planet");
        		
        		iathillesBtn.setVisible(true);
        		middleEarthBtn.setVisible(true);
        	}
      }
      if (source == blackHoleBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
        	boolean check = false;
        	while(connections.hasNext()){
        		if (connections.next().equals("Blackhole(K)")){
        			check = true;
        		}
        	}
        	if (check==false){
        		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
        	}
        	else if(check){
        		Object[] options = {"Restart",
                        "Quit"};
      		  int userChoice = JOptionPane.showOptionDialog(null,"you flight straight into a black hole like a deer run into the car light. RIP",
      				  		  "You have to make a decision",
      						  JOptionPane.YES_NO_OPTION,
      						  JOptionPane.QUESTION_MESSAGE,
      						  null,
      						  options,
      						  options[0]);
      		 if(userChoice == JOptionPane.YES_OPTION){
      			 this.main(null);
      		 }
      		 else if(userChoice == JOptionPane.NO_OPTION){
      			 System.exit(0);
      		 }
        	}
      }
      
    //----------------------------krypton buttons---------------
      if (source == kryptonBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
      	boolean check = false;
      	while(connections.hasNext()){
      		if (connections.next().equals("Krypton(J)")){
      			check = true;
      		}
      	}
      	if (check==false){
      		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
      	}
      	else if(check){
      		iathillesBtn.setVisible(true);
      		Object[] options = {"Restart",
                      "Quit"};
    		  int userChoice = JOptionPane.showOptionDialog(null,"You enter a merge galaxy, there is no way out, you are dead",
    				  		  "You have to make a decision",
    						  JOptionPane.YES_NO_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[0]);
    		 if(userChoice == JOptionPane.YES_OPTION){
    			 this.main(null);
    		 }
    		 else if(userChoice == JOptionPane.NO_OPTION){
    			 System.exit(0);
    		 }
      	}
      }
      
    //----------------------------iathilles buttons---------------
      if (source == iathillesBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
      	boolean check = false;
      	while(connections.hasNext()){
      		if (connections.next().equals("Iathilles(I)")){
      			check = true;
      		}
      	}
      	if (check==false){
      		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
      	}
      	else if(check){
      		kryptonBtn.setVisible(true);
      		Object[] options = {"Restart",
                      "Quit"};
    		  int userChoice = JOptionPane.showOptionDialog(null,"You enter a merge galaxy, there is no way out, you are dead",
    				  		  "You have to make a decision",
    						  JOptionPane.YES_NO_OPTION,
    						  JOptionPane.QUESTION_MESSAGE,
    						  null,
    						  options,
    						  options[0]);
    		 if(userChoice == JOptionPane.YES_OPTION){
    			 this.main(null);
    		 }
    		 else if(userChoice == JOptionPane.NO_OPTION){
    			 System.exit(0);
    		 }
      	}
      }
      
    //----------------------------wormhole buttons---------------
      if (source == wormHoleBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
        	boolean check = false;
        	while(connections.hasNext()){
        		if (connections.next().equals("Wormhole(L)")){
        			check = true;
        		}
        	}
        	if (check==false){
        		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
        	}
        	else if(check){
        		this.previousPlanet = this.currentPlanet;
          		this.currentPlanet = theGame.getDescription("Wormhole(L)");
          		eterniaBtn.setVisible(true);
          		plutoBtn.setVisible(true);
          		kryptonBtn.setVisible(true);
          		forgottenRealmBtn.setVisible(true);
        		if(theGame.getKey()!=0){		
        			JOptionPane.showMessageDialog(null, "You can choose to travel to Eternia, Pluto, Krypton(Highly Recommend) or Forgotten Realm");
        		}
        		else if(theGame.getKey()==0){
        			Random random = new Random();
        			int chances = random.nextInt(100);
        			if(chances<=25){
        				this.previousPlanet = this.currentPlanet;
        	      		this.currentPlanet = theGame.getDescription("Eternia(E)");
        	      		boolean result = this.theGame.explore("Eternia(E)");
        	      		if(result){
        	      		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+"\n");
        	      		if(this.theGame.getOffering()!=0){
        	    			  JOptionPane.showMessageDialog(null, "You meet a bad alien but since you have a peace offering, it let you through");
        	    			  this.theGame.useOffering();
        	    		  }
        	      		else{
        	      		  Object[] options = {"Use Light Saber",
        	                    "Use Gravity Bomb",
        	                    "Answer Riddle"};
        	  		  int userChoice = JOptionPane.showOptionDialog(null,"You meet a bad alien. What would you do?",
        	  				  		  "You have to make a decision",
        	  						  JOptionPane.YES_NO_CANCEL_OPTION,
        	  						  JOptionPane.QUESTION_MESSAGE,
        	  						  null,
        	  						  options,
        	  						  options[2]);
        	  		  if(userChoice == JOptionPane.YES_OPTION){
        	  			  if(theGame.getLightSaber()==0){
        	  				  JOptionPane.showOptionDialog(null,"You are not a jedi yet, you don't have any light Saber",
        	  				  		  "You have to make a decision",
        	  						  JOptionPane.YES_NO_OPTION,
        	  						  JOptionPane.QUESTION_MESSAGE,
        	  						  null,
        	  						  options,
        	  						  options[2]);
        	  			  }
        	  			  else if(theGame.getLightSaber()!=0){
        	  				  JOptionPane.showInputDialog("You sliced the alien like hot knife through butter");
        	  			  }
        	  		  }
        	  		  else if(userChoice == JOptionPane.NO_OPTION){
        	  			  if(theGame.getGBomb()==0){
        	  				  JOptionPane.showOptionDialog(null,"Stop being a troll, you don't have any bomb",
        	  				  		  "You have to make a decision",
        	  						  JOptionPane.YES_NO_OPTION,
        	  						  JOptionPane.QUESTION_MESSAGE,
        	  						  null,
        	  						  options,
        	  						  options[2]);
        	  			  }
        	  			  else if(theGame.getGBomb()!=0){
        	  				  JOptionPane.showInputDialog("The alien along with the alien's hope and dream explode in front of you. Alien's babies and wife(maybe?) will forever hate you");
        	  			  }
        	  		  }
        	  		  else if(userChoice == JOptionPane.CANCEL_OPTION){
        	  		  String answer = JOptionPane.showInputDialog("Answer this to pass: "+ theGame.getRiddle());
        	  		  	if(theGame.checkAnswer(answer)){
        	  		  		JOptionPane.showMessageDialog(null, "You answer the riddle correct");
        	  		  	}
        	  		  	else if(theGame.checkAnswer(answer)==false){
        	  		  		JOptionPane.showMessageDialog(null, "You know you could have google the answer");
        	  		  		theGame.setResources(100);
        	  		  	}
        	  		  }
        	  	  }		
        	      		}
        	      	  else if(result==false){
        	      		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+  ". You have succesfully explore the planet");
        	      	  }
        	        	resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
        	     	  	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
        	     	  	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
        	     	  	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
        	     	  	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
        	     	  	wormHoleBtn.setVisible(true);
        			}
        			else if(chances<=50){
        				iathillesBtn.setVisible(true);
        				this.currentPlanet = theGame.getDescription("Krypton(J)");
        				Object[] options = {"Restart",
                        "Quit"};
      		  int userChoice = JOptionPane.showOptionDialog(null,"You enter a merge galaxy, there is no way out, you are dead",
      				  		  "You have to make a decision",
      						  JOptionPane.YES_NO_OPTION,
      						  JOptionPane.QUESTION_MESSAGE,
      						  null,
      						  options,
      						  options[0]);
      		 if(userChoice == JOptionPane.YES_OPTION){
      			 this.main(null);
      		 }
      		 else if(userChoice == JOptionPane.NO_OPTION){
      			 System.exit(0);
      		 }
            		}
        			else if(chances<=75){
        				this.previousPlanet = this.currentPlanet;
                		this.currentPlanet = theGame.getDescription("Forgotten Realm(F)");
                		boolean result = this.theGame.explore("Forgotten Realm(F)");
                		if(result){
                		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+"\n");
                		  if(this.theGame.getOffering()!=0){
                			  JOptionPane.showMessageDialog(null, "You meet a bad alien but since you have a peace offering, it let you through");
                			  this.theGame.useOffering();
                		  }
                		  else{
                		  Object[] options = {"Use Light Saber",
                              "Use Gravity Bomb",
                              "Answer Riddle"};
            		  int userChoice = JOptionPane.showOptionDialog(null,"You meet a bad alien. What would you do?",
            				  		  "You have to make a decision",
            						  JOptionPane.YES_NO_CANCEL_OPTION,
            						  JOptionPane.QUESTION_MESSAGE,
            						  null,
            						  options,
            						  options[2]);
            		  if(userChoice == JOptionPane.YES_OPTION){
            			  if(theGame.getLightSaber()==0){
            				  JOptionPane.showOptionDialog(null,"You are not a jedi yet, you don't have any light Saber",
            				  		  "You have to make a decision",
            						  JOptionPane.YES_NO_OPTION,
            						  JOptionPane.QUESTION_MESSAGE,
            						  null,
            						  options,
            						  options[2]);
            			  }
            			  else if(theGame.getLightSaber()!=0){
            				  JOptionPane.showInputDialog("You sliced the alien like hot knife through butter");
            			  }
            		  }
            		  else if(userChoice == JOptionPane.NO_OPTION){
            			  if(theGame.getGBomb()==0){
            				  JOptionPane.showOptionDialog(null,"Stop being a troll, you don't have any bomb",
            				  		  "You have to make a decision",
            						  JOptionPane.YES_NO_OPTION,
            						  JOptionPane.QUESTION_MESSAGE,
            						  null,
            						  options,
            						  options[2]);
            			  }
            			  else if(theGame.getGBomb()!=0){
            				  JOptionPane.showInputDialog("The alien along with the alien's hope and dream explode in front of you. Alien's babies and wife(maybe?) will forever hate you");
            			  }
            		  }
            		  else if(userChoice == JOptionPane.CANCEL_OPTION){
            		  String answer = JOptionPane.showInputDialog("Answer this to pass: "+ theGame.getRiddle());
            		  	if(theGame.checkAnswer(answer)){
            		  		JOptionPane.showMessageDialog(null, "You answer the riddle correct");
            		  	}
            		  	else if(theGame.checkAnswer(answer)==false){
            		  		JOptionPane.showMessageDialog(null, "You know you could have google the answer");
            		  		theGame.setResources(100);
            		  	}
            		  }
            	  }
                		}
                	  else if(result==false){
                		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+  ". You have succesfully explore the planet");
                	  }
                  	resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
               	  	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
               	  	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
               	  	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
               	  	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
               	blackHoleBtn.setVisible(true);
               	cybertronBtn.setVisible(true);
        			}
        			else if(chances<=100){
        				this.previousPlanet = this.currentPlanet;
        		    	this.currentPlanet = theGame.getDescription("Pluto(B)");
        		    	this.theGame.explore("Pluto(B)");
        		    	JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+"\n");
        		    	resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
        		   	  	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
        		   	  	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
        		   	  	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
        		   	  	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
        		   	  	plutoBtn.setVisible(true);
        		   	  	cybertronBtn.setVisible(true);
        		   	  	dagobahBtn.setVisible(true);
        			}
        		}
        	}
      }
      
      //----------------------------middle earth buttons---------------
      if (source == middleEarthBtn) {
    	  Iterator<String> connections = theGame.connections(currentPlanet.getPlanetName());
      	boolean check = false;
      	while(connections.hasNext()){
      		if (connections.next().equals("Middle Earth(M)")){
      			check = true;
      		}
      	}
      	if (check==false){
      		JOptionPane.showMessageDialog(null, "this planet does not connect to your current planet");
      	}
      	else if(check){
      		this.previousPlanet = this.currentPlanet;
      		this.currentPlanet = theGame.getDescription("Middle Earth(M)");
      		boolean result = this.theGame.explore("Middle Earth(M)");
      		if(result){
      		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+"\n");
      		if(this.theGame.getOffering()!=0){
  			  JOptionPane.showMessageDialog(null, "You meet a bad alien but since you have a peace offering, it let you through");
  			  this.theGame.useOffering();
  		  }
      		else{
      		  Object[] options = {"Use Light Saber",
                    "Use Gravity Bomb",
                    "Answer Riddle"};
  		  int userChoice = JOptionPane.showOptionDialog(null,"You meet a bad alien. What would you do?",
  				  		  "You have to make a decision",
  						  JOptionPane.YES_NO_CANCEL_OPTION,
  						  JOptionPane.QUESTION_MESSAGE,
  						  null,
  						  options,
  						  options[2]);
  		  if(userChoice == JOptionPane.YES_OPTION){
  			  if(theGame.getLightSaber()==0){
  				  JOptionPane.showOptionDialog(null,"You are not a jedi yet, you don't have any light Saber",
  				  		  "You have to make a decision",
  						  JOptionPane.YES_NO_OPTION,
  						  JOptionPane.QUESTION_MESSAGE,
  						  null,
  						  options,
  						  options[2]);
  			  }
  			  else if(theGame.getLightSaber()!=0){
  				  JOptionPane.showInputDialog("You sliced the alien like hot knife through butter");
  			  }
  		  }
  		  else if(userChoice == JOptionPane.NO_OPTION){
  			  if(theGame.getGBomb()==0){
  				  JOptionPane.showOptionDialog(null,"Stop being a troll, you don't have any bomb",
  				  		  "You have to make a decision",
  						  JOptionPane.YES_NO_OPTION,
  						  JOptionPane.QUESTION_MESSAGE,
  						  null,
  						  options,
  						  options[2]);
  			  }
  			  else if(theGame.getGBomb()!=0){
  				  JOptionPane.showInputDialog("The alien along with the alien's hope and dream explode in front of you. Alien's babies and wife(maybe?) will forever hate you");
  			  }
  		  }
  		  else if(userChoice == JOptionPane.CANCEL_OPTION){
  		  String answer = JOptionPane.showInputDialog("Answer this to pass: "+ theGame.getRiddle());
  		  	if(theGame.checkAnswer(answer)){
  		  		JOptionPane.showMessageDialog(null, "You answer the riddle correct");
  		  	}
  		  	else if(theGame.checkAnswer(answer)==false){
  		  		JOptionPane.showMessageDialog(null, "You know you could have google the answer");
  		  		theGame.setResources(100);
  		  	}
  		  }
  	  }	
      		}
      	  else if(result==false){
      		  JOptionPane.showMessageDialog(null, "You encounter "+ currentPlanet.getAsteroidShower()+ " and "+currentPlanet.getAlien()+  ". You have succesfully explore the planet");
      	  }
        	resourceNUMLbl.setText(Integer.toString(theGame.getResources()));
     	  	gravityBombNUMLbl.setText(Integer.toString(theGame.getGBomb()));
     	  	lightsaberNUMLbl.setText(Integer.toString(theGame.getYodaGift()));
     	  	peaceOfferingNUMLbl.setText(Integer.toString(theGame.getOffering()));
     	  	wormHoleKeyNUMLbl.setText(Integer.toString(theGame.getKey()));
      	}
      }
      if(this.theGame.getResources()==1500){
    	  Object[] options = {"Restart",
                  "Quit"};
    	  int n = JOptionPane.showOptionDialog(null,
    			  "Congratulation, you win",
    					  "Congrat",
    					  JOptionPane.YES_NO_OPTION,
    					  JOptionPane.QUESTION_MESSAGE,
    					  null,
    					  options,
    					  options[0]);
    	  if(n==JOptionPane.YES_OPTION){
    		  this.main(null);
    	  }
    	  else if(n==JOptionPane.NO_OPTION){
    		  System.exit(0);
    	  }
      }
    } //end action performed
    
    //-----------------------------------------------------MAIN---------------------------------------------------------------------------------------------
    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILayout().setVisible(true);
            }
        }); 
    }
}
