package com.homework;

public class Main {

    public static void main(String[] args) {
        String str = "56.0";
        checkIntOrDouble(str);

        StringReader stringReader = new StringReader(str);
        stringReader.stringToCharArray();

        String[] strArr = {"23","2.3","15","23"};
        StringReader stringReader2 = new StringReader(strArr);
        stringReader2.stringToCharArray();

        stringReader2.printArray();
    }

    private static void checkIntOrDouble(String str){
        double value = Double.parseDouble(str);
        if (value % 1 == 0) {
            System.out.println("Value "+ (int)value + " is Integer");
        } else {
            System.out.println("Value "+ value + " is Double");
        }
    }
}
