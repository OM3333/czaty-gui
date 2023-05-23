package com.example.chaty;

public class ClientGUIReceiver implements ClientReceiver{

    ConnectionThread connectionThread;

    public ClientGUIReceiver(ConnectionThread connectionThread){
        this.connectionThread = connectionThread;
    }

    @Override
    public void broadcast(String message) {
        connectionThread.broadcast(message);
    }

    @Override
    public void whisper(String message, String user) {

    }

    @Override
    public void loginBroadcast() {

    }

    @Override
    public void logoutBroadcast() {

    }

    @Override
    public void online() {

    }

    @Override
    public void file() {

    }
}
