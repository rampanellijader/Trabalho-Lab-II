
package model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendaServicos {
    private static int cd_servico = 1;
    private LocalDateTime diaHora;
    private Servico servico;
    private Cliente cliente;
        List<Servico> atendimento;
    
    public  VendaServicos(Cliente c, Servico s){
        this.diaHora = LocalDateTime.now();
        this.cliente = c;
        this.servico = s;
        this.atendimento = new ArrayList<>();
    
}
    public VendaServicos(LocalDateTime dh, Cliente c, Servico s){
        this.cd_servico = generateCodigo();
        this.diaHora  = dh;
        this.cliente = c;
        this.servico = s;
        this.atendimento = new ArrayList<>();
    }
    
    
    
    public void adicionaServico(Servico s){
       servico.add(s); 
    }
    public LocalDateTime getDiaHora() {
        return diaHora;
    }

    public int qtdServicos(){
        return (servico.size());
    }
    public Servico getServicos() {
        return servico;
    }

    private int generateCodigo() {
          return (cd_servico++);
    }

    
}
