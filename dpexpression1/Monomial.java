/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpexpression1;

/**
 *
 * @author Doanh
 */
public class Monomial extends Expression{
    private int constant, exponent;
    
    public Monomial(int a, int n){
        if(a == 0){
            a = 0;
            n = 0;
        }else if(n == 0){
            a = constant;
            n = 0;
        }else{
            a = constant;
            n = exponent;
        }
    }
    
    public double evaluate(int x){
        return constant * Math.pow(x, exponent);
    }
    
    public Expression derive(){
        return new Monomial(constant*exponent, exponent - 1);
    }
    
    public String toString(){
        return constant + "x^" + exponent;
    }
}
