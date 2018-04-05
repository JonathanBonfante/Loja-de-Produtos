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
    private String nome, descricao, status;
    private double valor;

    public Produto(int id, String nome, String descricao, String status, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", status=" + status + ", valor=" + valor + '}';
    }
    
    
}
