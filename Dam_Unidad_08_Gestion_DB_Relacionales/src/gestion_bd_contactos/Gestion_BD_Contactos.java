/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion_bd_contactos;

/**
 *
 * @author Juan Carlos
 */
public class Gestion_BD_Contactos {

    public static void main(String[] args) {
        Database db = new Database();
        db.addContact("12345678A", "Nombre1", "Apellidos1",
                612345678, "email1@correo.es");
        db.addContact("23456789B", "Nombre2", "Apellidos2",
                617845678, "email2@correo.es");
        db.addContact("01234567C", "Nombre3", "Apellidos3",
                612965678, "email3@correo.es");

        db.showAll();

        db.updateContact("12345678A", "Nombre1", "Apellidos1",
                612345678, "emailnuevo@correo.es");

        db.searchContact("12345678A");

        db.deleteContact("12345678A");

        db.close();
    }
}
