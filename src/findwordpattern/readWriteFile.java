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

    //Читать файл
    public String readFile() {
        String sText = "";
        try {
            //Чтение файла
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String strLine = "";
            //Если файл существует
            if (fileInput.exists()) {
                //Пока не конец строки
                while ((strLine = br.readLine()) != null) {
                    System.out.println(strLine);
                    sText += strLine;
                }
                br.close();
            } else {
                System.out.println("Файла не найден");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sText;
    }
    //Записывать файл

    public void writeFile(String sResultText) {
        try {
            //Создать файл
            if (fileOutput.createNewFile()) {
                System.out.println(fileOutput + " Файл создан");
            }
            /*else {
                System.out.println("Файл " + fileOutput + " уже существует");
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
