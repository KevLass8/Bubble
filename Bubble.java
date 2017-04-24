import java.util.ArrayList;
import java.util.Random;


public class Bubble {
    public static void main(String[] args) {
        int size = 8;

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }
int c;
c = 0;
 ArrayList<Integer> list2 = new ArrayList<Integer> (size);
        Random rand = new Random(); // sets rand as random
        while(c != list.size()) {
            int index = rand.nextInt(list.size());
            System.out.println("before bubble sort : "+ list.get(index));
            list2.add(list.get(index));
            
              
        c++; }
        
        System.out.println("This is an unsorted list"+ list2);
        
       

        
        
        
        int a;
        int b;
        int temp;
        int name;
        
        while( true) {     
      a = 0;
      b = 1;
      c =0;
      
        while ( b != 8)
        {  
        if (list2.get(a) > list2.get(b)) {
               temp = list2.get(a) ;
                 name = list2.get(b);
                 list2.set(b, temp);
                 list2.set(a, name);
                 c =1;
                 
                
        
        System.out.println("after bubble sort : " + list2.get(a));
    }
        
    b++;
      a++;
}
        System.out.println("bubbled");
        if ( c ==0 ) {
           System.out.println("I got out");
         break; 
        }
                     
    }
        System.out.println( list2); 
    }
}
