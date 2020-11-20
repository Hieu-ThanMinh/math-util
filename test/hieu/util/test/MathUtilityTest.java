/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieu.util.test;

import hieu.util.MathUtility;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
  @Test //biến hàm ở trong class này thành public static void  main()
  //nhờ bộ thư viện JUnit.
  //tại sao cần vậy, vì mặc ddihj app từ main() chuẩn
  //trong khi đó mình cần test thử hà thoy, ko can thiệp main()
  //cậy mình cần main() khac, @Test giúp điều đó
  //nhưng vid  có nhiwuwf main() CPU
  
  //cú pháp  đặt tên hàm dùng để test hàm khác cảu dân QC
  public void getFactorial_RunsWell_IfvalidArgurment(){
      assertEquals(120, MathUtility.getFactorial(5));
      assertEquals(720, MathUtility.getFactorial(6));
      assertEquals(24, MathUtility.getFactorial(4));
      assertEquals(6, MathUtility.getFactorial(3));
      assertEquals(1, MathUtility.getFactorial(0));
      
  }
  
  // bắt ngoại lệ thế nào??
  //ngoại lệ Exception ko phải là 1 value đẻ mà so sanhgs 
  //do đó  dùng hàm assertX() là ko đc, vì ko là value để so 
  //ta phải dùng kỹ thuật khác
  @Test(expected = IllegalArgumentException.class)
  public void getFactorial_ThrowsException_IfInvalidArgument(){
      MathUtility.getFactorial(-5);
  }
}
