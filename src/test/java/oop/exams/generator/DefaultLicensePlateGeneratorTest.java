package oop.exams.generator;

import oop.exams.exception.BadRegionException;
import oop.exams.exception.NotAvailableLicensePlateException;
import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DefaultLicensePlateGeneratorTest {

    @Test
    public void givenADefaultState_whenGenerate_thenLicensePlateStartsWith1() {

        // Given:
        LicensePlateGenerator licensePlateProvider = new CenterLicensePlateGenerator();
        String state = "SLP";

        // When:
        String licensePlate = licensePlateProvider.generate(state);

        // Then:
        assertThat(licensePlate).startsWith("5");
        assertThat(licensePlate).hasSize(8);
        assertThat(licensePlate).containsOnlyDigits();
    }

    @Test
    public void givenADefaultState_whenGenerateTwice_thenLicensesAreDifferent() {

        // Given:
        LicensePlateGenerator licensePlateProvider = new DefaultLicensePlateGenerator();


        // When:
        String licensePlate1 = licensePlateProvider.generate("ZAC");
        String licensePlate2 = licensePlateProvider.generate("ZAC");

        // Then:
        assertThat(licensePlate1).isNotEqualTo(licensePlate2);
    }

    @Test
    public void givenANonDefaultState_whenGenerate_thenBadRegionExceptionIsThrown() {

        // Given:
        LicensePlateGenerator licensePlateProvider = new DefaultLicensePlateGenerator();
        String randomStateAbbreviation = "X" + RandomString.make(2);

        // When:
        // Then:
        assertThatThrownBy(() -> licensePlateProvider.generate(randomStateAbbreviation))
                .hasMessage("Allowed state codes: AGU, CMX, DUR, GUA, HID, MEX, PUE, QUE, SLP, TLA, ZAC")
                .isInstanceOf(NotAvailableLicensePlateException.class)
                .isInstanceOf(Exception.class);
    }
}
