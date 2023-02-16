/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.linhtk.mathutil.core;

/**
 *
 * @author Lenovo
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //hàm tính N! = 1 x 2 x 3 x 4
    //ko có giai thừa cho số âm
    //0! = 1! = 1
    //vì giai thừa tăng giá trị rất nhanh
    //tức 21! tràn kiểu long
    //Quy ước hàm này chỉ tính 0..20!
    //có 2 cách viết hàm: for truyền thống và đệ quy-recursion
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between  0.. 20");
        
        if (n == 0 || n == 1) 
            return 1;
        
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}
