public class pattern_advance {
    public static void main(String[] args) {
        
        // Butterfly pattern
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i) ;j++) {
                    System.out.print(" ");
                
            }
            for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i) ;j++) {
                    System.out.print(" ");
                
            }
            for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
        System.out.println();

        // Solid Rhombus

        for(int i=0; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Number Pyramid

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Palindromic pattern

        
        for(int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            for(int j=2; j<=i; j++) {
                System.out.print(j);   
            }

            System.out.println();
        }
        System.out.println();



        // Star pattern

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {

            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
