import java.util.*;
public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        String wordToReplace = sc.nextLine();
        String replacementWord = sc.nextLine();
        
        String updatedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Updated Sentence: " + updatedSentence);
        sc.close();
    }
    
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}