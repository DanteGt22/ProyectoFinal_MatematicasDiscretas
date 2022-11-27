package Principal;

import java.util.Scanner;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
//IMPORTAMOS LAS LIBRERIAS GRAPHSTRAM PARA JAVA

public class Matriz_Adyacencia {
    //COORDENADAS PARA GRAFICAR
    int y, x;
    private final int vertices;
    private final int[][] matriz;

    Graph graph = new SingleGraph("Vertices");
    
    //CREAMOS LOS METODOS 
    //METODO DE MATRIZ_ADYACENCIA PARA CREAR LA MATRIZ DEPENDIENDO DE LA CANTIDAD DE VERTICES
    //CREAMOS LA MATRIZ DE IGUAL TAMAÑO DE LOS VERTICES

    public Matriz_Adyacencia(int vertices) {
        this.vertices = vertices;
        matriz = new int[this.vertices][this.vertices];
        //INICIALIZAMOS LA MATRIZ EN 0
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {

                matriz[i][j] = 0;
            }
            //VA CREANDO LOS NODOS
            graph.addNode(String.valueOf(i + 1));
            //ESPECIFICO EL TAMAÑO Y LA POSICION DE LA ETIQUETA O DEL N0MBRE
            graph.getNode(i).setAttribute("ui.label", "->Vertice " + (i + 1) + " ");
            //LE DA EL NOMBRE AL VERTICE
            graph.getNode(i).setAttribute("ui.style", "text-alignment:right;");

        }

    }
    
    //METODO AGRAGAR_ARISTAS PARA CREAR LAS ARISTAS
    //PREGUNTA SI EL VERTICE ES ARISTA Y LAS GUARDA EN LA MATRIZ

    public void Agregar_Aristas(int vertices, int Matriz[][]) {

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {

                int Arista = Matriz[i][j];

                matriz[i][j] = Arista;

                if (matriz[i][j] == 1) {

                    graph.addEdge(String.valueOf(i + 1) + String.valueOf(j + 1), i, j, true);

                }

            }

        }
        //muestra la ventana emergente del grafo
        System.setProperty("org.graphstream.ui", "swing");
        graph.display();
    }

}
