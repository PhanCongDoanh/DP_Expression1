/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpexpression1;

/**
 *
 * @author Doanh
 */
public class Processor {
    public static void main(String[] args) {
        Expression A = new Monomial(4, 5);
        Expression B = new Monomial(2, 3);
        Expression C = new Monomial(3, 7);
        
        Expression A_plus_B = new Sum(A, B);
        Expression A_plus_B_times_C = new Product(A_plus_B, C);
        Expression A_divide_B = new Division(A, B);
        
        double AB = A_plus_B.evaluate(3);
        double ABC = A_plus_B_times_C.evaluate(3);
        
        
        Expression deriveAB_sum = A_plus_B.derive(), deriveAB_division = A_divide_B.derive();
        Expression deriveABC_product = A_plus_B_times_C.derive();
        
        
        System.out.println("Derivatve A + B: " + deriveAB_sum.toString());
        System.out.println("A + B : " + A_plus_B.toString());
        
        System.out.println();
        
        System.out.println("Derivatve (A + B) * C: " + deriveABC_product.toString());
        System.out.println("A + B : " + A_plus_B_times_C.toString());
        
        System.out.println();
        
        System.out.println("Derivatve A / B: " + deriveAB_division.toString());
        System.out.println("A + B : " + A_divide_B.toString());
    }
}
