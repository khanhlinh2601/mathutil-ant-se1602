/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.linhtk.mathutil.core.test;

import com.linhtk.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Lenovo
 */
public class MathUtilityTest {
    
    //kiểm thử ngoại lệ thì sao??
    //tức là đưa getF() đã thiết kế n cà chớn
    //thì hàm p ném ra ngoại lệ
    //tức là getF(-5) thì EXCEPTED = NGOẠI LỆ ILLEGAL EXCEPTION
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowException (){
        //Test case #5: getF() with a wrong arg: n = -5
        //Excepted result: An exception is thrown: Illegal Argument
        MathUtility.getFactorial(35);
        //nếu chỉ gõ lệnh này k thôi thì bị màu đỏ
        //do lệnh này gây ra exception, và exception là 
        //màu đỏ
        //nhưng hàm này mình kì vọng ra exception, nếu có exp
        //thì hàm này đúng như thiết kế, p màu xanh
        //lỗi ra là ko đo, k so sánh, k chưa nhận
        //ta cần thêm 1 lệnh: đã có ngoại lệ chưa??
        //có rồi -> xanh
        //chưa -> đỏ
        //JUnit 4 k dùng hàm asset() để đo ngoại lệ
        //JUnit 5 
    }

    @Test
    //trong hàm này sẽ chứa các test case để test getF() 
    //với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: test getF() with n = 0
        //Expected result = 1; //hy vọng 0! = 1;
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);   
        //Test case #2: test getF() with n = 5;
        //Expected result = 120 // hy vọng 5!
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        //Test case #3: test getF() with n = 6;
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        //Test case #4: test getF() with n = 4;
        Assert.assertEquals(24, MathUtility.getFactorial(4));
       
    }
}
