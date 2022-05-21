/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * La clase coche representa un coche 😃. Esta clase puede trabajar con String:
 * marca, entero: nº caballos y boolean: tiene o no turbo.
 *
 * @author Isaac Romanillos Deza
 * @version 1.0 31/05/2021
 * @since 1.0
 *
 */
public class Coche {

    /**
     * Tipo primitivo que lleva la cuenta de coches creados.
     */
    private static int contadorCoches = 01;
    /**
     * Tipo primitivo que identifica de manera unica a cada coche.
     */
    private int id;
    /**
     * Tipo primitivo que almacena la marca del coche.
     */
    private String marca;
    /**
     * Tipo primitivo que indica si el coche tiene o no turbo.
     */
    private boolean turbo;
    /**
     * Tipo primitivo que almacena el nº de caballos.
     */
    private int caballos;

    /**
     * Crea una nueva isntancia y se inicializan a valores vacios, exceptuando
     * el id que este si se incrementa.
     *
     */
    public Coche() {
        id = contadorCoches++;
        this.marca = "";
        this.turbo = true;
        this.caballos = 0;
    }

    /**
     *
     * Crea una isntancia a partir de los siguientes valores: tipo string, tipo
     * boolean y tipo entero.
     *
     * @param marca String que representa la marca del coche. No se distinguen
     * mayusculas de minusculas.
     *
     * @param turbo boolean que indica si tiene o no turbo
     *
     * @param caballos int que almacena el nº de caballos.
     *
     */
    public Coche(String marca, boolean turbo, int caballos) {
        id = contadorCoches++;
        this.marca = marca;
        this.turbo = turbo;
        this.caballos = caballos;
    }

    /**
     * Devuelve el identificador del coche en formato numerico.
     *
     * @return int que identifica de manera unica al coche.
     * @see #getId()
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del coche a partir de un tipo primitivo
     * entero.
     *
     * @param id int que representa de manera unica al coche.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve la marca del coche en formato texto.
     *
     * @return String que representa la marca del coche.
     * @see #getMarca()
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del coche a partir de un String.
     *
     * @param marca String que representa la marca del coche. No distingue entre
     * mayusculas y minusculas.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve si el coche tiene turbo o no, en formato true/false.
     *
     * @return boolean
     * @see #isTurbo()
     */
    public boolean isTurbo() {
        return turbo;
    }

    /**
     * Establece si el coche tiene o no turbo a partir de true/false..
     *
     * @param turbo boolean que representa true o false.
     */
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String turboPlain() {
        String tieneTurbo = "";
        if (isTurbo() == true) {
            tieneTurbo = "Sí";
        } else {
            tieneTurbo = "No";
        }
        return tieneTurbo;
    }

    /**
     * Devuelve los cv del coche en formato numerico.
     *
     * @return int que representan los cv del coche.
     * @see #getCaballos()
     */
    public int getCaballos() {
        return caballos;
    }

    /**
     * Establece los cv del coche a partir de un int.
     *
     * @param caballos int que representa los cv del coche.
     */
    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    /**
     * Devuelve un String que representa el objeto
     *
     * @return un String que representa el objeto.
     */
    @Override
    public String toString() {
        return "Coche{" + "ID:" + id + ", Marca-modelo:" + marca + ", TURBO: " + turboPlain() + ", " + caballos + "cv" + '}';
    }

}
