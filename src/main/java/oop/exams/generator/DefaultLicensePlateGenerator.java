package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;

public class DefaultLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {

        if(!validState(state)){
            throw new BadRegionException("Allowed state codes: AGU, CMX, DUR, GUA, HID, MEX, PUE, QUE, SLP, TLA, ZAC");
        }

        StringBuilder licensePlate=new StringBuilder("5");
        Random random=new Random();
        int i;

        for(i=1; i<8;i++){
            licensePlate.append(random.nextInt(10));
        }


        return licensePlate.toString();

    }

    private boolean validState(String state) {
        return switch (state) {
            case "AGU", "CMX", "DUR", "GUA", "HID", "MEX", "PUE", "QUE", "SLP", "TLA", "ZAC" -> true;
            default -> false;
        };
    }


}
