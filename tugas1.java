public class tugas1 {

    public static void main(String[] args) {

        //Case 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 2 || j == 4) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        System.out.print("\n");
    }
}