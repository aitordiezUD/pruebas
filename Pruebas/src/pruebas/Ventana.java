package pruebas;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class Ventana extends JFrame {
    public Ventana() {
        setTitle("Tabla Aleatoria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        Tabla tabla = new Tabla();
//        tabla.llenarTabla(3);

        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}


//Este código crea una ventana con una tabla que tiene tres columnas (Col 1, Col 2 y Col 3) y se rellena con tres filas de datos aleatorios cuando se ejecuta la clase Main. Asegúrate de que todas las clases estén en archivos separados con los mismos nombres que las clases. Luego, puedes ejecutar la clase Main para ver la ventana con la tabla.





