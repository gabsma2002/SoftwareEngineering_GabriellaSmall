package project.api.processapi;

import java.util.ArrayList;

import project.annotations.ProcessAPI;
import project.annotations.ProcessAPIPrototype;
@ProcessAPI 
public class DataStoragePrototype implements DataStorageAPI {
    @ProcessAPIPrototype
    public void prototype(DataStorageAPI api) {
        ArrayList<Integer> input = api.readInput("84");
        api.writeOutput("result", input.toString());
    }

    public ArrayList<Integer> readInput(String input) {
        //returns numbers as an arraylist of integers
        return new ArrayList<>();
    }

    public void writeOutput(String destination, String result) {
        //writes results to destination
        System.out.println("Writing output to " + destination + ": " + result);
    }


    
}
