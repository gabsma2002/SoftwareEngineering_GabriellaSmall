package project.api.networkapi;

public interface WebServer {
    LoginResponseCode login(LoginRequest loginRequest);
    ProfileLoadResponse loadProfile(UserIdentifier user);
    ProfileChangeResponse changeProfile(UserIdentifier user, ProfileChangeRequest request);
    LogoutResponse logout(UserIdentifier user);
}