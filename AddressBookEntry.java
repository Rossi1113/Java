public class AddressBookEntry{
    String firstName;
    String lastName;
    String telephoneNumber;
    String eMailAddress;    
    void print(){
      System.out.println("Name:   " + firstName + " " + lastName);
      System.out.println("Tel:   " + telephoneNumber);
      System.out.println("E-Mail: " + eMailAddress);
    }
    public static void main(String[] args){
      AddressBookEntry jeff = new AddressBookEntry();
      jeff.firstName = "Jeffrey";
      jeff.lastName  = "Huang";
      jeff.telephoneNumber = "123-456-7890";
      jeff.eMailAddress = "HuangJeff@gmail.com";
      jeff.print();
     }
}

