package com.tw.frustratedcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        List<Coder> coders= new ArrayList<>();
        for (int i = 0; i < count; i++) {
            coders.add(new Coder(Integer.parseInt(s[i])));
        }

        FrustratedCoder frustratedCoder = new FrustratedCoder(coders);
        frustratedCoder.calculateSkill();
        Integer sum = frustratedCoder.minimumSkillSum();
        System.out.println(sum);


    }
}



