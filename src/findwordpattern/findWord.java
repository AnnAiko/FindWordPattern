package findwordpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findWord {

    //Искчать слово
    public void findWord(String sText) {
        String sWord = "nоn";
        //Способ через класс Pattern
        /*Pattern pattern = Pattern.compile(sWord);
        Matcher matcher = pattern.matcher(sText);
        String sFind = "";
        while (matcher.find()) {
            sFind = sText.substring(matcher.start(), matcher.end());
        }
        if (sFind == "") {
            System.out.println("Слово " + regex + " не найдено");
        } else {
            System.out.println("Слово " + regex + " найдено");
            readWriteFile write = new readWriteFile();
            write.writeFile(sFind);
        }*/
        //Разбить текст на слова
        String[] sWords = sText.split("\\s+");
        //Перебрать все слова
        for (int i = 0; i < sWords.length; i++) {
            if (sWord.equals(sWords[i])) {
                System.out.println("Слово " + sWord + " найдено");
                readWriteFile write = new readWriteFile();
                write.writeFile(sWord);
                break;
            }
        }
    }
}
