package oop.exams.generator;
import oop.exams.exception.BadRegionException;

import java.util.Random;

public class EastLicensePlateGenerator implements LicensePlateGenerator {

    @Override
    public String generate(String state) {
        if(!validState(state)){
            throw new BadRegionException("Allowed state codes: CAM, ROO, TAB, VER, YUC");
        }

        StringBuilder licensePlate=new StringBuilder("3");
        Random random=new Random();
        int i;

        licensePlate.append(random.nextInt(10));
        licensePlate.append(random.nextInt(10));

        licensePlate.append("Z");


        return licensePlate.toString();
    }

    private boolean validState(String state) {
        return switch (state) {
            case "CAM", "ROO", "TAB", "VER", "YUC" -> true;
            default -> false;
        };
    }
}
