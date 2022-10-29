package com.hrishi.recursion;

public class MoveCharAtEnd {
    public static void moveCharAtEnd(String str, int count, int index , String finalString){
        if(index == str.length()){
            for (int i = 0; i <count ; i++) {
                finalString += 'z';
            }
            System.out.println(finalString);
            return;
        }
        char currentChar = str.charAt(index);
        if(currentChar=='z'){
            count +=1;
        }
        else{
            finalString +=currentChar;
        }
        moveCharAtEnd(str,count,index+1,finalString);

    }
    public static void main(String[] args) {
        String str= "azbzzczzzd";
        moveCharAtEnd(str,0,0,"");
    }
}
