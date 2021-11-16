package oop.exams.generator;

import oop.exams.exception.BadRegionException;

import java.util.Random;

public class WestLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        if(!validState(state)){
            throw new BadRegionException("Allowed state codes: COL, JAL, NAY, SIN");
        }

        StringBuilder licensePlate=new StringBuilder("2");
        Random random=new Random();
        int i;

        licensePlate.append(random.nextInt(10));

        licensePlate.append(state);

        return licensePlate.toString();
    }

    private boolean validState(String state) {
        return switch (state) {
            case "COL", "JAL", "NAY", "SIN" -> true;
            default -> false;
        };
    }
}
