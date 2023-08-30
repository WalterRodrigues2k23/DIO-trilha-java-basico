import java.util.Scanner;
import java.util.Locale;

/**
* <h1>Conta Terminal</h1>
* A Conta terminal é uma aplicação para criar uma conta através do terminal.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classe
* para ter um maior entendimento dos recursos oferecidos pelo autor.
*
* @author  Walter Rodrigues
* @version 1.0
* @since   29/08/2023
*/
public class ContaTerminal{
    /**
   * Este método é utilizado para abrir uma conta através do terminal, conforme as instruções
   * @param nome a pessoa deve inserir um nome contendo somente letras e sem espaço, caso contrário o programa finalizará com um erro;
   * @param sobrenome a pessoa deve inserir um sobrenome contendo somente letras e sem espaço, caso contrário o programa finalizará com um erro;
   * @param agencia a pessoa deve inserir um número inteiro que represente o número de uma agência, caso contrário o programa finalizará com um erro;
   * @param contaNumero a pessoa deve inserir um número inteiro que represente o número de uma conta, caso contrário o programa finalizará com um erro;
   * @param saldo a pessoa deve inserir um número inteiro que represente o valor que gostaria de ter em saldo, caso contrário o programa finalizará com um erro;
   */
    public static void main (String [] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá pessoa, estamos felizes de ter você aqui!");
        System.out.println("A partir de agora iremos lhe instruir como abrir sua conta em nosso banco.");
        System.out.println("");
        System.out.println("Digite abaixo como gostaria de ser chamada(o) e digite ENTER");
        String nome = scanner.next();
        System.out.println("Digite também um sobrenome (exemplo: Silva) e digite ENTER");
        String sobrenome = scanner.next();
        System.out.println("Agora digite o número da agência (exemplo 1001-5) de sua preferência e aperte ENTER");
        String agencia = scanner.next();
        System.out.println("Agora você deverá digitar o número da conta e digitar ENTER");
        int contaNumero = scanner.nextInt();
        System.out.println("Parabéns, agora para concretizar você deverá inserir abaixo o valor para o seu primeiro depósito e apertar ENTER");
        double saldo = scanner.nextDouble();
        System.out.println("");

        System.out.println("Olá " + nome +" "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaNumero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        System.out.println("");
        System.out.println("Muito obrigado por fazer parte do nosso banco!");
        System.out.println("");
    }
}
