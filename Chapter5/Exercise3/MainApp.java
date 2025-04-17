interface AddressValidator {
    boolean validateStreet(String street);

    boolean validateCity(String city);

    boolean validatePostalCode(String postalCode);

    boolean validateCountry(String country);
}

class USAAddress implements AddressValidator {
    @Override
    public boolean validateStreet(String street) {
        return street != null && !street.isEmpty();
    }

    @Override
    public boolean validateCity(String city) {
        return city != null && !city.isEmpty();
    }

    @Override
    public boolean validatePostalCode(String postalCode) {
        return postalCode != null && postalCode.matches("\\d{5}(-\\d{4})?");
    }

    @Override
    public boolean validateCountry(String country) {
        return "USA".equalsIgnoreCase(country);
    }
}

class VNAddress implements AddressValidator {
    @Override
    public boolean validateStreet(String street) {
        return street != null && !street.isEmpty();
    }

    @Override
    public boolean validateCity(String city) {
        return city != null && !city.isEmpty();
    }

    @Override
    public boolean validatePostalCode(String postalCode) {
        return postalCode != null && postalCode.matches("\\d{6}");
    }

    @Override
    public boolean validateCountry(String country) {
        return "Vietnam".equalsIgnoreCase(country) || "VN".equalsIgnoreCase(country);
    }
}

public class MainApp {
    public static void main(String[] args) {
        AddressValidator usaAddress = new USAAddress();
        System.out.println("USA Address Validation:");
        System.out.println("Street valid: " + usaAddress.validateStreet("911 Main Street"));
        System.out.println("City valid: " + usaAddress.validateCity("New York"));
        System.out.println("Postal Code valid: " + usaAddress.validatePostalCode("12345-6789"));
        System.out.println("Country valid: " + usaAddress.validateCountry("USA"));

        AddressValidator vnAddress = new VNAddress();
        System.out.println("\nVietnam Address Validation:");
        System.out.println("Street valid: " + vnAddress.validateStreet("97 Man Thien"));
        System.out.println("City valid: " + vnAddress.validateCity("Hồ Chí Minh"));
        System.out.println("Postal Code valid: " + vnAddress.validatePostalCode("700000"));
        System.out.println("Country valid: " + vnAddress.validateCountry("Vietnam"));
    }
}
