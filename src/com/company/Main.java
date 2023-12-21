package com.company;

public class Main {

    public static void main(String[] args) {
	int amount = 13676;
    int mile = 1;
    int ruble = 20;
    boolean isRegistered = true;
   if(isRegistered) {
        mile = 1;
    }else{
        ruble = 20;
    }
int bonus = amount*mile/ruble;
        System.out.println("Итоговая сумма начисления:" + bonus);
    }
}
