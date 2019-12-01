package com.tw.frustratedcoder;

class Coder implements Comparable<Coder> {
    private Integer skill;

    public Coder(Integer skill) {
        this.skill = skill;
    }

    @Override
    public int compareTo(Coder o) {
        return this.skill-o.skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public void setSkillToZero(){
        this.skill=0;
    }
    public Integer getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "skill=" + skill +
                '}';
    }
}