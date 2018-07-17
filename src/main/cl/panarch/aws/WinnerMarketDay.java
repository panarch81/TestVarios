package main.cl.panarch.aws;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WinnerMarketDay {

    /* Given a winner fruit combination on a day in our market
    *  we will give a price for the person who buy fruits in that combination
    * */
    private Map<String, Long> fruitsCounter;
    private List<String> winnerFruitsCombination;

    public void printFruitCombination(List<String> fruitCombination){
        System.out.print("[ ");
        fruitCombination.stream().forEach(fruit -> System.out.println(fruit +","));
        System.out.print("] ");

    }

    public static int checkHowManyWinnersFruitsCombination(List<String> winnerFruitsCombination,
                                                           HashMap<String,List<String>> pointOfSale){
        int winnerCounter = 0;

        if(winnerFruitsCombination != null && winnerFruitsCombination.size() == 0) {
            return 0;
        }

        if( pointOfSale.values().size() == 0 ){
            return 0;
        }

        Map<String, Long> winnerFruitsFrecuency = getFruitFrecuence(winnerFruitsCombination);

        outerloop:
        for(Map.Entry<String,List<String>> shoppingCart : pointOfSale.entrySet()){
            List<String> fruitCombination = shoppingCart.getValue();
            Map<String, Long> fruitsCombinationFrecuency = getFruitFrecuence(fruitCombination);

            for(Map.Entry<String,Long> winnerFrencuency : winnerFruitsFrecuency.entrySet()){
                if(!fruitsCombinationFrecuency.entrySet().contains(winnerFrencuency)) {
                    continue outerloop;
                }
            }
            System.out.println(shoppingCart.getKey());
            winnerCounter++;
        }
        return winnerCounter;
    }

    private static Map<String, Long> getFruitFrecuence(List<String> fruitsCombination){

        Map<String, Long> fruitFrecuence = fruitsCombination.stream()
                .collect(groupingBy(Function.identity(), counting()));

        //fruitFrecuence.forEach((k,v) ->  System.out.println( k +" : "+ v ));
        return fruitFrecuence;
    }

    public List<String> getWinnerFruitsCombination() {
        return winnerFruitsCombination;
    }

    public void setWinnerFruitsCombination(List<String> winnerFruitsCombination) {
        this.winnerFruitsCombination = winnerFruitsCombination;
    }
}
