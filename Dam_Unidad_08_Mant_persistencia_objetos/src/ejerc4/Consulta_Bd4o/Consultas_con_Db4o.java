package ejerc4.consultas_db4o;

import Database.Jugador;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

public class Consultas_con_Db4o {
    private ObjectContainer db;
    private String url = "C:\\BasesDatos\\db4o\\Equipos2DB.db";

    public Consultas_con_Db4o() {
        this.db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                url
        );
    }
    
    public void addPlayer(String name, String sport,
            String pais, int edad){
        db.store(new Jugador(name, sport, pais, edad));
    }
    
    public String buscarJugadores(String name, String sport, 
            String pais, Integer edad){
        ObjectSet<Jugador> result = db.queryByExample(
                new Jugador (name, sport, pais, edad)
        ); 
        
        return toResultString(result);
    }
    
    
    public String buscarJugadoresMayoresQue(int edad){
        Query q = db.query();
        q.constrain(Jugador.class);
        q.descend("edad").constrain(edad).greater();
        ObjectSet result = q.execute();
        
        return toResultString(result);
    }
    
    public String toResultString(ObjectSet<Jugador> result){
        String stringResult = "";
        if(result.isEmpty()){
            stringResult+="No hay jugadores en la base de datos";
        }
        else{
            stringResult+="Numéro de jugadores recuperados: "
                    + result.size();
            while(result.hasNext()){
                Jugador player = result.next();
                stringResult+="\n"+
                        player.getNombre()+
                        " ( "+player.getEdad()+" )"+
                        "\tDeporte: "+player.getDeporte()+
                        "\tPais: "+player.getPais();
            }
        }
        return stringResult;
    }
}


