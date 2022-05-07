/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.aula_2_lpc;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Baskara {
        int a, b, c;
        
        void setA(int a){
            this.a = a;
        }
        
        void setB(int b){
            this.b = b;
        }
        
        void setC(int c){
            this.c = c;
        }
        
        int getA(){
            return this.a;
        }
        
        int getB(){
            return this.b;
        }
        
        int getC(){
            return this.c;
        }
        
        public Baskara(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public boolean delta(){    
            double n;
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o valor de a: \n");	
            a = scan.nextInt();
            System.out.printf("Digite o valor de b: \n");
            b = scan.nextInt();
            System.out.printf("Digite o valor de c: \n");
            c = scan.nextInt();
            Baskara variaveis = new Baskara(a, b, c);
          
            n = Math.sqrt(variaveis.b) - (4*(variaveis.a)*(variaveis.c));
            if (n < 0){
                return false;
            }else{
                this.x1(n);
                this.x2(n);
                return true;
            }
        }
        
        public double x1(double n){
            double x = (-b + n)/(2*a);
            return x;
        }
        
        public double x2(double n){
            double x = (-b - n)/(2*a);
            return x; 
        }
        
        public static void main(String[] args){
            boolean delta = delta();
            if delta = true;
        }
}
