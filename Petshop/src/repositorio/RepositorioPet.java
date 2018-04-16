
package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Pet;


public class RepositorioPet {
  private List<Pet> pets;
    private static  RepositorioPet instance = null;
    
    private RepositorioPet(){
        pets = new ArrayList<Pet>();
    }
    
    public static RepositorioPet getInstance(){
      if(instance == null)  instance = new RepositorioPet();
       return instance;
    }
    
    public boolean add(Pet pet){
        return pets.add(pet);
    }
    
    public boolean estaVazio(){
        return pets.isEmpty();
    }
    
    public List<Pet> getPet(){
        return pets;
    }
    
   /* public boolean PetExiste(String nome){
        for(Pet pet : pets){
        if(pet.getNome().equals(nome)){
            return true;
         }
      }
        return false;
        
    }*/
    
    public  Pet BuscarPet(String nome){
         for(Pet pet : pets){
        if(pet.getNome().equals(nome)){
            return pet;
         }
     }
        return null;
    }

  
   
    
}
