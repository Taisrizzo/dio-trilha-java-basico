import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Por favor, digite o nome do cliente!");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o número da conta!");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da agência!");
            int agencia = scanner.nextInt();

            System.out.println("Por favor, digite o saldo!");
            double saldo = scanner.nextDouble();


            System.out.println("Olá, "+nomeCliente +" obrigado por criar uma conta em nosso banco. Sua agência é "+agencia+", sua conta "+numero+", e seu saldo de R$"+saldo+" já está disponível para saque.");
        }
}
