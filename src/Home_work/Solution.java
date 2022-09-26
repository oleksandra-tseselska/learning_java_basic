package Home_work;

import java.util.*;

class Solution {

    public static void main(String[] arg) {
        String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "az", "ay", "as", "by", "bz"};
        allSwap(arr);
    }
    /*
    allSwap(arr)

    ["ax", "bx", "cx", "cy", "by", "ay"] ===> ["ay", "by", "cy", "cx", "bx", "ax"]
 */

    public static void allSwap(String[] arr){
        Map<Integer, String> swap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            String word = arr[i];
            Integer index = i;
            swap.put(index, word);
        }

        if(swap.isEmpty()) {System.out.println("Error: We have empty array");}

        for (int j = 0; j < swap.size(); j++){
            Character letter = swap.get(j).charAt(0);
            String word = swap.get(j);
            Integer index = j;


            swap.forEach((key, value) -> {
                if(value != word && swap.get(index) != " ") {
                    if(value.charAt(0) == letter){
                        arr[index] = value;
                        arr[key] = word;

                        swap.replace(key, value," ");
                        swap.replace(index, word, " ");
                    }
                }
            });
        }

        swap.forEach((key, value) -> {
            if(value != " "){
                arr[key] = value;
            }
        });

        System.out.println(Arrays.toString(arr));
    }

    //        for(Map.Entry<Integer, String> mapEntry: swap.entrySet()){
//            Character letter = mapEntry.getValue().charAt(0);
//            String word = mapEntry.getValue();
//            Integer index = mapEntry.getKey();
//
//            swap.forEach((key, value) -> {
//                if(value != word && value != " ") {
//                    if(value.charAt(0) == letter){
//                        arr[index] = value;
//                        arr[key] = word;
//
//                        swap.replace(key, value," ");
//                        swap.replace(index, word, " ");
//
//                    }
//                }
//            });
//        }

//    for(Map.Entry<Integer, String> mapEntryLoop: swap.entrySet()){
//                Character letterLoop = mapEntryLoop.getValue().charAt(0);
//                String wordLoop = mapEntryLoop.getValue();
//                Integer indexLoop = mapEntryLoop.getKey();
//
//                if(word != wordLoop && index > 0 && indexLoop > 0){
//                    if(letterLoop == letter){
//                        String temp = wordLoop;
//                        index = -1;
//                        swap.put(-1, word);
//                        word = temp;
//                    }
//                }
//            }
//            for (int i = +index; i < swap.size(); i++){
//                swap.containsValue(i);
//            }
//
}
