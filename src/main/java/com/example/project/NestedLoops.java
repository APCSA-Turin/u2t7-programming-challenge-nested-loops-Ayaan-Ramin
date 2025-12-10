package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {

public static String starStaircase(int height){
    String newStr = "";
    int counter = 1;
    for (int i=1;i<=height;i++) {
        for (int j=1;j<=counter;j++) {
            newStr += "*";
        }
        counter++;
        newStr += "\n";
    }
    return newStr.substring(0, newStr.length()-1); 
}

public static String starStaircaseReverse(int height){
    String newStr = "";
    int counter = height-1;
    for (int i=1;i<=height;i++) {
        for (int j=counter;j>=0;j--) {
            newStr += "*";
        }
        counter--;
        newStr += "\n";
    }
    return newStr.substring(0, newStr.length()-1);
}

public static String emptyBox(int width, int height) {
    if (width < 2 || height < 2) {
        return "";
    }

    String newStr = "";
    for (int i=1;i<=height;i++) {
        if (i == 1 || i == height) {
            for (int j=1;j<=width;j++) {
                newStr += "*";
            }
        } else {
            newStr += "*";
            for (int j=2;j<=width-1;j++) {
                newStr += " ";
            }
            newStr += "*";
        }
        newStr += "\n";
    }
    return newStr.substring(0, newStr.length()-1);
}


public static String repeatRectangle(String word, int rows){
    String newStr = word;
    String newRect = newStr;
    for (int i=1;i<rows;i++) {
        newStr = newStr.substring(1,word.length()) + newStr.substring(0, 1);
        newRect += "\n" + newStr;
    }
    return newRect; 
}

}
