public class Main {
    public static void main(String[] args) {
        System.out.printf("O mínimo programa possível em Java");

        Produto lapis = new Produto(100, 0001, 2.00, "Lápis");
        lapis.exibirProduto();

        Produto borracha = new Produto(50, 0002, 1.50, "Borracha");
        borracha.exibirProduto();

        Produto apontador = new Produto(75, 0003, 3.0, "Apontador");
        apontador.exibirProduto();

        /**
         * Acrescente um metodo a classe Produto para calcular o preço do produto dado uma determinada quantidade
         */
    }
}

class Produto {
    public double peso;

    public int sku; //Código único de produto

    public double preco;

    public String nome;

    // Metodo construtor
    public Produto(double peso, int sku, double preco, String nome) {
        this.peso = peso;
        this.sku = sku;
        this.preco = preco;
        this.nome = nome;
    }

    // Criar 3 produtos e invocar o metodo exibirProduto para exibir suas informações no console
    public void exibirProduto() {
        System.out.println("\n");
        System.out.printf("Produto: " + this.nome + "\n");
        System.out.printf("SKU: " + this.sku + "\n");
        System.out.printf("Preço: " + this.preco + "\n");
        System.out.printf("Peso: " + this.peso + "\n");
    }
}
