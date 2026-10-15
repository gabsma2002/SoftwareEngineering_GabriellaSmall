package project.api.conceptualapi;

import project.annotations.ConceptualAPI;
@ConceptualAPI 

public interface ComputeWorkerAPI {
    //Takes a single positive integer and returns its computed factors
    ComputeResponse computeFactors(ComputeRequest number);

}

