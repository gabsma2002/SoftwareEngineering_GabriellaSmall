package project.api.networkapi;

import project.annotations.NetworkAPI;

@NetworkAPI 
public interface UserComputeRequest {
    String getInput();
    String getOutput();

    char getDelimiter();
    char getDelimiterPair();

}