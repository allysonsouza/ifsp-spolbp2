public class Main {
    static void main() {
        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        outroLivro.mostrarDetalhes();
    }
}

class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro ";
        IO.println(mensagem);
        IO.println(nome);
        IO.println(valor);
        IO.println(isbn);
        IO.println(descricao);
    }
}