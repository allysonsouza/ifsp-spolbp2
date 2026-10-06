public class Application {
    public static void main(String[] args) {
        IO.println(gameTitle());
        int tentativa = 1;

        int numeroSorteado = gerarNumero();
        IO.println("Número sorteado: " + numeroSorteado);

        int maximoTentativas = definirTentativas();
        IO.println("Número de tentativas: " + maximoTentativas);

        while ( tentativa <= maximoTentativas ) {
            String entrada = IO.readln();
            int palpite = Integer.parseInt(entrada);

            if ( palpite == numeroSorteado ) {
                IO.println("Número correto!");
                IO.println("Acertado em %d tentativa(s)".formatted(tentativa));
                break;
            }

            tentativa++;
        }
    }

    public static String gameTitle() {
        return """
                ███████╗ ██████╗███╗██╗   ██╗██╗███╗   ██╗██╗  ██╗███████╗     ██████╗     ███╗ ████╗██╗   ██╗███╗█  ███╗███████╗██████╗  ██████╗██
                ███╔══██╗██╔══██╗██║██║   ██║██║████╗  ██║██║ ███║██╔════╝    ██╔═══██╗    ████╗█░██║██║   ██║████╗ ████║██╔════╝██╔══██╗██╔═══██╗
                ███████║██║  ██║██║██║   ██║██║██╔██╗ ██║███████║█████╗    ████║   ██║    ██╔██╗ ██║██║   ██║██╔████╔██║█████╗  ██████╔╝██║   ██║
          ██░   ██╔══██║██║  ██║██║╚██╗ ██╔╝██║██║╚██╗██║██╔══██║██╔══╝  ███░██║   ██║   ███║╚██╗██║██║  ███║██║╚██╔╝██║██╔══╝  ██╔══██╗██║   ██║
          ░     ██║  ██║██████╔╝██║ ╚████╔╝ ██║██║ ╚████║██║  ██║███████╗█░  ╚██████╔╝ █████║ ╚████║╚██████╔╝██║ ╚═╝ ██║███████╗██║  ██║╚██████╔╝
          """;
    }

    public static Integer gerarNumero() {
        return (int) (Math.random() * 100) + 1;
    }

    public static Integer definirTentativas() {
        IO.println("Quantas tentativas para adivinhar?");
        String entrada = IO.readln();
        return Integer.parseInt(entrada);
    }
}
