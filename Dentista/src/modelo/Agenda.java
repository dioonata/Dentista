package modelo;


public class Agenda{
    
    Horario horario;
    
    private String ano;
    
    public Agenda(String ano, String data, String hora) {
        this.horario.setData(data);
        this.horario.setHora(hora);
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Agenda:" + "\n Ano: " + ano + "\nHorario\n Data:" + horario.getData() + "\n Hora: " + horario.getHora() ;
    }
     
    
    public String getAno() {
        return ano;
    }

    public void setAno(String  ano) {
        this.ano = ano;
    }
     

    
}
