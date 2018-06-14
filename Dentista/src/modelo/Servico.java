package modelo;

/**
 *
 * @author Dioônata
 */
public class Servico {
    
    private String descricao = "Vazio!";
    private Integer preco = 0;
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return " Descricao: " + descricao + "\n"
             + " Preco: " + preco ;
    }
    
    
    
}
