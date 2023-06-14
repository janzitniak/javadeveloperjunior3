package datumy;

import java.sql.*;
import java.time.LocalDate;

public class RozsahDatumuMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nazov_databazy";
        String username = "uzivatel";
        String password = "heslo";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            // Definovanie rozsahu dátumu "od" a "do"
            LocalDate datumOd = LocalDate.of(2023, 5, 15);
            LocalDate datumDo = LocalDate.of(2023, 5, 25);

            // Vytvorenie dopytu SQL s klauzulou WHERE pre dátumy v rozsahu
            String sql = "SELECT * FROM tabulka WHERE datum BETWEEN ? AND ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setDate(1, Date.valueOf(datumOd));
            stmt.setDate(2, Date.valueOf(datumDo));

            // Vykonanie dopytu a získanie výsledkov
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // Spracovanie údajov z výsledku
                LocalDate datum = rs.getDate("datum").toLocalDate();
                // Tu môžete robiť čo chcete s údajmi, napr. vypísať ich
                System.out.println(datum);
            }

            // Zatvorenie zdrojov
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

