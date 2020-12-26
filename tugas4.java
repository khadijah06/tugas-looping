public class tugas4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {

                System.out.println(j);
            }
        }
    }