// Importamos las clases necesarias para trabajar con JDBC
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase que inserta varias dietas en la base de datos 'Empresa', tabla 'Dietas'.
 */
public class InsertarDietas {
    public static void main(String[] args) {
        // Nos conectamos a la base de datos
        Connection conexion = ConexionBD.conectar();

        if (conexion == null) {
            System.out.println("No se pudo establecer conexión. Finalizando...");
            return;
        }

        // Sentencia SQL para insertar dietas
        String sql = "INSERT INTO Dietas (empleado, departamento, cantidad, concepto) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            // Inserto 10 dietas de distintos departamentos
            ps.setString(1, "Luis García");
            ps.setString(2, "Informática");
            ps.setDouble(3, 45.50);
            ps.setString(4, "Cena con cliente");
            ps.executeUpdate();

            ps.setString(1, "Ana Torres");
            ps.setString(2, "Ventas");
            ps.setDouble(3, 32.10);
            ps.setString(4, "Transporte a feria");
            ps.executeUpdate();

            ps.setString(1, "Pedro Ruiz");
            ps.setString(2, "RRHH");
            ps.setDouble(3, 28.00);
            ps.setString(4, "Formación interna");
            ps.executeUpdate();

            ps.setString(1, "Carmen López");
            ps.setString(2, "Informática");
            ps.setDouble(3, 36.75);
            ps.setString(4, "Hotel congreso");
            ps.executeUpdate();

            ps.setString(1, "Javier Sanz");
            ps.setString(2, "Ventas");
            ps.setDouble(3, 50.00);
            ps.setString(4, "Viaje cliente");
            ps.executeUpdate();

            ps.setString(1, "Lucía Martínez");
            ps.setString(2, "RRHH");
            ps.setDouble(3, 18.40);
            ps.setString(4, "Desayuno reunión");
            ps.executeUpdate();

            ps.setString(1, "David Ramírez");
            ps.setString(2, "Informática");
            ps.setDouble(3, 60.00);
            ps.setString(4, "Taller ciberseguridad");
            ps.executeUpdate();

            ps.setString(1, "Elena Pérez");
            ps.setString(2, "Ventas");
            ps.setDouble(3, 29.90);
            ps.setString(4, "Catering evento");
            ps.executeUpdate();

            ps.setString(1, "Marta Gómez");
            ps.setString(2, "RRHH");
            ps.setDouble(3, 22.35);
            ps.setString(4, "Material formativo");
            ps.executeUpdate();

            ps.setString(1, "Alberto Díaz");
            ps.setString(2, "Ventas");
            ps.setDouble(3, 38.70);
            ps.setString(4, "Combustible");
            ps.executeUpdate();

            System.out.println("✅ Inserción completada correctamente.");

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar los datos.");
            e.printStackTrace();
        }
    }
}

