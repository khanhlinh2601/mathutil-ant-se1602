/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.linhtk.mathutil.main;

import com.linhtk.mathutil.core.MathUtility;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testFactorialGivenRightArgumentRunWell();
//        testFactorialGivenWrongArgumentThrowException();
    }

    //thiết kế hàm getF() là: chỉ tính n! từ 0..20
    //Nếu n < 0  hoặc n > 20 thì hàm sẽ sẽ chửi, ko tính bằng cách ném ra ngoại lệ!!!
    //thực tế hàm getF() khi chạy có làm đc như thiết kế hay ko
    //p test thử mới biết đc
    public static void testFactorialGivenWrongArgumentThrowException() {
        //Test case #4: Test getF() with n = 5; wrong argument
        //Excepted value: an exception is thown
        //              IllegalArgumentException
        System.out.println("Test -5" + "!: expected = IllegalArgumentException is Thrown!");
        MathUtility.getFactorial(-5);

    }

    //dân dev phải có trách nhiệm test code của mình đúng hay sai trước khi ghép nó với các class khác để hoàn thành
    //Ghi chú:
    //Có nhiều quy tắc đặt tên kiểm thử hàm
    //thường tên hàm sẽ bao hàm ý nghĩa của việc kiểm thử
    //vd hàm dưới này sẽ dùng để test cái hàm giai thừa
    //trong tình huống - case đưa n đúng chuẩn, thì ta hy vọng - expected
    public static void testFactorialGivenRightArgumentRunWell() {
        //Test case #1: Test getFactorial with n = 0
        //Expected value
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: expected = " + expectedValue
                + " | actual: " + actualValue);

        //Test case #2: Test getFactorial with n=1
        //Expected value = 1 - hy vọng 1! trả về 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n); //thực tế hàm chạy
        System.out.println("Test " + n + "!: expected = " + expectedValue
                + " | actual: " + actualValue);

        //Test case #3: Test getFactorial with n=3
        //Expected value = 6
        System.out.println("Test 3" + "!: expected = 6"
                + " | actual: " + MathUtility.getFactorial(3));

    }

}
