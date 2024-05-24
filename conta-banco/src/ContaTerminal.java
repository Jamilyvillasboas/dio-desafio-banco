import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor,Digite seu número de usuário : ");
        int numero = scanner.nextInt();

        System.out.println("Por Favor,digite o número da Agência : ");
        String agencia = scanner.next();

        System.out.println("Por Favor,Digite seu nome : ");
        String nome = scanner.next();

        System.out.println("Seu saldo é de : ");
        Double saldo = 237.48;

        System.out.println("Olá, "+ nome + ".Obrigada por criar uma conta em nosso banco,sua agência é "
        + agencia + ", conta numero " + numero + " e seu saldo de " + saldo +" já está disponível para saque.");

    }
}
