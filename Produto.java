/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author aluno9
 */
public class Produto {
   private String descricao;
   private double preco;
   private int estoque;
   public void setDescrição(String entraDescricao){
       this.descricao = entraDescricao;
   }
   public void setPreco(double entraPreco){
       this.preco= entraPreco;
   }
   public String getDescricao(){
       return this.descricao;
   }
   public double getPreco(){
       return this.preco;
   }
   public void addEstoque(int entraEstoque){
       this.estoque += entraEstoque;
   }
   public void redEstoque(int saiEstoque){
        this.estoque -= saiEstoque;
   }
   
   public int estoque(){
       return this.estoque;
   }
   
   
}
