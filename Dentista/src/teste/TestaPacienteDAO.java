package teste;

import dao.PacienteDAO;
import modelo.Paciente;

public class TestaPacienteDAO {


     
    public static void main(String[] args) {
        Paciente p = new Paciente();

        p.setIdPaciente(1);
        p.setNome("Dioônata Vieira");
        p.setProfissao("Autonomo");
        p.setTelefone("996725280");
        p.setDataNascimento("13/01/1997");
        p.setEndereco("Rua Alida Pommerening");
        
        PacienteDAO pdao = new PacienteDAO();
        
        pdao.cadastrarPaciente(p);
        System.out.println("paciente cadastrado.");
        
        if (pdao.verificarPacienteCadastrado(1)) {
            System.out.println("paciente 1 existe");
        } else {
            System.out.println("paciente 1 não existe");
        }
        
    }

}
