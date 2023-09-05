package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

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
* @version 1.1
* @since   03/09/2023
*/
public class Contador {
    /**
   * Este método é utilizado para receber dois números inteiros e imprimir a diferença
   * entre os dois números conforme as instruções
   * @param ParametroUm a pessoa deve inserir um número inteiro;
   * @param ParametroDois a pessoa deve inserir outro número inteiro maior do que o primeiro número inserido;
   * @return uma exceção personalizada chamada ParametrosInvalidosException;
   */
    public static void main(String[] args){
        try{
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro número inteiro.");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo número inteiro.");
            int parametroDois = terminal.nextInt();

            System.out.println("");
            
            int totalIteracoes = contar(parametroUm, parametroDois);
            System.out.println("Total de iterações do FOR: " + (totalIteracoes-1));
                        
        }
        catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro!");
        }
        catch (InputMismatchException e){
            System.out.println("Só é aceito como argumento entradas alfanuméricas.");
        }
    }     
    static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        // Aqui iremos comparar se o parametroUm é MAIOR do que o parametroDois
        if (parametroUm < parametroDois){

        //caso o parâmetro um seja MENOR que o parâmetro dois, ele executa as funções abaixo    
        int contagem = parametroDois - parametroUm;

        for (int x = parametroUm + 1; x < parametroDois; x++){
            System.out.println("Imprimindo o número " + x);
            }
        
        // Retorna o total de iterações
        return contagem; 
        }
        //caso o parametroUm seja Maior do que o parametroDois ele lançará um exceção
        else{
            throw new ParametrosInvalidosException();            
        }
    }
}