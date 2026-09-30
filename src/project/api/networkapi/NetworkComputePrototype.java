package project.api.networkapi;

public class NetworkComputePrototype implements NetworkComputeAPI {
    @Override 
    public String computeJob(UserComputeRequest request) {
        return "Job computed";
    }

    
}
