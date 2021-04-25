package com.company;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        reverse(list);
    }
        public static void reverse(ArrayList<Integer> list){
            Integer [] reverse = new Integer[list.size()];
            for (int i=list.size()-1; i>=0; i--){
                reverse[i]= list.get(i);
                System.out.print(reverse[i]+" ");
            }

        }
    }
