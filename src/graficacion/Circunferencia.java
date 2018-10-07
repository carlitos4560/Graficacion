/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;

import java.util.Stack;

/**
 *
 * @author carlitos
 */
public class Circunferencia extends Figura{
    
    private int radio = 0;
    
    public Circunferencia(int radio, int x, int y, int color){
        super(x, y, color);
        this.radio = radio;
    }
    public Circunferencia(){
        super(50,50,150);
        this.radio = 25;
    }
 
    @Override
    public void calcular(){
        int []aux;
        int xc = super.punto[0];
        int yc = super.punto[1];
        int x = this.radio;
        int y = 0;
        int e = 0;
        while(x >= y){
            aux = new int[2];
            aux[0]=(xc + x);
            aux[1]=(yc + y);
            super.puntos.add(aux);
            aux = new int[2];
            aux[0]= (xc + y);
            aux[1]= (yc + x);
            super.puntos.add(aux);
            aux = new int[2];
            aux[0]=(xc - x);
            aux[1]=(yc + y);
            super.puntos.add(aux);
            aux = new int[2];
            aux[0]=(xc - y);
            aux[1]=(yc + x);
            super.puntos.add(aux);
            
            aux = new int[2];
            aux[0]=(xc + x);
            aux[1]=(yc - y);
            super.puntos.add(aux);
            aux = new int[2];
            aux[0]=(xc + y);
            aux[1]=(yc - x);
            super.puntos.add(aux);
            aux = new int[2];
            aux[0]= (xc - x);
            aux[1]= (yc - y);
            super.puntos.add(aux);
            aux = new int[2];
            aux[0]= (xc - y);
            aux[1]= (yc - x);
            super.puntos.add(aux);
            
            e = e + (2*y) + 1;
            y = y+1;
            if((2 * e) > ((2*x)-1)){
                x = x - 1;
                e = e - (2*x) + 1;
            }
        }        
        // claculo de todos los puntos de la cirfunferencia 
    }
    
    public void setRadio(int r ){
        this.radio = r;
        calcular();
    }
    
    public void scalar(int x, int y){
        super.punto[0] = x;
        super.punto[1] = y;
    }
    
    public void rellenarCirculo  (int[] pixelinterior, int color){
        //asumiendo que int x,y son el radio aplicamos el relleno por inundacion
        Stack <int[]> semillas = new Stack<int[]>();

    }
}
