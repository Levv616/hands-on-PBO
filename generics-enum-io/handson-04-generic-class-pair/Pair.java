public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void showTypes() {
        System.out.println(first.getClass().getName() + " & "
                + second.getClass().getName());
    }

    // Tipe berbeda, jadi hasil swap bertipe Pair<T2, T1>
    public Pair<T2, T1> swap() {
        return new Pair<T2, T1>(second, first);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<Integer, String>(90, "Andi");
        Pair<Double, Boolean> p2 = new Pair<Double, Boolean>(3.14, true);

        p1.showTypes();
        p2.showTypes();
        System.out.println(p1 + " -> " + p1.swap());
        System.out.println(p2 + " -> " + p2.swap());
    }
}
