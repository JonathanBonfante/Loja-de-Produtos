/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Enum;

/**
 *
 * @author jonathan.153417
 */
public enum ProdutosPreCadastrados {
    
    Panela(2556,"Panela","Tramontina",50.00,'a'),
    ToalhadeBanho(2532,"Toalha de Banho","Algodão",20.00,'a'),
    MicroOndas(2234,"Micro-Onda","Eletrolux",140.00,'a'),
    Travesseiro(2341,"Travesseiro","Da Nasa",100.00,'a'),
    Notbook(2431,"Notbook","Dell",3000.00,'a'),
    Televisao(2675,"Televisão","Sansung",1500.00,'a'),
    GuardaRoupas(2522,"Guarda Roupas","Itatiaia",500.00,'i'),
    Geladeira(2345,"Geladeira","Tramontina",2500.00,'i'),
    Arcondicionado(2980,"Ar condiciondo","Komeco",1500.00,'i'),
    Cama(2675,"Cama","Box",1100.00,'i');

    private int id;
    private String nome;
    private String descricao;
    private double valor;
    private char Status;

    private ProdutosPreCadastrados(int id, String nome, String descricao, double valor, char Status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.Status = Status;
    }

    public static ProdutosPreCadastrados getPanela() {
        return Panela;
    }

    public static ProdutosPreCadastrados getToalhadeBanho() {
        return ToalhadeBanho;
    }

    public static ProdutosPreCadastrados getMicroOndas() {
        return MicroOndas;
    }

    public static ProdutosPreCadastrados getTravesseiro() {
        return Travesseiro;
    }

    public static ProdutosPreCadastrados getNotbook() {
        return Notbook;
    }

    public static ProdutosPreCadastrados getTelevisao() {
        return Televisao;
    }

    public static ProdutosPreCadastrados getGuardaRoupas() {
        return GuardaRoupas;
    }

    public static ProdutosPreCadastrados getGeladeira() {
        return Geladeira;
    }

    public static ProdutosPreCadastrados getArcondicionado() {
        return Arcondicionado;
    }

    public static ProdutosPreCadastrados getCama() {
        return Cama;
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
        return Status;
    }
   
       
}
