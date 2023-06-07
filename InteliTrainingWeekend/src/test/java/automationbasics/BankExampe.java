package automationbasics;

public class BankExampe {

    public static void main(String[] args) {


        String role = "Manager";
        int noofWorkinDAYS = 10;
        int salary = 0;

        if (role.equalsIgnoreCase("Manager")) {

            salary = 500 * noofWorkinDAYS;
        } else if (role.equalsIgnoreCase("staff")) {
            salary = 300 * noofWorkinDAYS;


        } else if (role.equalsIgnoreCase("Clerk")) {

            salary = 100 * noofWorkinDAYS;

        } else {
            System.out.println("Enter the valid role");
        }

    }
}



