package ejerc3.Consulta_Bd4o;

import Database.Jugador;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

public class Consultas_con_Db4o {

    public static void main(String[] args) {
        String urlBD = "C:\\BasesDatos\\db4o\\Equipos2DB.db";
        
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        
        initializeDB(db);
        
        //MostrarTodos
        buscarJugadores(db, new Jugador("Federer", "Tenis", "Suiza", 37));
        
        //Mostrar el jugador llamador "Messi"
        System.out.println("\n\nJugadores llamados \"Messi\"");
        buscarJugadores(db, new Jugador("Messi", null, null, null));
        
        //Mostrar jugadores mayores de 35 años
        System.out.println("\n\nJugadores mayores de 35 años");
        buscarJugadoresMayoresQue(db, 35);
        
        db.close();
    }
    
    public static void initializeDB(ObjectContainer db){        
        Jugador federer = new Jugador(
                "Federer", "Tenis", "Suiza", 37
        );
        Jugador messi = new Jugador(
                "Messi", "Futbol", "Argentina", 32
        );
        Jugador lebron = new Jugador(
                "LeBron", "Baloncesto", "Estados Unidos", 34
        );
        Jugador iniesta = new Jugador(
                "Iniesta", "Futbol", "España", 34
        );
        Jugador gasol = new Jugador (
                "Gasol", "Baloncesto", "España", 38
        );
        
        db.store(federer);
        db.store(messi);
        db.store(lebron);
        db.store(iniesta);
        db.store(gasol);
    }
    
    public static void buscarJugadores(ObjectContainer db,
            Jugador j){
        ObjectSet<Jugador> result = db.queryByExample(j); 
        
        mostrar(result);
    }
    
    
    public static void buscarJugadoresMayoresQue(ObjectContainer db,
            int edad){
        //Creamos un nuevo objecto Query
        Query q = db.query();
        
        /* Le indicamos sobre que clase de la base de datos
        vamos a realizar la consulta*/
        q.constrain(Jugador.class);
        
        /* Le indicamos sobre que campo queremos realizar la
        clausula "where" (en SQL) con descend(campo)
        Despues se le indica que queremos que sea mayor que la
        variable edad con constrain(edad).greater()*/
        q.descend("edad").constrain(edad).greater();
        
        //Se ejecuta la consulta
        ObjectSet result = q.execute();
        
        mostrar(result);
    }
    
    public static void mostrar(ObjectSet<Jugador> result){
        if(result.isEmpty()){
            System.out.println("No existen jugadores en la base"
                    + " de datos");
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
                        "\n\tPais: "+player.getPais()
                );
            }
        }
    }
}


