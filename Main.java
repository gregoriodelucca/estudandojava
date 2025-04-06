import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        Usuario usuario = new Usuario(nome, idade);

        System.out.println("\n=== Dados do Usuário ===");
        usuario.exibirDados();

        scanner.close();
    }
}
