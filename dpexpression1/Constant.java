/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpexpression1;

/**
 *
 * @author Doanh
 */
public class Constant extends Expression{
    private int value;
    
    public Constant(int a){
        a = value;
    }
    
    public double evaluate(int x){
        return value;
    }
    
    public Expression derive(){
        return new Constant(0);
    }
    
    public String toString(){
        return String.valueOf(value);
    }
}
