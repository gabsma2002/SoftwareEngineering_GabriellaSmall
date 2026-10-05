package project.api.networkapi;

import project.annotations.NetworkAPI;

@NetworkAPI 
public interface NetworkComputeAPI {
    String computeJob(UserComputeRequest request);
    
}
