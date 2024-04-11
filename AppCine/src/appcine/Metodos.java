package appcine;

import javax.swing.JOptionPane;

public class Metodos {

    public static String[][] Seats;
    public static String ActualMovie;

    public static void BeginTheater() {
        Seats = new String[5][10];
        for (int i = 0; i < Seats.length; i++) {
            for (int x = 0; x < Seats[i].length; x++) {
                Seats[i][x] = "D";
            }
        }

        ActualMovie = "Sin título";
    }

    public static void ShowSeats() {
        String SeatsTxt = "---- Asientos del Cine ----\n";
        for (int i = 0; i < Seats.length; i++) {
            for (int x = 0; x < Seats[i].length; x++) {
                SeatsTxt += Seats[i][x] + "\t";
            }
            SeatsTxt += "\n";
        }
        SeatsTxt += "Película actual: " + ActualMovie;
        JOptionPane.showMessageDialog(null, SeatsTxt);
    }

    public static void ChangeMovie() {
        ActualMovie = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva película:");
    }

    public static void AsingSeat() {
        int row = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fila del asiento:"));
        int column = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la columna del asiento:"));

        if (row >= 0 && row < Seats.length && column >= 0 && column < Seats[0].length) {
            if (Seats[row][column]==("D")) {
                Seats[row][column] = "O";
                JOptionPane.showMessageDialog(null, "Asiento asignado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El asiento ya está ocupado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Asiento inválido. Intente de nuevo.");
        }
    }
}
