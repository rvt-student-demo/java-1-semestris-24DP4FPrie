public class Chapter60 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();

        public static void ex1() {
            
            int[] val = {0, 1, 2, 3};
    int sum = 0;
    int i;

    for (i = 0; i < val.length; i++) {
        sum += val[i];
    }
 
    System.out.println( "Sum of all numbers = " + sum );
        }

        public static void ex2() {

            int[] val = {13, -4, 82, 17}; 
    int[] twice = {val[0] * 2, val[1] * 2, val[2] * 2, val[3] * 2}; 
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // Construct an array object for twice.

    
    // Put values in twice that are twice the
    // corresponding values in val.


    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
        }

        public static void ex3() {}

        public static void ex4() {}

    }
}
