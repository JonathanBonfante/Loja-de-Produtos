/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Enum;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathan.153417
 */
public enum Menu {
    

    esc1("CadastrarCliente",1),
    esc2("CadastrarProduto",2),
    esc3("CadastrarVenda",3),
    esc4("ConsultarCliente",4),
    esc5("ConsultarProduto",5),
    esc6("ConsultarVenda",6),
    esc7("Produtos pre cadastrados",7),
    esc8("Sair",8);
    
    private String NomeOpc;
    private int escOpcao;

    private Menu(String NomeOpc, int escOpcao) {
        this.NomeOpc = NomeOpc;
        this.escOpcao = escOpcao;
    }

    public static Menu getEsc1() {
        return esc1;
    }

    public static Menu getEsc2() {
        return esc2;
    }

    public static Menu getEsc3() {
        return esc3;
    }

    public static Menu getEsc4() {
        return esc4;
    }

    public static Menu getEsc5() {
        return esc5;
    }

    public static Menu getEsc6() {
        return esc6;
    }

    public static Menu getEsc7() {
        return esc7;
    }

    public static Menu getEsc8() {
        return esc8;
    }

    public String getNomeOpc() {
        return NomeOpc;
    }

    public int getEscOpcao() {
        return escOpcao;
    }
    @Override
    public String toString() {
        return "Menu{" + "NomeOpc=" + NomeOpc + ", escOpcao=" + escOpcao + '}';
    }

   
}