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
    
    public Circunferencia(int radio, int x, int y){
        super(x,y);
        this.radio = radio;
    }
}
