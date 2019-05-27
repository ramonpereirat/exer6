public class TestaDisciplina {
    
    public static void main(String[] args) {
        
        Disciplina d1 = new Disciplina("Carla", 1, "6º");
        
        System.out.println("Nome: " + d1.getNome());
        System.out.println("Codigo: " + d1.getCodigo());
        System.out.println("Periodo: " + d1.getPeriodo()); 
    }
    
}