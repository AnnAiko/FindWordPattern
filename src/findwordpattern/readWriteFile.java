package findwordpattern;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readWriteFile {

    private String filePath = "text.txt";
    private String filePathResult = "result.txt";
    File fileInput = new File(filePath);
    File fileOutput = new File(filePathResult);

    //������ ����
    public String readFile() {
        String sText = "";
        try {
            //������ �����
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String strLine = "";
            //���� ���� ����������
            if (fileInput.exists()) {
                //���� �� ����� ������
                while ((strLine = br.readLine()) != null) {
                    System.out.println(strLine);
                    sText += strLine;
                }
                br.close();
            } else {
                System.out.println("����� �� ������");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sText;
    }
    //���������� ����

    public void writeFile(String sResultText) {
        try {
            //������� ����
            if (fileOutput.createNewFile()) {
                System.out.println(fileOutput + " ���� ������");
            }
            /*else {
                System.out.println("���� " + fileOutput + " ��� ����������");
            }*/
            BufferedWriter writerText = new BufferedWriter(new FileWriter(filePathResult));
            writerText.write(sResultText);
            writerText.flush();
            writerText.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
