package com.company;

public class MagicDoor {

    public  Hero[] Hero(){
        Hero[] hero = new Hero[4];

        Hero warrior = new Hero(50,10,"doubleDamage");
        hero[0] = warrior;

        Hero magic = new Hero(40,20,"fire");
        hero[1] = magic;

        Hero support = new Hero(30,5,"omegaHeal");
        hero[2] = support;

        Hero carry = new Hero(40,30,"crid");
        hero[3] = carry;

        return hero;
    }

}
