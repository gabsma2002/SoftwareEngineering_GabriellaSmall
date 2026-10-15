package project.api.processapi;

import project.annotations.ProcessAPI;
@ProcessAPI 
public interface DataStorageAPI {
    //read user input of positive integers
    InputData readInput(InputConfig input);

    //writes final result to storage destination
    void writeOutput(OutputConfig destination, OutputData data);
    
}

