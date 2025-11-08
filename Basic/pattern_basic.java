public class pattern_basic {

    public static void main(String[] args) {
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                if (i==0 || i==3 || j==0 || j==4) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
                
            }
            System.out.println("");
        }
        System.out.println("");

        //Half Pyramid 

        for(int i = 1; i <= 6 ; i++) {
            for(int j = 1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Inverted half pyramid
        for(int i = 1; i<= 6 ; i++) {
            for (int j = 6; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

        //inverted half pyramid rotated by 180 degree very important

        int n = 6;
        for(int i = 1 ; i <= n; i++) //outer loop for rows
        {
            for(int j=1; j<=(n-i); j++ ) {
                System.out.print(" ");
            }
            for( int j = 1 ; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern number print

        for(int i=1; i<=5;i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        int count=1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println();

        // Important -> bit triangle

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1 "); 
                }
                else {
                    System.out.print("0 ");
                }   
            }
            System.out.println();
        }
        System.out.println();
    }
}