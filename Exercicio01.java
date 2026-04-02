/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;
import java.util.ArrayList;
/**
 *
 * @author aluno9
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente novoGerente = new Gerente();
        novoGerente.setId(20);
        novoGerente.setSenha(123);
        
        
        
        int valorIdInserido = 20;
        int valorSenhaInserido = 123;
        int conectado = 0;
        if(valorIdInserido == novoGerente.getId() && (valorSenhaInserido == novoGerente.getSenha())){
            conectado = 1;
        }
        else{
            System.out.println("Login incorreto");
        }
        
        while(conectado ==1){
        Operador novoOperador = new Operador();
        novoOperador.setId(21);
        novoOperador.setSenha(200);
        int idInserido = 21;
        int senhaInserida = 200;
        
        if(idInserido == novoOperador.getId() && (senhaInserida == novoOperador.getSenha())){
            Produto novoProduto = new Produto();
            novoProduto.addEstoque(8);
            novoProduto.setDescrição("Pacoca");
            novoProduto.setPreco(2);
            
            Produto novoProduto2 = new Produto();
            novoProduto2.addEstoque(8);
            novoProduto2.setDescrição("Salgado");
            novoProduto2.setPreco(8);

            Produto novoProduto3 = new Produto();
            novoProduto3.addEstoque(2);
            novoProduto3.setDescrição("Arroz 5kg");
            novoProduto3.setPreco(10);

            ArrayList <Produto> compra = new ArrayList<>();
            //escolho 1 item de cada
            compra.add(novoProduto);
            compra.add(novoProduto2);
            compra.add(novoProduto3);
            //efetuando compra
            Pagamento novoPagamento = new Pagamento();
            for(int i = 0; i < compra.size(); i++){
                compra.get(i).redEstoque(1);
                novoPagamento.inserirValor(compra.get(i).getPreco());
            }
            System.out.println("Valor total: "+ novoPagamento.getValorTotal());
            System.out.println("Insira o metodo de pagamento: ");
            //vamos supor que o pagamento é feito por dinheiro
            novoPagamento.pagamentoDinheiro(20);
            novoPagamento.verificarPagamento();
            break;
            }
        else{
            System.out.println("Senha incorreta");
        }
            
        }
    }
    
}
