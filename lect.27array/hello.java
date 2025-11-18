
import javax.sound.sampled.SourceDataLine;

public class hello{
    public static void main(String[] args) {
        int [] marks ={20, 34, 45, 56, 60};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
          System.out.println(marks[2]);
            System.out.println(marks[3]);
              System.out.println(marks[4]);





        // float [] marks ={2.1f, 4.5f, 4.5f, 5.4f, 5.8f };

        //    System.out.println(marks[2]);
        //    System.out.println(marks.length);




        String [] students  = {"dipak", "kuldeep","prince", "raj" ,"sumit" };

        System.out.println(students.length);
        System.out.println(students[2]);
        


        //displying  the narray (for loop)

        for  (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
          }


          //  Quick quiz; displying the array in revese order (for loop)

            for(int i=marks.length -1;i>=0;i--){
                System.out.println(marks[i]);


               // displying the array in revese order (for each loop)

               for(int elements:marks){
               System.out.println(elements);
               }

            
        }
        
    }
}
