/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import hieu.util.MathUtility;
import static hieu.util.MathUtility.getFactorial;
import static hieu.util.MathUtility.*;
// câu lệnh mới từ JDK8 (5), khai báo sẵn hàm Static,
//ở dưới gọi hàm static ko cần chấm, y chang C, chỉ áp dụng cho static

/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       //ta test thử hàm của ta 
//       //dùng mắt để so sánh  kết quả thực tế khi chạy và kết quả ta mong đợi
//       long expected = 120; // ta mong nhận 120  nếu gọi hàm 5!
//       long actual = getFactorial(5);
//        System.out.println("Expected:" + expected + "; actual:" + actual);
//        
//        //expected: 720 if tính 6!
//        System.out.println("6!:" + getFactorial(6));
//        //expected : 1 if tính 0!
//        System.out.println("0! :" + getFactorial(0));
//        //expected: IllegalargurmentException if tính -5!
//        System.out.println("-5! :" + getFactorial(-5));
//        // in thử PI coi có  giống Math.PI hem?
//        System.out.println("PI:" + PI);


     long expected = 120; // tao hy vọng 120 ói về nếu
     long actual = MathUtility.getFactorial(5);// tao gọi hàm 5!
        System.out.println("5!? expected:" + expected + "; actual:"+actual );
        // dùng cho case tình huống đàu tiên
        
        expected = 720; //hy vọng  ói về 720 nếu tao gọi
        actual = MathUtility.getFactorial(6);
        System.out.println("6!? expected:" + expected + "; actual:" + actual);
        
        System.out.println("0!? expected: 1; actual:" + MathUtility.getFactorial(0));
            
        //case4: 
        //tao kỳ vọng nhận về ngoại lệ IllegalAgurmentException
        //nếu tao gọi -5!
        MathUtility.getFactorial(-5);
        //thấy ngoại lệ mừng vì hàm chạy như thiết kế
        
       }
}
//cất code lên github
//cần:
// nhớ kho trên github, url: hrrps://github.com/ten-minh/ten-kho.git
//nhớ uername và pass và email vào githiub cảu mình
//cần tool để đồng bộ code từ máy mình (loca) lên server(GitHub, Gitlab)
//tool có thể là: cmd, GUI (git desktop, SOurce tree), chính IDE(cmd, click) 
//vì ta pro ta chơi cmd
//file đặc biệt để  nói với git tool rằng: ai  lên server ai ở lại local
//file này đc gọi là .ignoore (thuần text)
//nó sẽ khác nhau content tùy vào IDE minh xài, ngôn ngữ lập trình minh xài
//có 1 gã dev cực dễ thương, làm sẵn những file ứng với cái iDE, NNLT rồi
//xin anh ấy đên về xài http://gitignore.io
//
