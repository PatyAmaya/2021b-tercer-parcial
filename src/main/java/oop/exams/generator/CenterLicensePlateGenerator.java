package oop.exams.generator;

import java.util.Random;

public class CenterLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        Random ran=new Random(10);
        int v1 = ran.nextInt(9)+1;
        int v2 = ran.nextInt(9)+1;
        int v3 = ran.nextInt(9)+1;
        int v4 = ran.nextInt(9)+1;
        int v5 = ran.nextInt(9)+1;
        int v6 = ran.nextInt(9)+1;
        int v7 = ran.nextInt(9)+1;

        String plate = "5"+ v1 + v2 + v3 + v4 + v5 + v6 + v7;

        return plate;
    }
}
