package findwordpattern;

public class FindWordPattern {

    public static void main(String[] args) {
        String sScanText = "";
        readWriteFile readWrite = new readWriteFile();
        System.out.println("Текст файла:");
        sScanText = readWrite.readFile();
        System.out.println("----------------------------");

        findWord word = new findWord();
        word.findWord(sScanText);

    }
}
