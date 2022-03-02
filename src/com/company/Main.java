package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        canHeGoWalk(12,14);

    }
    public static void canHeGoWalk(int age, int temperature ){
        if((age>=20 && age<= 45) &&(temperature>=-20 && temperature<=30) ){
            System.out.println("можно идти гулять");
        }
        else if (age<20 && (temperature>=0 && temperature<=28)){
            System.out.println("можно идти гулять");
        }
        else if (age>45&&(temperature>=-10 && temperature<=25 )){
            System.out.println("можно идти гулять");
        }
        else {
            System.out.println("оставайтесь дома!");
        }


    }
}
