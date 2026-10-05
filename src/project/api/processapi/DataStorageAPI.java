package project.api.processapi;
import java.util.ArrayList;

import project.annotations.ProcessAPI;
@ProcessAPI 
public interface DataStorageAPI {
    //read user input of positive integers
    ArrayList<Integer> readInput(String input);

    //writes final result to storage destination
    void writeOutput(String destination, String result);
    
}

