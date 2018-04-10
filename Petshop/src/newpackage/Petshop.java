
package newpackage;

import java.util.InputMismatchException;
import model.Cliente;
import repositorio.RepositorioClientes;
import util.Console;
import java.util.ArrayList;

public class Petshop {
    
    public static void main(String[] args) {
        int opcao =0;
        do{
           
           try{
               System.out.println("\nMenu: ");
               System.out.println("1- Adicionar Cliente");
               System.out.println("2- Listar Clientes");
               System.out.println("0- Sair");
                opcao = Console.scanInt("Digite uma opcao: ");
           
              switch(opcao) {
                  case 1:
                 adicionarCliente();
                 break;
                 
                  case 2:
                   listarClientes()   ;
                   break;
                  
                  case 0:
                      System.out.println("Saindo do sistema....");   
                   break;
                  
                  default:
                      System.out.println("Opção inválida!!");  
              }
           } catch (InputMismatchException e) {
                System.err.println("Erro: Escolha a opcao correta!");
            }   
        } while (opcao != 0);
        
    }

    private static void adicionarCliente() {
        System.out.println("Adicionando Cliente....");
       
           String nome = Console.scanString("Nome: ");
           String rg = Console.scanString("Rg: ");
           String telefone = Console.scanString("Telefone: ");
           
           Cliente cliente = new Cliente(nome, rg, telefone);
            RepositorioClientes.getInstance().add(cliente);
            System.out.println("Cliente cadastrado com sucesso");
      
    }

    private static void listarClientes() {
        System.out.println("Listando Clientes...");
        if(RepositorioClientes.getInstance().getClientes()){
            System.out.println("Não há clientes cadastrados");
        }
        else{
            System.out.println(String.format("%-20s","|NOME"));
            System.out.print(String.format("%-10s","|RG"));
            System.out.print(String.format("%-10s","|TELEFONE"));
            
         for(Cliente c : RepositorioClientes.getInstance().getClientes()) {
             System.out.print(String.format("%-20s",c.getNome()));
             System.out.print(String.format("%-10s",c.getRg()));
             System.out.print(String.format("%-20s",c.getTelefone()));
             
         }
    }  
}
   
}
