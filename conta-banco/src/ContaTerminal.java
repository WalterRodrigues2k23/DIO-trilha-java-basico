import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá pessoa, estamos felizes de ter você aqui!");
        System.out.println("A partir de agora iremos lhe instruir como abrir sua conta em nosso banco.");
        System.out.println("");
        System.out.println("Digite abaixo como gostaria de ser chamada(o) e digite ENTER");
        String nome = scanner.next();
        System.out.println("Digite também um sobrenome (exemplo: Silva) e digite ENTER");
        String sobrenome = scanner.next();
        System.out.println("Agora digite o número da agência (exemplo 001-5) de sua preferência e aperte ENTER");
        String agencia = scanner.next();
        System.out.println("Agora você deverá digitar o número da conta e digitar ENTER");
        int contaNumero = scanner.nextInt();
        System.out.println("Parabéns, agora para concretizar você deverá inserir abaixo o valor para o seu primeiro depósito e apertar ENTER");
        double saldo = scanner.nextDouble();
        System.out.println("");

        System.out.println("Olá " + nome +" "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaNumero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        System.out.println("");
        System.out.println("Muito obrigado por usar o nosso banco!");
        System.out.println(" ");
    }
}
