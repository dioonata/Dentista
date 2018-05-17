package dentista;

import java.util.Date;

/**
 *
 * @author Dioônata
 */
public class Paciente {
    
    String nome;
    int endereco;
    String telefone;
    Date dataNascimento;
    String profissao;

    public Paciente(String nome, int endereco, String telefone, Date dataNascimento, String profissao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void verificarPacienteCadastrado(){}
    public void adicionaPaciente(){}
    public void obterPaciente(){}
    public void obterConsulta(){}
    public void localizacaoPaciente(){}
    public void cadastrarPaciente(){}
    
    
    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    
    
}
