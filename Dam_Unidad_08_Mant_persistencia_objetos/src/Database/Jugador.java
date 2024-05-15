/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

public class Jugador {

    private String nombre;
    private String deporte;
    private Pais pais;
    private Integer edad;

    public Jugador(String federer, String tenis, String suiza, int par) {
        this.nombre = null;
        this.deporte = null;
        this.pais = new Pais();
        this.edad = null;
    }

    public Jugador(String nombre, String deporte,
            Pais pais, Integer edad) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.pais = pais;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDeporte() {
        return this.deporte;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return this.edad;
    }
}
