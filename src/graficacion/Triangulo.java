/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;
import java.util.ArrayList;
/**
 *
 * @author carlitos
 */
public class Triangulo extends Figura{
    
    private int x1,y1,x2,y2;
    //requiero utilizar los dats de las lineas por ello variables locales
    //Figura linea1;
    //Figura linea2;
    //Figura linea3;
    
    
    public Triangulo(int x, int y,int x1,int y1, int x2, int y2, int color){
        super(x, y, color);
        this.x1 = x1;
        this.y2 = y2;
        this.x1 = x1;
        this.y2 = y2;
        calcular();
    }
    public void calcular(){
        Figura linea1 = new LineaDDA(super.punto[0],super.punto[1],x1,y1,color);
        linea1.calcular();
        puntos(linea1.getPuntos());
        
        Figura linea2 = new LineaDDA(x1,y1,x2,y2,color);
        linea2.calcular();
        puntos(linea2.getPuntos());
        
        Figura linea3 = new LineaDDA(x2,y2,super.punto[0],super.punto[1],color);
        linea3.calcular();
        puntos(linea3.getPuntos());
    }
    public void puntos(ArrayList<int[]> p){
        for(int[] pl: p){
            super.puntos.add(pl);
        }
    }
    
    public void scalar(int x, int y, int x1, int y1){
        this.x1 = x;
        this.y1 = y;
        this.x1 = x1;
        this.y1 = 1;
    }
    
   /* public void rellenarTriangulo (int color, int ancho, int alto){
        int[] punto1=new int [2];
        int[] punto2=new int [2];
        int[] punto=new int [2];
        ArrayList<int[]> puntosIntersectos=new ArrayList<int []>();
        int[] aux=new int [2];
        Figura linea;
        for(int x=0;x<ancho;x++){
            for(int y=0;y<alto;y++){
                aux[0]=x;
                aux[1]=y;
                if(linea1.perteneceALinea(aux)){
                    punto[0]=x;
                    punto[1]=y;
                    puntosIntersectos.add(aux);}
                    else{
                    if(linea2.perteneceALinea(aux)){
                        punto[0]=x;
                        punto[1]=y;
                        puntosIntersectos.add(aux);}
                        else{
                        if (linea3.perteneceALinea(aux)){
                            punto[0]=x;
                            punto[1]=y;
                            puntosIntersectos.add(aux);}
                        }
                    }
            }
            if(puntosIntersectos.size()==2){
                    punto1=puntosIntersectos.get(0);
                    punto2=puntosIntersectos.get(1);
                    linea=new LineaDDA(punto1[0]+1,punto1[1],punto2[0]-1,punto2[1],color);
                    linea.calcular();
                    linea.pintar();
                }
            puntosIntersectos.clear();
        }
    }*/   
}
