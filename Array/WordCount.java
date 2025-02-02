public class WordCount {
    public static int countWords(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int wordCount = 0;
        int state = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\\') {
                i++; 
                continue;
            }

            if (Character.isLetterOrDigit(str.charAt(i))) {

                if (state == 0) {
                    wordCount++;
                    state = 1;
                }
            }
            else {
                state = 0;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String str = "afd dafd aed";
        System.out.println("No of words: " + countWords(str));
    }
}
