/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Objeto;

/**
 *
 * @author jonathan.153417
 */
public class Produto {
    private int id;
    private String nome, descricao;
    private double valor;
    private char status;

    public Produto(int id, String nome, String descricao, double valor, char status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public char getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", status=" + status + '}';
    }
        
    
    }

   
   
    
    
    

