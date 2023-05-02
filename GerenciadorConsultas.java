import java.util.ArrayList;
import java.util.List;

public class GerenciadorConsultas {
    private List<Consultas> consultar;   
    
    //construtor que ao ser chamado atrinbui a minha lista
    public GerenciadorConsultas(){
        consultar = new ArrayList<>();
    }

    //metodo para cadastrar uma consulta
    public void cadastarConsulta(String paciente, String medico, String data){
        Consultas consulta = new Consultas(paciente, medico, data);
        consultar.add(consulta);

    }

    //listar consultas
    public void listarConsulta(){
         //verifica se a lista está vazia
        if(consultar.isEmpty()){
            System.out.println("Não tem consultas");
        }else {
            for (Consultas consultas : consultar) {
                System.out.println(consultas);
            } 
        }
    }

    public static void main(String[] args) {
        //cria o objeto gerenciador
        GerenciadorConsultas gerenciador = new GerenciadorConsultas();
        gerenciador.cadastarConsulta("Kaian", "Nicolas", "14/08");
        gerenciador.listarConsulta();
        
    }
}