import java.security.SecureRandom;

public class GeradorSenhasSeguras {
    private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%¨&*()_+-*/";

    public static String gerarSenha(int comprimento) {
        SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento);

        for(int i=0; i<comprimento; i++) {
            int indice = geradorDeNumeroAleatorio.nextInt(CARACTERES.lenght());
            senha.append(CARACTERES.chatAt(indice));
        }

        return senha.toString();
    }
    public static void main(String[] args) {
  
    }
}