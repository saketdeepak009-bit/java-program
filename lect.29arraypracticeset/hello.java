
import javax.lang.model.util.Elements;

public class hello {
    public static void main(String[] args) {

        //practice problem 1.

        /*
        
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
         for(float element:marks){
        sum = sum + element;
         }
        System.out.println("the value of is " +sum);

         */

       // practice problem 2.


       
        /*
        
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num= 10.f;
        boolean isinarray = false;
         for(float element:marks){
        if(num ==  element){
            isinarray =true;
            break;
        }
         }
         if(isinarray){
            System.out.println("the value is present in the array ");
         }
         else{
                        System.out.println("the value is not present in the array ");

         }

         */


         // practice problem 3.

    /*
         
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
         for(float element:marks){
        sum = sum + element;
         }
        System.out.println("the value of average marks is is " +sum/marks.length);

*/



  // practice problem 4.
 
/* 
  int [][] mat1  = {{1, 2, 3},
                {4, 5, 6}};
  int [][] mat2  = {{2, 6, 13},
                 {3, 7, 1}};

  int [][] result = {{0, 0, 0},
                     {0, 0, 0}};

  for (int i=0;i<mat1.length;i++){  //row number of time
    for(int j=0;j<mat1[i].length;j++){   //column number of time

        System.out.format("setting value for i=%d and j=%d\n", i,j);
       result[i][j] = mat1[i][j] + mat2[i][j];
    }
  }

  
  for (int i=0;i<mat1.length;i++){  //row number of time
    for(int j=0;j<mat1[i].length;j++){   //column number of time

        System.out.print( result[i][j] +  " ");
       result[i][j] = mat1[i][j] + mat2[i][j];
    } 
    

  System.out.println(""); // print a new line
    }

*/



   // practice problem 5.

   /* *

   int [] array = {1, 2, 3, 4, 5, 6};
   int l = array.length;
   int n = Math.floorDiv(l,2);
   int temp;


   for(int i=0; i<n; i++){


    // swap a[i] and a[l-1-i]
    // a   b   temp
    // |4| |3| ||

    temp = array[i];
    array[i] = array[l-1-i];
    array[l-1-i] = temp;
   }
   for(int element: array){
    System.out.println(element + " ");
   } 

   */



  // practice problem 6.

//   int [] array = {1, 21, 3, 455, 5, 34, 67};
//   int max = 0; 
//   for(int element: array){
//     if(element>max){
//         max = element;
//     }
//   }
//    System.out.println("the value of the  meximum element in this array is: " + max);



   //practice problem 7.

boolean  isSorted = true;
   int [] array = {1, 2, 3, 4, 5, 34, 67};
   for(int i=0; i<array.length-1;i++){
    if(array[i] > array[i+1]){
        isSorted = false;
        break;
    }
   }

   if (isSorted){
    System.out.println("the array is sorted ");
   }
   else{
    System.out.println("the array is not sorted ");
   }
}

}


