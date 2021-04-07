public class palindromes {
    public boolean palindromes(String input){
        int first = 0;
        int last = input.length()-1;
        while (first < last){
            if (input.charAt(first) != input.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        String racecar = "racecar";
        String madam = "madam";
        String Not = "Not";
        palindromes test = new palindromes();
        System.out.println(test.palindromes(racecar));
        System.out.println(test.palindromes(madam));
        System.out.println(test.palindromes(Not));
    }
}
