import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        //declaramos las variables
        int x = 0, y = 0, resul = 0;
        int opcion = 0;

        // hacemos el menu que se imprime en la pantalla
        System.out.println("Menu");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Modular");

        System.out.print("Que opcion deseas realizar? ");
        Scanner entrada = new Scanner(System.in);
        //le pedimos al usuario que digite la opcion que el desea
        opcion = entrada.nextInt();

        /*Con este switch dependiendo la opcion que escoga el usuario sera lo que va a correr,
        en todos los case es casi el mismo codigo, lo unico que varia es operador arimetrico
        que dependiendo la opcion cambia el resultado
         */
        switch (opcion){
            case 1:
                System.out.print("Ingrese el primer numero: ");
                x = entrada.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                y = entrada.nextInt();

                resul = x+y;

                System.out.print("La suma es: " + resul);


                break;
            case 2:
                System.out.print("Ingrese el primer numero: ");
                x = entrada.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                y = entrada.nextInt();

                resul = x-y;

                System.out.println("La resta es: " + resul);
                break;
            case 3:
                System.out.print("Ingrese el primer numero: ");
                x = entrada.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                y = entrada.nextInt();

                resul = x*y;

                System.out.println("La multiplicacion es: " + resul);
                break;
            case 4:
                System.out.print("Ingrese el primer numero: ");
                x = entrada.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                y = entrada.nextInt();

                resul = x/y;

                System.out.println("La division es: " + resul);
                break;
            case 5:
                System.out.print("Ingrese el primer numero: ");
                x = entrada.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                y = entrada.nextInt();

                resul = x%y;

                System.out.println("El residuo es: " + resul);
                break;
        }


    }

}
