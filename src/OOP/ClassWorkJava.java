package OOP;
//import java.util.LinkedHashSet;
import java.sql.Array;
import java.util.*;

public class ClassWorkJava {

    public static void main(String[] arg) {

        List<String> animals = Arrays.asList("cat", "dog", "cow", "sheep", "cat", "dog");
        System.out.println("Array: " + animals);
        System.out.println("Duplicates: " + getDuplicatesWithIteration(animals));

//        final Set<Integer> numberSet = new HashSet<>();
//        System.out.println(numberSet.isEmpty());
//        numberSet.add(12);
//        numberSet.add(27);
//        numberSet.add(1);
//
//        numberSet.forEach(el -> {
//            if (el % 2 == 0) {
//                System.out.println(el);
//            }
//        });

//        final Deque<Integer> deque = new ArrayDeque<>();
////        add to top
//        deque.addFirst(50);
//        deque.offerFirst(23);
//
////        add to end
//        deque.addLast(70);
//        deque.offerLast(21);
//
////        remove first
//        deque.removeFirst();
//        deque.pollFirst();
//
////        remove last
//        deque.removeLast();
//        deque.pollLast();
//
////        retrieve first queue
//        deque.getFirst();
//        deque.peekFirst();
//
////        retrieve last queue
//        deque.getLast();
//        deque.peekLast();

        /*
    create a method to accept an arraylist of names and count how many duplicates are in thr list after which
    it should sort and return a non-duplicate list
        */

        final List<Integer> numList = new ArrayList<>(Arrays.asList(2, 3, 6, 3, 7, 2, 8, 8, 9));
        final Set<Integer> numListWithoutDuplicates = new TreeSet<>();
//        System.out.println(countFrequencyDuplicates(numList));
        System.out.println(getDuplicatesWithIteration(numList));

        numList.forEach(el -> {
            numListWithoutDuplicates.add(el);
        });

        int duplicatesNum = numList.size() - numListWithoutDuplicates.size();

        System.out.println(numListWithoutDuplicates);
        System.out.println(duplicatesNum);

        final Map<Integer, String> ageToNames = new TreeMap<>();

        ageToNames.put(11, "Andrew");
        ageToNames.put(22, "Mike");
        ageToNames.put(33, "John");

        ageToNames.remove(22);
//        System.out.println(ageToNames.get(11));

        for (final Integer key : ageToNames.keySet()) {
//            System.out.println("Key is "+key);
        }
        for (final String value : ageToNames.values()) {
//            System.out.println("Value is "+value);
        }
        for (final Map.Entry<Integer, String> ageToName : ageToNames.entrySet()) {
//            System.out.println("Value for key "+ageToName.getKey()+" is "+ageToName.getValue());
        }

        ageToNames.forEach((key, value) -> {
//            System.out.println("Value for key "+key+" is "+value+" from forEach");
        });

//        areAnagrams("heart", "earth");
//        areAnagramsTwo("heart", "earth");
//        System.out.println(areAnagramsThree("heart", "earth"));
        System.out.println(isPangram("the quick brown fox jumps over the lazy dog"));

    }

    public void countFreguency(Arrays arr) {
        final Map<Integer, String> nameMaps = new TreeMap<>();
    }

    public static <E> List<E> getDuplicatesWithIteration(List<E> a) {
        Set<E> duplicates = new HashSet<>();
        for (int i = 0; i < a.size(); i++) {
            E e1 = a.get(i);
            if (e1 == null) continue; // игнорируем null
            // сравниваем каждый элемент со всеми остальными
            for (int j = 0; j < a.size(); j++) {
                if (i == j) continue; // не проверяем элемент с собой же
                E e2 = a.get(j);
                if (e1.equals(e2)) {
                    // дубликат найден, сохраним его
                    duplicates.add(e2);
                }
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static void countFrequencyDuplicates(ArrayList<Integer> input) {
        int frequency;

        for (Integer el : input) {
            frequency = Collections.frequency(input, el);
            System.out.println("The element " + el + " has " + frequency + " duplicates");
        }
    }

    public static void areAnagrams(String word1, String word2) {
        if (word1.length() == word2.length()) {
            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(word1 + " and " + word2 + " are anagram.");
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagram.");
            }
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagram.");
        }
    }

    public static void areAnagramsTwo(String word1, String word2) {
        HashMap<Character, Integer> hashmap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashmap2 = new HashMap<Character, Integer>();

        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            if (hashmap1.get(arr1[i]) == null) {

                hashmap1.put(arr1[i], 1);
            } else {
                Integer c = (int) hashmap1.get(arr1[i]);
                hashmap1.put(arr1[i], ++c);
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (hashmap2.get(arr2[j]) == null)
                hashmap2.put(arr2[j], 1);
            else {

                Integer d = (int) hashmap2.get(arr2[j]);
                hashmap2.put(arr2[j], ++d);
            }
        }

        if (hashmap1.equals(hashmap2))
            System.out.println(word1 + " and " + word2 + " are anagram.");
        else
            System.out.println(word1 + " and " + word2 + " are not anagram.");
    }

    public static boolean areAnagramsThree(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            Character character = word1.charAt(i);
            if (hashMap.containsKey(character)) {
                hashMap.put(character, hashMap.get(character) + 1);
            } else {
                hashMap.put(character, 1);
            }
        }
        hashMap.forEach((kay, value) -> {
            System.out.println(kay+"===>"+value);
        });

        for (int i = 0; i < word2.length(); i++) {
            Character character = word1.charAt(i);
            if (hashMap.containsKey(character)) {
                if(hashMap.get(character) == 0) return false;
                hashMap.put(character, hashMap.get(character) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean isPangram(String pangram){
        if(pangram.length() < 26) return false;

        Set<Character> hashMap = new HashSet<>();

        for(int i = 0; i < pangram.length(); i++){
            Character character = pangram.charAt(i);

            if(!Character.isLetter(character)) continue;
            hashMap.add(character);
        }

        return hashMap.size() == 26;
    }


}




interface Queue<E> extends Collection<E>{
    E element();
    boolean offer(E e);
    E peek();
    E poll();
    E remove();
}



