/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Alumno> cjsp = new ArrayList<Alumno>();
        Scanner entrada = new Scanner(System.in);
        String resp;
        int i=1;
        do{
            
                    
            System.out.println("Registro de Alumnos \n");
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Registrar un alumno ");
            System.out.println("2 - Consultar un alumno ");  
            System.out.println("5 - Salir ");
             resp= entrada.next(); 
             switch (resp){
                case "1":                 
                System.out.println("Carnet del alumno");
                int carnet = entrada.nextInt();  
                System.out.println("Nombre del alumno");
                String nombre = entrada.next();
                System.out.println("Apellidos del alumno");
                String apellidos = entrada.next();
                System.out.println("Correo del alumno");
                String correo = entrada.next();
                        
                break;
                case "2":
                System.out.println("Introduce numero de Carnet del alumno a consultar :");
                int id = entrada.nextInt();
                if (cjsp.size()<id){System.out.println("Hay "+cjsp.size()+" alumnos registrados");
                }else{System.out.println(cjsp.get(id-1));}
                resp="0";
                break;
                case "3":
                System.out.println("Introduce la id del alumno a modificar :");
                id = entrada.nextInt();
                if (cjsp.size()<id){System.out.println("Hay "+cjsp.size()+" alumnos registrados");
                }
                break;
                case "5":
                System.out.println("Adios");
                resp="1";
                break;
                default:
                System.out.println("Opción invalida.Debes elegir 1,2,3,4 ó 5");
                resp="0";
            }
        }while (resp=="0");     
        
}
        
}
        
    
    
