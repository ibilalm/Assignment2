
public class StudentProfiles {
    private String firstname;
    private String lastname;
    private String id;
    private String standing;
    private String email;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private static int count;

    /*public StudentProfiles(String firstname, String lastname, int id, double standing, String email, String address) {
        firstname = firstname;
        lastname = lastname;
        id = id;
        standing = standing;
        email = email;
        address = address;
        count++;
    }*/

    public void getInfo(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
        firstname = a;
        lastname = b;
        id = c;
        standing = d;
        email = e;
        address1 = f;
        address2 = g;
        address3 = h;
        address4 = i;
        count++;
    }


    /*public void getInfo(){
        System.out.println("Firstname: "+firstname);
        System.out.println("Lastname: "+lastname);
        System.out.println("Id: "+id);
        System.out.println("Class Standing: "+standing);
        System.out.println("Email Address: "+email);
        System.out.println("Address: "+address);
}*/
    public void displayInfo(){
        System.out.println("Firstname: "+firstname);
        System.out.println("Lastname: "+lastname);
        System.out.println("Id: "+id);
        System.out.println("Class Standing: "+standing);
        System.out.println("Email: "+email);
        System.out.println("Address: "+address1);
        System.out.println("City: "+address2);
        System.out.println("State: "+address3);
        System.out.println("Zip code: "+address4);
        System.out.println("");
}

    /*private static boolean checkValidId (String id, int len){
        boolean flag=true;
        int i=0;
        if((len)!= 7) {
            flag=false;
        }
        else {
            while(i<len){
                if(!(Character.isDigit(id.charAt(i)))){
                    flag=false;
                    break;
                }
                    else {
                        i++;
                    }flag=true;
                }
            }return flag;
        }*/


    /*public void getFirstname(String a){
        firstname=a;
}
    public void getLastname(String b){
        lastname=b;
    }
    public void getId(int c){
        id=c;
    }
    public void getStanding(String d){
        standing=d;
    }
    public void getEmail(String e){
        email=e;
    }
    public void getAddress(String f){
        address=f;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public int getId(){
        return id;
    }
    public String getStanding(){
        return standing;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }*/

    /*private boolean checkValidFirstname(String firstname){
        char[] name=firstname.toCharArray();
        for (char i : name){
        if(!firstname.equals("[a-z/A-Z]")) {
            System.out.println("Enter valid firstname");
        }
        else {
             return true;
            }
        }

        return false;
    }*/
    /*private boolean verifyEmail(String email)
    {
        if(email.equals(""))
            return false;

        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }*/

public static int incrementCount(){
        count= count+1;
        return (count);
}
}
