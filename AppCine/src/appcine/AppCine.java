package appcine;

import javax.swing.JOptionPane;

public class AppCine {

    public static void main(String[] args) {
        Metodos m1 = new Metodos();
        m1.BeginTheater();

        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "---- Menú del Cine ----\n"
                    + "1. Mostrar todos los asientos del cine y la película actual\n"
                    + "2. Cambiar nombre de la película\n"
                    + "3. Asignar asiento\n"
                    + "4. Salir\n"
                    + "Seleccione una opción:"));

            switch (option) {
                case 1:
                    m1.ShowSeats();
                    break;
                case 2:
                    m1.ChangeMovie();
                    break;
                case 3:
                    m1.AsingSeat();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
                    break;

            }
        } while (option != 4);
    }

}
