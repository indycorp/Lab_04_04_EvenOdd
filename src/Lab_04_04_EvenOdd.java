public class Lab_04_04_EvenOdd {
    static void main() {
        int numToExamine = 2;

        IO.println("number to examine " + numToExamine);

        if (numToExamine % 2 == 0) {
            IO.println(numToExamine + " is Even.");
        } else {
            IO.println(numToExamine + " is Odd.");
        }
    }
}


