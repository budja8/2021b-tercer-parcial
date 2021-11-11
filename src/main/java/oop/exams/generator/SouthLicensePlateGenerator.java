package oop.exams.generator;

import org.assertj.core.internal.bytebuddy.utility.RandomString;

public class SouthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String plate = "4" +  state;
        return plate;
    }
}
