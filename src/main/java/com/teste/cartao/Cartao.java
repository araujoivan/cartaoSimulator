/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.cartao;

import java.awt.AWTException;

/**
 *
 *
 *
 *
 *
 * @author eder.crespo
 */
public class Cartao {

    private Robo robo;

    private String nomeBeneficiario = "USUARIO ROBO";
    private String nrCarteira = "00297700036000095";
    private String data = "010101";
    private String param = "99999999999";
    private int espera = 4;

    public void passa() throws AWTException, InterruptedException {

        Thread.sleep(getEspera());
        
        robo = new Robo();

        robo.digita("%");
        robo.digita(getNomeBeneficiario());
        robo.digitaInterrogacao();
        robo.digita("\n");
        robo.digita(";");
        robo.digita(getNrCarteira());
        robo.digita("=");
        robo.digita(getData());
        robo.digita("=");
        robo.digita(getParam());
        robo.digitaInterrogacao();
        robo.digita("\n");
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getNrCarteira() {
        return nrCarteira;
    }

    public void setNrCarteira(String nrCarteira) {
        this.nrCarteira = nrCarteira;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getEspera() {
        return espera;
    }

    public void setEspera(int espera) {
        this.espera = espera;
    }
}
