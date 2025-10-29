class firstSon {
    final void displayActions() {
        System.out.println("He cry");
    }
}

class secondSon extends firstSon {
    void display() {
        super.displayActions();
        System.out.println("He always cries ");
    }
}

public class Abdirashid {
    public static void main(String[] args) {
        secondSon wish1 = new secondSon();
        wish1.displayActions();
    }
}