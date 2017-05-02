
/**
 *JFrame for GUI Layout (Made in NetBeans)
 *
 * @author Caitlin Harvey & Anh Tran
 */
public class GUILayout extends javax.swing.JFrame {
	
	//1: items 2: Resources 3: resources ## 4: Gravity Bomb 5: Lightsaber 6: Peace Offering 7: wormhole key 8: #GB 9: #LS 10: #PO 11: #WK

    private javax.swing.JButton moveButton;
    private javax.swing.JButton instructionsButton;
    private javax.swing.JLabel itemslbl;
    private javax.swing.JLabel resourceslbl;
    private javax.swing.JLabel numResourceslbl;
    private javax.swing.JLabel gravityBomblbl;
    private javax.swing.JLabel lightsaberlbl;
    private javax.swing.JLabel peaceOfferinglbl;
    private javax.swing.JLabel wormholeKeylbl;
    private javax.swing.JLabel numGravityBomblbl;
    private javax.swing.JLabel numLightsaberlbl;
    private javax.swing.JLabel numPeaceOfferinglbl;
    private javax.swing.JLabel numWormholeKeylbl;
    private javax.swing.JPanel jPanel1;
    
    /**
     * Creates new form GUILayout
     */
    public GUILayout() {
        initComponents();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moveButton = new javax.swing.JButton();
        itemslbl = new javax.swing.JLabel();
        resourceslbl = new javax.swing.JLabel();
        numResourceslbl = new javax.swing.JLabel();
        gravityBomblbl = new javax.swing.JLabel();
        lightsaberlbl = new javax.swing.JLabel();
        peaceOfferinglbl = new javax.swing.JLabel();
        wormholeKeylbl = new javax.swing.JLabel();
        numGravityBomblbl = new javax.swing.JLabel();
        numLightsaberlbl = new javax.swing.JLabel();
        numPeaceOfferinglbl = new javax.swing.JLabel();
        numWormholeKeylbl = new javax.swing.JLabel();
        instructionsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        //-----------------------------------------panel---------------------------------------------
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        
        //--------------------------------------Move Button -----------------------------------------------------
        moveButton.setBackground(new java.awt.Color(0, 0, 0));
        moveButton.setFont(new java.awt.Font("Impact", 0, 14)); 
        moveButton.setForeground(new java.awt.Color(0, 255, 0));
        moveButton.setText("<html>\n<center>Move</center><br>\n(-25 Resources)\n</html>");
        moveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        //------------------------------------Labels----------------------------------------------------------------
        itemslbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        itemslbl.setText("Items:");

        resourceslbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        resourceslbl.setText("Resources:");

        numResourceslbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        numResourceslbl.setText("####");

        gravityBomblbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        gravityBomblbl.setText("Gravity Bomb:");

        lightsaberlbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        lightsaberlbl.setText("Lightsaber:");

        peaceOfferinglbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        peaceOfferinglbl.setText("Peace Offering:");

        wormholeKeylbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        wormholeKeylbl.setText("Wormhole Key:");

        numGravityBomblbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        numGravityBomblbl.setText("(#)");

        numLightsaberlbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        numLightsaberlbl.setText("(#)");

        numPeaceOfferinglbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        numPeaceOfferinglbl.setText("(#)");

        numWormholeKeylbl.setFont(new java.awt.Font("Impact", 0, 14)); 
        numWormholeKeylbl.setText("(#)");

        //-----------------------------------------Instructions Button -----------------------------------------------------
        instructionsButton.setBackground(new java.awt.Color(0, 0, 0));
        instructionsButton.setFont(new java.awt.Font("Impact", 0, 14)); 
        instructionsButton.setForeground(new java.awt.Color(0, 255, 0));
        instructionsButton.setText("<html>\n<center>\nMission <br>\nInstructions\n</center>\n</html>");
        instructionsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        //---------------------------------------------Setup (ignore)-----------------------------------------------------
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(resourceslbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(numResourceslbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gravityBomblbl)
                            .addComponent(itemslbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numGravityBomblbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lightsaberlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numLightsaberlbl)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(peaceOfferinglbl)
                        .addGap(18, 18, 18)
                        .addComponent(numPeaceOfferinglbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wormholeKeylbl)
                        .addGap(18, 18, 18)
                        .addComponent(numWormholeKeylbl)))
                .addGap(69, 69, 69)
                .addComponent(instructionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(itemslbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gravityBomblbl)
                                    .addComponent(numGravityBomblbl)
                                    .addComponent(peaceOfferinglbl)
                                    .addComponent(numPeaceOfferinglbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(numLightsaberlbl)
                                        .addComponent(wormholeKeylbl)
                                        .addComponent(numWormholeKeylbl))
                                    .addComponent(lightsaberlbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resourceslbl)
                                .addGap(18, 18, 18)
                                .addComponent(numResourceslbl)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instructionsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }

    
    //---------------------------------------------Getters and Setters-------------------------------------


	//Resources ##
	public String getNumResourceslbl() {
		return numResourceslbl.getText();
	}
	public void setNumResourceslbl(String newNum) {
		this.numResourceslbl.setText(newNum);
	}
	
	//GravityBomb##
	public String getNumGravityBomblbl() {
		return numGravityBomblbl.getText();
	}
	public void setNumGravityBomblbl(String newNum) {
		this.numGravityBomblbl.setText(newNum);
	}
	
	//Lightsaber##
	public String getNumLightsaberlbl() {
		return numLightsaberlbl.getText();
	}
	public void setNumLightsaberlbl(String newNum) {
		this.numLightsaberlbl.setText(newNum);
	}

	//PeaceOffering##
	public javax.swing.JLabel getNumPeaceOfferinglbl() {
		return numPeaceOfferinglbl;
	}
	public void setNumPeaceOfferinglbl(javax.swing.JLabel numPeaceOfferinglbl) {
		this.numPeaceOfferinglbl = numPeaceOfferinglbl;
	}

	//WormholeKey##
	public javax.swing.JLabel getNumWormholeKeylbl() {
		return numWormholeKeylbl;
	}
	public void setNumWormholeKeylbl(javax.swing.JLabel numWormholeKeylbl) {
		this.numWormholeKeylbl = numWormholeKeylbl;
	}
    
    /**
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
