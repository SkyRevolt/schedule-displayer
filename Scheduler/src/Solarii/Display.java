package Solarii;

import javax.swing.JOptionPane;
import java.util.Random;

public class Display extends javax.swing.JFrame{
	
	/**
     *
     */
    private static final long serialVersionUID = -4720667810160888930L;

    public Display() {
		initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
	}
	
	private void initComponents() {
        confirm = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        alphalabel = new javax.swing.JLabel();
        alphafield = new javax.swing.JTextField();
        omegalabel = new javax.swing.JLabel();
        omegafield = new javax.swing.JTextField();
        vweek = new javax.swing.JComboBox<>();


        confirm.setText("Submit");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        title.setText("Employee Schedule");

        alphalabel.setText("First Name");

        alphafield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphafieldActionPerformed(evt);
            }
        });

        omegalabel.setText("Last Name");

        omegafield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omegafieldActionPerformed(evt);
            }
        });

        vweek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
                 "Select Day", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" 
            }));
        vweek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vweekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(omegalabel)
                                    .addComponent(alphalabel)
                                    .addComponent(vweek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(alphafield)
                                    .addComponent(omegafield, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alphalabel)
                    .addComponent(alphafield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omegafield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omegalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirm)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vweek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>    
  

    public class Selection {
        // nothing to see here.... for now
    }

    private void alphafieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // nothing to see here
    }                                          

    private void omegafieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // nothing to see here
    }                                          

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String day = vweek.getSelectedItem().toString();
        
        if(day == "Select Day") {
            JOptionPane.showMessageDialog(null, "Select Valid Day", "Error!", JOptionPane.ERROR_MESSAGE);            
        } else {
            String name = alphafield.getText() + " " + omegafield.getText();

            JOptionPane.showMessageDialog(null, "Welcome " + name +"- Crewmate" + "\n TT Booting Task Database " +
            "\n | | Short Task=" +this.qset +"\n | | Long Task=" +this.pset + "\n | | Visual Task=" +this.vset + "\n | | Common Task=" +this.cset 
            + "\n V Have a safe day at work.", "Tasks For: " + day, JOptionPane.INFORMATION_MESSAGE);
        }
        
    }                          

    private void vweekActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     
	
    

	public static void main(String[] args){
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
		
	}
	  // Variables declaration - do not modify                     
	private javax.swing.JTextField alphafield;
    private javax.swing.JLabel alphalabel;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel omegalabel;
    private javax.swing.JTextField omegafield;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> vweek;
    // End of variables declaration          
	
    //haha
    public int qran;
    public int pran;
    public int vran;
    public int cran;
    
    //ae
    public String qset;
    public String pset;
    public String vset;
    public String cset;

    
}