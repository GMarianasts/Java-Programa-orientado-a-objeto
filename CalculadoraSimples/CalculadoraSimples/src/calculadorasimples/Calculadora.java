/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorasimples;

/**
 *
 * @author MARI
 */
public class Calculadora {
    double x;
    double y;
    double Res;
    
    // Método para soma entre dois números 
   public double soma(){
        return Res =  x + y;
   }
   
   // Método usado para fazer a subtração entre dois números
   public double subtracao() { 
       return Res =  x - y;
   }
   
   // Método usado para fazer a multiplicação de dois números
   public double multiplicacao() { 
      return Res = x * y;
   }
   
   public double divisao(){ // Método usado para dividir dois números, com verificação de erro para divisão por zero
       if(y == 0){
           System.out.println("Erro: Divi~sao por zero não é permitida");
           return Res = Double.NaN; // Retorna "Not a Number" para mostrar que deu erro               
   }
       return Res =  x / y;
   }
   
   public String getResultadoFormatado(){
       return String.format("%.2f", Res);
   }
}
