/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import clases.Coche;
import clases.Usuario;

/**
 *
 * @author Isaac-PC
 */
public class Probar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConectaDB conexion = new ConectaDB();
        Coche hola = new Coche("Mazda", true, 32);

        Usuario administrador = conexion.getUsuario("admin");
        Usuario user = new Usuario();

        user.setPassword("admin");
        user.setUsuario("admin");

        if (administrador == user) {
            System.out.println("hola");
        }
//        System.out.println(conexion.getId()+1);

        System.out.println(conexion.actualizarCoche(3, "HOLA", true, 10));
    }

}
