package org.ifspspo.tamagotchi;

public class BichinhoVirtual {
    public String nome;
    public int idade;
    public int fome;
    public int energia;
    public String humor;

    public BichinhoVirtual(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

        this.fome = 0;
        this.energia = 100;

        this.humor = "Indiferente";
    }

    public void exibirDetalhes() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
