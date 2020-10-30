package com.codecool.scoutcamp.guardpost;

public abstract class GuardPost {
    protected int rope;
    protected boolean hasWood;
    public int chanceToGatherWood;
    public int buildChance;

    public GuardPost(int rope) {
        this.rope = 400;
    }

    public  abstract void gatherWood();

    public abstract void build();

    public abstract void lightAfire();

}
