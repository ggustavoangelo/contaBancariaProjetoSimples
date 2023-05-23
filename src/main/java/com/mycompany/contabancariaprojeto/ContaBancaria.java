package com.mycompany.contabancariaprojeto;

public class ContaBancaria implements ContaBancaInterface {
     
    private int id;
    private String nome;
    private String sobrenome;
    private String banco;
    private String conta;
    private float saldo;
    private boolean status;
    private boolean cartaoCredito;
    private String tipo;
    private float limiteCartao;


public ContaBancaria (int id, String nome, String sobrenome, String banco, String conta, boolean status, float saldo, String tipo) {
    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.banco = banco;
    this.conta = conta;
    this.status = status;
    this.saldo = saldo;
    this.tipo = tipo;

}

public ContaBancaria (int id, String banco, String conta, float limiteCartao, String tipo) {
    this.id = id;
    this.banco = banco;
    this.conta = conta;
    this.limiteCartao = limiteCartao;
    this.tipo = tipo;

}

public ContaBancaria (int id, float saldo, String nome, boolean status, String tipo) {
    this.id = id;
    this.saldo = saldo;
    this.nome = nome;
    this.status = status;
    this.tipo = tipo;

}

public void setId(int id) {
    this.id = id;
}

public int getId() {
    return id;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
}

public String getSobrenome() {
    return sobrenome;
}

public void setBanco(String banco) {
    this.banco = banco;
}

public String getBanco() {
    return banco;
}

public void setConta(String conta) {
    this.conta = conta;
}

public String getConta() {
    return conta;
}

public void setSaldo(float saldo) {
    this.saldo = saldo;
}

public float getSaldo() {
    return saldo;
}

public void setStatus(boolean status) {
    this.status = status;
}

public boolean getStatus() {
    return status;
}

public void setCartaoCredito(boolean cartaoCredito) {
    this.cartaoCredito = cartaoCredito;
}

public boolean getCartaoCredito() {
    return cartaoCredito;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public String getTipo() {
    return tipo;
}

public void setLimiteCartao(float limiteCartao) {
    this.limiteCartao = limiteCartao;
}

public float getLimiteCartao() {
    return limiteCartao;
}

public void imprimirDados() {


    String nomeStatus;
    if(this.status == true) {
        nomeStatus = "Ativada"; 
    } else {
        nomeStatus = "Desativada";

    }

    String creditoCartao;
    if(this.cartaoCredito == true) {
        creditoCartao = "Sim";
    } else {
        creditoCartao = "Não";
    }

    System.out.println("O ID da conta é: " + id);
    System.out.println("O Nome do títular da Conta é:" + nome);
    System.out.println("O Sobrenome do Titular da Conta é:" + sobrenome);
    System.out.println("A Agência da conta é: " + banco);
    System.out.println("O Número da Conta é: " + conta);
    System.out.println("O Saldo da Conta é: " + saldo);
    System.out.println("A Conta Está: " + nomeStatus);
    System.out.println("A Conta Possui Cartão de Crédito? " + creditoCartao);
    System.out.println("O Tipo da Conta é: " + tipo);
    System.out.println("O Limite do Cartão de Crédito é De: " + limiteCartao);
    inflacaoBrasil();
    taxaSelic();
    serasa();
}

public void depositar(float valor) {
    this.saldo += valor;
    System.out.println("Foi depositado o Valor de: " + valor);
}

public void sacar(float valor) {
    if(this.saldo >= valor) {
        this.saldo -= valor;
        System.out.println("O Valor Sacado: " + valor);
        System.out.println("Novo Saldo da Conta: " + this.saldo);
    } else {
        System.out.println("A Conta Não Possui o Valor Informado Para Saque!");
    }
}

public void encerrarConta() {
    if(this.status){
        this.status = false;
        System.out.println("Conta Encerrada!");
    } else {
        System.out.println("A Conta Já Está Encerrada");
    }
}

public void ativarCartaoCredito() {
    if(this.cartaoCredito == true) {
        System.out.println("Esta Conta Já Possui Cartão de Crédito");
    } else {
        this.cartaoCredito = true;
        System.out.println("Cartão de Crédito Ativado");
    }
}

public void desativarCartaoCredito() {
    if(this.cartaoCredito == true) {
        this.cartaoCredito = false;
        System.out.println("Cartão de Crédito Desativado");
    } else {
        System.out.println("Esta Conta Não Possui Cartão de Crédito");
    }
}

public void mudarTipoConta() {
    
     if(this.tipo == "Corrente") {
        this.tipo = "Poupança";
        System.out.println("O Tipo da Conta Foi Alterado Para Poupança");
    } else if(this.tipo == "Poupança") {
        this.tipo = "Corrente";
        System.out.println("O Tipo da Conta Foi Alterado Para Corrente");
    } else {
        System.out.println("Tipo de conta não reconhecido");
    }
}

public void aumentarLimiteCartao(float valor) {
    if(this.cartaoCredito) {
        this.limiteCartao += valor;
    } else {
        System.out.println("Essa Conta Não Possui Cartão de Crédito");
    }
}

public void mudarBanco(String banco) {
        this.banco = banco;
}

public void compraCartaoCredito(float valorCompra) {
    if(this.cartaoCredito) {
        if(this.limiteCartao >= valorCompra) {
            this.limiteCartao -= valorCompra;
            System.out.println("Compra No Cartão Realizada Com Sucesso");
            System.out.println("Valor Disponível No Cartão: " + this.limiteCartao);
        } else {
            System.out.println("O Cartão Não Possui o Valor Disponível Para Compra");
        }
    } else {
        System.out.println("Essa Conta Não Possui Cartão de Crédito");
    }
}
    @Override
    public void inflacaoBrasil() {
        System.out.println("O valor do IPCA hoje está em 0,61%, de acordo com dados divulgados em 12 de maio pelo Instituto Brasileiro de Geografia e Estatística (IBGE) referente ao mês de abril de 2023. A inflação ficou acima do previsto, puxada pelo aumento do preço dos remédios, autorizado pelo governo.\n");
    }

    @Override
    public void taxaSelic() {
        System.out.println("A Taxa Selic hoje está em 13,75% ao ano. Ela foi decidida no dia 3 de maio de 2023 pelo Copom, que decidiu manter a taxa.\n");

    }

    @Override
    public void serasa() {
        System.out.println("Caso possua alguma pendência conosco, entre urgentemente em contato e renegocie suas dívidas.É hora de ficar com o nome limpo novamente!\n");

    }
    
}
