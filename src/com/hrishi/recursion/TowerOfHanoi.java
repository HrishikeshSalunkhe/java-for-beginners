package com.hrishi.recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int numberOfDisks, String src, String helper,String dest){
        if(numberOfDisks==1){
            System.out.println("Transfer disk "+ numberOfDisks+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(numberOfDisks-1,src,dest,helper);
        System.out.println("Transfer disk "+ numberOfDisks+" from "+src+" to "+dest);
        towerOfHanoi(numberOfDisks-1,helper,src,dest);
    }
    public static void main(String[] args) {

        int n =3;
        towerOfHanoi(n,"S","H","D");
    }
}
