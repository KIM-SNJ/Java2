package ai0922;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//이미지파일과 같은 이진파일은 1byt씩 읽어서 1byt씩 출력해야한다.
public class LAB_FileCopy {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("myData1.txt"));

            FileWriter fw = new FileWriter("newFile.txt");

            String line = "";

            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }

                fw.write(line + "\n");
            }

            br.close();
            fw.close();

            System.out.println("myData1.txt의 내용이 newFile.txt로 성공적으로 복사되었습니다.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}