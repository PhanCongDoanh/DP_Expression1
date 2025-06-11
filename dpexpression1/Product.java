/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpexpression1;

/**
 *
 * @author Doanh
 */
public class Product extends Expression{
    private Expression left_side, right_side;
    
    public Product(Expression u, Expression v){
        this.left_side = u;
        this.right_side = v;
    }
    
    public double evaluate(int x){
        double u = left_side.evaluate(x);
        double v = right_side.evaluate(x);
        return u * v;
    }
    
    public Expression derive(){
        return new Sum(
                new Product(left_side.derive(), right_side), 
                new Product(left_side, right_side.derive()));
    }
    
    public String toString(){
        return left_side.toString() + " * " + right_side.toString();
    }
}
