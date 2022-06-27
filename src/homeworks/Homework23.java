package homeworks;

import java.util.*;

public class Homework23 {
    //TASK-1
    public static TreeMap<Integer, String> parseData(String str){
        List<String> strList = Arrays.asList(str.split("[{]"));
        TreeMap<Integer, String> strMap = new TreeMap<>();
        for (int i = 1; i < strList.size(); i++) {
            String[] tempArr = strList.get(i).split("[}]");
            strMap.put(Integer.parseInt(tempArr[0]), tempArr[1]);
        }
        return strMap;
    }

    //TASK-2
    public static double calculateTotalPrice1(Map<String, Integer> items) {
        double totalPrice = 0, apple = 2.00, orange = 3.29, mango = 4.99, pineapple = 5.25;
        if (items.containsKey("Apple")) totalPrice += items.get("Apple") * apple;
        if (items.containsKey("Orange")) totalPrice += items.get("Orange") * orange;
        if (items.containsKey("Mango")) totalPrice += items.get("Mango") * mango;
        if (items.containsKey("Pineapple")) totalPrice += items.get("Pineapple") * pineapple;
        return totalPrice;
    }

    //TASK-3
    public static double calculateTotalPrice2(Map<String, Integer> items){
        double totalPrice = 0, apple = 2.00, twoApples = 3.00, orange = 3.29, mango = 4.99, fourMangoes = 14.97;
        if (items.containsKey("Apple")) {
            double apples = items.get("Apple");
            if (apples % 2 == 0) totalPrice += (apples/2) * twoApples;
            else totalPrice += ((apples-1)/2) * twoApples + apple;
        }
        if (items.containsKey("Orange")) totalPrice += items.get("Orange")*orange;
        if (items.containsKey("Mango")) {
            double mangoes = items.get("Mango"), extraMangoes = mangoes % 4;
            if (mangoes < 4) totalPrice += mangoes * mango;
            else{
                if(mangoes % 4 == 0) totalPrice += (mangoes/4) * fourMangoes;
                else totalPrice += ((mangoes-extraMangoes)/4) * fourMangoes + (extraMangoes * mango);
            }
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        Map<String, Integer> shoppingList = new HashMap<>();
        shoppingList.put("Apple", 4);
        shoppingList.put("Mango", 8);
        shoppingList.put("Orange", 3);
//        shoppingList.put("Pineapple", 1);
        System.out.println(calculateTotalPrice1(shoppingList));
        System.out.println(calculateTotalPrice2(shoppingList));
    }
}
