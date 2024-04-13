/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

/**
 *
 * @author Juan Carlos
 */
public class LeerFicheroXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory
                = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("C:\\Users\\FOC\\Desktop\\mi_directorio\\" + "Empleados.xml"));
            document.getDocumentElement().normalize();

            System.out.println("Elemento raíz: "
                    + document.getDocumentElement().getNodeName());

            //Crea una lista con todos los nodes del empleado
            NodeList empleados = document.getElementsByTagName("empleado");

            //Recorrer la lista de nodos
            for (int i = 0; i < empleados.getLength(); i++) {
                Node empleado = empleados.item(i); //Obtener el nodo
                if (empleado.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) empleado;
                    System.out.println("ID :" + getNodo("id", elemento));
                    System.out.println("Apellido :"
                            + getNodo("apellido", elemento));
                    System.out.println("Departamento :"
                            + getNodo("departamento", elemento));
                    System.out.println("Salario: "
                            + getNodo("salario", elemento));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getNodo(String etiqueta, Element elem) {
        NodeList nodo = elem.
                getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node valornodo = (Node) nodo.item(0);
        return valornodo.getNodeValue();
    }

}
