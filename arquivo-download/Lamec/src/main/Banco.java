package main;

import filhos.Filho;
import transacao.Administrador;
import transacao.TransacoesFinanceiras;

public class Banco {

	public static void main(String[] args) {
		
		Filho filho1 = new Filho();
	    filho1.nome = "Enzito";
	    filho1.numero_Cartao = 12345;
	    filho1.senha = 12345;
	    filho1.entrarConta(filho1.numero_Cartao, filho1.senha);
	    
	    if(filho1.numero_Cartao == filho1.senha) {
	    TransacoesFinanceiras transacoes = new TransacoesFinanceiras();
	    transacoes.deposito(1640);
	    transacoes.verSaldo();
	    transacoes.saque(1640);
	    transacoes.escolherNotas_Maquina(20, 20, 20, 20);
	    Administrador adm = new Administrador();
	    adm.reponhaNotas();
	    }
	    else {
	    	System.out.println("Dados incorretos");
	    }    
}
}

	    
	    
	   