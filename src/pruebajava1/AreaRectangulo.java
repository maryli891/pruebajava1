/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;
import java.util.Scanner;
/********************************************************************
 * Fecha 30 de Octubre 2017
 * @author LC22
 * Clase AreaRectangulo
 * Responsabilidad Clase Principal
 ********************************************************************/
public class AreaRectangulo 
{
public static void main(String[] args)
{  
    int area;
    
    
   Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
           int base =sc.nextInt();          
        System.out.println("Ingrese la altura del rectangulo");
        int altura =sc.nextInt(); 
        area=base*altura;
        System.out.println(" El area del rectangulo es: "+area+" mts2");                
     }
} 

