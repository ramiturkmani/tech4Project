package enums;

public class TrasversingEnums {
    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day);
        }

        for (Constants.Month month : Constants.Month.values()) {
            System.out.println(month);
        }
    }
}
