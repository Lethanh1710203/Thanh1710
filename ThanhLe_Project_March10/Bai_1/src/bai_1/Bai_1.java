package bai_1;

import java.util.Scanner;

public class Bai_1 {

      public static void main(String[] args) {
       int number1, number2;
       
          System.out.print("Nhap vao 2 so nguyen bat ky: ");
          Scanner nhapTuBanPhim = new Scanner (System.in);
          number1 = nhapTuBanPhim.nextInt();
          number2 = nhapTuBanPhim.nextInt();
          
          System.out.println("Tổng : " + (number1 + number2));
          //System.out.printf("Tổng :%d ", number1 + number 2 );
          
          System.out.println("Hiệu : " + (number1 - number2));
          System.out.println("Tích : " + (number1 * number2));
          System.out.printf("Thương : %.2f\n",  1.0*number1 / number2);
          System.out.println("Chia lấy dư : " + (number1 % number2));
          
          System.out.println("Trong 2 số số lớn hơn là: " + (number1 > number2?number1:number2));
          //(a>b?a:b) có nghĩa là nếu a lớn hơn b  thì trả về a còn ko thì trả về b 
          
    }
    
}
