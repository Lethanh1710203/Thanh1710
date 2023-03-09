package bai_2;

import java.util.Scanner;

public class Bai_2 {
    
    public static void main(String[] args) {
        int number1;
        
        Scanner nhapDoiTuong = new Scanner(System.in);
        
        System.out.print("Nhập vào một số nguyên : ");
        number1 = nhapDoiTuong.nextInt();
        
        if(number1%2 ==0){
            System.out.println("Số chẵn");
        }
        else 
            System.out.println("Số lẻ");
    }   
}
