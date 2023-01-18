package transacao;

public class TransacoesFinanceiras{
    
	public int valorDeposito;
	public int valorSaque;
	public int saldo = 0;
	public int seuSaldo;
	public int doisReais = 20;
	public int dezReais = 20;
	public int vinteReais = 20;
	public int cinquentaReais = 20;

public void setValorDeposito(int valorDeposito){
    this.valorDeposito = valorDeposito;
}

public int getValorDeposito(){
    return valorDeposito;
}

public void setValorSaque(int valorSaque){
    this.valorSaque = valorSaque;
}

public int getValorSaque(){
    return valorSaque;
}

public void setSaldo(int saldo){
    this.saldo = saldo;
}

public int getSaldo(){
    return saldo;
}

public void setSeuSaldo(int seuSaldo){
    this.seuSaldo = seuSaldo;
}

public int getSeuSaldo(){
    return seuSaldo;
}

public void setDoisReais(int doisReais){
    this.doisReais = doisReais;
}

public int getDoisReais(){
    return doisReais ;
}

public void setDezReais(int dezReais){
    this.dezReais = dezReais;
}

public int getDezReais(){
    return dezReais ;
}

public void setVinteReais(int vinteReais){
    this.vinteReais = vinteReais;
}

public int getVinteReais(){
    return vinteReais ;
}

public void setCinquentaReais(int cinquentaReais){
    this.cinquentaReais = cinquentaReais;
}

public int getCinquentaReais(){
    return cinquentaReais ;
}

public void deposito(int valor_Deposito){
    this.setSaldo(this.getSaldo() + valor_Deposito);
        System.out.println("Foi depositado o total de "+valor_Deposito);
}

public void verSaldo(){
        System.out.println("O seu saldo é de "+this.getSaldo());
}

public void saque (int valor_Saque){
        
        if (this.getSaldo() >=  valor_Saque) {
            System.out.println("Saque feito com sucesso, no valor de "+valor_Saque);
            this.setValorSaque(valor_Saque);
            this.setSaldo(this.getSaldo() - this.getValorSaque());
        }
        else{
            System.out.println("Saque inválido!!");
        }
    }
   
    public void escolherNotas_Maquina(int doisReais, int dezReais, int vinteReais, int cinquentaReais){
        if((2*doisReais) + (10*dezReais) + (20*vinteReais) + (50*cinquentaReais) == this.getValorSaque()){
            System.out.println("Foram retirados "+doisReais + " Notas de 2 reais " +dezReais + " Notas de 10 reais "+ vinteReais + " Notas de 20 reais " + cinquentaReais+ " Notas de 50 reais");
        }
        else {
            System.out.println("Número de notas excedido ou não foi realizado saque");
        } 
    }
}
