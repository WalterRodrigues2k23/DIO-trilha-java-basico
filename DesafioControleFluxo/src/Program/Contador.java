package Program;

import java.util.Scanner;
import Program.ParametrosInvalidosException;

/**
* <h1>Controle de Fluxo</h1>
* O Controle de Fluxo é uma aplicação para criar 
* um sistema que receberá dois números inteiros inseridos pelo usuário, 
* obter a diferença do segundo número inserido com o primeiro e imprimir esses números.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classe
* para ter um maior entendimento dos recursos oferecidos pelo autor.
*
* @author  Walter Rodrigues
* @version 1.0
* @since   03/09/2023
*/
public class Contador {
    /**
   * Este método é utilizado para receber dois números inteiros e imprimir a diferença
   * entre os dois números conforme as instruções
   * @param ParametroUm a pessoa deve inserir um número inteiro;
   * @param ParametroDois a pessoa deve inserir outro número inteiro maior do que o primeiro número inserido;
   */
    public static void main(String[] args) throws Exception {
        
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro número inteiro.");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo número inteiro.");
            int parametroDois = terminal.nextInt();

            System.out.println("");
        try{    
            contar(parametroUm, parametroDois);
                        
        }
        catch (Exception e){
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro!");
        }            
    }     
    static void contar(int parametroUm, int parametroDois){
        if (parametroUm < parametroDois){

        int contagem = parametroDois - parametroUm;

        for (int x = parametroUm + 1; x < parametroDois; x++){
            System.out.println("Imprimindo o número " + x);
            }
        }
    }
}
