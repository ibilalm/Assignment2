
import java.util.Arrays;
import java.util.Scanner;
public class DemoStudent {
    public static void main(String[] args) {
        System.out.println("Students Details, Department of ILT");

        String firstname;
        String lastname;
        String id;
        String standing;
        String email;
        String address1;
        String address2;
        String address3;
        String address4;
        boolean flag = false;
        String[] states = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID",
                "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND",
                "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX",
                "UT", "VA", "VT", "WA", "WI", "WV", "WY"};
        String[] year = {"freshman","sophomore", "junior", "senior"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of Students");
        int N = input.nextInt();
        input.nextLine();
        //int count=N;
        int Students[];
        Students = new int[N];
        int i;
        StudentProfiles[] s = new StudentProfiles[N];


        for (i = 0; i < N; i++) {

            s[i] = new StudentProfiles();


            System.out.println("Enter Firstname:");
            firstname = input.nextLine();

            while ( !(firstname.matches("^[a-z/A-Z]*")) ) {
                System.out.println("Enter valid firstname");
                firstname = input.nextLine();

            }

            System.out.println("Enter Lastname:");
            lastname = input.nextLine();
            while ( !(lastname.matches("^[a-z/A-Z]*")) ) {
                System.out.println("Enter valid lastname");
                lastname = input.nextLine();

            }


            System.out.println("Enter Id:");
            id = input.nextLine();
            while ( id.length() != 7 ) {
                System.out.println("Enter a valid id:");
                id = input.nextLine();
            }


            System.out.println("Enter standing:");
            standing = input.nextLine();
            while ( !Arrays.asList(year).contains(standing) ) {
                System.out.println("Enter a valid standing");
                standing = input.nextLine();
            }

            System.out.println("Enter Email:");
            email = input.nextLine();
            while ( !(email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}")) ) {
                System.out.println("enter a valid email");
                email = input.nextLine();
            }

            System.out.println("Enter Address line 1: ");
            address1 = input.nextLine();
            while ( !(address1.matches("\\d{1,}(\\s{1}\\w{1,})(\\s{1}?\\w{1,})+")) ) {
                System.out.println("Enter a valid address:");
                address1 = input.nextLine();
            }

            System.out.println("Enter City");
            address2 = input.nextLine();
            while ( !(address2.matches("[a-zA-Z]*")) ) {
                System.out.println("Enter a valid city:");
                address2 = input.nextLine();
            }

            System.out.println("Enter state:");
            address3 = input.nextLine();
                while ( !Arrays.asList(states).contains(address3) ) {
                    System.out.println("Enter a valid State");
                    address3 = input.nextLine();
                }

            System.out.println("Enter zip code:");
            address4 = input.nextLine();
            while ( !(address4.matches("^\\d{5}$|^\\d{5}\\d{4}$")) ) {
                System.out.println("Enter a valid zipcode:");
                address4 = input.nextLine();
            }
            System.out.println("");

            s[i].getInfo(firstname, lastname, id, standing, email, address1, address2, address3, address4);
        }

                    for (i = 0; i < Students.length; i++) {
                        //System.out.println("Number of students: "+ StudentProfiles.incrementCount() );
                        s[i].displayInfo();
                    }
                    System.out.println("Number of students: " + N);

                }
            }

    /*private static boolean checkValidFirstname(String firstname){
        char[] name=firstname.toCharArray();
        for (char j : name){
            if(!firstname.equals("[a-z/A-Z]")) {
                System.out.println("Enter valid firstname");
            }
            else {
                return true;
            }
        }

        return false;
    }
    private static boolean checkValidLastname(String lastname){
        char[] name=lastname.toCharArray();
        for (char j : name){
            if(!lastname.equals("[a-z/A-Z]")) {
                System.out.println("Enter valid lastname");
            }
            else {
                return true;
            }
        }

        return false;
    }*/

