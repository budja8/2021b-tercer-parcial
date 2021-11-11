package oop.exams.generator;

import org.assertj.core.internal.bytebuddy.utility.RandomString;

public class EastLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String plate = "3" + RandomString.make(2)+ "Z";
        return plate;
    }
}
