/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import clases.Coche;
import clases.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ConectaDB {

    private Connection con;
    private Statement stmt;
    private boolean error;

    public ConectaDB() {
        error = false;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tareafinal", "root", "");
            stmt = con.createStatement();
            crearTabla();
            crearTablaUsuarios();
            addUsuarioAdmin();
        } catch (SQLException e) {
            error = true;
        }
    }

    public void closeDB() {
        error = false;
        try {
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            error = true;
        }
    }

    private void crearTabla() {
        error = false;
        String sql;
        try {
            sql = "CREATE TABLE IF NOT EXISTS jdm ("
                    + "id int NOT NULL, "
                    + "marca varchar(100) NOT NULL, "
                    + "turbo boolean NOT NULL, "
                    + "caballos int NOT NULL, "
                    + "PRIMARY KEY (id)"
                    + ");";
            stmt.execute(sql);
        } catch (SQLException ex) {
            error = true;
        }
    }

    private void crearTablaUsuarios() {
        error = false;
        String sql;
        try {
            sql = "CREATE TABLE IF NOT EXISTS usuarios ("
                    + "user VARCHAR(25) NOT NULL, "
                    + "password varchar(50) NOT NULL, "
                    + "PRIMARY KEY (user)"
                    + ");";
            stmt.execute(sql);
        } catch (SQLException ex) {
            error = true;
        }
    }

    private boolean addUsuarioAdmin() {
        error = false;
        boolean agregado = false;
        int insertado = 0;
        String sql;
        try {
            sql = "INSERT INTO usuarios VALUES(\"admin\", \"admin\");";
            insertado = stmt.executeUpdate(sql);
            if (insertado == 1) {
                agregado = true;
            }
        } catch (SQLException ex) {
            error = true;
        }
        return agregado;
    }

    public boolean addUsuario(Usuario usuario) {
        error = false;
        boolean agregado = false;
        int insertado = 0;
        String sql;
        try {
            sql = "INSERT INTO usuarios VALUES(\"" + usuario.getUsuario() + "\", \"" + usuario.getPassword() + "\");";
            insertado = stmt.executeUpdate(sql);
            if (insertado == 1) {
                agregado = true;
            }
        } catch (SQLException ex) {
            error = true;
        }
        return agregado;
    }

    public boolean addCoche(Coche coche) {
        error = false;
        boolean agregado = false;
        int insertado = 0;
        String sql;
        try {
            sql = "INSERT INTO jdm VALUES("
                    + coche.getId() + ", "
                    + "\"" + coche.getMarca() + "\", "
                    + coche.isTurbo() + ", "
                    + coche.getCaballos()
                    + ");";
            insertado = stmt.executeUpdate(sql);
            if (insertado == 1) {
                agregado = true;
            }
        } catch (SQLException ex) {
            error = true;
            ex.printStackTrace();
        }
        return agregado;
    }

    public boolean borrarCoche(int id) {
        error = false;
        boolean borrardo = false;
        int borrados = 0;
        String sql;
        try {
            sql = "DELETE FROM jdm WHERE id=" + id;
            borrados = stmt.executeUpdate(sql);
            if (borrados == 1) {
                borrardo = true;
            }
        } catch (SQLException ex) {
            error = true;
        }
        return borrardo;
    }

    public Coche getCoche(int id) {
        error = false;
        Coche coche = null;
        String sql = "SELECT id, marca, turbo, caballos FROM jdm WHERE id=" + id;
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                coche = new Coche();
                coche.setId(id);
                coche.setMarca(rs.getString("marca"));
                coche.setTurbo(rs.getBoolean("turbo"));
                coche.setCaballos(rs.getInt("caballos"));
            }
        } catch (SQLException ex) {
            error = true;
        }
        return coche;
    }

    public int getId() {
        error = false;
        int idUltimoCoche = 0;
        String sql = "SELECT id FROM jdm ORDER BY id DESC LIMIT 1";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                idUltimoCoche = rs.getInt("id");
            }
        } catch (SQLException ex) {
            error = true;
        }
        return idUltimoCoche;

    }

    public Usuario getUsuario(String user) {
        error = false;
        Usuario usuario = null;
        String sql = "SELECT user, password FROM usuarios WHERE user= \"" + user + "\";";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setUsuario(rs.getString("user"));
                usuario.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex) {
            error = true;
        }
        return usuario;
    }

    public List<Coche> getCoches() {
        error = false;
        List<Coche> misCoches = new ArrayList();
        String sql = "SELECT * FROM jdm";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Coche coche = new Coche();
                coche.setId(rs.getInt(1));
                coche.setMarca(rs.getString(2));
                coche.setTurbo(rs.getBoolean(3));
                coche.setCaballos(rs.getInt(4));
                misCoches.add(coche);
            }
            rs.close();
        } catch (SQLException ex) {
            error = true;
            misCoches = null;
        }
        return misCoches;
    }

    public boolean actualizarCoche(int id, String marca, boolean turbo, int caballos) {
        error = false;
        boolean actualizado = false;
        int actualizados = 0;
        String sql;
        try {
            sql = "UPDATE jdm "
                    + "SET marca= \"" + marca + "\", "
                    + "turbo= " + turbo + ", "
                    + "caballos= " + caballos
                    + " WHERE id= " + id;
            actualizados = stmt.executeUpdate(sql);
            if (actualizados == 1) {
                actualizado = true;
            }
        } catch (SQLException ex) {
            error = true;
        }
        return actualizado;
    }
}
