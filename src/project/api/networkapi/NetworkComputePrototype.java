package project.api.networkapi;

import project.annotations.NetworkAPI;

@NetworkAPI 
public class NetworkComputePrototype implements NetworkComputeAPI {
    @Override 
    public String computeJob(UserComputeRequest request) {
        return "Job computed";
    }

    
}
