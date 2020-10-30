package com.codecool.scoutcamp.guardpost;

import java.util.Random;

public class BoyGuardPost extends GuardPost {
    Random random = new Random();
    public BoyGuardPost(int rope) {
        super(rope);
        this.chanceToGatherWood = 65;
        this.buildChance = 75;
    }

    @Override
    public void gatherWood() {
        int woodChance = random.nextInt(100)+1;
        this.hasWood = woodChance <= chanceToGatherWood;
    }

    @Override
    public void build() {
        int buildingChance = random.nextInt(100) + 1;
        if (hasWood && buildChance <= buildingChance) {
            this.rope -= 30;
        } else {
            this.rope -= 10;
        }

    }

    @Override
    public void lightAfire() {
        while(true){
            if(random.nextInt(100)+1 <= 70){
                System.out.println("Fire is meg van rakva!");
                break;
            }else{
                System.out.println("Nincs tűz!");
            }
        }
    }
}
