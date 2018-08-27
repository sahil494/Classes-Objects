class Static {
 static int i;
 int j;
  static {
    i = 10;
     System.out.println("static block called ");
    }
    Static(){
    System.out.println("Constructor called");
    }
}
 
class Test {
    public static void main(String args[]) {
       Static t1 = new Static();
       Static t2 = new Static();
    }
}
