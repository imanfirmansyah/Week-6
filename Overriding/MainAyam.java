class Hewan {

    public void makan() {
        System.out.println("Hewan bisa makan");
    }
}

class Ayam extends Hewan {

    @Override
    public void makan() {
        System.out.println("Ayam bisa makan");
        super.makan();
    }
}
public class MainAyam {
    public static void main(String args[]) {
        Hewan ayam = new Hewan();
        Ayam ayamKate = new Ayam();
        ayam.makan();
        ayamKate.makan();
    }
}
