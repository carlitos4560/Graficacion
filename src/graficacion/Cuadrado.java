package graficacion;

import java.util.ArrayList;

/**
 *
 * @author carlitos
 */
public class Cuadrado extends Figura{
    
    private final int x1, y1, x2, y2, x3, y3 ;
    public Cuadrado(int x,int y, int x1, int y1, int x2, int y2, int x3, int y3, int color){
        super(x, y, color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        calcular();
    }
    
    @Override
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
        
        Figura linea4 = new LineaDDA(x2,y2,super.punto[0],super.punto[1],color);
        linea4.calcular();
        puntos(linea4.getPuntos());
    }
    public void puntos(ArrayList<int[]> p){
        for(int[] pl: p){
            super.puntos.add(pl);
        }
    }
    /*public void rellenarcuadrado (int color, int ancho, int alto){
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
                            else{
                            if(linea4.perteneceALinea(aux)){
                                punto[0]=x;
                                punto[1]=y;
                                puntosIntersectos.add(aux);}
                            }
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
                puntosIntersectos.clear();;
            }
    } */   
}
