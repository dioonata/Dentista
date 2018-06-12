package dao;

import java.util.Scanner;
import modelo.Exame;
import modelo.LimpezaRestauracao;
import modelo.Servico;

public class ServicoDAO {

    public void registrarServico(/*String descricao, String preco*/) {
        Scanner leitura = new Scanner(System.in);
        Servico servico = new Servico();

        System.out.println("Informe a descricao da consulta: ");
        String descricao = leitura.nextLine();

        System.out.println("Informe o preço da consulta: ");
        Integer preco = leitura.nextInt();

        servico.setDescricao(descricao);
        servico.setPreco(preco);
    }

    public void recuperarServico() {
        

    }

}
