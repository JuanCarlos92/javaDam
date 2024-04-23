/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8_1_bd4o;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

/**
 *
 * @author Juan Carlos
 */
public class DBArticulos {
    
    private final String path = "Articulos.yap";
    private ObjectContainer db;
    
    public DBArticulos(){
        
    }
    
    public String alta(Articulos articulo){
        try {
            db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        
        db.store(articulo);
        
        db.close();
        
        return "El articulo se ha guardado correctamente";
        
        } catch (Exception e) {
            return "Ha habido un error conectando con la base de datos" + e.getMessage();
        }
        
        
    }
}
