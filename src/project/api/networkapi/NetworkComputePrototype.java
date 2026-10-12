package project.api.networkapi;

import project.annotations.NetworkAPI;
import project.annotations.NetworkAPIPrototype;

@NetworkAPI 
public class NetworkComputePrototype implements NetworkComputeAPI {
    @NetworkAPIPrototype
    public void prototype(NetworkComputeAPI api) {
        api.computeJob(null);
    }

    @Override 
    public String computeJob(UserComputeRequest request) {
        return "Job computed";
    }

    
}
