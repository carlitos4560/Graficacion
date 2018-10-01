/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;

/**
 * @author carlitos
 */
import java.util.ArrayList;
public abstract class Figura {
    
    protected int[] punto = new int[2];
    protected ArrayList<int[]> puntos = new ArrayList<>();
    protected int color;
    
    public Figura(int x, int y, int color){
        this.punto[0] = x;
        this.punto[1] = y;
        this.color = color;
    }    
    /*
    * Totas las figuras rotan sin ningun problema uso de matrices 
    */    
    public abstract void calcular();
    
    public void pintar(){
        for(int[] p: this.puntos){
            Lienzo.canvas.setRGB(p[0], p[1], this.color);
        }
    }
    public void cambiarColor(int c){
        this.color = c;
        pintar();
    }
    public ArrayList<int[]> getPuntos(){
        return this.puntos;
    }
    public void rotacion(double theta){
        // este algoritmo ya lo tengo implementado en el otro git la idea es reusar
        for(int[] p:this.puntos){
            double rad = Math.toRadians(theta);
            double c_x = (double)p[0], c_y = (double)p[1];      
            p[0] = (int)((c_x * Math.cos(rad)) - (c_y * Math.sin(rad)));
            p[1] = (int)((c_x * Math.sin(rad)) + (c_y * Math.cos(rad)));
        }
    }
    
    /*
    * Totas las figuras se trasladan asiendo uso de matrices [][]A *x y
    */
    public void traslacion(int x, int y){        
        for(int[] p:this.puntos){
            p[0] += x;
            p[0] += y;
        }
    }
    
    /*
    * Totas la transformacion se hace por matrices igual [][]A *x y
    */
    public void transformacion(int x, int y ){
        for(int[] p:this.puntos){
            p[0] *= x;
            p[0] *= y;
        }
   }
}
