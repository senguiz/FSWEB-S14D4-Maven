package org.example.rpg;

public abstract class Monster {
    String name;
    int hitPoints;
    double damage;
    double totalDamage=0;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }
    public double attack(){
        totalDamage = getDamage();
        if(this instanceof Bleedable){
            totalDamage +=((Bleedable) this).bleed();
        }
        if(this instanceof Poisonable){
            totalDamage +=((Poisonable) this).poison();
        }
        return totalDamage;
    }
}
