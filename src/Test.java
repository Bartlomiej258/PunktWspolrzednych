import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        Point point = new Point(x, y);

        CheckQuarter checkQuarter = new CheckQuarter();
        String quarter = checkQuarter.getQuarter(point);
        if (quarter != null)
            System.out.println("Punkt leży w " + quarter + " ćwiartce układu");
        else
            System.out.println("Punkt leży w środku układu lub na jednej z osi");
    }
}