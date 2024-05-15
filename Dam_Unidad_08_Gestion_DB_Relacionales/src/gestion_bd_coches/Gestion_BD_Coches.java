/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion_bd_coches;

/**
 *
 * @author Juan Carlos
 */
public class Gestion_BD_Coches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db = new Database();
        db.addCar("A 1234 AB", 14534.5, "rojo", "Seat");
        db.addCar("B 5678 CD", 12514.5, "amarillo", "Ford");
        db.addCar("E 9012 FG", 10514.5, "amarillo", "Audi");

        db.showAll();

        db.updateCar("A 1234 AB", 4534.5, "verde", "seat");

        db.searchCar("A 1234 AB");

        db.deleteCar("A 1234 AB");
    }
}
