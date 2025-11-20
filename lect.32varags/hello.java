public class hello {
//    public static int sum(int a, int b){
//     return  a+b;
//    }

//       public static int sum(int a, int b, int c){
//     return  a+b+c;
//    }

//       public static int sum(int a, int b,int c, int d){
   // return  a+b+c+d;
  // }

  static int sum(int ...arr){
    // Available as int [] arr
    int result = 0;
    for(int a: arr){
        result += a;

    }
    return result;
  }


    public static void main(String[] args) {
        System.out.println("Welcome to the varags");
        System.out.println("the sum of 5 and 6 is: " +  sum(5, 6));

        System.out.println("the sum of 5 and 6 is: " +  sum(5, 6));
        System.out.println("the sum of 5 , 6 and 9 is: " + sum(5,6,9));
        System.out.println("the sum of 5,6,9,and 7 is " +sum(5,6,9,7));
}
}