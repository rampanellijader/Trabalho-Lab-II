
package View;

import ViewMenu.ClienteMenu;
import ViewMenu.PetMenu;
import model.Cliente;
import model.Pet;
import repositorio.RepositorioClientes;
import repositorio.RepositorioPet;
import util.Console;


public class PetUi {
    
      public void executar(){
        int opcao =0;
      do{
        System.out.println(PetMenu.getOpcoes());
        opcao = Console.scanChar("Digite uma opção: ");
        
        switch(opcao){
           case PetMenu.OP_CADASTRAR:
                 cadastrarPet();
             break;    
           case PetMenu.OP_LISTAR:
                 listarPet();
             break;    
           case PetMenu.OP_VOLTAR:
                System.out.println("Retornando ao menu inicial!"); 
        
           default: System.out.println("Opção inválida..");
        }
       } while (opcao != ClienteMenu.OP_VOLTAR);
    }

    private void cadastrarPet() {
            String nome = Console.scanString("Nome: ");
            String tp_animal = Console.scanString("Espécie: ");
           RepositorioPet.getInstance().add(new Pet(nome, tp_animal, cliente));
            System.out.println("Pet " +nome + " cadastrado com sucesso!");
        }

    private void listarPet() {
       if(RepositorioPet.getInstance().estaVazio()){
            System.out.println("-----------------------------");        
            System.out.println("Nao ha animais cadastrados");
            System.out.println("-----------------------------\n");
       }
 
           else {System.out.println("-----------------------------\n");
            System.out.println(String.format("%-20s", "NOME") + "\t"
                    + String.format("%-10s", "|ESPÉCIE") + "\t"
                    + String.format("%-20s", "|CLIENTE"));
            for (Pet pet : RepositorioPet.getInstance().getPet()) {
                System.out.println(String.format("%-20s", pet.getNome()) + "\t"
                        + String.format("%-20s", "|" + pet.getTp_animal()) +"\t"
                        + String.format("%-20s", "|" + pet.getCliente()));
    }
}
    }
 
    
    
    }

    


