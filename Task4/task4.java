package Task4;

public class task4 {

    private static void eightqueens(int[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard.length; j++){
                if (i == 0){
                    chessBoard[0][0] = 1;
                }
                if (i == 1){
                    chessBoard[1][6] = 1;
                }
                if (i == 2){
                    chessBoard[2][4] = 1;
                }
                if (i == 3){
                    chessBoard[3][7] = 1;
                }
                if (i == 4){
                    chessBoard[4][1] = 1;
                }
                if (i == 5){
                    chessBoard[5][3] = 1;
                }
                if (i == 6){
                    chessBoard[6][5] = 1;
                }
                if (i == 7){
                    chessBoard[7][2] = 1;
                }
            }
        }
    }

    private static void print(int[][] chessBoard) {
        System.out.println();
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print("" + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Данная программа расставляет на шахматной 8 ферзей так, чтобы они не били друг друга. ");
        int[][] chessBoard = new int[8][8];
        eightqueens(chessBoard);
        print(chessBoard);
    }

}