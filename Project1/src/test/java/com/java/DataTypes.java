package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tipos de datos
		byte abc = 127;
		short var = 30000;
		long var2 = 9223372036854775807L;
		
		int altura = (int) 2.54; //solo tomara el entero de este numero
		System.out.println(altura);
		
		double altura1 = 2.54;//si toma todo
		System.out.println(altura1);
		
		char letra = '\u00D4'; //https://unicode-table.com/en/  de aqui se sacan los unicodes de los simbolos especiales
		System.out.println(letra);
	
		String frase = "Hola";
		String frase2 = " Mundo ";
		int frase3 = 4;
		int frase4 = 5;
		System.out.println(frase+frase2+frase3+frase4); //concatenar valores string con int
		System.out.println(frase3+frase4); //si son enteros los suma no los concatena

		boolean isDog = true; //si es true
		boolean isDog2 = false; //si es false 
		
		//Operadores aritmeticos +, -, *, /, %
		int x = 3;
		int y = 4;
		int suma = x+y;
		System.out.println("La suma es: "+ suma);
		
		//Operadores unarios +, -, ++(incrementa 1), --(decrementa 1), !(diferente) 
		int a = 3;
		a++;
		System.out.println("El valor de a es: "+a);
		a--;
		System.out.println("El valor de a es: "+a);
		
		//Operadores relaiconales ==(igual igual), !=(diferente igual), >, >=, <, <=
		//Operadores condicionales &&(and), ||(or)
		int var0 = 3;
		int var1 = 4;
		boolean var3 = true;
		if(var0!=var1 || !var3) {
			System.out.println("HERE");
		}
			
		
	}

}