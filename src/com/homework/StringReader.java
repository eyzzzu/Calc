package com.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReader {
    private List<String> stringList = new ArrayList<>();
    private String[] inputStringArray;
    private String inputString;

    {
        for (int i = 0; i < inputStringArray.length; i++) {
            stringList.set(i, inputStringArray[i]);
        }
    }

    public StringReader(String[] inputStringArray) {
        this.inputStringArray = inputStringArray;
    }

    public StringReader(String inputString) {
        this.inputString = inputString;
    }

    public void stringToCharArray() {
        if (stringList.get(0) == null) {
            throw new IllegalArgumentException("Num не должен быть null");
        }
        if (stringList.get(0) != null) {
            char[] chars = stringArrayToString(stringList).toCharArray();
            System.out.println(Arrays.toString(chars));
        } else {
            char[] chars = inputString.toCharArray();
            System.out.println(Arrays.toString(chars));
        }
    }

    private String stringArrayToString(List<String> inputStringList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputStringList.size(); i++) {
            stringBuilder.append(inputStringList.get(i));
        }
        inputString = stringBuilder.toString();
        return inputString;
    }

    public void printArray() {
        System.out.println(Arrays.toString(inputStringArray));
    }
}
