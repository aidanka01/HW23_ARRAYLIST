import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

        List<Integer> integerList = new java.util.ArrayList<>();
        for (int i =1; i <= numbers.length; i++) {
            integerList.add(i);
        }System.out.println("Numbers 1-50: " + integerList);

        List<Integer> integerListEven = new java.util.ArrayList<>();
        List<Integer> integerListOdd = new java.util.ArrayList<>();
        for (int i =0; i < integerList.size(); i++){
            Integer number = integerList.get(i);
            if (number %2 == 1) {
                integerListEven.add(number);
            } else
                integerListOdd.add(number);
        }

        System.out.println("even numbers: " + integerListEven);
        System.out.println("odd numbers: " + integerListOdd);

    }
    }
