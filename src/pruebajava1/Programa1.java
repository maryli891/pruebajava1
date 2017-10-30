/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;

import javax.swing.JOptionPane;

/********************************************************************
  Mariane Muñoz Gonzalez
 * Fecha 30 de Octubre 2017
 * @author LC22
 * Clase Programa
 * Responsabilidad Clase principal 
 ********************************************************************/
public class Programa1
{
   public static void main(String[] args)  
 {
     String nombre;
     int edad;
   
     nombre=(JOptionPane.showInputDialog("Digite su Nombre"));
     edad=Integer.parseInt(JOptionPane.showInputDialog("Digite su Edad"));
      
      JOptionPane.showMessageDialog(null," Bienvenido "+nombre+" en 20 años usted tendra "+(edad+20)+" años ");
 }
   } 
