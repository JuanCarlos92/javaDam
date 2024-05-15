package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "ESTO ES UNA PRUEBA DE CAMBIO DE TITULO",
                "TITULO",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "CAMBIAR MENSAJE",
                "DIAOLOGO",
                2,
                null,
                null,
                "ESCRIBE AQUI");
        
        
        String[] acceptableValues = {"APARTADO 1", "APARTADO 2", "APARTADO 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "ELIGE EL APARTADO",
                "DIALOGO",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
