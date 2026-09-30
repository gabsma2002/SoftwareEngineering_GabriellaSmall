package project.api.networkapi;

public interface UserComputeRequest {
    String getInput();
    String getOutput();

    char getDelimiter();
    char getDelimiterPair();

}