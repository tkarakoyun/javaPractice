package day62;

import java.util.*;
public class SetOfUniqueStates {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL"));


        System.out.println("How many?? states.size() = "+ states.size());


        for(String each : states){
            System.out.println("each = " + each);

        }
        //Iterator<String> stIter = states.iterator();

        //while(stIter.hasNext() ){
        //    System.out.println("stIter = " + stIter);

        }

    }

