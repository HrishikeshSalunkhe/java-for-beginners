package com.hrishi.javaBasics;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Switch statement in Java");
        int permissions = 777;
        String role = (permissions == 777) ? "admin" : "moderator";
        switch (role){
            case "admin":
                System.out.println("You are admin");
                break;
            case "moderator":
                System.out.println("You are Moderator");
                break;
            default:
                System.out.println("You are User");
        }
    }
}
