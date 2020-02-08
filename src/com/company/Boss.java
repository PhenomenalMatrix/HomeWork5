package com.company;

import java.util.Random;

public class Boss {
   private int health;
   private int damage;
   private static String [] defenceType;
   public static String bossDefence = "";

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            System.out.println("error");
        }else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0){
            System.out.println("error");
        }else {
            this.damage = damage;
        }
    }

    public String [] getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String [] defenceType) {
        this.defenceType = defenceType;
    }

    public static void changeTypeDefence(){
        Random r = new Random();
        int indexRandom = r.nextInt(defenceType.length);
        bossDefence = defenceType[indexRandom];


    }
}
