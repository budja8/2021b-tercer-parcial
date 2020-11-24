package oop.exams.generator;

import oop.exams.model.Region;

public class LicensePlateGeneratorFactory {

    private final LicensePlateGenerator northLicensePlateGenerator = new NorthLicensePlateGenerator();
    private final LicensePlateGenerator southLicensePlateGenerator = new SouthLicensePlateGenerator();
    private final LicensePlateGenerator eastLicensePlateGenerator = new EastLicensePlateGenerator();
    private final LicensePlateGenerator westLicensePlateGenerator = new WestLicensePlateGenerator();
    private final LicensePlateGenerator centerLicensePlateGenerator = new CenterLicensePlateGenerator();

    public LicensePlateGenerator getInstance(String state) {
        return switch (state) {
            case "BCN", "BCS", "CHH", "COA", "NLE", "SON", "TAM" -> northLicensePlateGenerator;
            case "CAM", "ROO", "TAB", "VER", "YUC" -> eastLicensePlateGenerator;
            case "COL", "JAL", "NAY", "SIN" -> westLicensePlateGenerator;
            case "CHP", "GRO", "MIC", "OAX" -> southLicensePlateGenerator;
            default -> centerLicensePlateGenerator;
        };
    }

    public LicensePlateGenerator getInstance(Region region) {
        return switch (region) {
            case NORTH -> northLicensePlateGenerator;
            case EAST -> eastLicensePlateGenerator;
            case WEST -> westLicensePlateGenerator;
            case SOUTH -> southLicensePlateGenerator;
            case CENTER -> centerLicensePlateGenerator;
        };
    }
}
