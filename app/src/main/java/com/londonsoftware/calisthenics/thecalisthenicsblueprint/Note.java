package com.londonsoftware.calisthenics.thecalisthenicsblueprint;

public class Note {
    private String title;
    private String description;
    private int priority;
    private String date;

    public Note() {
        //empty constructor needed
    }

    public Note(String title, String description, int priority, String date) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDate() {
        return date;
    }
}