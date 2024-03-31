class pattern_Q{
    static void q1_Rectangle(){
        //Rectangle of dimension 5x4
        /*
            * * * * *
            * * * * *
            * * * * *
            * * * * *
         */
        System.out.print("\n");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void q2_hollow_Recatngle(){
        //Hollow Rectangle of dimension 5x4
        /*
            * * * * *
            *       *
            *       *
            * * * * *
         */
        System.out.print("\n");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<5; j++){
                if(i==0 || i==3 || j==0 || j ==4){
                System.out.print("* ");
                }
                else{
            System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    static void q3_right_triangle(){
        //Right angled triangle of side 4
        /*
            *
            * *
            * * *
            * * * *
         */
        System.out.print("\n");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void q4_inverted_right_triangle(){
        //Inverted right angled triangle of side 4
        /*
            * * * *
            * * *
            * *
            *
         */
        System.out.print("\n");
        for(int i = 3; i>=0; i--){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void q5_vertically_inverted_right_triangle(){
        /*
                   *
                 * *
               * * *
             * * * * 
         */
        System.out.print("\n");
        int s = 3;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<s-i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void q6_triangle_with_numebers(){
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
        System.out.print("\n");
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    static void q7_tvertically_inverted_triangle_with_numebers(){
        /*
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
         */
        System.out.print("\n");
        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    static void q8_triangle_with_numebers(){
        /*
            1
            2   3
            4   5   6
            7   8   9   10
            11  12  13  14  15
         */
        System.out.print("\n");
        int sum = 0;
        for(int i = 1; i<=5; i++){
            if(i==5){
                for(int j=1;j<=i;j++){
                    sum += 1;
                    System.out.print(sum + "  ");
                }
            break;
            }
            for(int j = 1; j<=i; j++){
                sum += 1;
                System.out.print(sum + "   ");
            }
            System.out.print("\n");
        }
    }

    static void q9_triangle_with_0_1(){
        /*
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1 
         */
        System.out.print("\n\n");
        int a = 1;
        for(int i = 1; i<=5; i++){
            if(i % 2 == 0){
                a = 0;
            }
            else{
                a = 1;
            }
            for(int j = 1; j<=i; j++){
                System.out.print(a + " ");
                if(a == 1){
                    a = 0;
                }
                else{
                    a = 1;
                }
            }
            System.out.print("\n");
        }
    }

    
    public static void main(String[] args){
        q1_Rectangle();
        q2_hollow_Recatngle();
        q3_right_triangle();
        q4_inverted_right_triangle();
        q5_vertically_inverted_right_triangle();
        q6_triangle_with_numebers();
        q7_tvertically_inverted_triangle_with_numebers();
        q8_triangle_with_numebers();
        q9_triangle_with_0_1();
    }
}