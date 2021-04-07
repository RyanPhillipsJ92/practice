public class ReverseWordsInString {

    public static String reverse(String input) {
        if (input.isEmpty()) {
            return input;
        }
        String[] arr = input.split(" ", 2);
        String firstWord = arr[0];
        System.out.println(firstWord);
        String remainingSentence;
        if (arr.length == 2) {
            remainingSentence = arr[1];
        }
        else
            remainingSentence = "";
        return reverse(remainingSentence) + firstWord + " ";
    }

    public static void main(String[] args) {
        System.out.println(reverse("this is a TEST"));
        System.out.println(reverse("backwards! typed is sentence This"));

    }
}