public class SearchWordInSentences {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is a programming language.",
                "I love coding.",
                "Data structures and algorithms are important."
        };
        String word = "coding";
        System.out.println("Sentence containing word: " + findSentence(sentences, word));
    }
}
