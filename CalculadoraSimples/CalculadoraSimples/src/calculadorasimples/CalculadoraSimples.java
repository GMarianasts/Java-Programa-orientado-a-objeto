/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasimples;
import java.util.Scanner;

/**
 *
 * @author MARI
 */
public class CalculadoraSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Calculadora cal = new Calculadora();
        int opcao;
        boolean continuar = true;
        
        //Pede para escolher uma operação digitando 1, 2, 3, 4 ou sair escolhendo o 5
        while (continuar){
            System.out.println("Escolha uma operação: ");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            
            opcao = scan.nextInt();
          
            if (opcao == 5){ // Se a opção for sair, se encerra a calculadora
                continuar = false;
                System.out.println("Encerrando a calculadora.");  
            }else{ // Se escolheu uma operação, o programa pede para inserir os números que serão usados na operação
                System.out.println("Digite o primeiro número: ");
                cal.x = scan.nextDouble();
                System.out.println("Digite o segundo número: ");
                cal.y = scan.nextDouble();
                
                switch (opcao){ // execução do programa dependendo de qual operação o usuário escolher
                    case 1:
                        cal.soma();
                        System.out.println("Resultado da soma: " + cal.getResultadoFormatado()); // Imprime o resultado da soma
                        break;
                    case 2:
                        cal.subtracao();
                        System.out.println("Resultado da subtração: " + cal.getResultadoFormatado()); // Imprime o resultado da subtração
                        break;
                    case 3:
                        cal.multiplicacao();
                        System.out.println("Resultado da multiplicação: " + cal.getResultadoFormatado()); // Imprime o resultado da multiplicação
                        break;
                    case 4:
                        cal.divisao();
                        System.out.println("Resultado da divisão: " + cal.getResultadoFormatado()); // Imprime o resultado da divisão
                        break;
                    default: 
                        System.out.println("Opção inválida. Tente novamente."); // Imprime que a opção escolhida é inválida
                }
                
                if (continuar){
                    System.out.println("Desejar realizar outra operação? (S/N): "); // Pergunta se quer realizar outra operação, resposta 'S'(Sim) ou 'N'(Não)
                    char resposta = scan.next().charAt(0);
                    if(resposta == 'N' || resposta == 'n'){ // Se a resposta for 'N' a calculadora se encerra
                        continuar = false;
                        System.out.println("Encerrando Calculadora.");
                    }
                }
            }
        }
        
        
    }
    
}
