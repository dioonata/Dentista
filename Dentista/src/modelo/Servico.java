package modelo;

import dao.ServicoDAO;

/**
 *
 * @author Dioônata
 */
public class Servico extends ServicoDAO{
    
    private String descricao = "Vazio!";
    private Integer preco = 0;
    
    
//    Servico(String descricao, Integer preco){
//        this.descricao = descricao;
//        this.preco = preco;
//    }
    

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
    
    
    
}
