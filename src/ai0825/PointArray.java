package ai0825;

import java.util.Scanner;

public class PointArray {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Integer[] pointArr = {0,0,0,0,0};
        double sum = 0;

        System.out.println("김연아 선수가 멋진 경기를 마쳤습니다.");
        for (int i = 0; i < pointArr.length; i++) {
            System.out.print("심사위원" + (i+1) + " 점수 : ");
            pointArr[i] = s1.nextInt();
            sum += pointArr[i];
        }

        System.out.printf("평균 점수 : %2f  ", sum/pointArr.length);

        s1.close();
    }
}
