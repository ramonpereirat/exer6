public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;
    
    public Pessoa (String n, String e, String t){
        
        setNome(n);
        setEndereco(e);
        setTelefone(t);
    }
    
    public String getNome(){
        
        return this.nome;
    }
    
    public void setNome(String n){
    
        this.nome = n;
    }
    
    public String getEndereco(){
        
        return this.endereco;
    }
    
    public void setEndereco(String e){
    
        this.endereco = e;
    }
    
    public String getTelefone(){
        
        return this.telefone;
    }
    
    public void setTelefone(String t){
    
        this.telefone = t;
    }
}