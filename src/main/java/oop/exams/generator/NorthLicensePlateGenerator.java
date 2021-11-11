package oop.exams.generator;

import org.assertj.core.internal.bytebuddy.utility.RandomString;

public class NorthLicensePlateGenerator implements LicensePlateGenerator {
    @Override
    public String generate(String state) {
        String plate = "1" + state + RandomString.make(2);
        return plate;
    }
}
