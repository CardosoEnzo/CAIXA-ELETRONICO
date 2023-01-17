package filhos;

public class Filho1{
    
    public int numCartao;
    public int senha;
    public String nome;
    
    public void entrarConta(int numCartao, int senha){
        if (numCartao==senha){
        System.out.println("Entrou");
        }
        else{
            System.out.println("Não entrou");
        }
        
}    
}