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
    
    public LineaBresenham(int x, int y, int x1, int y1, int color){
        super(x,y, color);
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void dibujar(){
    }
    /*
    private Point2D point1;
    private Point2D point2;
    private ArrayList<Point2D> points;
    private int distands;
    //private ArrayList<Point2D> proyectionPoints;
    public LineBresemhan(Point2D point1,Point2D point2)
    {
        this.point1 = point1;
        this.point2 = point2;
        this.points = new ArrayList<>() ;
        this.distands = distands(point1,point2);
    }
    public void recalcular(Point2D point1,Point2D point2){
        this.point1 = point1;
        this.point2 = point2;
        this.points.clear();
        drawLine();
    }
    public Point2D getPoint1(){
        return point1;
    }
    
    public Point2D getPoint2(){
        return point2;
    }
    public void setPoint12(Point2D p1,Point2D p2){
        this.point1 = p1;
        this.point2 = p2;
    }
    
    public void scaleAmpliacion(int n){
        this.points.clear();
        if(n > 0){
            this.point2.scaleAmplia(n);
            drawLine();
        }
        else{
            if(n!=0){
                n = Math.abs(n);
                // Point2D aux = this.point2;
                this.point2.scaleReduce(n);
                System.out.println(this.point2.getX()+"  " +this.point2.getY());
               // this.point2 = new Point2D(aux.getX() - this.point2.getX(),aux.getY() - this.point2.getY());
                drawLine();
            }
        }
        
    }
    
    public void drawLine() {
        // delta of exact value and rounded value of the dependent variable
        int x1 = point1.getX(); 
        int y1 = point1.getY();
        int x2 = point2.getX();
        int y2 = point2.getY();
        
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
                points.add(new Point2D(x,y));
                
                //System.out.println(x+"  "+y);
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
                points.add(new Point2D(x,y));
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
    */
}
