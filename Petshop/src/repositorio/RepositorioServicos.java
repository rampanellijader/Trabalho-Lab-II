
package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Servico;

public class RepositorioServicos {
     private List<Servico> servicos;
    private static  RepositorioServicos instance = null;
    
    private RepositorioServicos(){
        servicos = new ArrayList<Servico>();
    }
    
    public static RepositorioServicos getInstance(){
      if(instance == null)  instance = new RepositorioServicos();
       return instance;
    }
    
    public boolean add(Servico servico){
        return servicos.add(servico);
    }
    
    public boolean estaVazio(){
        return servicos.isEmpty();
    }
    
    public List<Servico> getServico(){
        return servicos;
    }
    
   /* public boolean PetExiste(String nome){
        for(Pet pet : pets){
        if(pet.getNome().equals(nome)){
            return true;
         }
      }
        return false;
        
    }*/
    
    public  Servico BuscarServico(int nr_servico){
         for(Servico servico : servicos){
        if(servico.getNr_servico().equals(nr_servico)){
            return servico;
         }
     }
        return null;
    }

  
}
