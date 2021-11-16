package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;

public class NorthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        if(!validState(state)){
            throw new BadRegionException("Allowed state codes: BCN, BCS, CHH, COA, NLE, SON, TAM");
        }

        StringBuilder licensePlate=new StringBuilder("1");
        Random random=new Random();
        int i;

        licensePlate.append(state);

        licensePlate.append(random.nextInt(10));
        licensePlate.append(random.nextInt(10));


        return licensePlate.toString();
    }

    private boolean validState(String state) {
        return switch (state) {
            case "BCN", "BCS", "CHH", "COA", "NLE", "SON", "TAM" -> true;
            default -> false;
        };
    }
}
