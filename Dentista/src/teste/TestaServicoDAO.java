package teste;

import dao.ServicoDAO;
import modelo.LimpezaRestauracao;

public class TestaServicoDAO {
    public static void main(String[] args) {
        LimpezaRestauracao lr = new LimpezaRestauracao();
        
        lr.setDenteTratado("Canino");
        lr.setDescricao("Podre");
        lr.setMaterialUsado("faca");
        lr.setPreco(100);
        
        ServicoDAO servicoDao = new ServicoDAO();
        
        servicoDao.registrarServico(lr);
        
        
    }
}
