/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author carlitos
 * 
 * Write a description of class Canvas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends Canvas implements MouseListener,MouseMotionListener{

    public static BufferedImage canvas;    
    private Color colorFound;
    int x;
    int y;
    int xf;
    int yf;
    Figura fig;
    public Lienzo()
    {
        setBackground(Color.black);
        
        addMouseListener(this);
        buffer(600,600);
        }
   //*******************************************************************************
    public void buffer(int height,int width){
         this.colorFound = Color.white;    
         this.canvas = new BufferedImage(height,width, BufferedImage.TYPE_INT_ARGB);
         fig=new Circunferencia();
         fig.calcular();
         drawnPoint(fig.getPuntos(),Color.blue);
         repaint();
        // heignt = alto
        // width = ancho 
        //llamada a metodos para que se pinten
        /*switch (f){
            case "LINEA":
               fig= new LineaBresenham(x,y,xf,yf,c);
               fig.calcular();
               
               fig.pintar();
               break;
            case  "TRIANGULO":
                fig=new Triangulo (50,50,100,100,150,150,c);
               
                fig.calcular();
                fig.pintar();
                break;
            case "CUADRADO":
                fig=new Cuadrado(50,50,100,100,80,80,60,60,c);
                fig.pintar();
                fig.calcular();
                break;
            case "CIRCULO":
                int radio=60;
                fig=new Circunferencia(radio,x,y,c);
                fig.pintar();
                break;
            default:
                System.out.print("error "+ f);
                break;
                
        }*/
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.pintar();
     }
    //*******************************************************************************
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Lienzo de Dibujo Canvas",40,40);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(canvas,null,null);   
        
       // repaint();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        System.out.println(x+", "+y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        xf=e.getX();
        yf=e.getY();
        System.out.println(xf+" , "+yf);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public void drawnPoint(ArrayList<int []> points,Color c){
        int color=c.getRGB();
            for(int[] p :points){
           this.canvas.setRGB(p[0],p[1],color);
           repaint();
        }        
    }    
        

    
}