
package Calculadora;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaCalculadora extends javax.swing.JFrame {
    private String numbersString = "";
    private double number1, result;
    private String operation = "nula";
    private boolean activate = true; // This to validate the process
    private boolean point = true;  
    
    public VentanaCalculadora() {
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
        showLabel = new javax.swing.JLabel();
        numbersLabel = new javax.swing.JLabel();
        buttonC = new javax.swing.JButton();
        buttonRaiz = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonX = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        lessButton = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        changeSign = new javax.swing.JButton();
        buttonZero = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        calculadora = new javax.swing.JMenuItem();
        conversor = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                   Calculadora");
        setMinimumSize(new java.awt.Dimension(300, 450));
        setPreferredSize(new java.awt.Dimension(300, 450));

        panel.setLayout(new java.awt.GridBagLayout());

        showLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        showLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(showLabel, gridBagConstraints);

        numbersLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        numbersLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numbersLabel.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(numbersLabel, gridBagConstraints);

        buttonC.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        buttonC.setText("c");
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(buttonC, gridBagConstraints);

        buttonRaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/raizCuadrada.png"))); // NOI18N
        buttonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRaizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(buttonRaiz, gridBagConstraints);

        divisionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dividir.png"))); // NOI18N
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(divisionButton, gridBagConstraints);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(deleteButton, gridBagConstraints);

        button7.setBackground(new java.awt.Color(204, 204, 204));
        button7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button7, gridBagConstraints);

        button8.setBackground(new java.awt.Color(204, 204, 204));
        button8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button8, gridBagConstraints);

        button9.setBackground(new java.awt.Color(204, 204, 204));
        button9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button9, gridBagConstraints);

        buttonX.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        buttonX.setText("x");
        buttonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(buttonX, gridBagConstraints);

        button4.setBackground(new java.awt.Color(204, 204, 204));
        button4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button4, gridBagConstraints);

        button5.setBackground(new java.awt.Color(204, 204, 204));
        button5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button5, gridBagConstraints);

        button6.setBackground(new java.awt.Color(204, 204, 204));
        button6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button6, gridBagConstraints);

        lessButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lessButton.setText("-");
        lessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(lessButton, gridBagConstraints);

        button1.setBackground(new java.awt.Color(204, 204, 204));
        button1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button1, gridBagConstraints);

        button2.setBackground(new java.awt.Color(204, 204, 204));
        button2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button2, gridBagConstraints);

        button3.setBackground(new java.awt.Color(204, 204, 204));
        button3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(button3, gridBagConstraints);

        addButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(addButton, gridBagConstraints);

        changeSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/masMenos.png"))); // NOI18N
        changeSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSignActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(changeSign, gridBagConstraints);

        buttonZero.setBackground(new java.awt.Color(204, 204, 204));
        buttonZero.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        buttonZero.setText("0");
        buttonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(buttonZero, gridBagConstraints);

        pointButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        pointButton.setText(".");
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(pointButton, gridBagConstraints);

        equalButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(equalButton, gridBagConstraints);

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        calculadora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora.png"))); // NOI18N
        calculadora.setText("Calculadora");
        menu.add(calculadora);

        conversor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        conversor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/divisas.png"))); // NOI18N
        conversor.setText("Conversor de Divisas");
        conversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorActionPerformed(evt);
            }
        });
        menu.add(conversor);
        menu.add(separator);

        exit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menu.add(exit);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void conversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorActionPerformed
        VentanaDivisas conversor = new VentanaDivisas();
        conversor.setVisible(true);
        this.dispose(); // This to avoid duplication windows
    }//GEN-LAST:event_conversorActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "1";
        } 
        else {
            numbersString += "1";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "2";
        } 
        else {
            numbersString += "2";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "3";
        } 
        else {
            numbersString += "3";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "4";
        } 
        else {
            numbersString += "4";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "5";
        } 
        else {
            numbersString += "5";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "6";
        } 
        else {
            numbersString += "6";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "7";
        } 
        else {
            numbersString += "7";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "8";
        } 
        else {
            numbersString += "8";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        if ("0".equals(numbersLabel.getText())) {
            numbersString = "9";
        } 
        else {
            numbersString += "9";
        }
        numbersLabel.setText(numbersString);
        activate = true;
    }//GEN-LAST:event_button9ActionPerformed

    private void buttonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZeroActionPerformed
        if (!(numbersString.isBlank())) {
            if ("0".equals(numbersLabel.getText())) {
                numbersString = "0";
            } 
            else {
                numbersString += "0";
            }
            numbersLabel.setText(numbersString);
        }
    }//GEN-LAST:event_buttonZeroActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (activate == true) {
            number1 = Double.parseDouble(numbersString);
            showLabel.setText(numbersString.concat(" + "));
            numbersString = "";
            operation = "sumar";
            activate = false; // Here we validate, do not press more than 1 time the button
            point = true;
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        double number2;
        if (operation.equals("nula")) {
            numbersLabel.setText(numbersString);
        }
        else if (operation.equals("sumar")) {
            number2 = Double.parseDouble(numbersString);
            result = number1 + number2;
            numbersLabel.setText(String.format("%.2f", result));
            numbersString = String.valueOf(result);
            operation = "nula";
        }
        else if (operation.equals("restar")) {
            number2 = Double.parseDouble(numbersString);
            result = number1 - number2;
            numbersLabel.setText(String.format("%.2f", result));
            numbersString = String.valueOf(result);
            operation = "nula";
        }
        else if (operation.equals("multiplicar")) {
            number2 = Double.parseDouble(numbersString);
            result = number1 * number2;
            numbersLabel.setText(String.format("%.2f", result));
            numbersString = String.valueOf(result);
            operation = "nula";
        }
        else if (operation.equals("dividir")) {
            number2 = Double.parseDouble(numbersString);
            result = number1 / number2;
            numbersLabel.setText(String.format("%.2f", result));
            numbersString = String.valueOf(result);
            operation = "nula";
        }
        
        showLabel.setText(""); // We delete the operation after the result
        activate = true;
        
    }//GEN-LAST:event_equalButtonActionPerformed

    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointButtonActionPerformed
        if (point == true) {
            if (numbersString.isBlank()) {
                numbersString = "0.";
            } else {
                numbersString += ".";
                numbersLabel.setText(numbersString);
            }
            numbersLabel.setText(numbersString);
            point = false;
        }
    }//GEN-LAST:event_pointButtonActionPerformed

    private void changeSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSignActionPerformed
        if (numbersString.charAt(0) != '-') {
            numbersString = "-".concat(numbersString);
        }
        else {
            numbersString = numbersString.substring(1, numbersString.length()); 
            // Here we delete the negative sign, to put the number in a positive way
        }
        numbersLabel.setText(numbersString);
    }//GEN-LAST:event_changeSignActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int tamanio = numbersString.length();
        if (tamanio > 0) {
            if (tamanio == 1) {
                numbersString = "0";
            } 
            else {
                numbersString = numbersString.substring(0, numbersString.length() - 1);
            }
            numbersLabel.setText(numbersString);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void lessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessButtonActionPerformed
        if (activate == true) {
            number1 = Double.parseDouble(numbersString);
            showLabel.setText(numbersString.concat(" - "));
            numbersString = "";
            operation = "restar";
            activate = false; // Here we validate, do not press more than 1 time the button
            point = true;
        }
    }//GEN-LAST:event_lessButtonActionPerformed

    private void buttonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXActionPerformed
        if (activate == true) {
            number1 = Double.parseDouble(numbersString);
            showLabel.setText(numbersString.concat(" x "));
            numbersString = "";
            operation = "multiplicar";
            activate = false; // Here we validate, do not press more than 1 time the button
            point = true;
        }
    }//GEN-LAST:event_buttonXActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        if (activate == true) {
            number1 = Double.parseDouble(numbersString);
            showLabel.setText(numbersString.concat(" / "));
            numbersString = "";
            operation = "dividir";
            activate = false; // Here we validate, do not press more than 1 time the button
            point = true;
        }
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void buttonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRaizActionPerformed
        number1 = Double.parseDouble(numbersString);
        showLabel.setText("sqrt(" + numbersString + ")");
        result = Math.sqrt(number1);
        numbersLabel.setText(String.format("%.2f", result));
        numbersString = String.valueOf(result);
        point = true;
    }//GEN-LAST:event_buttonRaizActionPerformed

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCActionPerformed
        showLabel.setText("");
        numbersLabel.setText("0");
        numbersString = "";
        operation = "nula";
        activate = true; 
        point = true;  
    }//GEN-LAST:event_buttonCActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            // com.jtattoo.plaf.texture.TextureLookAndFeel this was used by Alejandro
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
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    
    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JMenuBar barraMenu;
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
    private javax.swing.JButton buttonRaiz;
    private javax.swing.JButton buttonX;
    private javax.swing.JButton buttonZero;
    private javax.swing.JMenuItem calculadora;
    private javax.swing.JButton changeSign;
    private javax.swing.JMenuItem conversor;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton lessButton;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel numbersLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JButton pointButton;
    private javax.swing.JPopupMenu.Separator separator;
    private javax.swing.JLabel showLabel;
    // End of variables declaration//GEN-END:variables
}
