import java.util.Scanner;

public class ChkOddEven {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Peça ao usuário para inserir um número entre 1 e 10
        System.out.print("Insira um numero entre 1 e 10: ");
        int numero = scanner.nextInt();
        
        // Verifique se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número e " + numero + ", par.");
        } else {
            System.out.println("O número e " + numero + ", ímpar.");
        }
        
        // Feche o Scanner
        scanner.close();
    }
}