package Principal;
// se importan las librerias necesarias a utilizar

import java.util.Scanner;

public class Desarrollo {

    public static void main(String[] args) {

        Operaciones prueba = new Operaciones(); // se crea el objeto para comunicarse con otra clase
        Scanner entrada = new Scanner(System.in);// se crea el objeto para recibir las entradas del ususario
        int filas = 0, columnas = 0, i, j, comprobar;// algunas variables de tipo enteras a utilizar

        System.out.println("Ingrese las filas: ");// se piden las filas a definir
        filas = entrada.nextInt();
        while (filas != columnas) { // Aqui se validan que las columnas tienen que ser iguales a la filas
            System.out.println("Ingrese las columnas: ");// se piden las columnas a definir
            columnas = entrada.nextInt();
            if (columnas != filas) {
                System.out.println("Las columnas debe ser iguales a las filas");// envia mensaje de error
            } else {
                columnas = filas;
            }
        }
        //Se le muestra al usuario las filas y columnas finales
        System.out.println("filas: " + filas);
        System.out.println("Columnas: " + columnas);
        //Se le deja a opcion del usuario si quiere una matriz aleatoria o manual
        System.out.println("Como desea que se llene la matriz:");
        System.out.println("1. Aleatoria");
        System.out.println("2. Manual");
        int opcion = entrada.nextInt();

        switch (opcion) {// Aqui se van a trabajar con las dos opciones anteriores
///////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 1: {// El usuario escogio la opcion de generar una matriz aleatoria

                int[][] Matriz = new int[filas][columnas];//Se crea la matriz
                //A traves del ciclo for se va a generar una matriz aleatoria por el sistema 
                for (i = 0; i < Matriz.length; i++) {
                    for (j = 0; j < Matriz[i].length; j++) {

                        Matriz[i][j] = (int) (Math.random() * 2 + 0);
                    }
                }
                // Se le muestra al usuario la matriz generada por el sistema
                System.out.println("La matriz es: ");
                int contador = 0;
                for (i = 0; i < Matriz.length; i++) {
                    System.out.print("| ");
                    for (j = 0; j < Matriz[i].length; j++) {
                        System.out.print(Matriz[i][j]);
                        if (j != Matriz[i].length - 1) {
                            System.out.print("\t");
                        }
                    }
                    System.out.println("| ");
                }

                int ciclo = 0, salir = 3;
                int verificar1, verificar2, verificar3, verificar4, verificar5, verificar6;
                while (ciclo == 0) {//Aqui se va a validar si el usuario desea conocer otra opcion
                    //se le muestra al usuario las opciones que hay disponibles
                    System.out.println("____________________________________");
                    System.out.println("Cual relacion desea generar?:");
                    System.out.println("1.  Relacion Reflexiva");
                    System.out.println("2.  Relacion Anti-Reflexiva");
                    System.out.println("3.  Relacion Simetrica");
                    System.out.println("4.  Relacion Asimetrica");
                    System.out.println("5.  Relacion Anti-simetrica");
                    System.out.println("6.  Relacion transitiva");
                    System.out.println("7.  Mostrar todas las relaciones y salir");
                    System.out.print("=");

                    int opcion2 = entrada.nextInt();
                    if (opcion2 < 1 || opcion2 > 7) {
                        salir--;
                        System.out.println("||||| le quedan " + salir + " oportunidades ||||||");
                    }
                    if (salir == 0) {
                        ciclo = 1;
                    }

                    switch (opcion2) {
                        case 1: {
                            verificar1 = prueba.Reflexiva(Matriz);
                            // Se le muestra al usuario la matriz generada por el sistema
                            System.out.println("La matriz es: ");

                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }
                        }
                        break;
                        case 2: {
                            verificar2 = prueba.Anti_Reflexiva(Matriz);
                            // Se le muestra al usuario la matriz generada por el sistema
                            System.out.println("La matriz es: ");

                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }
                        }
                        break;
                        case 3: {
                            verificar3 = prueba.Simetrica(filas, columnas, Matriz);
                            // Se le muestra al usuario la matriz generada por el sistema
                            System.out.println("La matriz es: ");

                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }
                        }
                        break;
                        case 4: {
                            verificar4 = prueba.Asimetrica(filas, columnas, Matriz);
                            // Se le muestra al usuario la matriz generada por el sistema
                            System.out.println("La matriz es: ");

                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }
                        }
                        break;
                        case 5: {
                            verificar5 = prueba.Anti_Simetrica(filas, columnas, Matriz);
                            // Se le muestra al usuario la matriz generada por el sistema
                            System.out.println("La matriz es: ");

                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }
                        }
                        break;
                        case 6: {
                            verificar6 = prueba.Transitiva(filas, columnas, Matriz);

                            // Se le muestra al usuario la matriz generada por el sistema
                            System.out.println("La matriz es: ");

                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }
                        }

                        break;
                        case 7: {

                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar1 = prueba.Reflexiva(Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar2 = prueba.Anti_Reflexiva(Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar3 = prueba.Simetrica(filas, columnas, Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar4 = prueba.Asimetrica(filas, columnas, Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar5 = prueba.Anti_Simetrica(filas, columnas, Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar6 = prueba.Transitiva(filas, columnas, Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");

                            System.out.println("\n\n");
                            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                            prueba.propiedades(verificar1, verificar2, verificar3, verificar4, verificar5, verificar6);
                            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                            ciclo = 1;

                            // Se le muestra al usuario la matriz generada por el sistema
                            System.out.println("La matriz es: ");

                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }

                        }
                        break;

                    }

                }

                System.out.println("El grafo es: ");
                Matriz_Adyacencia xd = new Matriz_Adyacencia(filas);
                xd.Agregar_Aristas(filas, Matriz);

            }
            break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 2: {// El usuario escogio la opcion de generar una matriz de forma manual

                int[][] Matriz = new int[filas][columnas];//Se crea la matriz
                //A traves del ciclo for se va a generar una matriz aleatoria por el sistema
                System.out.println("Ingrese los valores de la matriz: ");
                for (i = 0; i < filas; i++) {
                    for (j = 0; j < columnas; j++) {
                        System.out.println("Matriz [" + i + "] [" + j + "]");
                        comprobar = entrada.nextInt();

                        if (comprobar != 0 && comprobar != 1) {
                            System.out.println("ERROR! - Solo se aceptan 0 ó 1");
                            System.out.println("Matriz [" + i + "] [" + j + "]");
                            comprobar = entrada.nextInt();
                        }
                        if (comprobar == 1) {
                            Matriz[i][j] = comprobar;
                        } else if (comprobar == 0) {
                            Matriz[i][j] = comprobar;
                        }
                    }
                }
                System.out.println("La matriz es: ");
                int contador = 0, contador2 = 0;
                for (i = 0; i < Matriz.length; i++) {
                    System.out.print("| ");
                    for (j = 0; j < Matriz[i].length; j++) {
                        System.out.print(Matriz[i][j]);
                        if (j != Matriz[i].length - 1) {
                            System.out.print("\t");
                        }
                    }
                    System.out.println("| ");
                }

                int ciclo = 0, salir = 3;
                int verificar1, verificar2, verificar3, verificar4, verificar5, verificar6;
                while (ciclo == 0) {//Aqui se va a validar si el usuario desea conocer otra opcion
                    //se le muestra al usuario las opciones que hay disponibles
                    System.out.println("____________________________________");
                    System.out.println("Cual relacion desea generar?:");
                    System.out.println("1.  Relacion Reflexiva");
                    System.out.println("2.  Relacion Anti-Reflexiva");
                    System.out.println("3.  Relacion Simetrica");
                    System.out.println("4.  Relacion Asimetrica");
                    System.out.println("5.  Relacion Anti-simetrica");
                    System.out.println("6.  Relacion transitiva");
                    System.out.println("7.  Mostrar todas las relaciones y salir");
                    System.out.print("=");

                    int opcion2 = entrada.nextInt();
                    if (opcion2 < 1 || opcion2 > 7) {
                        salir--;
                        System.out.println("||||| le quedan " + salir + " oportunidades ||||||");
                    }
                    if (salir == 0) {
                        ciclo = 1;
                    }

                    switch (opcion2) {
                        case 1: {
                            verificar1 = prueba.Reflexiva(Matriz);
                            // Se le muestra al usuario la matriz generada de forma manual
                            System.out.println("La matriz es: ");

                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }

                        }
                        break;
                        case 2: {
                            verificar2 = prueba.Anti_Reflexiva(Matriz);
                            // Se le muestra al usuario la matriz generada de forma manual
                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }

                        }
                        break;
                        case 3: {
                            verificar3 = prueba.Simetrica(filas, columnas, Matriz);
                            // Se le muestra al usuario la matriz generada de forma manual
                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }

                        }
                        break;
                        case 4: {
                            verificar4 = prueba.Asimetrica(filas, columnas, Matriz);
                            // Se le muestra al usuario la matriz generada de forma manual
                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }

                        }
                        break;
                        case 5: {
                            verificar5 = prueba.Anti_Simetrica(filas, columnas, Matriz);
                            // Se le muestra al usuario la matriz generada de forma manual
                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }

                        }
                        break;
                        case 6: {
                            verificar6 = prueba.Transitiva(filas, columnas, Matriz);
                            // Se le muestra al usuario la matriz generada de forma manual
                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");
                            }

                        }
                        break;
                        case 7: {

                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar1 = prueba.Reflexiva(Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar2 = prueba.Anti_Reflexiva(Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar3 = prueba.Simetrica(filas, columnas, Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar4 = prueba.Asimetrica(filas, columnas, Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar5 = prueba.Anti_Simetrica(filas, columnas, Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            System.out.println("\n\n");
                            System.out.println("|||||||||||||||||||||||||||||||||||||");
                            verificar6 = prueba.Transitiva(filas, columnas, Matriz);
                            System.out.println("|||||||||||||||||||||||||||||||||||||");

                            System.out.println("\n\n");
                            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                            prueba.propiedades(verificar1, verificar2, verificar3, verificar4, verificar5, verificar6);
                            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                            ciclo = 1;
                            // Se le muestra al usuario la matriz generada de forma manual
                            for (i = 0; i < Matriz.length; i++) {
                                System.out.print("| ");
                                for (j = 0; j < Matriz[i].length; j++) {
                                    System.out.print(Matriz[i][j]);
                                    if (j != Matriz[i].length - 1) {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("| ");

                            }

                            break;

                        }
                    }

                    System.out.println("el grafo es ");
                    Matriz_Adyacencia matriz = new Matriz_Adyacencia(filas);
                    matriz.Agregar_Aristas(filas, Matriz);

                }
                break;

///////////////////////////////////////////////////////////////////////////////////////////////////////////
            }

        }

    }
}
