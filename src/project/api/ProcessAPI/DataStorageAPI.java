package project.api.ProcessAPI;
import java.util.ArrayList;


public interface DataStorageAPI {
    //read user input of positive integers
    ArrayList<Integer> readInput(String input);

    //writes final result to storage destination
    void writeOutput(String destination, String result);
    
}
