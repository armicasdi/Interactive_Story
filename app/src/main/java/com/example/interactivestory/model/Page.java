package com.example.interactivestory.model;

public class Page {

    private int imageId;
    private int textId;
    private Choice choice1;
    private Choice choice2;
    private boolean isfinalPage = false;

    public Page(int imageId, int textId) {
        this.imageId = imageId;
        this.textId = textId;
        this.isfinalPage = true;
    }

    public Page(int imageId, int textId, Choice choice1, Choice choice2) {
        this.imageId = imageId;
        this.textId = textId;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public boolean isIsfinalPage() {
        return isfinalPage;
    }

    public void setIsfinalPage(boolean isfinalPage) {
        this.isfinalPage = isfinalPage;
    }
}