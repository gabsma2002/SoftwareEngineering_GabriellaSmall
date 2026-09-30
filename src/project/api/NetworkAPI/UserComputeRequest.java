package project.api.NetworkAPI;

public interface UserComputeRequest {
    String getInput();
    String getOutput();

    char getDelimiter();
    char getDelimiterPair();

}