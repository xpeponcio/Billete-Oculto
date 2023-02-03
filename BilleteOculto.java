package billete;

import java.util.Arrays;

class BilleteOculto {
    
    public static void main(String[] args) {
        
        int columna = 8;
        int fila = 4;
        
        String tabla [][] = new String [columna][fila];
        
        int x = (int)Math.random()*columna;
        int y = (int)Math.random()*fila;
        
        tabla[x][y] = "€";
        
        for (int i=0; i<5; i++) { 
            for (int j=0; j<5; j++) { 
                System.out.println(tabla[i][j]); 
            }
        }
        
        
    }
    
}
