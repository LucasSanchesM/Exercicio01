/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;


public class Pagamento {
    private double valorPago;
    private double valorTotal;
    
    public void inserirValor(double valorItem){
        this.valorTotal +=valorItem;
    }
    public double getValorTotal(){
        return this.valorTotal;
    }
    
    public void pagamentoCartao(double limite){
        if(limite>valorPago){
            this.valorTotal = 0;
        }
        else{
            System.out.println("Limite insuficiente");
        }
    }
    public void pagamentoDinheiro(double entraPagamento){
        this.valorPago += entraPagamento;
    }
    public void verificarPagamento(){
        System.out.printf("Faltam %.2f para o total ser pago\n", this.valorTotal-this.valorPago);
    }
    
}
