package project.api.conceptualapi;
import java.util.ArrayList;

import project.annotations.ConceptualAPI;
@ConceptualAPI 

public interface ComputeWorkerAPI {
    //Takes a single positive integer and returns its computed factors
    ArrayList<Integer> computeFactors(int number);


}

