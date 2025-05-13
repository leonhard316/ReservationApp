import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) {
        try {
            // SQLite JDBCドライバの読み込み
            Class.forName("org.sqlite.JDBC");

            // データベースの接続（なければ作成される）
            Connection conn = DriverManager.getConnection("jdbc:sqlite:reservation.db");

            // テーブル作成
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Reservation " +
                         "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                         " name TEXT NOT NULL, " +
                         " date TEXT NOT NULL, " +
                         " time_slot TEXT NOT NULL, " +
                         " symptoms TEXT, " +
                         " phone_number TEXT)";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}