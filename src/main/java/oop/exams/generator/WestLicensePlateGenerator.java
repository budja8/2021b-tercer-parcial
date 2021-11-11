package oop.exams.generator;

import org.assertj.core.internal.bytebuddy.utility.RandomString;

public class WestLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String plate = "2" + RandomString.make(1)+ state;
        return plate;
    }
}
