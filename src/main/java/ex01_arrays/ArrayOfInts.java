package ex01_arrays;

import java.util.*;

public class ArrayOfInts {

    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if (arrayOfInts == null) return 0;
        int [] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOfRange(copy,Math.max(copy.length - x, 0), copy.length));
    }

    public int countMostPopularNumber(int[] arrayOfInts){
        if (arrayOfInts == null || arrayOfInts.length == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.stream(arrayOfInts).forEach(n -> {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                Integer value = map.get(n);
                map.put(n, ++value);
            }
        });
        return map.entrySet().stream().max(Comparator.comparing(HashMap.Entry::getValue)).get().getValue();
    }

    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
