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
public class LineaBresenham extends Figura{
    
    protected int[] punto1 = new int[2];
    
    public LineaBresenham(int x, int y, int x1, int y1, int color){
        super(x,y, color);
        this.punto1[0]= x1;
        this.punto1[1]= y1;
        calcular();
    }
    
    @Override
    public void calcular(){
        // delta of exact value and rounded value of the dependent variable
        int []aux = new int[2];
        int x1 = super.punto[0]; 
        int y1 = super.punto[1];
        int x2 = punto1[0];
        int y2 = punto1[1];
        
        int d = 0;
 
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
 
        int dx2 = 2 * dx; // slope scaling factors to
        int dy2 = 2 * dy; // avoid floating point
 
        int ix = x1 < x2 ? 1 : -1; // increment direction
        int iy = y1 < y2 ? 1 : -1;
 
        int x = x1;
        int y = y1;
 
        if (dx >= dy) {
            while (true) {
                aux = new int[2];
                aux[0] = x;
                aux[1] = y;
                super.puntos.add(aux);
                System.out.println(aux[0]+", "+aux[1]);
                if (x == x2)
                    break;
                x += ix;
                d += dy2;
                if (d > dx) {
                    y += iy;
                    d -= dx2;
                }
            }
        } else {
            while (true) {
                aux = new int[2];
                aux[0] = x;
                aux[1] = y;
                super.puntos.add(aux);
                if (y == y2)
                    break;
                y += iy;
                d += dx2;
                if (d > dy) {
                    x += ix;
                    d -= dy2;
                }
            }
        }
    }
    public void scalar(int x, int y){
        this.punto1[0] = x;
        this.punto1[1] = y;
    }
}
