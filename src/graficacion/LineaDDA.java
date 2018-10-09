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
public class LineaDDA {
    
    ArrayList<int[]> p = new ArrayList<>();
    int x0, y0, x1, y1;
    public LineaDDA(int x0, int y0, int x1, int y1){
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
    public void rectaSimple2()
    {
        int [] puntos = new int[2];
        int dx = x1 - x0;
        int dy = y1 - y0;
        puntos[0] = x0;
        puntos[1] = x1;
        p.add(puntos);
        //g.drawLine( x0, y0, x0, y0);
        if (Math.abs(dx) > Math.abs(dy)) {          // pendiente < 1
           
            float m = (float) dy / (float) dx;
            float b = y0 - m*x0;
            if(dx<0)
                dx =  -1;
            else
                dx =  1;
            while (x0 != x1) {
                
                x0 += dx;
                y0 = Math.round(m*x0 + b);
                puntos = new int[2];
                puntos[0] = x0;
                puntos[1] = x1;
                p.add(puntos);
                //g.drawLine( x0, y0, x0, y0);
            }
        } else
        if (dy != 0) {                              // slope >= 1
            float m = (float) dx / (float) dy;      // compute slope
            float b = x0 - m*y0;
            if(dy<0)
                dy =  -1;
            else
                dy =  1;
            while (y0 != y1) {
                y0 += dy;
                x0 = Math.round(m*y0 + b);
                puntos = new int[2];
                puntos[0] = x0;
                puntos[1] = x1;
                p.add(puntos);
                //g.drawLine( x0, y0, x0, y0);
            }
        }
    }
    
    public ArrayList<int[]> getPuntos(){
        return p;
    }
}
