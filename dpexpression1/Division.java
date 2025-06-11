/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpexpression1;

/**
 *
 * @author Doanh
 */
public class Division extends Expression{
private Expression above, below;
    
    public Division(Expression u, Expression v){
        this.above = u;
        this.below = v;
    }
    
    public double evaluate(int x){
        double u = above.evaluate(x);
        double v = below.evaluate(x);
        return u / v;
    }
    
    public Expression derive(){
        return new Division(new Sum(new Product(above.derive(), below), 
                new Product(new Constant(-1), new Product(above, below.derive())))
                , new Product(below, below));
        
    }
    
    public String toString(){
        return above.toString() + " / " + below.toString();
    }
}
