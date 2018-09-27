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
public class Circunferencia extends Figura{
    
    private int radio = 0;
    
    public Circunferencia(int radio, int x, int y, int color){
        super(x, y, color);
        this.radio = radio;
    }
    /*
    private Point2D pointCenter;
    private int radio;
    private ArrayList<Point2D> points;
    public CircleBresenham(Point2D pointCenter,int radio)
    {
        this.pointCenter = pointCenter;
        this.radio = radio;
        this.points = new ArrayList<Point2D>();
    }
    
    public CircleBresenham(){
        this.pointCenter = null;
        this.radio = 0;
        this.points = new ArrayList<Point2D>();
    }
    
    public ArrayList<Point2D> getPoint2DCircle(){
        return this.points;
    }
    
    public ArrayList<Point2D> calcule(){
        int xc = pointCenter.getX();
        int yc = pointCenter.getY();
        int x = this.radio;
        int y = 0;
        int e = 0;
        while(x >= y){
            points.add(new Point2D((xc + x),(yc + y)));
            points.add(new Point2D((xc + y),(yc + x)));
            points.add(new Point2D((xc - x),(yc + y)));
            points.add(new Point2D((xc - y),(yc + x)));

            points.add(new Point2D((xc + x),(yc - y)));
            points.add(new Point2D((xc + y),(yc - x)));
            points.add(new Point2D((xc - x),(yc - y)));
            points.add(new Point2D((xc - y),(yc - x)));
            e = e + (2*y) + 1;
            y = y+1;
            if((2 * e) > ((2*x)-1)){
                x = x - 1;
                e = e - (2*x) + 1;
            }
        }        
        // claculo de todos los puntos de la cirfunferencia 
        return this.points;
    }*/
}
