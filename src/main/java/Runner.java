import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");


        System.out.println(scottishIslands.get(4));
        scottishIslands.remove("Tresco");
        scottishIslands.remove(5);
        System.out.println(scottishIslands.size());
        Collections.sort(scottishIslands);
        for (String islands : scottishIslands) {
            System.out.println(islands);
        }


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
            evenNumbers.add(number);
        }
        System.out.println(evenNumbers);
    }

//        1. Print out a list of the even integers

        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);

//        2. Print the difference between the largest and smallest value

        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);
        int difference = maxNumber - minNumber;
        System.out.println(difference);

//        3. Print true if the list contains a 1 next to a 1 somewhere

        if(numbers.contains(1)){
            System.out.println("true");
        }

//        4. Print the sum of the numbers

        int numberSum = 0;
        for (int number : numbers){
            numberSum += number;
        }
        System.out.println(numberSum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

    }

}
