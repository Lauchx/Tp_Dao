import Person.Controller.PersonController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String yesorno = "";
        PersonController personController = new PersonController();
        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("1) crear || 2) Listar || 3) Listar por ID || 4) Actualizar || 5) Eliminar");
            int number = keyboard.nextInt();
            switch (number) {
                case 1:
                    personController.create();
                    break;
                case 2:
                    personController.readAll();
                    break;
                case 3:
                    personController.readById();
                    break;
                case 4:
                    personController.update();
                    break;
                case 5:
                    personController.delete();
                    break;
            }
            keyboard = new Scanner(System.in);
            System.out.println("¿Querés seguir usando?");
            yesorno = keyboard.nextLine();
        }while(yesorno.equalsIgnoreCase("si"));


    }
}
