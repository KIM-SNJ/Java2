package ai0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest1 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            FileWriter fw = new FileWriter("myData2.txt");
            String line = "";

            while (true) {
                if(line.equals("exit"))
                    break;

                System.out.print("파일에 저장할 1줄 내용 입력(종료 : exit) : ");
                line = s.nextLine();
                fw.write(line + "\n");
            }

            line = "오늘은 추석연휴가 시작되는 전전날입니다.";
            fw.write(line + "\n");

            line = "내일 너무나 신나는 추석연휴가 시작되는 전날입니다.";
            fw.write(line + "\n");

            line = "야르~ 내일 모레는 추석연휴가 시작되는 날입니다.";
            fw.write(line + "\n");

            fw.close();
            System.out.println("myData2.txt에 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
