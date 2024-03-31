public class pattern_adv_Q {

    static void q10_adv_pattern(){
        //Print the pattern
        /*

            *             *
            * *         * *
            * * *     * * *
            * * * * * * * *
            * * * * * * * *
            * * *     * * *
            * *         * *
            *             *

         */
        System.out.println();
        int n = 4;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int i = n ; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void q11_adv_pattern(){
        /*
                    * * * * * 
                  * * * * * 
                * * * * * 
              * * * * * 
            * * * * * 
         */
        System.out.println();
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<= 5-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

        static void q12_hollow_of_q11(){
    /*
                    * * * * * 
                  *       * 
                *       * 
              *       * 
            * * * * * 
         */
            System.out.println();
            for(int i = 1; i<=5; i++){
                for(int j = 1; j<= 5-i; j++){
                    System.out.print("  ");
                }
                if(i==1 || i==5){
                for(int j = 1; j<=5; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int j = 1; j<=3; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
                System.out.println();
            }
        }

        static void q13_number_pyramid(){
            /*
                    1 
                   2 2
                  3 3 3
                 4 4 4 4
                5 5 5 5 5
             */
            System.out.println();
            for(int i= 1; i<=5; i++){
                //spaces
                for(int j = 1; j<= 5-i; j++){
                    System.out.print(" ");
                }
                // numbers
                for(int j = 1; j<=i; j++){
                    System.out.print(i+" ");
                }
                //new line
                System.out.println();
            }
        }

        static void q14_palindrome_number_pyramid(){
            /*
                            1
                          2 1 2
                        3 2 1 2 3
                      4 3 2 1 2 3 4
                    5 4 3 2 1 2 3 4 5 
             */
            System.out.println();
            for(int i= 1; i<=5; i++){
                //spaces
                for(int j = 1; j<= 5-i; j++){
                    System.out.print("  ");
                }
                // numbers

                for(int k = i; k>=1; k--){
                    System.out.print(k + " ");
                }
                for(int k = 1; k<=i; k++){
                    if(k==1){
                        continue;}
                    System.out.print(k + " ");
                }
                    
                //new line
                System.out.println();
            }
        }

        static void q15_diamond(){
            /*
                    * 
                  * * * 
                * * * * * 
              * * * * * * * 
              * * * * * * * 
                * * * * * 
                  * * * 
                    *
             */
            System.out.println();
            for(int i= 1; i<=4; i++){
                //spaces
                for(int j = 1; j<= 5-i; j++){
                    System.out.print("  ");
                }
                // numbers
                    for(int j = 0; j<(2*i-1); j++){
                        System.out.print("* "); 
                    }
                
                //new line
                System.out.println();
            }
            for(int i= 4; i>=1; i--){
                //spaces
                for(int j = 1; j<= 5-i; j++){
                    System.out.print("  ");
                }
                // numbers
                    for(int j = 0; j<(2*i-1); j++){
                        System.out.print("* "); 
                    }
                
                //new line
                System.out.println();
            }
        }


    public static void main(String[] args){
        q10_adv_pattern();
        q11_adv_pattern();
        q12_hollow_of_q11();
        q13_number_pyramid();
        q14_palindrome_number_pyramid();
        q15_diamond();
    }
}
