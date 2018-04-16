/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc;


import br.edu.satc.Enum.Menu;
import br.edu.satc.Enum.ProdutosPreCadastrados;
import br.edu.satc.Objeto.Cliente;
import br.edu.satc.Objeto.Produto;
import br.edu.satc.Objeto.Venda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author jonathan.153417
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       ArrayList<Produto> produtos = new ArrayList<>(); 
       ArrayList<Cliente>clientes = new ArrayList<>();
       ArrayList<Venda>vendas = new ArrayList<>();
       int escMenu = 0; 
        for (ProdutosPreCadastrados p : ProdutosPreCadastrados.values()) {
            produtos.add(new Produto(p.getId(), p.getNome(),p.getDescricao(),p.getValor(),p.getStatus()));
        }
        
            String menu ="";
            for (Menu m : Menu.values()) {
                menu += m.getEscOpcao() + "  " + m.getNomeOpc() + "\n";
                
            }
          
       
       
       do{
        
        escMenu = Integer.parseInt(JOptionPane.showInputDialog(Menu.values()));
           
        
        switch (escMenu){
            case 1: {
           do{     
           
            int IDCliente = Integer.parseInt(JOptionPane.showInputDialog("Indique o ID do cliente:"));
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataCadastro = sdf.parse(JOptionPane.showInputDialog("Informe a data do Cadastro: "));
            char status = JOptionPane.showInputDialog("Informe o status:").charAt(0);
            String nomeCliente = JOptionPane.showInputDialog("Informe o nome do Cliente: ");
            String rgCliente  = JOptionPane.showInputDialog("Informe  o rg do Cliente: ");
            String cpfCliente = JOptionPane.showInputDialog("Informe o cpf do Cliente: ");
            Date dataNascimentoCliente = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do cliente: "));
            
           }while ((JOptionPane.showConfirmDialog(null, "Deseja continuar:")==0));
           break;
        }
            case 2 :{ 
              int IDProduto = Integer.parseInt(JOptionPane.showInputDialog("Indique o ID do Produto:")); 
              String nomeProduto = JOptionPane.showInputDialog("Informe o nome do Produto: ");
              String DescricaoProduto = JOptionPane.showInputDialog("Informe a Descricao do Produto:");
              double valorProduto = Double.parseDouble("Informe o valor do produto:");
              char statusProduto = JOptionPane.showInputDialog("Informe o status:").charAt(0);
              
              break;
              }
            
            case 3 : {
              String ClienteVenda = JOptionPane.showInputDialog("Informe o Cliente da venda: "); 
              float totalApagar = Float.parseFloat("Informe o total a ser pago:");
              String statusVenda = JOptionPane.showInputDialog("Informe o status:");
              int IDVenda= Integer.parseInt(JOptionPane.showInputDialog("Indique o ID da Venda:")); 
            }
              break;
            
            
            case 4 : {
                int pesquisarCliente = Integer.parseInt(JOptionPane.showInputDialog("Qual o cliente que você quer consultar: "));
                clientes.get(pesquisarCliente);
                JOptionPane.showConfirmDialog(null, clientes.get(pesquisarCliente).toString());
            }
                break;
            
            
            case 5 :{
                int pesquisarProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual o produto que você quer consultar: "));
                produtos.get(pesquisarProduto);
                JOptionPane.showConfirmDialog(null, produtos.get(pesquisarProduto).toString());
                
            }
            break;
            
            case 6: {
                int pesquisarVenda = Integer.parseInt(JOptionPane.showInputDialog("Qual a venda que você quer consultar: "));
                produtos.get(pesquisarVenda);
                JOptionPane.showConfirmDialog(null, vendas.get(pesquisarVenda).toString()); 
            }
            case 7 : {
                String produto = "";
                for (ProdutosPreCadastrados m : ProdutosPreCadastrados.values()){
                    produto +=m.getNome()+ "\n";
                }
                JOptionPane.showMessageDialog(null, produto);
            }
       }
    }while(escMenu != 8);  
  }
  }