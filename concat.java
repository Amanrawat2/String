class Main {
  public static void main(String[] args) {

    // create string
    String greet = "Hello! ";
    System.out.println("First String: " + greet);

    String name = "World";
    System.out.println("Second String: " + name);

    // join two strings
    String joinedString = greet.concat(name);
    System.out.println("Joined String: " + joinedString);
  }
}
