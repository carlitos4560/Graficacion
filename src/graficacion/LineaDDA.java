/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;
/**
 *
 * @author Carlos Roberto Esccobar Soria 
 * @author Elizabeth Cussi Lopez
 */
public class LineaDDA extends Figura {
    
    int []punto1 = new int[2];
    
    public LineaDDA(int x, int y, int x1, int y1, int color){
        
        super(x,y,color);
        this.punto1[0] = x1;
        this.punto1[1] = y1;
    }
    
    @Override
    public void calcular(){
    //public void calcular(int x0, int y0, int x1, int y1){
        int dx = this.punto1[0] - super.punto[0];
        int dy = this.punto1[1] - super.punto[1];
        int []aux;
        super.puntos.add(punto);
      //  g.drawLine( x0, y0, x0, y0);
        super.puntos.add(this.punto1);
        if (Math.abs(dx) > Math.abs(dy)) {          // pendiente < 1
            float m = (float) dy / (float) dx;
            float b = super.punto[1] - m*super.punto[0];
            if(dx<0)
                dx =  -1;
            else
                dx =  1;
            while (super.punto[0] != this.punto1[0]) {
                super.punto[0] += dx;
                super.punto[1] = Math.round(m*super.punto[0] + b);
                aux = new int[2];
                super.puntos.add(punto);
                //   g.drawLine( x0, y0, x0, y0);
            }
        } else
        if (dy != 0) {                              // slope >= 1
            float m = (float) dx / (float) dy;      // compute slope
            float b = super.punto[0] - m*super.punto[1];
            if(dy<0)
                dy =  -1;
            else
                dy =  1;
            while (super.punto[1] != this.punto1[1]) {
                super.punto[1] += dy;
                super.punto[0] = Math.round(m*super.punto[1] + b);
                super.puntos.add(punto);
                // g.drawLine( x0, y0, x0, y0);
            }
        }
    }

}
