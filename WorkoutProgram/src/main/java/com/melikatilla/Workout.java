package com.melikatilla;

import javax.swing.plaf.PanelUI;

public class Workout {
    private int burpee;
    private int pushup;
    private int situp;
    private int squat;

    public Workout(int burpee,int pushup,int situp,int squat){
        this.burpee=burpee;
        this.pushup=pushup;
        this.situp=situp;
        this.squat=squat;
    }

    public void setBurpee(int burpee){
        this.burpee=burpee;
    }
    public int getBurpee(){
        return burpee;
    }

    public void setPushup(int pushup){
        this.pushup=pushup;
    }
    public int getPushup(){
        return pushup;
    }

    public void setSitup(int situp){
        this.situp=situp;
    }
    public int getSitup(){
        return situp;
    }

    public void setSquat(int squat){
        this.squat=squat;
    }
    public int getSquat(){
        return squat;
    }
    public void exercise(String exerciseType,int count){

        if (exerciseType.equals("Burpee")){
            doBurpee(count);
        }
        else if (exerciseType.equals("Pushup")) {
            doPushup(count);
        }
        else if (exerciseType.equals("Situp")) {
            doSitup(count);
        }
        else if(exerciseType.equals("Squat")){
            doSquat(count);
        }
        else{
            System.out.println("Invalid Transaction...");
        }
    }

    public void doBurpee(int count){

        if (burpee==0){
            System.out.println("No more burpees to do..");
        }
        if (burpee-count<0){
            System.out.println("You exceeded your target number of burpees. Congratulations!");
            burpee=0;
            System.out.println("the burpee you need to do:"+burpee);
        }
        else {
            burpee-=count;
            System.out.println("Last "+burpee+" burpee");
        }

    }
    public void doPushup(int count){
        if (pushup ==0){
            System.out.println("No more pushup to do..");
        }
        if (pushup-count<0){
            System.out.println("You exceeded your target number of pushup. Congratulations!");
            pushup=0;
            System.out.println("the pushup you need to do:"+pushup);
        }
        else {
            pushup-=count;
            System.out.println("Last "+pushup+" pushup");
        }
    }
    public void doSitup(int count){
        if (situp==0){
            System.out.println("No more situp to do..");
        }
        if (situp-count<0){
            System.out.println("You exceeded your target number of situp. Congratulations!");
            situp=0;
            System.out.println("the situp you need to do:"+situp);
        }
        else {
            situp-=count;
            System.out.println("Last "+situp+" situp");
        }

    }
    public void doSquat(int count){
        if (squat==0){
            System.out.println("No more squat to do..");
        }
        if (squat-count<0){
            System.out.println("You exceeded your target number of squat. Congratulations!");
            squat=0;
            System.out.println("the squat you need to do:"+squat);
        }
        else {
            squat-=count;
            System.out.println("Last "+squat+" squat");
        }

    }
    public boolean workoutFinal(){
        return (squat==0) && (pushup==0) && (situp==0) && (burpee==0);
    }


}
