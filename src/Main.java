import java.util.List;

public class Main {
    public static void main(String[] args) {
        DbConnect connect = new DbConnect();

        String select = """
                select *
                from audit_department
                """;

        List<String[]> valueList = connect.executeSelect(select);

        printRow();

        valueList.forEach(key -> {
            for (String value : key) {
                System.out.printf("|" + "%-25s", value);
            }

            System.out.printf("|");
            System.out.print("\n");
            printRow();
        });
    }

    public static void printRow() {
        System.out.print("+");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.print("-");
            }
            System.out.print("+");
        }

        System.out.print("\n");
    }
}