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
public class Lienzo extends Canvas{

    public static BufferedImage canvas;    
    private Color colorFound;
    
    public Lienzo()
    {
        setBackground(Color.WHITE);  
        }
   //*******************************************************************************
    public void buffer(int height,int width){
         this.colorFound = Color.BLACK;    
         this.canvas = new BufferedImage(height,width, BufferedImage.TYPE_INT_ARGB);
        // heignt = alto
        // width = ancho 
        //llamada a metodos para que se pinten
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.pintar();
     }
    //*******************************************************************************
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Lienzo de Dibujo Canvas",40,40);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(canvas,null,null);   
        
        repaint();
    }
    
}
