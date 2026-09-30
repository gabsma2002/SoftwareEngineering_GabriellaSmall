package project.api.ProcessAPI;

import java.util.ArrayList;

public class DataStoragePrototype implements DataStorageAPI {
    
    public ArrayList<Integer> readInput(String input) {
        //returns numbers as an arraylist of integers
        return new ArrayList<>();
    }

    public void writeOutput(String destination, String result) {
        //writes results to destination
        System.out.println("Writing output to " + destination + ": " + result);
    }






    
}
