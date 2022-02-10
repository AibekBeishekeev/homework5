package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(150);
        boss.setDamage(150);
        boss.setChooseBossDefence("Aibek");
        System.out.println(boss.getHealth() + ", " + boss.getDamage() + ", " + boss.getChooseBossDefence());
    }

}
