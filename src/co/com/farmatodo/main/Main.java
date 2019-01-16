package co.com.farmatodo.main;

import co.com.farmatodo.model.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        showMenu();

    }

    public static void showMenu(){
            Movie miMovie = new Movie();
            miMovie.tittle = "Coco";
            miMovie.duration = 180;
            int exit = 0;
            do {
                Scanner sc = new Scanner(System.in);

                System.out.println("BIENVENIDOS AMAZON VIEWER");
                System.err.println("");
                System.out.println("Selecciona el numero de la opción deseada");
                System.out.println("1. Movies");
                System.out.println("2. Series");
                System.out.println("3. Books");
                System.out.println("4. Magazines");
                System.out.println("0. Exit");

                //leer la respuesta del usuario
                int response = 1;

                switch (response) {
                    case 1:
                        System.out.println("entraste a Movies");
                        showMovies();
                        break;
                    case 2:
                        System.out.println("entraste a Series");
                        break;
                    case 3:
                        System.out.println("entraste a Books");
                        break;
                    case 4:
                        System.out.println("entraste a Magazines");
                        break;
                    case 0:
                        System.out.println("saliste del sistema!");
                        break;

                    default :
                        System.out.println("Opción no disponible");
                        break;
            }
        }while(exit != 0);
    }

    public static void showMovies(){
        int exit = 0;
        do{
            System.out.println();
            System.out.println("------------------");
            System.out.println("Estas son las peliculas: ---");
        }while(exit != 0);
    }

    public static void showSeries(){}

    public static void showChapters(){}

    public static void showBooks(){}

    public static void showMagazines(){}
}
