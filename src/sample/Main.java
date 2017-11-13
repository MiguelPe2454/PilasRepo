package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Pilas pilas = new Pilas();

        //launch(args);


        String opcion;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("\n ************* Pilas ***************");
            System.out.println("********** Menú Principal  **********");
            System.out.println("1) Isertar.");
            System.out.println("2) Mostrar.");
            System.out.println("3) Buscar.");
            System.out.println("4) Eliminar.");
            System.out.println("5) Tamaño.");
            System.out.println("6) Máximo.");
            System.out.println("7) Minimo");
            System.out.println("8) Terminar");
            System.out.print("Elija una opción: ");

            opcion = sc.nextLine();


            switch (opcion) {
                case "1": {
                    pilas.Insertar();
                    break;
                }
                case "2": {
                    pilas.peek();
                    break;
                }
                case "3": {

                }
                case "4": {
                    pilas.Pop();
                    break;
                }
                case "5": {

                    break;
                }
                case "6": {
                    break;
                }
                case "7": {
                    pilas.Minimo();
                    break;
                }
                case "8": {
                    System.out.println("¡Bye!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Opción incorrecta");
                    break;
                }
            }
        }while (!opcion.equals("0"));
        /*while (!opcion.equals("0"));


        pilas.Push(2);
        pilas.Push(8);
        pilas.Push(1);

        pilas.peek();
        pilas.Cima();
        pilas.Pop();
        pilas.peek();
        pilas.Pop();
        pilas.Cima();
        pilas.Pop();
        pilas.peek();
        */
    }


}

