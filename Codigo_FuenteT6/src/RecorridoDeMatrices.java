public class RecorridoDeMatrices {
    public static void main(String[] args) {
        /*Declaración de la matriz*/
        int filas=2;
        int columnas=3;
        int [][] m = new int [filas][columnas];
        
        /*Incialización de los elementos de la matriz*/
        /*Inicialización de los elementos de la fila 0*/
        m[0][0]=1;
        m[0][1]=4;
        m[0][2]=7;
        
        /*Inicialización de los elementos de la fila 1*/
        m[1][0]=2;
        m[1][1]=8;
        m[1][2]=4;
// En el primer bucle se recorren por las filas de la matriz
        for(int i=0; i<filas; i++){
// En el segundo bucle se recorren las columnas de cada fila de la matriz
            for(int j=0; j<columnas; j++){ 
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}


