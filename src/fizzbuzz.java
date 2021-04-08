public class fizzbuzz {

    private static void fizzBuzz(int num){
        for(int i = 1; i <= num; i++){
            if(((i % 3) == 0) && ((i % 5) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }

    private static void fizzBuzzWay2(int num){
        for(int i = 1; i <= num; i++){
            if(i % 15 == 0)
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("Buzz");
            else if ((i % 3) == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
    private static void fizzBuzzWay3(int num){
        for (int number = 1; number <= num; number++) {
            String toPrint = "";
            if (number % 3 == 0) {
                toPrint += "Fizz";
            }
            if (number % 5 == 0) {
                toPrint += "Buzz";
            }
            if (toPrint.isEmpty()) {
                toPrint = Integer.toString(number);
            }
            System.out.println(toPrint);
        }}



            public static void main(String[] args) {
//        fizzBuzz(100);
//        fizzBuzzWay2(100);
          fizzBuzzWay3(100);

    }}


