import java.util.Scanner;

public class ProjectPenggajian {
    static class User {
        String username;
        String password;
        String role;

        public User(String username, String password, String role) {
            this.username = username;
            this.password = password;
            this.role = role;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getRole() {
            return role;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pengguna: ");
        int numUsers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        User[] users = new User[numUsers];

        for (int i = 0; i < numUsers; i++) {
            System.out.println("Masukkan data pengguna ke-" + (i + 1) + ":");
            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            System.out.print("Role: ");
            String role = scanner.nextLine();

            users[i] = new User(username, password, role);
        }

        // Tampilkan data pengguna
        System.out.println("\nData Pengguna:");
        for (User user : users) {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println("Role: " + user.getRole());
            System.out.println();

        scanner.close();
        }
    }
}
