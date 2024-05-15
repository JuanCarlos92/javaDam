/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc1.Consulta_de_objeto_dentro_de_objetos_con_Db4o;
import Database.Pais;
import Database.Jugador;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Equipo {

    public static void main(String[] args) {
        String urlBD = "C:\\BasesDatos\\db4o\\EquiposDB.db";
        
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        
        initializeDB(db);
        showPlayers(db);
        showCountries(db);
        
        db.close();
        
    }
    
    public static void initializeDB(ObjectContainer db){
        Pais españa = new Pais(1, "España");
        Pais argentina = new Pais (2, "Argentina");
        Pais eeuu = new Pais(3, "Estados Unidos");
        Pais suiza = new Pais (4, "Suiza");
        
        Jugador federer = new Jugador(
                "Roger Federer", "Tenis", suiza, 37
        );
        Jugador messi = new Jugador(
                "Lionel Messi", "Futbol", argentina, 32
        );
        Jugador lebron = new Jugador(
                "LeBron James", "Baloncesto", eeuu, 34
        );
        Jugador iniesta = new Jugador(
                "Andres Iniesta", "Futbol", españa, 34
        );
        
        db.store(españa);
        db.store(argentina);
        db.store(eeuu);
        db.store(suiza);
        db.store(federer);
        db.store(messi);
        db.store(lebron);
        db.store(iniesta);
    }
    
    public static void showPlayers(ObjectContainer db){
        Jugador j = new Jugador("Federer", "Tenis", "Suiza", 37);
        
        ObjectSet<Jugador> result = db.queryByExample(j);
        if(result.isEmpty()){
            System.out.println("No existen jugadores en la base"
                    + "de datos");
        }
        else{
            System.out.println("\nNuméro de jugadores recuperados: "
                    + result.size());
            while(result.hasNext()){
                Jugador player = result.next();
                System.out.println(
                        "\n"+player.getNombre()+
                        " ( "+player.getEdad()+" )"+
                        "\n\tDeporte: "+player.getDeporte()+
                        "\n\tPais: "+player.getPais().getNombrePais()
                );
            }
        }
    }
    
    public static void showCountries(ObjectContainer db){
        Pais c = new Pais();
        
        ObjectSet<Pais> result = db.queryByExample(c);
        if(result.isEmpty()){
            System.out.println("No existen paises en la base"
                    + "de datos");
        }
        else{
            System.out.println("\nNuméro de paises recuperados: "
                    + result.size());
            while(result.hasNext()){
                Pais country = result.next();
                System.out.println("\nId: "+country.getId()+
                        "\tNombre: "+country.getNombrePais()
                );
            }
        }
    }
}
