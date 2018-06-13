package teste;

import modelo.Servico;

public class TestaServico {
    public static void main(String[] args) {
        Servico servico = new Servico();
        
        servico.registrarServico();
        System.out.println("-----------------------------");
        servico.verServico();
        
    }
}
