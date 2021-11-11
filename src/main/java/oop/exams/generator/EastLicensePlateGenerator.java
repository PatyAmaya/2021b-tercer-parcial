package oop.exams.generator;
import java.util.Random;

public class EastLicensePlateGenerator implements LicensePlateGenerator {

    @Override
    public String generate(String state) {
        Random ran=new Random(10);
        int v1 = ran.nextInt(9)+1;
        int v2 = ran.nextInt(9)+1;

        String plate = "3"+ v1+ v2 +"Z";

        return plate;
    }
}
