
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class CreacionFicheroXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        File fichero = new File(
                "C:\\\\Users\\\\FOC\\\\Desktop\\\\mi_directorio"
                + "\\ficheroAleatorio.dat");
        RandomAccessFile ficheroAleatorio = new RandomAccessFile(fichero, "r");

        //Variable en la que se almacenará la posición del puntero
        int posicionPuntero = 0;

        //Variabes Datos Empleado
        char apellido[] = new char[10];
        char caracter;
        int id_empleado, id_departamento;
        double salario;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementacion
                    = builder.getDOMImplementation();
            Document document = implementacion.createDocument(null, "Empleados", null);
            document.setXmlVersion("1.0");

            ficheroAleatorio.seek(posicionPuntero);
            while (ficheroAleatorio.getFilePointer()
                    != ficheroAleatorio.length()) {

                //Se leee el id del empleado
                id_empleado = ficheroAleatorio.readInt();

                for (int i = 0; i < apellido.length; i++) {
                    caracter = ficheroAleatorio.readChar();
                    apellido[i] = caracter;
                }

                String apellidosString = new String(apellido);
                id_departamento = ficheroAleatorio.readInt();
                salario = ficheroAleatorio.readDouble();

                posicionPuntero = posicionPuntero + 36;
                ficheroAleatorio.seek(posicionPuntero);
                if (id_empleado > 0) {
                    //Nodo empleado
                    Element raiz = document.createElement("empleado");
                    document.getDocumentElement().appendChild(raiz);
                    //Añadir el id del empleado
                    crearElementoFicheroXML(document, raiz,
                            "id", Integer.toString(id_empleado));
                    //Añadir el apellido
                    crearElementoFicheroXML(document, raiz, "apellido",
                            apellidosString.trim());
                    //Añadir el departamento
                    crearElementoFicheroXML(document, raiz, "departamento",
                            Integer.toString(id_departamento));
                    //Añadir el salario
                    crearElementoFicheroXML(document, raiz, "salario",
                            Double.toString(salario));
                }
            }

            Source source = new DOMSource(document);
            Result result = new StreamResult(new java.io.File(
                    "C:\\\\Users\\\\FOC\\\\Desktop\\\\mi_directorio"
                    + "\\Empleados.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

            ficheroAleatorio.close();

        } catch (Exception e) {
            System.err.println("Error :" + e);
        }
    }

    //Inserción de un nodo
    static void crearElementoFicheroXML(Document document,
            Element raiz, String dato, String valor) {
        //Creación del hijo
        Element elem = document.createElement(dato);
        //Asingación del valor
        Text text = document.createTextNode(valor);
        raiz.appendChild(elem);
        elem.appendChild(text);
    }

}
