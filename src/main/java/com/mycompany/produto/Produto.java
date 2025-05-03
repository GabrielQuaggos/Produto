//Enunciado:
//Crie uma classe chamada Produto com os seguintes atributos:
//String nome
//double preco
//Depois, crie:
//Um construtor que recebe nome e preço
//Um método chamado exibirInfo() que imprime:
//"Produto: [nome] - Preço: R$ [preco]"
package com.mycompany.produto;

public class Produto {

    //Atributos
    String nome;
    double preco;

    //construtor
    public Produto(String nome, double preco) {
       this.nome = nome;
       this.preco = preco;

    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
    }
}
