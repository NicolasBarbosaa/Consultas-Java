public class Consultas {

    //variaveis de intancia
    private String paciente;
    private String medico;
    private String data;
    
    //construtor
    public Consultas(String paciente, String medico, String data){
        this.paciente= paciente;
        this.medico= medico;
        this.data= data;
    }
    //representação textual
    @Override
    public String toString(){
        return "Consulta: [Paciente: " + paciente +",Medico: " + medico + ",Data: " +data+ "]";
    }
}