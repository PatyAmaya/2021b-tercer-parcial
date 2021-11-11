package oop.exams.generator;

import java.util.Random;

public class WestLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        Random ran=new Random(10);
        int v1 = ran.nextInt(9)+1;

        String plate = "2"+ v1 + state;

        return plate;
    }
}
