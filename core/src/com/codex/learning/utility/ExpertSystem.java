package com.codex.learning.utility;

public class ExpertSystem {
    private int[] cookies;
    private int totalCookies;
    private String expertiseLevel;
    private String currentBehavior;


    public ExpertSystem(){

        currentBehavior = null;
    }

    public void updateExpertiseLevel(){

    }

    public void writeFile(){

    }

    public int getTotalCookies() {
        return totalCookies;
    }

    public void setTotalCookies(int totalCookies) {
        this.totalCookies = totalCookies;
    }

    public String getExpertiseLevel() {
        return expertiseLevel;
    }

    public void setExpertiseLevel(String expertiseLevel) {
        this.expertiseLevel = expertiseLevel;
    }

    public String getCurrentBehavior() {
        return currentBehavior;
    }

    public void setCurrentBehavior(String currentBehavior) {
        this.currentBehavior = currentBehavior;
    }
}