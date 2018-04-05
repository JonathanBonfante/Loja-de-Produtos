/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Objeto;

import java.util.ArrayList;

/**
 *
 * @author jonathan.153417
 */
public class Venda {
 private String cliente;
 private ArrayList <Produto> Produto= new ArrayList<>();
 private float totalAPagar;
 private String status;
 private int id;

    public Venda(String cliente, float totalAPagar, String status, int id) {
        this.cliente = cliente;
        this.totalAPagar = totalAPagar;
        this.status = status;
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProduto() {
        return Produto;
    }

    public void setProduto(ArrayList<Produto> Produto) {
        this.Produto = Produto;
    }

    public float getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(float totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Venda{" + "cliente=" + cliente + ", Produto=" + Produto + ", totalAPagar=" + totalAPagar + ", status=" + status + ", id=" + id + '}';
    }
 
    
}
