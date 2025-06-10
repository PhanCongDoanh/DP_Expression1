/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpexpression1;

/**
 *
 * @author Admin
 */
public class Division extends Expression{
    private Expression left_side, right_side;
    
    public Division(Expression u, Expression v){
        u = left_side;
        v = right_side;
    }
    
    public double evaluate(int x){
        double u = left_side.evaluate(x);
        double v = right_side.evaluate(x);
        return u / v;
    }
    
    public Expression derive(){
        return new Division(new Sum(new Product(left_side.derive(), right_side), 
                new Product(new Constant(-1), new Product(left_side, right_side.derive())))
                , new Product(right_side, right_side));
        
    }
    
    public String toString(){
        return left_side.toString() + " / " + right_side.toString();
    }
}
