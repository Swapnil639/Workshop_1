package com.bridgelabz;


public class CountElement {
    static int[] arr = {10, 40, 50, 80, 30, 40, 90, 20, 10, 39, 23, 50, 10};
    void frequencyElement() {
        int[] visitedArr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visitedArr[j] = visited;

                }
            }
            if (visitedArr[i] != visited) {
                visitedArr[i] = count;
            }
        }
        for (int i = 0; i < visitedArr.length; i++) {
            if (visitedArr[i] != visited) {
                System.out.println("Frequency of " + arr[i] + " :" + visitedArr[i]);
            }
        }
    }

    public static void main(String[] args) {
        CountElement obj = new CountElement();
        obj.frequencyElement();
    }
}

