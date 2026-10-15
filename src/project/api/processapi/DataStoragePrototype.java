package project.api.processapi;

import java.util.ArrayList;
import java.util.List;

import project.annotations.ProcessAPIPrototype;
public class DataStoragePrototype {
    @ProcessAPIPrototype
    public void prototype(DataStorageAPI api) {
        //readinput
        InputData inputData = api.readInput(new InputConfig() {});
        System.out.println(inputData.getNumbers());
        //writeoutput
        api.writeOutput(new OutputConfig() {}, new OutputData()  {
            @Override 
            public List<String> getResults() {
                return new ArrayList<>();
            }
        });
       
    }

    
}
