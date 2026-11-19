public class Main {
    public static void main(String[] args) {
        GradeCalculator calc = new GradeCalculator();
        GradeReportPrinter printer = new GradeReportPrinter();
        GradeRepository repo = new DatabaseGradeRepository();

        double nilai = calc.hitungNilaiAkhir(80, 85, 90);
        printer.cetakLaporan("Andi", nilai);
        repo.simpan("Andi", nilai);
    }
}
