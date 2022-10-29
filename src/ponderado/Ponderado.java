/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ponderado;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author User
 */
public class Ponderado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aplicacion que saca el promedio ponderados
	 
	 //Pedir los creditos para el calculo ponderado
	 System.out.println("Ingrese la cantidad de creditos totales");
	 Scanner creditos = new Scanner (System.in);
	 int creditos_total = creditos.nextInt();
	 
	 //Cantidad de notas para saber hasta donde terminar el ciclo
	 System.out.println("Ingrese la cantidad de materias");
	 Scanner materias = new Scanner (System.in);
	 int materias_total = materias.nextInt();
	 
	 double multiplicacion=1;
	 double[] vector_notas;
	 vector_notas = new double [materias_total];
	 //Iniciar ciclo para pedir las notas
	 for (int i=0; i<materias_total ;i++){
	    
	    //Pedir la nota de cada materia
	    System.out.println("Ingrese la nota "+(i+1));
	    Scanner nota1 = new Scanner(System.in);
	    double notaUser1= nota1.nextDouble();
	    //Pedir los creditos de cada materia
	    System.out.println("Ingrese los creditos de la materia");
	    Scanner creditosMateria = new Scanner(System.in);
	    int creditosUser= creditosMateria.nextInt();
	    multiplicacion=notaUser1*creditosUser;
	    vector_notas[i]=multiplicacion;
	}
	double suma=0;
	for (int j=0;j<materias_total;j++){
	    suma=suma+vector_notas[j];
	} 
	double total=suma/creditos_total;
	DecimalFormat formato1 = new DecimalFormat("#.#");
	System.out.println(formato1.format(total));
    }
    
}
