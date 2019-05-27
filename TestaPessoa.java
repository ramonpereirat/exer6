public class TestaPessoa {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("RAMON", " nº10", "9997402725");
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Endereco: " + p1.getEndereco());
        System.out.println("Telefone: " + p1.getTelefone());        
    }
    
}