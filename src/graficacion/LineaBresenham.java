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
    
    protected int x1, y1;
    
    public LineaBresenham(int x, int y, int x1, int y1){
        super(x,y);
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void dibujar(){
    }
}
