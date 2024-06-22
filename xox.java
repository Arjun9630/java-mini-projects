import java.util.Scanner;
public class xox {
    String[] xox_Grid = new String[9];
    int[] ref_xox_Grid = new int[9];
    int[] input_verification = new int[9];

    public void ref_printxox_Grid(){
        System.out.println("| " + ref_xox_Grid[0] + " | " + ref_xox_Grid[1] + " | " + ref_xox_Grid[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + ref_xox_Grid[3] + " | " + ref_xox_Grid[4] + " | " + ref_xox_Grid[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + ref_xox_Grid[6] + " | " + ref_xox_Grid[7] + " | " + ref_xox_Grid[8] + " |");
    }
    
    public void printxox_Grid(){
        System.out.println("| " + xox_Grid[0] + " | " + xox_Grid[1] + " | " + xox_Grid[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + xox_Grid[3] + " | " + xox_Grid[4] + " | " + xox_Grid[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + xox_Grid[6] + " | " + xox_Grid[7] + " | " + xox_Grid[8] + " |");
    }

    public int decision(){
        int decision = 0;
        if((xox_Grid[0]+xox_Grid[1]+xox_Grid[2]).equals("XXX")){
        decision = 1;
        }
        else if((xox_Grid[3]+xox_Grid[4]+xox_Grid[5]).equals("XXX")){
            decision = 1;
        }
        else if((xox_Grid[6]+xox_Grid[7]+xox_Grid[8]).equals("XXX")){
            decision = 1;
        }
        else if((xox_Grid[0]+xox_Grid[3]+xox_Grid[6]).equals("XXX")){
            decision = 1;
        }
        else if((xox_Grid[1]+xox_Grid[4]+xox_Grid[7]).equals("XXX")){
            decision = 1;
        }
        else if((xox_Grid[2]+xox_Grid[5]+xox_Grid[8]).equals("XXX")){
            decision = 1;
        }
        else if((xox_Grid[0]+xox_Grid[4]+xox_Grid[8]).equals("XXX")){
            decision = 1;
        }
        else if((xox_Grid[2]+xox_Grid[4]+xox_Grid[6]).equals("XXX")){
            decision = 1;
        }
        else if((xox_Grid[0]+xox_Grid[1]+xox_Grid[2]).equals("OOO")){
            decision = 2;
        }
        else if((xox_Grid[3]+xox_Grid[4]+xox_Grid[5]).equals("OOO")){
            decision = 2;
        }
        else if((xox_Grid[6]+xox_Grid[7]+xox_Grid[8]).equals("OOO")){
            decision = 2;
        }
        else if((xox_Grid[0]+xox_Grid[3]+xox_Grid[6]).equals("OOO")){
            decision = 2;
        }
        else if((xox_Grid[1]+xox_Grid[4]+xox_Grid[7]).equals("OOO")){
            decision = 2;
        }
        else if((xox_Grid[2]+xox_Grid[5]+xox_Grid[8]).equals("OOO")){
            decision = 2;
        }
        else if((xox_Grid[0]+xox_Grid[4]+xox_Grid[8]).equals("OOO")){
            decision = 2;
        }
        else if((xox_Grid[2]+xox_Grid[4]+xox_Grid[6]).equals("OOO")){
            decision = 2;
        }
        return decision;
    }
    
    public static void main(String[] args) {
        xox master = new xox();
        Scanner in = new Scanner(System.in);
        String player1, player2;    // Variable declaration
        char ply1_symbol = 'X';
        char ply2_symbol = 'O';
        int deci;


        System.out.print("Enter name of player1: ");   // Player name input
        player1 = in.nextLine();

        
        System.out.print("Enter name of player2: ");
        player2 = in.nextLine();
        System.out.println();
        System.out.println(player1 + "\'s symbol '" + ply1_symbol + "'");
        System.out.println(player2 + "\'s symbol '" + ply2_symbol + "'");
    
        for(int i = 0; i <= 8; i++){    //Initializing grid!!
            master.ref_xox_Grid[i] = i;
        }
        for(int i = 0; i <= 8; i++){
            master.xox_Grid[i] = " ";
        }
        for(int i = 0; i <= 8; i++){
            master.input_verification[i] = 0;
        }

        System.out.println("\nCell number referance diagram!!");
        master.ref_printxox_Grid();
        System.out.println("\nTIC TAC TOE\n");  //Begining of game
        
//================================================================================================================================================================================//
        int loop_termination_index = 0;
        for(int i = 0; i<=5; i++){
////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print(player1 + "\'s turn - \nChose the cell to insert 'X' = ");
        int cell_no = in.nextInt();
        System.out.println();
        if(master.input_verification[cell_no] == 0){
            master.xox_Grid[cell_no] = "X";
            master.input_verification[cell_no] = 1;
        }
        else{
            System.out.println("Cell number " + cell_no + " is aready taken!");
            System.out.print(player1 + " chose other cell number to insert 'X' = ");
            cell_no = in.nextInt();
            System.out.println();
            if(master.input_verification[cell_no] == 0){
                master.xox_Grid[cell_no] = "X";
                master.input_verification[cell_no] = 1;
            }
            else{
                System.out.println("Ending game please start over!!");
                System.exit(1);
            }
        }
        
        master.printxox_Grid();
        loop_termination_index++;

        deci = master.decision(); //check winner
        if(deci == 1){
            System.out.println(player1 + " wins the match! Tic Tac Toe!");
            System.exit(1);
        }
        else if(deci == 2){
            System.out.println(player2 + " wins the match! Tic Tac Toe!");
            System.exit(1);
        }

        if(loop_termination_index == 9){
            break;
        }
////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print(player2 + "\'s turn - \nChose the cell to insert 'O' = ");
        cell_no = in.nextInt();
        System.out.println();
        if(master.input_verification[cell_no] == 0){
            master.xox_Grid[cell_no] = "O";
            master.input_verification[cell_no] = 1;
        }
        else{
            System.out.println("Cell number " + cell_no + " is aready taken!");
            System.out.print(player2 + " chose other cell number to insert 'O' = ");
            cell_no = in.nextInt();
            System.out.println();
            if(master.input_verification[cell_no] == 0){
                master.xox_Grid[cell_no] = "O";
                master.input_verification[cell_no] = 1;
            }
            else{
                System.out.println("Ending game please start over!!");
                System.exit(1);
            }
        }
        loop_termination_index++;
        master.printxox_Grid();

        deci = master.decision(); //check winner
        if(deci == 1){
            System.out.println(player1 + " wins the match! Tic Tac Toe!");
            System.exit(1);
        }
        else if(deci == 2){
            System.out.println(player2 + " wins the match! Tic Tac Toe!");
            System.exit(1);
        }

        System.out.println("\n\n\nCell number referance diagram \n");
////////////////////////////////////////////////////////////////////////////////////////////
        master.ref_printxox_Grid();
        System.out.println("\n\nCurrent Status = \n");
        master.printxox_Grid();
    }
//================================================================================================================================================================================//
        in.close();
    }
}
