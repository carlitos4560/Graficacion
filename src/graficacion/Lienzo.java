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
public class Lienzo extends Canvas {//implements MouseListener,MouseMotionListener{

    private static BufferedImage canvas;
    private Color colorFound;
    ArrayList<Figura> figura = new ArrayList<>();
    int x, y, xf, yf;
    Figura fig;

    public Lienzo() {
        setBackground(Color.BLACK);
    }

    public void buffer(int height, int width) {
        this.colorFound = Color.BLACK;
        this.canvas = new BufferedImage(height, width, BufferedImage.TYPE_INT_ARGB);
        // linea(Color.BLUE);
//         ciruclo(Color.RED);
//         triangulo(Color.CYAN);
//         rectangulo(Color.BLUE);
    }

    public void ciruclo(Color c) {
        int radio = 60;
        int xc = 200;
        int yc = 200;
        int color = c.getRGB();
        fig = new Circunferencia(radio, xc, yc, color);
        fig.calcular();
        figura.add(fig);
        drawnPoint(fig.getPuntos(), c);
    }

    public void triangulo(Color c) {
        int x1 = 200;
        int y1 = 200;
        int x2 = 150;
        int y2 = 150;
        int x3 = 300;
        int y3 = 300;
        int color = c.getRGB();
        fig = new Triangulo(x1, y1, x2, y2, x3, y3, color);
        fig.calcular();
        figura.add(fig);
        drawnPoint(fig.getPuntos(), c);
    }

    public void rectangulo(Color c) {
        int x1 = 50;
        int y1 = 50;
        int x2 = 50;
        int y2 = 300;
        int x3 = 200;
        int y3 = 300;
        int x4 = 200;
        int y4 = 50;
        int color = c.getRGB();
        fig = new Cuadrado(x1, y1, x2, y2, x3, y3, x4, y4, color);
        fig.calcular();
        figura.add(fig);
        drawnPoint(fig.getPuntos(), c);
    }

    public void linea(Color c) {
        int x1 = 50;
        int y1 = 50;
        int x2 = 100;
        int y2 = 100;
        int color = c.getRGB();
        fig = new LineaBresenham(x1, y1, x2, y2, color);
        fig.calcular();
        figura.add(fig);
//        System.out.println("linea");
        drawnPoint(fig.getPuntos(), c);
    }

    public void lineaDDA(Color c) {
        int x1 = 50;
        int y1 = 50;
        int x2 = 100;
        int y2 = 100;
        int color = c.getRGB();
        fig = new LineaDDA(x1, y1, x2, y2, color);
        fig.calcular();
        figura.add(fig);
//        System.out.println("linea");
        drawnPoint(fig.getPuntos(), c);
    }

    public void rotar(int rotar) {
        fig.rotacion(rotar);
    }

    public void trasladar(int t, Color c) {
        drawnPoint(fig.getPuntos(), Color.BLACK);
        fig.traslacion(t);
        drawnPoint(fig.getPuntos(), c);
    }

    public void transformar(int x, int y) {
        fig.transformacion(x, y);
    }

    public void pintar() {

    }

    public void cambiaColor(Color c) {
        int color = c.getRGB();
        fig.cambiarColor(color);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);
    }

    public void drawnPoint(ArrayList<int[]> points, Color c) {
        int color = c.getRGB();
        for (int[] p : points) {
            if (isValid(p)) {
                this.canvas.setRGB(p[0], p[1], color);
                System.out.println(p[0]+" "+p[1]);
            }

            repaint();
        }
    }

    public boolean isValid(int[] point) {
        if (point[0] > 0 && point[1] > 0 && point[0] < getSize().getWidth() && point[1] < getSize().getHeight()) {
            return true;
        }
        return false;
    }
    /*
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     */
}
