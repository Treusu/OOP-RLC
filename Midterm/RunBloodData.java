package OOP.Midterm;
/**
 * Cubia, Richard L.
 * BSIT-307
 */
import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BloodData bloodData = new BloodData();

        System.out.print("Enter blood type of patient: ");
        String bloodType = scanner.nextLine();
        bloodData.setBloodType(bloodType);

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactor = scanner.nextLine();
        bloodData.setRhFactor(rhFactor);

        System.out.println(bloodData.getBloodType() + bloodData.getRhFactor() + " is added to the blood bank.");
    }
}

class BloodData {
    private static final String[] bloodTypes = {"O", "A", "B", "AB"};
    private static final String[] rhFactors = {"+", "-"};

    private String bloodType;
    private String rhFactor;

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}
/* Withouth encapsulation
public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactor = scanner.nextLine();

        BloodData bloodData;
        if (bloodType.isEmpty() || rhFactor.isEmpty()) {
            bloodData = new BloodData();
        } else {
            bloodData = new BloodData(bloodType, rhFactor);
        }

        System.out.println(bloodData.getBloodType() + bloodData.getRhFactor() + " is added to the blood bank.");
    }
}

class BloodData {
    private static final String[] bloodTypes = {"O", "A", "B", "AB"};
    private static final String[] rhFactors = {"+", "-"};

    private String bloodType;
    private String rhFactor;

    public BloodData() {
        this.bloodType = bloodTypes[0];
        this.rhFactor = rhFactors[0];
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}*/