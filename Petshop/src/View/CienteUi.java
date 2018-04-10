
package View;

import ViewMenu.ClienteMenu;
import model.Cliente;
import repositorio.RepositorioClientes;
import util.Console;


public class CienteUi {
    public void executar(){
        int opcao =0;
      do{
        System.out.println(ClienteMenu.getOpcoes());
        opcao = Console.scanChar("Digite uma opção: ");
        
        switch(opcao){
           case ClienteMenu.OP_CADASTRAR:
                 cadastrarCliente();
             break;    
           case ClienteMenu.OP_LISTAR:
                 listarCliente();
             break;    
           case ClienteMenu.OP_VOLTAR:
                System.out.println("Retornando ao menu inicial!"); 
        
           default: System.out.println("Opção inválida..");
        }
       } while (opcao != ClienteMenu.OP_VOLTAR);
    }

    private void cadastrarCliente() {
         String rg = Console.scanString("RG: ");
        if (RepositorioClientes.getInstance().ClienteExiste(rg)) {
            System.out.println("RG já existente no cadastro");
        } else {
            String nome = Console.scanString("Nome: ");
            String telefone = Console.scanString("Telefone: ");
           RepositorioClientes.getInstance().add(new Cliente(nome, rg, telefone));
            System.out.println("Paciente " +nome + " cadastrado com sucesso!");
        }
    }

    private void listarCliente() {
     if(RepositorioClientes.getInstance().estaVazio()){
            System.out.println("-----------------------------");        
            System.out.println("Nao ha clientes cadastrados");
            System.out.println("-----------------------------\n");
        }
        else{
            System.out.println("-----------------------------\n");
            System.out.println(String.format("%-10s", "RG") + "\t"
                    + String.format("%-20s", "|NOME") + "\t"
                    + String.format("%-20s", "|TELEFONE"));
            for (Cliente cliente : RepositorioClientes.getInstance().getClientes()) {
                System.out.println(String.format("%-10s", cliente.getRg()) + "\t"
                        + String.format("%-20s", "|" + cliente.getNome()));
    }
}
    }
}