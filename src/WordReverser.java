
public class WordReverser {
    public WordReverser() {
    }
//подьем переворот
    public static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        int left = 0;

        for(int right = characters.length - 1; left < right; --right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            ++left;
        }

        return new String(characters);
    }

    public static void main(String[] args) {
        String word = "Hello World!";
        String reverseWord = reverseWord(word);
        System.out.println("Слово: " + word);
        System.out.println("Результат: " + reverseWord);
    }
}
