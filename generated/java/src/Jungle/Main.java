package Jungle;

import org.overture.codegen.runtime.SeqUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Board board = new Board();
        board.startGame();
        Scanner s = new Scanner(System.in);
        while(board.winner == null){
            System.out.println(board);
            System.out.println("It's player " + board.currentPlayer + "'s turn.");
            System.out.println("Make your move: Xi Yi Xf Yf: ");
            String line = s.nextLine();
            String[] parts = line.split(" ");
            board.play(SeqUtil.seq(board.getMaxX()-Long.parseLong(parts[1]),board.getMaxY()-Long.parseLong(parts[0])), SeqUtil.seq(board.getMaxX()-Long.parseLong(parts[3]), board.getMaxY()-Long.parseLong(parts[2])));
        }
        System.out.println(board);
        System.out.println("GAME OVER! Winner: Player " + board.winner);
    }
}