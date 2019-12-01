package com.tw.frustratedcoder;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class FrustratedCoder {
    private List<Coder> coders;
    private Stack<Integer> newCoders;
    private Integer sum = 0;

    FrustratedCoder(List<Coder> coders) {
        this.coders = coders;
        Collections.sort(coders);
        this.newCoders = coders.stream().map(coder->coder.getSkill()).collect(Collectors.toCollection(Stack::new));
    }

    void calculateSkill() {
        for(int i=coders.size()-1;i>=0;i--){
            if(coders.get(i).getSkill()<newCoders.peek()){
                coders.get(i).setSkillToZero();
                newCoders.pop();
            }
        }
    }
    Integer minimumSkillSum(){
        for(Coder c:coders){
            sum=sum+c.getSkill();

        }
        return sum;
    }
}