package transacao;

public class Movimentacao{
    
public int valorDeposito;
public int valorSaque;
public int saldo = 0;
public int seuSaldo;
public int notas2=20;
public int notas10=20;
public int notas20=20;
public int notas50=20;
public int retiradas = notas2+notas10+notas20+notas50;
public int x = 80;


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

public void setNotas2(int notas2){
    this.notas2 = notas2;
}

public int getNotas2(){
    return notas2 ;
}

public void setNotas10(int notas10){
    this.notas10 = notas10;
}

public int getNotas10(){
    return notas10 ;
}

public void setNotas20(int notas20){
    this.notas20 = notas20;
}

public int getNotas20(){
    return notas20 ;
}

public void setNotas50(int notas50){
    this.notas50 = notas50;
}

public int getNotas50(){
    return notas50 ;
}

public void setRetiradas(int retiradas){
    this.retiradas = retiradas;
}

public int getRetiradas(){
    x = this.getNotas50() + this.getNotas20() + this.getNotas10() + this.getNotas2();
    return x;
}


public void deposito(int v){
    this.setSaldo(this.getSaldo() + v);
        System.out.println("Foi depositado o total de "+v);
}

public void verSaldo(){
        System.out.println("O seu saldo é de "+this.getSaldo());
}

public void saque (int v){
        
        if (this.getSaldo() >=  v) {
            System.out.println("Saque feito com sucesso, no valor de "+v);
            this.setValorSaque(v);
            this.setSaldo(this.getSaldo() - this.getValorSaque());
        }
        else{
            System.out.println("Saque inválido!!");
        }
        
    }
    
    
    public void retirarMaquina(int dois, int dez, int vinte, int cinquenta){
        if((2*dois) + (10*dez) + (20*vinte) + (50*cinquenta) == this.getValorSaque()){
            System.out.println("Foram retirados "+dois + " Notas de 2 reais " +dez + " Notas de 10 reais "+ vinte + " Notas de 20 reais " + cinquenta+ " Notas de 50 reais");
        }
        else {
            System.out.println("Número de notas excedido ou não foi realizado saque");
        }
        
    }

}
