package pruebas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class Tabla extends JTable {
    public Tabla() {
        // Creamos un modelo de tabla con 3 columnas
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Col 1", "Col 2", "Col 3"}, 0);
        setModel(modelo);
    }

//    public void llenarTabla(int filas) {
//        DefaultTableModel modelo = (DefaultTableModel) getModel();
//        Random rand = new Random();
//
//        for (int i = 0; i < filas; i++) {
//            // Generamos datos aleatorios
//            int dato1 = rand.nextInt(100);
//            int dato2 = rand.nextInt(100);
//            int dato3 = rand.nextInt(100);
//            modelo.addRow(new Object[]{dato1, dato2, dato3});
//        }
//    }
}
