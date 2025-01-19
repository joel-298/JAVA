// TIME COMPLEXITY DEMO 


public class TimeComplexityDemo {
    public static void main(String[] args) {
        int n = 10000;
        int i = 0;

        System.out.println("G10");//0(1)
        System.out.println("G10");
        System.out.println("G10");
        System.out.println("G10");

        for(i = 0;i < n;i++)
        {
            //0(n)
            System.out.println("G10");
        }

        while (i <= n) {
            //o(log n) base 2
            System.out.println("Hey");
            i *= 2;
        }










        while (n > 0) {
            //O(log n) base 2
            System.out.println("Hey");
            n /= 2;
        }

        while (i <= n) {
            //O(n)
            System.out.println("Hey");
            i += 2;
            i += 3;
        }
        while (i <= n) {
            //O(log n)base 6
            System.out.println("Hey");
            i *= 2;
            i *= 3;
        }

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                //O(n^2)
                System.out.println("hey");
            }
        }

        for (i = 1; i * i <= n; i++) {
            //(sqrt(n))
            System.out.println("hey");
        }

        //O(n^4)
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i * i; j++) {
                for (int k = 1; k <= n / 2; k++) {
                    System.out.println("hey");
                }
            }
        }

        //O(n^2 log n)
        for (i = n / 2; i <= n; i++) {
            for (int j = 1; j <= n / 2; j++) {
                for (int k = 1; k <= n; k = k * 2) {
                    System.out.println("hey");
                }
            }
        }
    }
}