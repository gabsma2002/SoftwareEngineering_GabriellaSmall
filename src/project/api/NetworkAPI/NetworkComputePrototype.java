package project.api.NetworkAPI;

public class NetworkComputePrototype implements NetworkComputerAPI {
    @Override 
    public String computeJob(UserComputeRequest request) {
        return "Job computed";
    }

    
}
