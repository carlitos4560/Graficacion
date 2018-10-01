/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;

/**
 *
 * @author carlitos
 */
public class Cuadrado extends Figura{
    
    private final int x1, y1, x2, y2, x3, y3 ;
    
    public Cuadrado(int x,int y, int x1, int y1, int x2, int y2, int x3, int y3, int color){
        super(x, y, color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    
    @Override
    public void calcular(){
    
    }
        
}
