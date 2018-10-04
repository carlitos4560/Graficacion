/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author user
 */
public class Lienzo1 extends javax.swing.JPanel{
    public Lienzo1  (){
        this.setBackground(Color.WHITE);
        this.setBounds(0,0,480,480);
    }
    @ Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE);
        //g.drawLine (0,0,200,200);
    }
    public void paint(Graphics g, String color, String figura ){
        super.paint(g);
        //case para color Y FIGURA
        Figura f;
        switch (figura){
            case "LINEA":
                //por defecto se creara en la posicion 50,50
                f=new LineaBresenham (50,50,100,100,);
        }
        g.setColor(Color.blue);
        //g.drawLine (0,0,200,200);
    }
}
