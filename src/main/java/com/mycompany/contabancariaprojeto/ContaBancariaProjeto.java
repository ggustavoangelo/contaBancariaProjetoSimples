package com.mycompany.contabancariaprojeto;
import java.util.HashSet;
import java.util.Set;


public class ContaBancariaProjeto {

    public static void main(String[] args) {
     ContaBancaria conta1 = new ContaBancaria(1,"Paulo", "Gustavo", "Caixa", "1020", true, 0, "Corrente");
     ContaBancaria conta2 = new ContaBancaria(2, "Itaú", "3040", (float)3.500,"Poupança");
     ContaBancaria conta3 = new ContaBancaria(3, (float)10000, "Diogo", false, "Corrente");
        
     /*conta1.imprimirDados();
     System.out.println("=================");*/
     conta2.imprimirDados();
     System.out.println("=================");
     /*conta3.imprimirDados();*/

    /*conta1.ativarCartaoCredito();
    conta1.aumentarLimiteCartao((float)1000);
    conta1.mudarBanco("Banco do Brasil");
    conta1.compraCartaoCredito((float)400);
    conta1.imprimirDados();
    conta1.encerrarConta()*/;
    conta2.depositar(1000);
    conta2.imprimirDados();
    }
}
