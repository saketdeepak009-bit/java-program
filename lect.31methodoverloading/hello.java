
import javax.sound.sampled.SourceDataLine;

public class hello {

    static void foo(){
        System.out.println("Good morning bro!");
    }
    
    static void foo(int a){
System.out.println(" Good morning " + a + "bro!");
    }

    static void foo(int a, int b){
        // a aur b parameters
        System.out.println("Good morning " + a + "bro!");
        System.out.println("Good morning " + b + "bro!");
    }
    

    static void change(int a){
        a = 60;
    }

        static void change2(int [] arr){
        arr[0] = 60; 
    }


        static void telljock(){

            System.out.println("I invented a new word!\n" + "piagiarisn!");
        }

            public static void main(String[] args) {

              telljock();
            

            // case 1: changing the integer
               int x = 45;
               change(x);
              System.out.println("  the value x after runing change is " + x);
        


            
            // case 2: changing the array
                int [] marks = {50, 30, 59, 60, 55};
                change2(marks);
               System.out.println("  the value x after runing change is " + marks[0]);





              // method overloading 

             foo();
             foo(5000);
            foo(5000,4000);

            //Argument are actual

            }

        }
    

