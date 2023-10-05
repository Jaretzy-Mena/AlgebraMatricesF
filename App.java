import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        int menu, intentos=3;

        System.out.println("Bienbenid@/s");
        System.out.println("Menú");
        System.out.println("1. Igualdad de dos matrices");//Listo
        System.out.println("2. Suma de dos matrices");//Listo
        System.out.println("3. Una matriz nxm con todos los elementos 0");//Listo
        System.out.println("4. Inverso aditivo de una matrix nxm");//Listo
        System.out.println("5. Resta de dos matrices");//Listo
        System.out.println("6. Multiplicación de un escalar por una matriz nxm");//Listo
        System.out.println("7. Multiplicación de dos matrices compatibles");//En progreso
        System.out.println("8. Matriz identidad de tamaño n");
        System.out.println("9. Matriz inversa de tamaño n");
        System.out.println("10. El determinante de una matriz de tamaño n");
        System.out.println("11. Salir");

        do{
            System.out.print("Ingrese una opción ");
            menu=lector.nextInt();
            if(menu<=0 || menu>11){
                intentos--;
                System.out.println("Ingrese una opción valida");
            }
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
        }while(menu<=0 || menu>11);

        switch(menu){
            case 1->{
                System.out.println("1. Igualdad de dos matrices");
                System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
                System.out.print("Cantidad de filas: ");
                int cantFilas = lector.nextInt();
                System.out.print("Cantidad de columnas: ");
                int cantColumnas = lector.nextInt();
                //Primera matriz
                int[][] matrizA = new int[cantFilas][cantColumnas];
                //Pedir los datos
                System.out.println("Ingrese los elementos de la primera matriz");
                for (int i = 0; i < matrizA.length; i++) {//Para las filas
                    for (int j = 0; j < matrizA[i].length; j++) {//Para las columnas
                        System.out.print("A[" + (i+1) + "," + (j+1) + "]=");
                        matrizA[i][j] = lector.nextInt();
                    }
                }
                //Segunda matriz
                int[][] matrizB = new int[cantFilas][cantColumnas];
                //Pedir los datos
                System.out.println("Ingrese los elementos de la segunda matriz");
                for (int i = 0; i < matrizB.length; i++) {//Para las filas
                    for (int j = 0; j < matrizB[i].length; j++) {//Para las columnas
                        System.out.print("B[" + (i+1) + "," + (j+1) + "]=");
                        matrizB[i][j] = lector.nextInt();
                    }
                }
                //Mostrar matrices
                System.out.println("La matriz A");
                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        System.out.print(matrizA[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("La matriz B");
                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[i].length; j++) {
                        System.out.print(matrizB[i][j] + "\t");
                    }
                    System.out.println();
                }
                //
                int falsa=0;
                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        if(matrizA[i][j]!=matrizB[i][j]){
                            falsa=2;
                        }
                    }
                }
                if(falsa==2){
                    System.out.println("Las matrices no son iguales");
                }else{
                    System.out.println("Las matrices son iguales");
                }                
            }
            case 2->{
                System.out.println("2. Suma de dos matrices");
                System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
                System.out.print("Cantidad de filas: ");
                int cantFilas = lector.nextInt();
                System.out.print("Cantidad de columnas: ");
                int cantColumnas = lector.nextInt();
                //Primera matriz
                int[][] matrizA = new int[cantFilas][cantColumnas];
                //Pedir los datos
                System.out.println("Ingrese los elementos de la primera matriz");
                for (int i = 0; i < matrizA.length; i++) {//Para las filas
                    for (int j = 0; j < matrizA[i].length; j++) {//Para las columnas
                        System.out.print("A[" + (i+1) + "," + (j+1) + "]=");
                        matrizA[i][j] = lector.nextInt();
                    }
                }
                //Segunda matriz
                int[][] matrizB = new int[cantFilas][cantColumnas];
                //Pedir los datos
                System.out.println("Ingrese los elementos de la segunda matriz");
                for (int i = 0; i < matrizB.length; i++) {//Para las filas
                    for (int j = 0; j < matrizB[i].length; j++) {//Para las columnas
                        System.out.print("B[" + (i+1) + "," + (j+1) + "]=");
                        matrizB[i][j] = lector.nextInt();
                    }
                }
                //Mostrar matrices
                System.out.println("A");
                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        System.out.print(matrizA[i][j] + "\t");
                    }
                    System.out.println("");
                }
                System.out.println("B");
                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[i].length; j++) {
                        System.out.print(matrizB[i][j] + "\t");
                    }
                    System.out.println("");
                }
                //
                int[][] matrizS = new int[matrizA.length][matrizA[0].length];
                //
                System.out.println("la suma de la matriz A y B es:");
                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        matrizS[i][j] = matrizA[i][j]+matrizB[i][j];
                    }
                    System.out.print("");
                }
                for (int i = 0; i < matrizS.length; i++) {
                    for (int j = 0; j < matrizS[i].length; j++) {
                        System.out.print(matrizS[i][j] + "\t");                
                    }
                    System.out.println("");
                }
            }

            case 3->{
                System.out.println("3. Una matriz nxm con todos los elementos 0");
                System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
                System.out.println("De cuanto desea que sea la matriz nula");
                System.out.print("Cantidad de filas: ");
                int cantFilas = lector.nextInt();
                System.out.print("Cantidad de columnas: ");
                int cantColumnas = lector.nextInt();

                int [][]matriz=new int[cantFilas][cantColumnas];
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz.length; j++){
                        matriz[i][j]=0;
                    }        
                }
        
                System.out.println("Aquí esta la matriz 0 ["+cantFilas+","+cantColumnas+"] ");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + "\t");                
                    }
                    System.out.println("");
                }
            }

            case 4->{
                System.out.println("4. Inverso aditivo de una matrix nxm");
                System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
                System.out.print("Cantidad de filas: ");
                int cantFilas = lector.nextInt();
                System.out.print("Cantidad de columnas: ");
                int cantColumnas = lector.nextInt();

                int [][]matriz=new int[cantFilas][cantColumnas];
        

                System.out.println("Ingrese los elementos de la matriz");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print("A[" + (i+1) + "," + (j+1) + "]=");
                        matriz[i][j] = lector.nextInt();
                    }
                }

                System.out.println("Matriz que ingreso");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println("");
                }
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz.length; j++){
                        matriz[i][j]=(-(matriz[i][j]));
                    }        
                }

                System.out.println("Su inverso aditivo es");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + "\t");                
                    }
                    System.out.println("");
                }
            }

            case 5->{
                System.out.println("5. Resta de dos matrices");
                System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
                System.out.print("Cantidad de filas: ");
                int cantFilas = lector.nextInt();
                System.out.print("Cantidad de columnas: ");
                int cantColumnas = lector.nextInt();
                //Primera matriz
                int[][] matrizA = new int[cantFilas][cantColumnas];
                //Pedir los datos
                System.out.println("Ingrese los elementos de la primera matriz");
                for (int i = 0; i < matrizA.length; i++) {//Para las filas
                    for (int j = 0; j < matrizA[i].length; j++) {//Para las columnas
                        System.out.print("A[" + (i+1) + "," + (j+1) + "]=");
                        matrizA[i][j] = lector.nextInt();
                    }
                }
                //Segunda matriz
                int[][] matrizB = new int[cantFilas][cantColumnas];
                //Pedir los datos
                System.out.println("Ingrese los elementos de la segunda matriz");
                for (int i = 0; i < matrizB.length; i++) {//Para las filas
                    for (int j = 0; j < matrizB[i].length; j++) {//Para las columnas
                        System.out.print("B[" + (i+1) + "," + (j+1) + "]=");
                        matrizB[i][j] = lector.nextInt();
                    }
                }
                //Mostrar matrices
                System.out.println("La matriz A");
                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        System.out.print(matrizA[i][j] + "\t");
                    }
                    System.out.println("");
                }
                System.out.println("La matriz B");
                for (int i = 0; i < matrizB.length; i++) {
                    for (int j = 0; j < matrizB[i].length; j++) {
                        System.out.print(matrizB[i][j] + "\t");
                    }
                    System.out.println("");
                }
                //
                int[][] matrizS = new int[matrizA.length][matrizA[0].length];
                //
                System.out.println("La resta entre matriz A y B es:");
                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA[i].length; j++) {
                        matrizS[i][j] = matrizA[i][j]-matrizB[i][j];
                    }
                    System.out.print("");
                }
                for (int i = 0; i < matrizS.length; i++) {
                    for (int j = 0; j < matrizS[i].length; j++) {
                        System.out.print(matrizS[i][j] + "\t");                
                    }
                    System.out.println("");
                }
            }

            case 6->{
                System.out.println("6. Multiplicación de un escalar por una matriz nxm");
                System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
                System.out.print("Cantidad de filas: ");
                int cantFilas = lector.nextInt();
                System.out.print("Cantidad de columnas: ");
                int cantColumnas = lector.nextInt();

                int [][]matriz=new int[cantFilas][cantColumnas];
        
                System.out.println("Ingrese los elementos de la matriz");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print("A[" + (i+1) + "," + (j+1) + "]=");
                        matriz[i][j] = lector.nextInt();
                    }
                }
        
                System.out.println("Ingrese el número real por el cual multiplicarlo");
                int real=lector.nextInt();

                System.out.println("Matriz que ingreso");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println("");
                }
        
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz.length; j++){
                        matriz[i][j]=((real)*(matriz[i][j]));
                    }        
                }

                System.out.println("Producto de multiplicar "+real+" por la matriz");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + "\t");                
                    }
                    System.out.println("");
                }
            }

            case 7->{
                System.out.println("7. Multiplicación de dos matrices compatibles");
            }
            case 8->{
                System.out.println("8. Matriz identidad de tamaño n");
            }
            case 9->{
                System.out.println("9. Matriz inversa de tamaño n");
            }
            case 10->{
                System.out.println("10. El determinante de una matriz de tamaño n");
            }
            case 11->{
                System.out.println("11. Salir");
                System.out.println("Muchas gracias por usar nuestros servicios");
                System.out.println("Esperamos volver a verl@/s luego");
                System.out.println(":D");
            }
            
        }
        
        lector.close();
    }
}
