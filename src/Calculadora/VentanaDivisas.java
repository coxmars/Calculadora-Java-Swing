package Calculadora;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class VentanaDivisas extends javax.swing.JFrame {
    private String divisaCambio1 = "";
    private String divisaCambio2 = "";
    private String cantidad = "";
    private double dinero, cambio;
    private boolean punto = true;
 
    
    public VentanaDivisas() {
        initComponents();
        this.setSize(300, 450);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(300,450));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem3 = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        divisaUno = new javax.swing.JLabel();
        cambio1 = new javax.swing.JLabel();
        comboDivisas1 = new javax.swing.JComboBox<>();
        divisaDos = new javax.swing.JLabel();
        cambio2 = new javax.swing.JLabel();
        comboDivisas2 = new javax.swing.JComboBox<>();
        buttonC = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        point = new javax.swing.JButton();
        barraMenuDivisas = new javax.swing.JMenuBar();
        menuDivisas = new javax.swing.JMenu();
        calculadora = new javax.swing.JMenuItem();
        divisas = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("              Conversor Divisas");

        panel.setLayout(new java.awt.GridBagLayout());

        divisaUno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        divisaUno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        divisaUno.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 5);
        panel.add(divisaUno, gridBagConstraints);

        cambio1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cambio1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(cambio1, gridBagConstraints);

        comboDivisas1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDivisas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar ", "Reino Unido - Libra Esterlina ", "Unión Europea - Euro", "Costa Rica - Colón " }));
        comboDivisas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboDivisas1, gridBagConstraints);

        divisaDos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        divisaDos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        divisaDos.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 5);
        panel.add(divisaDos, gridBagConstraints);

        cambio2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cambio2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(cambio2, gridBagConstraints);

        comboDivisas2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDivisas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar ", "Reino Unido - Libra Esterlina ", "Unión Europea - Euro", "Costa Rica - Colón " }));
        comboDivisas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboDivisas2, gridBagConstraints);

        buttonC.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        buttonC.setText("c");
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(buttonC, gridBagConstraints);

        deleteButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(deleteButton, gridBagConstraints);

        button7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button7, gridBagConstraints);

        button8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button8, gridBagConstraints);

        button9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button9, gridBagConstraints);

        button4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button4, gridBagConstraints);

        button5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button5, gridBagConstraints);

        button6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button6, gridBagConstraints);

        button1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button1, gridBagConstraints);

        button2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button2, gridBagConstraints);

        button3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button3, gridBagConstraints);

        button0.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button0, gridBagConstraints);

        point.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        point.setText(".");
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(point, gridBagConstraints);

        menuDivisas.setText("Usos");
        menuDivisas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        calculadora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora.png"))); // NOI18N
        calculadora.setText("Calculadora");
        calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraActionPerformed(evt);
            }
        });
        menuDivisas.add(calculadora);

        divisas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        divisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/divisas.png"))); // NOI18N
        divisas.setText("Conversor de Divisas");
        menuDivisas.add(divisas);
        menuDivisas.add(separator);

        exit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuDivisas.add(exit);

        barraMenuDivisas.add(menuDivisas);

        setJMenuBar(barraMenuDivisas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void calculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraActionPerformed
        VentanaCalculadora calculadora = new VentanaCalculadora();
        calculadora.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_calculadoraActionPerformed

    private void comboDivisas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas1ActionPerformed
        divisaCambio1 = (String) comboDivisas1.getSelectedItem();
        // This method return an object, so we put (String)
        
        if (divisaCambio1.startsWith("Estados")) {
            divisaUno.setText("$");
        }
        else if (divisaCambio1.startsWith("Reino")) {
            divisaUno.setText("£");
        }
        else if (divisaCambio1.startsWith("Unión")) {
            divisaUno.setText("€");
        }
        else if (divisaCambio1.startsWith("Costa")) {
            divisaUno.setText("₡");
        }
        obtenerDinero();
        
    }//GEN-LAST:event_comboDivisas1ActionPerformed

    private void comboDivisas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas2ActionPerformed
        divisaCambio2 = (String) comboDivisas2.getSelectedItem();
        // This method return an object, so we put (String)
        
        if (divisaCambio2.startsWith("Estados")) {
            divisaDos.setText("$");
        }
        else if (divisaCambio2.startsWith("Reino")) {
            divisaDos.setText("£");
        }
        else if (divisaCambio2.startsWith("Unión")) {
            divisaDos.setText("€");
        }
        else if (divisaCambio2.startsWith("Costa")) {
            divisaDos.setText("₡");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboDivisas2ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        if (cantidad != "") {
            if (cambio1.getText().equals("0")) {
                cantidad = "0";
            }
            else {
                cantidad += "0";
            }
            cambio1.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_button0ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "1";
        }
        else {
            cantidad += "1";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "2";
        }
        else {
            cantidad += "2";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "3";
        }
        else {
            cantidad += "3";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "4";
        }
        else {
            cantidad += "4";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "5";
        }
        else {
            cantidad += "5";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "6";
        }
        else {
            cantidad += "6";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "7";
        }
        else {
            cantidad += "7";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "8";
        }
        else {
            cantidad += "8";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        if (cambio1.getText().equals("0")) {
            cantidad = "9";
        }
        else {
            cantidad += "9";
        }
        cambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_button9ActionPerformed

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCActionPerformed
        cantidad = "";
        punto = true;
        cambio1.setText("0");
        cambio2.setText("0");
    }//GEN-LAST:event_buttonCActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        if (punto == true) {
            if (cantidad == "") {
                cantidad = "0.";
            } 
            else {
                cantidad += ".";
            }
            cambio1.setText(cantidad);
            punto = false;
        }
    }//GEN-LAST:event_pointActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int tamaño = cantidad.length();
        if(tamaño > 0){
            if(tamaño == 1){
                cantidad = "0";
            }
            else{
                cantidad = cantidad.substring(0, cantidad.length()-1);
            }
            cambio1.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    
    private void obtenerDinero() {
        cantidad = cambio1.getText();
        dinero = Double.parseDouble(cantidad);
        cambioDivisasOperacion();
        dinero *= cambio;
        cambio2.setText(String.format("%.2f", dinero));
    }
    
    
    private void cambioDivisasOperacion () {
        if (divisaCambio1.startsWith(divisaCambio2)) {
            cambio = 1;
        }
        /*
        Estados Unidos - Dólar 
        Reino Unido - Libra Esterlina 
        Unión Europea - Euro
        Costa Rica - Colón 
        */
        else if (divisaCambio1.startsWith("Estados") && divisaCambio2.startsWith("Costa")) {
            cambio = 624.183;
        }
        else if (divisaCambio1.startsWith("Estados") && divisaCambio2.startsWith("Reino")) {
            cambio = 0.732064;
        }
        else if (divisaCambio1.startsWith("Estados") && divisaCambio2.startsWith("Unión")) {
            cambio = 0.852721;
        }
        else if (divisaCambio1.startsWith("Costa") && divisaCambio2.startsWith("Estados")) {
            cambio = 0.00160206;
        }
        else if (divisaCambio1.startsWith("Costa") && divisaCambio2.startsWith("Reino")) {
            cambio = 0.00117294;
        }
        else if (divisaCambio1.startsWith("Costa") && divisaCambio2.startsWith("Unión")) {
            cambio = 0.00136603;
        }
        else if (divisaCambio1.startsWith("Reino") && divisaCambio2.startsWith("Estados")) {
            cambio = 1.36574;
        }
        else if (divisaCambio1.startsWith("Reino") && divisaCambio2.startsWith("Costa")) {
            cambio = 852.529;
        }
        else if (divisaCambio1.startsWith("Reino") && divisaCambio2.startsWith("Unión")) {
            cambio = 1.1647;
        }
        else if (divisaCambio1.startsWith("Unión") && divisaCambio2.startsWith("Estados")) {
            cambio = 1.17285;
        }
        else if (divisaCambio1.startsWith("Unión") && divisaCambio2.startsWith("Costa")) {
            cambio = 732.382;
        }
        else if (divisaCambio1.startsWith("Unión") && divisaCambio2.startsWith("Reino")) {
            cambio = 0.858606;
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
       } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenuDivisas;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonC;
    private javax.swing.JMenuItem calculadora;
    private javax.swing.JLabel cambio1;
    private javax.swing.JLabel cambio2;
    private javax.swing.JComboBox<String> comboDivisas1;
    private javax.swing.JComboBox<String> comboDivisas2;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel divisaDos;
    private javax.swing.JLabel divisaUno;
    private javax.swing.JMenuItem divisas;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuDivisas;
    private javax.swing.JPanel panel;
    private javax.swing.JButton point;
    private javax.swing.JPopupMenu.Separator separator;
    // End of variables declaration//GEN-END:variables
}
