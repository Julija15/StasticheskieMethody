import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String document = "1234-abc-6549-mcn-8r9t";
        System.out.println(document);

        StringBuilder document1 = new StringBuilder();
        document1.append("1234 -").append(" 6549");
        System.out.println(document1);

        String s = document.replace("abc", "***");
        System.out.println(s.replace("mcn", "***"));

        StringBuilder document2 = new StringBuilder();
        document2.append("abc-").append("mcn-").append("r-").append("t");
        System.out.println(document2);

        String s2 = String.valueOf(document2);
        String s3 = s2.replace("-", " / ");
        System.out.println(s3);

        String s4 = s3.toUpperCase();
        System.out.println(s4);

        System.out.println("Letters: " + s4);


        boolean isContain1 = document.contains("abc");
        System.out.println(isContain1);

        boolean isContain2 = document.contains("ABC");
        System.out.println(isContain2);

        // начинается ли строка с 555
        System.out.println(document.startsWith("555"));

        // заканчивается 1a2b
        System.out.println(document.endsWith("1a2b"));

        // Дана произвольная строка с произвольными словами. Найти самое короткое и самое длинное слово

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] sentenceArr = sentence.split(" ");
        String min = sentenceArr[0];
        String max = "";
        for (String e : sentenceArr) {
            if (e.length() < min.length()) {
                min = e;
                System.out.print(" Min:" + min);
            }
            if (e.length() > max.length()) {
                max = e;
                System.out.println(" Max:" + max);
            }
        }
//найти слово, в котором число различных символов минимально
        String inputText;

        Scanner scanner1 = new Scanner(System.in);
        while (scanner.hasNext()) {
            inputText = scanner.nextLine();
            System.out.println(inputText);
        }
    }
    private static String findWordMinDifferent(String text) {
        String[] words = text.split(" ");
        String wordMinDiff = words[0];
        int minCountDifferent = words[0].length();
        for (String word : words) {
            char[] chars = word.toCharArray();
            int tekustcheeKolichestvo = getCountDifferentChars(chars);
            if (tekustcheeKolichestvo < minCountDifferent) {
                minCountDifferent = tekustcheeKolichestvo;
                wordMinDiff = word;
            }
        }
        return wordMinDiff;
    }

    private static int getCountDifferentChars(char[] chars) {
        int countOfDifferentChars = 0;
        int countOfMatchingChars = 0;
        char charToCompare;
        for (char var1 : chars) {
            int compareCount = 0;
            charToCompare = var1;
            for (char var2 : chars) {
                if (charToCompare == var2) {
                    compareCount++;
                }
            }
            if (compareCount == 1)
                countOfDifferentChars++;
            else
                countOfMatchingChars++;
        }
        return countOfDifferentChars + countOfMatchingChars / 2;
    }

    protected void repeatLetters(){
        String text = "Hello";
        int n = 2;
        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < n; j++) {
                repeat.append(text.charAt(i));
            }
        }
        System.out.println(repeat);
    }
}

