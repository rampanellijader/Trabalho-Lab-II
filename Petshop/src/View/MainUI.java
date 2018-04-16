
package View;

import ViewMenu.MainMenu;
import model.Pet;
import util.Console;

public class MainUI {
    int opcao =0;
    do{
     System.out.println(MainMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
    switch(opcao){
        case MainMenu.OP_CLIENTES:
          new ClienteUi().executar();  
        break;
        case MainMenu.OP_PETS:
          new Pet.PetUi().executar();
        break; 
        case MainMenu.OP_SAIR:
                    System.out.println("Aplicação finalizada!!!");
                    break;
                default:
                    System.out.println("Opção inválida..");
    
    } 
} while(opcao != MainMenu.OP_SAIR);

}
