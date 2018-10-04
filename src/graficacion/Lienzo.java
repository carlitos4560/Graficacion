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
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    int x4;
    int y4;
    
    private ArrayList<Figura> figuras;
    private String figura;
    private int[] puntos;
    public Lienzo()
    {
        figuras = null;
        setBackground(Color.black);        
        addMouseListener(this);
    }
   /*******************************************************************************
    public void buffer(int height,int width){
         this.colorFound = Color.BLACK;    
         this.canvas = new BufferedImage(height,width, BufferedImage.TYPE_INT_ARGB);
        // heignt = alto
        // width = ancho 
        //llamada a metodos para que se pinten
        Figura f = new Circunferencia(30, 50, 50, 150);
        f.pintar();
     }*/
    //*******************************************************************************
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Lienzo de Dibujo Canvas",40,40);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(canvas,null,null);   
        repaint();
    }
    
    public void figura(String figura){
        this.figura = figura;
        System.out.println(this.figura);
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        switch(this.figura){
            case "LINEA":
                int i=0;
                puntos = new int[4];
                //for(int i = 0; i < 4; i=+2){
                    x1= e.getX();
                    System.out.print(puntos[0]);
                    y1= e.getY();
                //} 
                /*
                Figura linea = new LineaBresenham(puntos[0],puntos[1],puntos[2],puntos[3],50);
                linea.calcular();
                linea.pintar();*/
                break;
                
            case "CIRCUNFERENCIA":
                puntos = new int[2];
                puntos[1]= e.getX();
                puntos[2]= e.getY();
                Figura cirunferencia = new Circunferencia(50,puntos[0],puntos[1],50);
                cirunferencia.calcular();
                cirunferencia.pintar();
                break;
                
            case "TRIANGULO":
                break;
                
            case "RECTANGULO":    
                break;
            default:
                break;
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        xf=e.getX();
//        yf=e.getY();
//        System.out.println(xf+" , "+yf);
    }
        
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY() );
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // cuando se suelta el mouse
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
}