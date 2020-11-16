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
    //minh se lam class nay falke y chang class Math  cua JDK
     //ta sẽ là clss fake Math với các hàm static để xài chung chô mọi nơi
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
        //throw là ném ra tương đương  app   bị dừng
        if(n == 0 || n==1)
            return 1;
        //ko xài else, có else trừ điểm
        //ngay chỗ này chính là n = 2..20
       long result = 1;
       for(int i = 2; i <= n; i++){
           result *= i; // nhân dồn vào
           
       }
       return result;
    }
    //test nghĩa là đưa hàm ra xài, gọi với các tham số khâc nhau
    //ví dụ gọi hàm getFactorial (với các số khác nhau dưa vào)
    //getF(-5), getF(-1) getF(0), getF(5),  ...
    
    //ta gọi là test case, các tình huống cần test,  các tình huống xài hàm 
    //khi ta test hàm, ta cần quan tâm 2 việc
    //1. dự kiến hàm trả về giá trị gì khi hàm chậy với 1 dầu vào nào đó
     // dự kiên shafm trả về giá trị, tui gọi là EXPECTED VALUE
    //ví dụ: hàm sẽ trả về 120 khi gọi getF(5)
    //2. hàm khi chạy với 1 dầu vào nào đó, thì nó sẽ ói/ return về 1 value
    //cái value trả về cảu hàm khi chạy đc gọi là ACTUAL VALUE
    
    //NGHÊ TEST CHÍNH LÀ: SO SÁNH COI EXPECTED VALUE CÓ BẰNG VỚI ACTUAL, VALUE HEM?
    // NẾU CÓ BẰNG, HÀM ĐÚNG CHO CASE/TÌNH HUỐNG NÀY 
    //NẾU CÓ BẰNG, HÀM TÍNH TOÁN SAI,  HOẶC KÌ VỌNG SAI
    
    //HÀM MÀ TỐT THÌ PHẢI LÀ EXCEPTION  == ACTUAL  MỌI TÌNH HUỐNG
    
    //NẾU TỐT TA MỚI ĐEM RA XÀI, BÁN, PUBLIC CỘNG ĐÒNG XÀI
    
    //LÀM SAO ĐỂ TEST HÀM CÓI CÓ TỐT KO, EXOECTED == ACTUAL 
    //HAI KĨ THUẬT ĐC ÁP DỤNG 
    
    //KĨ THUẬT 1: nhìn bằng mắt và so sánh từng cặp expected vs. actual
    //          chính là kĩ thuật sout(expected), sout(actual- hàm ói về giá trị khi xài)
    //kĩ thauatj này đươn giản , dễ làm , nhưng mắc sai sót do có quá nhiều cặp
    //expected actual cần so sánh bằng mắt
    
    //KĨ THUẬT 2: nhìn bằng mắt , ko cần so sánh từng cặp, đẻ máy so sánh giùm luôn
    
    
    
    
    //tương đương câu: hàm tui chạy ngon lắm , đúng 99.9%, lâu lâu sai tí
    //nói câu đó: hàm éo tin cậy đẻ xài
    //Kỹ THUẬT 2 NÀY DÙNG MÀU SẮC, MÚN LÀM VẬY THÌ PHẢI XÀI THƯ VIỆN BỔ SUNG THÊM 
    //CHÍNH LÀ FILE.JAR, .DLL ĐC CÙNG CẤP THÊM NGOÀI JDK
    //Các thư viện
}
