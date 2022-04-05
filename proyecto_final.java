/*
 * PROYECTO FINAL UTU 2021: Juego del ahorcado.
 * Nombre: UniversePepsi
 */
import java.util.Random;
import java.util.Scanner;

public class proyecto_final {
	// < Scanner >
	static Scanner sc = new Scanner(System.in);

	// < Interfaz error 1 >
	public static void error1() {
		System.out.println("──────────────────────────────────────");
		System.out.println("|                                    |");
		System.out.println("|_                                   |");
		System.out.println("|_|                                  |\n");
	}

	// < Interfaz error 2 >
	public static void error2() {
		System.out.println("──────────────────────────────────────");
		System.out.println("|                                    |");
		System.out.println("|_                                   |");
		System.out.println("|_|                                  |");
		System.out.println(" |                                   |");
		System.out.println(" |                                   |\n");
	}

	// < Interfaz error 3 >
	public static void error3() {
		System.out.println("──────────────────────────────────────");
		System.out.println("|                                    |");
		System.out.println("|_                                   |");
		System.out.println("|_|                                  |");
		System.out.println(" |                                   |");
		System.out.println(" |                                   |");
		System.out.println("/ \\                                 |\n");
	}

	// < Interfaz error 4 >
	public static void error4() {
		System.out.println("──────────────────────────────────────");
		System.out.println("|                                    |");
		System.out.println("|_                                   |");
		System.out.println("|_|                                  |");
		System.out.println("/|\\                                  |");
		System.out.println(" |                                   |");
		System.out.println("/ \\                                  |\n");
	}

	// Menu
	public static void Menu() {
		int intentos = 0, pos = 0; 
		String opcion;

		Random r = new Random();

		// < Peliculas permitidas >
		String[] peliculas = {
				"titanic",
				"avatar",
				"spiderman",
				"batman",
		};

		// < Colores permitidos >
		String[] colores = {
				"amarillo",
				"azul",
				"naranja",
				"marron",
				"blanco",
				"negro",
		};

		// < Animales permitidos >
		String[] animales = {
				"cabra",
				"perro",
				"gato",
				"zorro",
				"caballo",
				"mulita",
				"tigre",
				"leon",
		};

		// < Interfaz principal >
		System.out.println("¡Bienvenido al juego del Ahorcado! - Autor: Pepsi\n");
		System.out.println("──────────────────────────────────────");
		System.out.println("                                     |”‚");
		System.out.println("                                     |”‚");
		System.out.println("                                     |”‚");
		System.out.println("                                     |”‚");
		System.out.println("                                     |”‚");
		System.out.println("                                     |”‚\n");
		System.out.print("[#] Con que deseas jugar? (Animales, Peliculas o Colores): ");
		opcion = sc.nextLine().toLowerCase(); // < Ponemos en minúscula la palabra. >

		// < Si la opcion es igual a animales entonces: >
		if (opcion.equals("animales")) {

			int a = r.nextInt(animales.length); // < Guardamos la longitud de un elemento random del array Animales. >
			String lengtth = animales[a]; // < Guardamos el elemento >

			// < Algoritmo para sustituir letras por guiones >
			int sustitucion = lengtth.length(); 
			char[] letra = new char[sustitucion];
			for (int i = 0; i < letra.length; i++) {
				letra[i] = '_';
			}
			System.out.println(letra); // < Mostramos la palabra con guiones >

			String letras[] = new String[20]; // < Maximo 20 caracteres permitidos >

			// < Algoritmo para saber si la letra es correcta o incorrecta >
			for (int j = 0; j < lengtth.length(); j++) {
				System.out.print("[#] Ingrese una letra: ");
				letras[j] = sc.nextLine();
				if (animales[a].contains(letras[j])) {
					System.out.println("[#] Letra correcta!");
					pos = animales[a].indexOf(letras[j]);
					letra[pos] = letras[j].charAt(0);
					System.out.println(letra);
				} else {
					System.out.println("[#] Letra incorrecta!");
					intentos++;
					
					// < Mostrar error 1 >
					if (intentos == 1) {
						System.out.println();
						error1();
						System.out.println("[#] Tienes: " + intentos + " intentos.");
					} // < Mostrar error 2 > 
					else if (intentos == 2) {
						System.out.println();
						error2();
						System.out.println("[#] Tienes: " + intentos + " intentos.");
					} // < Mostrar error 3 > 
					else if (intentos == 3) {
						System.out.println();
						error3();
						System.out.println("[#] Tienes: " + intentos + " intentos.");
					} // < Mostrar error 4 > 
					else if (intentos == 4) {
						error4();
						System.out.println("[#] Juego finalizado!");
						break;
					}
				}
			}
			System.out.println("[#] El animal es: " + animales[a]);
		} else if (opcion.equals("colores")) {

			int a = r.nextInt(colores.length);
			String lengtth = colores[a];

			int sustitucion = lengtth.length();
			char[] letra = new char[sustitucion];
			for (int i = 0; i < letra.length; i++) {
				letra[i] = '_';
			}
			System.out.println(letra);

			String letras[] = new String[20];

			for (int j = 0; j < lengtth.length(); j++) {
				System.out.println("[#] Ingrese una letra: ");
				letras[j] = sc.nextLine();
				if (colores[a].contains(letras[j])) {
					System.out.println("[#] Letra correcta!");
					pos = colores[a].indexOf(letras[j]);
					letra[pos] = letras[j].charAt(0);
					System.out.println(letra);
				}

				else {
					System.out.println("[#] Letra incorrecta!");
					intentos++;

					if (intentos == 1) {
						System.out.println();
						error1();
					} else if (intentos == 2) {
						System.out.println();
						error2();
					} else if (intentos == 3) {
						System.out.println();
						error3();
					} else if (intentos == 4) {
						error4();
						System.out.println("[#] Juego finalizado!");
						break;
					}
				}
			}
			System.out.println("[#] El color es: " + colores[a]);
		} else if (opcion.equals("peliculas")) {

			int a = r.nextInt(peliculas.length);
			String lengtth = peliculas[a];

			int sustitucion = lengtth.length();
			char[] letra = new char[sustitucion];
			for (int i = 0; i < letra.length; i++) {
				letra[i] = '_';
			}
			System.out.println(letra);

			String letras[] = new String[20];

			for (int j = 0; j < lengtth.length(); j++) {
				System.out.println("[#] Ingrese una letra: ");
				letras[j] = sc.nextLine();
				if (peliculas[a].contains(letras[j])) {
					System.out.println("[#] Letra correcta!");
					pos = peliculas[a].indexOf(letras[j]);
					letra[pos] = letras[j].charAt(0);
					System.out.println(letra);
				} 				
				else {
					System.out.println("[#] Letra incorrecta!");
					intentos++;

					if (intentos == 1) {
						System.out.println();
						error1();
					} else if (intentos == 2) {
						System.out.println();
						error2();
					} else if (intentos == 3) {
						System.out.println();
						error3();
					} else if (intentos == 4) {
						error4();
						System.out.println("[#] Juego finalizado!");
						break;
					}
				}
			}
			System.out.println("[#] La pelicula es: " + peliculas[a]);
		} else {
			System.err.println("[#] ¡Error! Has ingresado mal la categoria.");
		}
	}

	public static void main(String[] args) {
		Menu();
	}
}
