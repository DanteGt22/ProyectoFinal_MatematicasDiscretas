package Principal;

import javax.swing.JOptionPane;

public class Operaciones {

    public int contador;

    public int Reflexiva(int Matriz[][]) {
        int verificar1 = 2, com = 0;
        int x = 0, y = 0;
        while (x < Matriz.length && y < Matriz[0].length) {
            contador += Matriz[y][x];
            x++;
            y++;
        }

        System.out.println("La matriz es  :");
        if (contador == Matriz.length || com == 1) {
            System.out.println("_____________________________");
            System.out.println("La matriz es reflexiva      |");
            System.out.println("_____________________________");
            verificar1 = 1;
        } else if (contador == 0 || contador < Matriz.length) {
            System.out.println("_____________________________");
            System.out.println("La matriz no es reflexiva   |");
            System.out.println("_____________________________");
            verificar1 = 0;
        }

        return verificar1;

    }

    public int Anti_Reflexiva(int Matriz[][]) {
        int verificar2 = 2;
        int x = 0, y = 0;
        while (x < Matriz.length && y < Matriz[0].length) {
            contador += Matriz[y][x];
            x++;
            y++;
        }
        System.out.println("La matriz es  :");
        if (contador == Matriz.length || contador != 0) {
            System.out.println("_________________________________");
            System.out.println("La matriz no es Anti-reflexiva  |");
            System.out.println("_________________________________");
            verificar2 = 0;
        } else if (contador == 0) {
            System.out.println("_________________________________");
            System.out.println("La matriz si es Anti-reflexiva  |");
            System.out.println("_________________________________");
            verificar2 = 1;
        }
        return verificar2;
    }

    public int Simetrica(int filas, int columnas, int Matriz[][]) {
        int verificar3 = 2;
        int i = 0, j = 0;
        boolean simetrica = true;

        while (i < filas && simetrica == true) {
            j = 0;
            while (j < i && simetrica == true) {
                if (Matriz[i][j] != Matriz[j][i]) {
                    simetrica = false;
                }
                j++;
            }
            i++;
        }
        System.out.println("La matriz es :");
        if (simetrica == true) {
            System.out.println("_____________________________");
            System.out.println("La matriz si es simetrica   |");
            System.out.println("_____________________________");
            verificar3 = 1;
        } else {
            System.out.println("_____________________________");
            System.out.println("La matriz no es simetrica   |");
            System.out.println("_____________________________");
            verificar3 = 0;
        }
        return verificar3;
    }

    public int Asimetrica(int filas, int columnas, int Matriz[][]) {
        int verificar4 = 2;
        int i = 0, j = 0;
        boolean simetrica = true;

        while (i < filas && simetrica == true) {
            j = 0;
            while (j < i && simetrica == true) {
                if (Matriz[i][j] != Matriz[j][i]) {
                    simetrica = false;
                }
                j++;
            }
            i++;
        }
        System.out.println("La matriz es    :");
        if (simetrica == true) {
            System.out.println("_____________________________");
            System.out.println("La matriz no es Asimetrica  |");
            System.out.println("_____________________________");
            verificar4 = 0;
        } else {
            System.out.println("_____________________________");
            System.out.println("La matriz si es Asimetrica  |");
            System.out.println("_____________________________");
            verificar4 = 1;
        }
        return verificar4;
    }

    public int Anti_Simetrica(int filas, int columnas, int Matriz[][]) {
        int verificar5 = 2;
        boolean prueba = true;
        for (filas = 0; filas < Matriz.length; filas++) {
            for (columnas = 0; columnas < Matriz[filas].length; columnas++) {
                if (filas != columnas) {
                    if (Matriz[filas][columnas] != Matriz[columnas][filas] * -1) {
                        prueba = false;
                    }
                }
            }
        }

        System.out.println("La matriz es :");
        if (prueba == true) {
            System.out.println("_________________________________");
            System.out.println("la matriz si es antisimetrica   |");
            System.out.println("_________________________________");
            verificar5 = 1;
        } else {
            System.out.println("_________________________________");
            System.out.println("la matriz no es antisimetrica   |");
            System.out.println("_________________________________");
            verificar5 = 0;
        }
        return verificar5;
    }

    public int Transitiva(int filas, int columnas, int Matriz[][]) {
        int verificar6 = 2;
        boolean prueba = true;
        for (filas = 0; filas < Matriz.length; filas++) {
            for (columnas = 0; columnas < Matriz[filas].length; columnas++) {
                if (Matriz[filas][columnas] != (Matriz[filas][columnas] * Matriz[columnas][filas])) {
                    prueba = false;
                } else {
                    prueba = true;
                }
            }
        }
        System.out.println("La matriz es    :");

        if (prueba == true) {
            System.out.println("_____________________________");
            System.out.println("la matriz si es Transitiva  |");
            System.out.println("_____________________________");
            verificar6 = 1;
        } else {
            System.out.println("_____________________________");
            System.out.println("la matriz no es Transitiva  |");
            System.out.println("_____________________________");
            verificar6 = 0;
        }
        return verificar6;
    }

    public void propiedades(int verificar1, int verificar2, int verificar3, int verificar4,
            int verificar5, int verificar6) {

        System.out.println("La matriz es de  ");
        if (verificar1 == 1 && verificar3 == 1 && verificar6 == 1) {
            System.out.println("De Equivalencia     : Si");
            System.out.println("De Orden Estricto   : No");
            System.out.println("De Orden Parcial    : No");
            System.out.println("De Orden Total      : Si");

        } else if (verificar5 == 1 && verificar6 == 1) {
            System.out.println("De Equivalencia     : No");
            System.out.println("De Orden Estricto   : Si");
            System.out.println("De Orden Parcial    : No");
            System.out.println("De Orden Total      : No");
        } else if (verificar1 == 1 && verificar5 == 1 && verificar6 == 1) {
            System.out.println("De Equivalencia     : No");
            System.out.println("De Orden Estricto   : No");
            System.out.println("De Orden Parcial    : Si");
            System.out.println("De Orden Total      : No");
        } else {
            System.out.println("\n\n");
            System.out.println("No es de ningun orden");
            System.out.println("\n\n");
        }
    }

}
