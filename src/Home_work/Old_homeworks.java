package Home_work;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Old_homeworks {
    public static void main(String[] arg) {
        int[] nums = {1,5,7,9,3};
        twoSumProblem(nums, 10);

        String[] letters = {"a", "b", "a", "c", "b"};
        stringMultiple(letters);

        String[] words = {"salt", "tea", "soda", "toast", "water"};
        System.out.println(firstChar(words));
    }


//    TWO-SUM PROBLEM
//    [1,5,7,9,3]
//            10
//
//            2 pairs
//    public static void twoSumProblem(int[] arr){
//        Set<Integer> numArr = new HashSet<>();
//        Set<Integer> numArrHelp = new HashSet<>();
//
//        int numberOfPairs = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            numArr.add(arr[i]);
//            numArrHelp.add(arr[i]);
//        }
//
//        for(Integer num: numArr) {
//            int pair = 10 - num;
//            numArrHelp.remove(num);
//
//            if (numArrHelp.contains(pair)) {
//                numberOfPairs = numberOfPairs + 1;
//                System.out.println("Numbers " + num + " and " + pair + " are pairs");
//            }
//        }
//
//        if(numberOfPairs == 0){
//            System.out.println("This array don't have pairs");
//        }else {
//            System.out.println("This array have "+numberOfPairs+" pairs");
//        }
//    }
//
//    public static void twoSumProblem(int[] arr){
//        Set<Integer> numArr = new HashSet<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            numArr.add(arr[i]);
//        }
//
//        int numberOfPairs = 0;
//
//        for(Integer num: numArr) {
//            if(num < 5) {
//                int pair = 10 - num;
//                numberOfPairs += Collections.frequency(numArr, pair);
//            }
//        }
//
//        if(numberOfPairs == 0){
//            System.out.println("This array don't have pairs");
//        }else {
//            System.out.println("This array have "+numberOfPairs+" pairs");
//        }
//    }
//
//    public static void twoSumProblem(int[] arr){
//        Set<Integer> numArr = new HashSet<>();
//
//        int numberOfPairs = 0;
//        int sumOfUniqueNum = 0;
//        double middleNum = sumOfUniqueNum / 2;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            numArr.add(arr[i]);
//        }
//
//        if (numArr.isEmpty()) {return;}
//
//        for(Integer num: numArr) {sumOfUniqueNum =+ num;}
//
//        for(Integer num: numArr) {
//            if(num < 5) {
//                int pair = 10 - num;
//                numberOfPairs += Collections.frequency(numArr, pair);
//            }
//        }
//
//        if(numberOfPairs == 0){
//            System.out.println("This array don't have pairs");
//        }else {
//            System.out.println("This array have "+numberOfPairs+" pairs");
//        }
//    }

    public static void twoSumProblem(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        int pairCount = 0;

        for(int index = 0; index < nums.length; index++){
            int number = nums[index];
            numMap.put(number, index);
        }

        for(Map.Entry<Integer, Integer> mapEntry: numMap.entrySet()){
            int firstNum = mapEntry.getKey();
            int index = mapEntry.getValue();

            if(index != -1){
                int secondNum = target - firstNum;
                if(firstNum == secondNum && index == numMap.get(secondNum)){
                    continue;
                }
                if(numMap.containsKey(secondNum)){
                    pairCount++;

                    numMap.put(firstNum, -1);
                    numMap.put(secondNum, -1);
                }
            }
        }
        System.out.println(pairCount);
    }

    /*
    ["a", "b", "a", "c", "b"]

    Map<String, Boolean>

    {"a": true, "b": true, "c": false}
 */


    public static void stringMultiple(String[] letters){
        Map<String, Boolean> lettersMap = new HashMap<>();

        for(int index = 0; index < letters.length; index++){
            String letter = letters[index];
            lettersMap.put(letter, false);
        }

        if(lettersMap.isEmpty()) {System.out.println("We have empty array");}

        for(Map.Entry<String, Boolean> mapEntry: lettersMap.entrySet()) {
            String letter = mapEntry.getKey();

            if((Collections.frequency(List.of(letters), letter)) > 1) {
                mapEntry.setValue(true);
            }
        }

        System.out.println(lettersMap.entrySet());
    }
     /*
    ["salt", "tea", "soda", "toast", "water"] ==> {"s": "saltsoda", "t": teatoast, "w": "water"}
    Map<Character, String>

    firstChar(arr);
 */

//    public static void firstChar(String[] words){
//        Map<Character, String> together = new HashMap<>();
//
//        for(int index = 0; index < words.length; index++) {
//            String word = words[index];
//            Character character = word.charAt(0);
//
//
//            together.put(character, word);
//        }
//        System.out.println(together.entrySet());
//    }

//    public static void firstChar(String[] words){
//    find mistake!!!!!
//        Map<Character, String> together = new HashMap<>();
//
//        for(String word: words) {
//            Character firstChar = word.charAt(0);
//
//            if(together.containsKey(firstChar)) {
//                together.put(firstChar, together.get(firstChar) + word);
//            }else {
//                together.put(firstChar, word);
//            }
//            together.put(firstChar, word);
//        }
//        System.out.println(together.entrySet());
//    }

    static Map<Character, String> firstChar(String[] words){
        Map<Character, String> map = new HashMap<>();

        for(String word: words){
            Character firstChar = word.charAt(0);

            if(map.containsKey(firstChar)){
                map.put(firstChar, map.get(firstChar) + word);
            } else {
                map.put(firstChar, word);
            }
        }

        return map;
    }
}
