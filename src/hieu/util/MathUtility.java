/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieu.util;

/**
 *
 * @author Admin
 */
public class MathUtility {
    //minh se lam class nay falke y chang class Nath  cua JDK
    //Math.PI.abs(0 .sqrt() .pow() .sin()
    //cái gì mà là dồ xài chung, ko lưu trữ riêng lẻ info ta sẽ
    //chơi static
    public static final double PI = 3.1415;
    //xài: MathUtility.PI y chang Math.PI
    
    //hàm tín n!= 1.2.3.4.5...n
    //n phải >= 0, 0!= 1 quy ước
    //n1 tang nahnh, cho nên 21! tràn long rồi
    //ta chỉ tính n! từ 0..20
    //ngoài vùng này, dù âm hay lố 20, éo tính, chửi = Exception
    //ko thêm trả về -1  hàm vs giá trị ko xài
    //học cách ném ngoại lệ luôn 
    //thứ 2 ông viết tiếp, 
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
         throw new IllegalArgumentException("n must be between 0..20");
        if(n == 0 || n==1)
            return 1;
        //ko xài else, có else trừ điểm
       long result = 1;
       for(int i = 2; i <= n; i++){
           result *= i; // nhân dồn vào
           
       }
       return result;
    }
}
