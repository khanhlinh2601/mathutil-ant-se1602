/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.linhtk.mathutil.core.test;

import com.linhtk.mathutil.core.MathUtility;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Lenovo
 */
@RunWith(value = Parameterized.class)
//báo với Junit rằng code trong class này tao sẽ tách data và
//hàm so sánh riêng biệt nhau - Data driven testing
//tách thì p có kĩ thuật nhồi/ fill data trờ lại lệnh so sánh
//fill trở lại thông qua biến - biến chứa value đc thay đổi
//DDT có anh em nương tựa với Parameterized - thâm số hóa data
public class MathUtilityAdvancedTest {

    //chuẩn bị mảng 2 chiều để chứa data trong các test case
    //sẽ dùng
    //quy ước mảng phải là static public
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }
    //map từng cặp data ở trên vào 2 biến, đẩy 2 biến này vòa hàm assertEquals() đã quen
    //hàm assertEquals() đã quen
    @Parameterized.Parameter(value = 0) //lấy cột 0 của mảng gán vào
    public int n;
    @Parameterized.Parameter(value = 1) //lấy cột 0 của mảng gán vào
    public long expected;
    //test hoi
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}