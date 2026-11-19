import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileCopyNew {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path log = Paths.get("log.txt");

        try {
            Files.write(source, List.of("Report Generated", "Status: OK"));

            if (Files.exists(source)) {
                if (Files.notExists(backup.getParent()))
                    Files.createDirectories(backup.getParent());
                Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
                Files.write(log, List.of("Backup berhasil: " + backup),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println("Backup created successfully!");
            } else {
                Files.write(log, List.of("Gagal: source tidak ada"),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
