package modelo;


public class Agenda {
    
    Horario horario = new Horario();
     String ano;
    
    public Agenda(String ano, String data, String hora) {
        this.horario.data = data;
        this.horario.hora = hora;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Agenda:" + "\n Ano: " + ano + "\nHorario\n Data:" + horario.data + "\n Hora: " + horario.hora ;
    }
     
    
    
    public String getAno() {
        return ano;
    }

    public void setAno(String  ano) {
        this.ano = ano;
    }
     

    
}
