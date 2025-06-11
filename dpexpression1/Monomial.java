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
            this.constant = 0;
            this.exponent = 0;
        }else if(n == 0){
            this.constant = a;
            this.exponent = 0;
        }else{
            this.constant = a;
            this.exponent = n;
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
