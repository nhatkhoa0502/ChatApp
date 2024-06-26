package com.example.chatapp.Model;

public class Chat {
    private String sender;
    private String receiver;
    private String message;
    private long duration;
    private long time;
    private boolean isseen;

    public Chat() {
    }

    public Chat(String sender, String receiver, String message, long duration, long time, boolean isseen) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.duration = duration;
        this.time = time;
        this.isseen = isseen;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
