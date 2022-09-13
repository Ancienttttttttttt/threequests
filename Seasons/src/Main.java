import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        for (Season season : Season.values()) printInfo(season);
        System.out.print("Любимое время года: ");
        printInfo(Season.valueOf("Winter"));
    }
    public static void printInfo(Season season) {
        System.out.printf("%s %s, ", season.name(), season);
        season.getDescription();
    }

}
