package findwordpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findWord {

    //������� �����
    public void findWord(String sText) {
        String sWord = "n�n";
        //������ ����� ����� Pattern
        /*Pattern pattern = Pattern.compile(sWord);
        Matcher matcher = pattern.matcher(sText);
        String sFind = "";
        while (matcher.find()) {
            sFind = sText.substring(matcher.start(), matcher.end());
        }
        if (sFind == "") {
            System.out.println("����� " + regex + " �� �������");
        } else {
            System.out.println("����� " + regex + " �������");
            readWriteFile write = new readWriteFile();
            write.writeFile(sFind);
        }*/
        //������� ����� �� �����
        String[] sWords = sText.split("\\s+");
        //��������� ��� �����
        for (int i = 0; i < sWords.length; i++) {
            if (sWord.equals(sWords[i])) {
                System.out.println("����� " + sWord + " �������");
                readWriteFile write = new readWriteFile();
                write.writeFile(sWord);
                break;
            }
        }
    }
}
