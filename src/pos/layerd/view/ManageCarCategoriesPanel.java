/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layerd.view;

import javax.swing.JOptionPane;
import pos.layerd.controller.CarCategoryController;
import pos.layerd.dto.CarCategoryDto;

/**
 *
 * @author ASUS
 */
public class ManageCarCategoriesPanel extends javax.swing.JPanel {

    private CarCategoryController carCategoryController;
    public ManageCarCategoriesPanel() {
        carCategoryController=new CarCategoryController();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageCarCategoriesHeaderPanel = new javax.swing.JPanel();
        manageCarCategoriesHeaderLabel = new javax.swing.JLabel();
        manageCarCategoriesTopPanel = new javax.swing.JPanel();
        categoryIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        dailyRateLabel = new javax.swing.JLabel();
        categoryIDTextfield = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        dailyRateTextfield = new javax.swing.JTextField();
        addCategoriesButton = new javax.swing.JButton();
        deleteCategoriesButton = new javax.swing.JButton();
        updateCategoriesButton = new javax.swing.JButton();
        manageCarCategoriesBottomPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        manageCarCategoriesHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manageCarCategoriesHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageCarCategoriesHeaderLabel.setText("Manage Car Categories");

        javax.swing.GroupLayout manageCarCategoriesHeaderPanelLayout = new javax.swing.GroupLayout(manageCarCategoriesHeaderPanel);
        manageCarCategoriesHeaderPanel.setLayout(manageCarCategoriesHeaderPanelLayout);
        manageCarCategoriesHeaderPanelLayout.setHorizontalGroup(
            manageCarCategoriesHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageCarCategoriesHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manageCarCategoriesHeaderPanelLayout.setVerticalGroup(
            manageCarCategoriesHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageCarCategoriesHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        categoryIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryIDLabel.setText("Category ID");

        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");

        dailyRateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dailyRateLabel.setText("Daily Rate");

        nameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dailyRateTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        addCategoriesButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addCategoriesButton.setText("Add Categories");
        addCategoriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoriesButtonActionPerformed(evt);
            }
        });

        deleteCategoriesButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteCategoriesButton.setText("Delete categories");

        updateCategoriesButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateCategoriesButton.setText("Update Categories");

        javax.swing.GroupLayout manageCarCategoriesTopPanelLayout = new javax.swing.GroupLayout(manageCarCategoriesTopPanel);
        manageCarCategoriesTopPanel.setLayout(manageCarCategoriesTopPanelLayout);
        manageCarCategoriesTopPanelLayout.setHorizontalGroup(
            manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageCarCategoriesTopPanelLayout.createSequentialGroup()
                .addGroup(manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(manageCarCategoriesTopPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dailyRateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryIDTextfield)
                            .addComponent(nameTextField)
                            .addComponent(dailyRateTextfield)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, manageCarCategoriesTopPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(addCategoriesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(deleteCategoriesButton)))
                .addGap(105, 105, 105)
                .addComponent(updateCategoriesButton)
                .addGap(107, 107, 107))
        );
        manageCarCategoriesTopPanelLayout.setVerticalGroup(
            manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageCarCategoriesTopPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryIDLabel)
                    .addComponent(categoryIDTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dailyRateLabel)
                    .addComponent(dailyRateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageCarCategoriesTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCategoriesButton)
                    .addComponent(deleteCategoriesButton)
                    .addComponent(updateCategoriesButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout manageCarCategoriesBottomPanelLayout = new javax.swing.GroupLayout(manageCarCategoriesBottomPanel);
        manageCarCategoriesBottomPanel.setLayout(manageCarCategoriesBottomPanelLayout);
        manageCarCategoriesBottomPanelLayout.setHorizontalGroup(
            manageCarCategoriesBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        manageCarCategoriesBottomPanelLayout.setVerticalGroup(
            manageCarCategoriesBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageCarCategoriesBottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageCarCategoriesHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageCarCategoriesBottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageCarCategoriesTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(manageCarCategoriesHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageCarCategoriesTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageCarCategoriesBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCategoriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoriesButtonActionPerformed
        addCarCategory();
    }//GEN-LAST:event_addCategoriesButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategoriesButton;
    private javax.swing.JLabel categoryIDLabel;
    private javax.swing.JTextField categoryIDTextfield;
    private javax.swing.JLabel dailyRateLabel;
    private javax.swing.JTextField dailyRateTextfield;
    private javax.swing.JButton deleteCategoriesButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel manageCarCategoriesBottomPanel;
    private javax.swing.JLabel manageCarCategoriesHeaderLabel;
    private javax.swing.JPanel manageCarCategoriesHeaderPanel;
    private javax.swing.JPanel manageCarCategoriesTopPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton updateCategoriesButton;
    // End of variables declaration//GEN-END:variables

    private void addCarCategory() {
        CarCategoryDto carCategoryDto=new CarCategoryDto(categoryIDTextfield.getText(), nameTextField.getText(), Double.parseDouble(dailyRateTextfield.getText()));
    
        String result=carCategoryController.addCarCategory(carCategoryDto);
        JOptionPane.showMessageDialog(this, result);
        clear();
    }
    private void clear(){
        categoryIDTextfield.setText("");
        nameTextField.setText("");
        dailyRateTextfield.setText("");
    }
}
