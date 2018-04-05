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
    

    CadastraCliente(1),
    CadastrarProduto(2),
    CadastrarVenda(3),
    ConsultarCliente(4),
    ConsultarProduto(5),
    ConsultarVenda(6);
    
    private int escolhaOpcao;

    private Menu(int escolhaOpcao) {
        this.escolhaOpcao = escolhaOpcao;
    }

    public static Menu getCadastraCliente() {
        return CadastraCliente;
    }

    public static Menu getCadastrarProduto() {
        return CadastrarProduto;
    }

    public static Menu getCadastrarVenda() {
        return CadastrarVenda;
    }


    public static Menu getConsultarCliente() {
        return ConsultarCliente;
    }

    public static Menu getConsultarProduto() {
        return ConsultarProduto;
    }

    public static Menu getConsultarVenda() {
        return ConsultarVenda;
    }

    public int getEscolhaOpcao() {
        return escolhaOpcao;
    }

    @Override
    public String toString() {
        return "Menu{" + "escolhaOpcao=" + escolhaOpcao + '}';
    }
    
    
    
    
      
}