package oop.exams.generator;

public class DefaultLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        CenterLicensePlateGenerator generator = new CenterLicensePlateGenerator();
        return generator.generate(state);
    }
}
