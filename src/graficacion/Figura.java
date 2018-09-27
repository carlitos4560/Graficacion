/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;

/**
 * @author carlitos
 */
public class Figura {
    
    protected int x,y;
    protected int color;
    
    public Figura(int x, int y, int color){
        
        this.x = x;
        this.y = y; 
        this.color = color;
    }
    
    /*
    * Totas las figuras rotan sin ningun problema uso de matrices 
    */    
    public void rotacion(int grado){
        // este algoritmo ya lo tengo implementado en el otro git la idea es reusar
        int vector [] = new int[2];
        vector[0]= (int)Math.cos(grado)- 1;
        vector[1]= 1 + (int)Math.sin(grado);
    }
    
    /*
    * Totas las figuras se trasladan asiendo uso de matrices [][]A *x y
    */
    public void traslacion(int t){
        
        int []vector = new int[2];
        vector[0] = this.x + t;
        vector[1] = this.y + t;
    }
    
    /*
    * Totas la transformacion se hace por matrices igual [][]A *x y
    */
    public void transformacion(int x){
        
        int [] vector = new int[3];
        vector [0]= this.x * this.x;
        vector [1]= this.y * this.y;;
        vector [2]=1;
 
   }
}
