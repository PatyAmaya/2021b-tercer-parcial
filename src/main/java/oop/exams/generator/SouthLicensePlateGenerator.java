package oop.exams.generator;

import java.util.Random;

public class SouthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        Random ran=new Random(10);
        int v1 = ran.nextInt(9)+1;
        int v2 = ran.nextInt(9)+1;
        int v3 = ran.nextInt(9)+1;

        String plate = "4"+ state + v1+ v2+v3;

        return plate;
    }
}
