import org.postgresql.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnect {
    public List<String[]> executeSelect(String select) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/training_hw_5",
                    "postgres", "14852");
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(select);
            ResultSetMetaData setMetaData= result.getMetaData();

            int count = setMetaData.getColumnCount();
            String[] columnLabels = new String[count];
            List<String[]> values = new ArrayList<>();

            for (int i = 1; i < count + 1; i++) {
                columnLabels[i - 1] = setMetaData.getColumnLabel(i);
            }

            values.add(columnLabels);

            while (result.next()) {
                String[] res = new String[count];
                for (int i = 1; i < count + 1; i++) {
                    res[i-1] = result.getString(i);
                }
                values.add(res);
            }

            return values;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
