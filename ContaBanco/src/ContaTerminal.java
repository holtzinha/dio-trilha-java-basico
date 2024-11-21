import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Bem vindo ao Banco!, informe o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência!: ");
        agencia = sc.nextLine();

        System.out.print("Agora informe o número da sua conta: ");
        numero = sc.nextInt();

        System.out.print("Por último informe o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque");

    }
}
