package oop.exams.generator;

import org.assertj.core.internal.bytebuddy.utility.RandomString;

public class DefaultLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String plate = "1" +  RandomString.make(7);
        return plate;
    }
}
