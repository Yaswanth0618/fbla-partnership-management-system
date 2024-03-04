package com.yash.pms.view;

// Main class for the application's initial screen
public class ApplicationMain extends javax.swing.JFrame {

	// Declare a static reference to the initial screen
	static ApplicationMain initialScreen;
    
    // Constructor for the initial screen
    public ApplicationMain() {
        initComponents(); // Initialize GUI components
        
        // Create a thread to manage progress bar animation and screen transitions
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                // Loop through progress bar values
                for (int i = 0; i <= 100; i++) {
                    try {
                        // Set the value of the progress bar
                        jProgressBar1.setValue(i);
                        Thread.sleep(20); // Introduce a delay for animation
                        
                        // Perform actions based on progress bar value
                        if(jProgressBar1.getString().equals("100%")) {                          
                        	// When progress reaches 100%, show the SignIn screen
                        	SignIn.signInScreen= new SignIn();
                        	SignIn.signInScreen.setVisible(true);                        
                        }
                        if(jProgressBar1.getString().equals("50%")){
                            jLabel2.setText("Loading Modules.....");                            
                        }
                        if(jProgressBar1.getString().equals("25%")){
                            jLabel2.setText("Connecting Database....");
                            //jLabel1.setForeground(Color.WHITE);
                        }
                        if(jProgressBar1.getString().equals("95%"))
                            jLabel2.setText("Launching Application....");
                    } catch (InterruptedException ex) {
                        // Handle interruption exceptions
                    }
                }
            }
        });
        t.start(); // Start the thread
    }

    // Method to initialize GUI components
    @SuppressWarnings("unchecked")   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(); // Panel for the main content
        jLabel1 = new javax.swing.JLabel(); // Label for the welcome message
        jLabel2 = new javax.swing.JLabel(); // Label for the loading message
        jProgressBar1 = new javax.swing.JProgressBar(); // Progress bar to indicate loading progress
        jLabel3 = new javax.swing.JLabel(); // Label for the logo

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true); // Remove window decorations
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 124, 157)); // Set panel background color
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 22)); // Set font for welcome message
        jLabel1.setText("Welcom CTE AHS"); // Set text for welcome message
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 370, 53));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // Set font for loading message
        jLabel2.setForeground(java.awt.Color.white); // Set color for loading message
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT); // Set alignment for loading message
        jLabel2.setText("Loading......"); // Set initial text for loading message
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 680, 30));

        jProgressBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // Set font for progress bar
        jProgressBar1.setForeground(new java.awt.Color(66, 213, 224)); // Set foreground color for progress bar
        jProgressBar1.setRequestFocusEnabled(false); // Disable focus request for progress bar
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 680, 10)); // Add progress bar to panel

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo-kmk.png"))); // Set icon for logo
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 630, 400)); // Add logo to panel

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460)); // Add panel to content pane

        pack(); // Pack components for display
        setLocationRelativeTo(null); // Center the frame on screen
    }// </editor-fold>//GEN-END:initComponents

    // Main method to launch the application
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	// Create an instance of the initial screen and make it visible
            	initialScreen= new ApplicationMain();
            	initialScreen.setVisible(true);            	
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
