package main;

import filhos.Filho1;
import filhos.Filho2;
import transacao.Administrador;
import transacao.Movimentacao;

public class Banco {

	public static void main(String[] args) {
		
		Filho1 filho1 = new Filho1();
	    filho1.nome = "Enzito";
	    filho1.numCartao = 12345;
	    filho1.senha = 12345;
	    filho1.entrarConta(12345, 12345);
	    
	    if(filho1.numCartao  == filho1.senha){
	        
	    Movimentacao m1 = new Movimentacao();
	    m1.deposito(1640);
	    m1.verSaldo();
	    m1.saque(1640);
	    m1.retirarMaquina(20, 20, 20, 20);
	    m1.deposito(1000);
	    m1.retirarMaquina(0, 0, 0, 50);
	    
	    Administrador adm = new Administrador();
	    adm.reponhaNotas();
	    }
	    
	    else{
	        System.out.println("Não está logado");
	    }
	    
	    
	    Filho2 filho2 = new Filho2();
	    filho2.nome = "Enzão";
	    filho2.numCartao = 12345;
	    filho2.senha = 12345;
	    filho2.entrarConta(12345, 12345);
	    
	    if(filho2.numCartao == filho2.senha){
	        
	    Movimentacao m2 = new Movimentacao();
	    m2.deposito(100);
	    m2.verSaldo();
	    m2.saque(100);
	    m2.retirarMaquina(0, 0, 0, 2);
	    
	    Administrador adm2 = new Administrador();
	    adm2.reponhaNotas();
	    }
	    
	    else{
	        System.out.println("Não está logado");
	    } 
	}
}


	


