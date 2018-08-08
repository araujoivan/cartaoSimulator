/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.cartao;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author eder.crespo
 */
public class Tela {

    private TextField txtCartao = new TextField(17);
    private static int ESPERA = 4;

    public Tela(Cartao cartao) {

        criaInterface(cartao);

    }

    private void criaInterface(Cartao cartao) {

        JFrame framePrincipal = new JFrame("Cartão Simulator v 1.0");

        javax.swing.border.Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);

        framePrincipal.setSize(350, 120);

        framePrincipal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        JPanel painelPrincipal = new JPanel();

        painelPrincipal.setBorder(padding);

        Label lbCartao = new Label("Número do Cartão");

        painelPrincipal.setLayout(new GridLayout(2, 2));

        painelPrincipal.add(lbCartao);
        painelPrincipal.add(txtCartao);

        Button btPassar = new Button("Passar cartão");
        painelPrincipal.add(new Label(""));
        painelPrincipal.add(btPassar);

        framePrincipal.add(painelPrincipal, BorderLayout.NORTH);

        setNrCarteira(cartao.getNrCarteira());

        framePrincipal.setVisible(true);

        btPassar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new Thread() {
                    @Override
                    public void run() {

                        btPassar.setEnabled(!btPassar.isEnabled());
                        btPassar.requestFocus();
                        txtCartao.setEnabled(false);

                        for (int i = ESPERA; i >= 0; i--) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                return;
                            }

                            final int c = i;

                            SwingUtilities.invokeLater(new Runnable() {
                                @Override
                                public void run() {
                                    if (c > 0) {
                                        btPassar.setLabel("Aguardando... " + String.valueOf(c));
                                    } else {
                                        btPassar.setLabel("Passar Cartão");
                                    }
                                }
                            });
                        }

                        cartao.setNrCarteira(txtCartao.getText());

                        try {
                            cartao.passa();
                        } catch (AWTException ex) {
                            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        framePrincipal.setExtendedState(JFrame.ICONIFIED);
                        btPassar.setEnabled(!btPassar.isEnabled());
                        txtCartao.setEnabled(true);

                    }
                }.start();
            }
        });
    }

    public String getNrCarteira() {
        return txtCartao.getText();
    }

    public void setNrCarteira(String nrCarteira) {
        this.txtCartao.setText(nrCarteira);
    }
}
