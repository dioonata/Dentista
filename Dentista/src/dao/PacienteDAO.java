package dao;

import modelo.Paciente;

public class PacienteDAO {

    Paciente p = new Paciente();

    public void cadastrarPaciente(Paciente paciente) {
        System.out.println("Paciente cadastrado no DAO estático: \n" + paciente);
    }

    public boolean verificarPacienteCadastrado(Integer id) {

        return id == p.getIdPaciente();

//        if (id.equals(1)) {
//            Paciente p = new Paciente();
//            p.setIdPaciente(1);
//            p.setNome("Dioônata Vieira");
//            p.setProfissao("Autonomo");
//            p.setTelefone("996725280");
//            p.setDataNascimento("13/01/1997");
//            p.setEndereco("Rua Alida Pommerening");
//            return p;
//        } else {
//            Paciente p2 = new Paciente();
//            p2.setIdPaciente(1);
//            p2.setNome("Dioônata Vieira");
//            p2.setProfissao("Autonomo");
//            p2.setTelefone("996725280");
//            p2.setDataNascimento("13/01/1997");
//            p2.setEndereco("Rua Alida Pommerening");
//            return p2;
//        }
    }

    public void obterConsulta() {
    }

    public void localizacaoPaciente() {
    }

}
