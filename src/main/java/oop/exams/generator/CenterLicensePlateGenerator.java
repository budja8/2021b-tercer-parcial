package oop.exams.generator;

import org.assertj.core.internal.bytebuddy.utility.RandomString;

public class CenterLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String plate = "5" + state + RandomString.make(4);
        return plate;
    }
}
