package dao;

import java.util.Scanner;
import modelo.LimpezaRestauracao;
import modelo.Servico;

public class ServicoDAO extends LimpezaRestauracao {

    public void registrarServico(/*String descricao, String preco*/) {
        Scanner leitor = new Scanner(System.in);
        Servico servico = new Servico();

        System.out.println("Informe a descricao da consulta: ");
        String descricao = leitor.nextLine();

        System.out.println("Informe o preço da consulta: ");
        Integer preco = leitor.nextInt();

        servico.setDescricao(descricao);
        servico.setPreco(preco);

//        System.out.println("Deseja ver o cadastro S/N: ");
//        String resultado = leitor.nextLine();
//
//        if (resultado.equalsIgnoreCase("s")) {
//            verServico();
//        }

    }

    public void verServico() {
        Servico servico = new Servico();

        System.out.println("Servico: \n"
                + " Descrição: " + servico.getDescricao() + " \n"
                + " Preço: " + servico.getPreco());
    }

    public void recuperarServico() {

    }

}
