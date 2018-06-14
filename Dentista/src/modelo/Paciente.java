package modelo;


/**
 *
 * @author Dioônata
 */
public class Paciente {
    
    private Integer idPaciente;
    private String nome;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Número do Paciente:" + idPaciente + 
                "\n Nome: " + nome + 
                "\n Nndereco: " + endereco + 
                "\n Telefone: " + telefone + 
                "\n Data de Nascimento: " + dataNascimento + 
                "\n Profissão: " + profissao ;
    }
    
    
    
}
