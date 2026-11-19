import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;

public class FileHandling {
    static final Path SUMBER = Paths.get("employees.txt");
    static final Path SALINAN = Paths.get("copy_employees.txt");

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
        writeFile(employees);
    }

    static void readFile(ArrayList<String> employees) {
        try (BufferedReader br = Files.newBufferedReader(SUMBER, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println("File tidak ditemukan: " + e.getFile());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    static void displayEmployees(ArrayList<String> employees) {
        for (String employee : employees)
            System.out.println(employee);
    }

    static void writeFile(ArrayList<String> employees) {
        if (employees.isEmpty()) return;
        try (BufferedWriter bw = Files.newBufferedWriter(SALINAN, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE)) {
            for (String employee : employees) {
                bw.write(employee);
                bw.newLine();
            }
            System.out.println("Berhasil menulis ke " + SALINAN);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
