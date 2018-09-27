/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;
import java.util.ArrayList;
/**
 *
 * @author Carlos Roberto Esccobar Soria 
 * @author Elizabeth Cussi Lopez
 */
public class LineaDDA extends Figura {
    
    private int x1,y1;
    private ArrayList<int[]> puntos;
    public LineaDDA(int x, int y, int x1, int y1, int color){
        
        super(x,y,color);
        this.x1 = x1;
        this.y1 = y1;
        this.puntos = null;
    }
    
    public void rectaSimple2()
    {
        int dx = x1 - x;
        int dy = y1 - y;

        //g.drawLine( x, y, x, y); dibujo de la primera linea
        
        if (Math.abs(dx) > Math.abs(dy)) {          // pendiente < 1
            float m = (float) dy / (float) dx;
            float b = y - m*x;
            if(dx<0)
                dx =  -1;
            else
                dx =  1;
            while (x != x1) {
                super.x += dx;
                super.y = Math.round(m*x + b);
                //g.drawLine( x, y, x, y); dibujo de las siguientes lineass
            }
            
        } else
        if (dy != 0) {                              // slope >= 1
            float m = (float) dx / (float) dy;      // compute slope
            float b = x - m*y;
            if(dy<0)
                dy =  -1;
            else
                dy =  1;
            while (y != y1) {
                y += dy;
                x = Math.round(m*y + b);
                //g.drawLine( x, y, x, y);Dibujo de las ultimas lineas 
                System.out.println();
            }
        }
    }
}
