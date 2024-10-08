/*Day 4 - Question 2*/
/*https://neetcode.io/problems/valid-sudoku*/
/*You are given a a 9 x 9 Sudoku board board. A Sudoku board is valid if the following rules are followed:

Each row must contain the digits 1-9 without duplicates.
Each column must contain the digits 1-9 without duplicates.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
Return true if the Sudoku board is valid, otherwise return false */

import java.util.*;
public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {

        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> squares = new HashMap<>();

        for(int r =0 ;r<9;r++){
            for(int c=0;c<9;c++){
                char cell = board[r][c];
                if(cell == '.')continue;

                if(rows.getOrDefault(r, new HashSet<>()).contains(cell)
                        || cols.getOrDefault(c, new HashSet<>()).contains(cell)
                        || squares.getOrDefault((r/3)*3 +c/3 , new HashSet<>()).contains(cell)){
                    return false;
                }
                cols.computeIfAbsent(c, k-> new HashSet<>()).add(cell);
                rows.computeIfAbsent(r, k-> new HashSet<>()).add(cell);
                squares.computeIfAbsent((r/3)*3+c/3, k-> new HashSet<>()).add(cell);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }
}
