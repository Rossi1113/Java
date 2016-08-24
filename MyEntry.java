public class MyEntry extends AddressBookEntry {
  int age;
  void birthday() {
    age = age + 1;
  }
  void print() {
     super.print();
     System.out.println("Age:  " + age);
     System.out.println();
  }
  public static void main(String[] args) {
     MyEntry rossi = new MyEntry();
     rossi.age = 18;
     rossi.birthday();
     rossi.print();
  }
}
