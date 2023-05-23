package com.example.chaty;

public interface ClientReceiver {

    public void broadcast(String message);

    public void whisper(String message, String user);

    public void loginBroadcast();

    public void logoutBroadcast();

    public void online();

    public void file();
}
