/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dpexpression1;

/**
 *
 * @author Doanh
 */
abstract class Expression {

    abstract double evaluate(int x);
    abstract Expression derive();
    public abstract String toString();
    
}
