package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        boolean isCorrect = x1 > -1 && x1 < 8 && y1 > -1 && y1 < 8 && x2 > -1 && x2 < 8 && y2 > -1 && y2 < 8;
        int dist = Math.abs(x2 - x1);
        boolean isDiagonal = dist == Math.abs(y2 - y1);

        if (isCorrect && isDiagonal) {
            System.out.println(dist);
            return dist;
        }
        System.out.println("не слон");
        return 0;
    }

    public static void main(String[] args) {
        ChessBoard.way(7, 2, 4, 5);
    }
}
