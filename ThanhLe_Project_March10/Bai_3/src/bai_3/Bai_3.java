package bai_3;

import java.util.Scanner;

public class Bai_3 {

    public static void main(String[] args) {
        String name;
        int yob;

        Scanner NhapTuBanPhim = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        name = NhapTuBanPhim.nextLine();
        System.out.print("Nhập năm sinh của bạn: ");
        yob = NhapTuBanPhim.nextInt();

        if((2023- yob) < 16){
            System.out.println("Bạn " + name + " ở độ tuổi vị thành niên"); 
        }
        else if((2023- yob) >= 16 && yob < 18){
            System.out.println("Bạn " + name + " ở độ tuổi trưởng thành");
        }
        else
            System.out.println("Bạn " + name + " đã già");
           
    }
    
}
