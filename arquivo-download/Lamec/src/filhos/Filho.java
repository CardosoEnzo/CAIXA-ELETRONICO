package filhos;

public class Filho{
    
    public int numero_Cartao;
    public int senha;
    public String nome;
    
    public void entrarConta(int numero_Cartao2, int senha2){
        if (numero_Cartao2 == senha2){
        System.out.println(nome+" Entrou");
        }
        else{
            System.out.println("Não entrou");
        }
        
}    
}