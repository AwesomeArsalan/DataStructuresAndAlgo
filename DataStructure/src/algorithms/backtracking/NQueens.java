package algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		solveNQueens(4);
	}

	public static List<List<String>> solveNQueens(int n) {
		char[][] board = new char[n][n];
		List<List<String>> listOfStringList = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '.';
			}
		}
		solveNQueensRecursively(board, 0, listOfStringList);
		System.out.println(listOfStringList);
		return listOfStringList;
	}

	public static void solveNQueensRecursively(char[][] board, int row, List<List<String>> listOfStringList) {
		if (row == board.length) {
			addToListOfListOfString(board, listOfStringList);
			return;
		}
		for (int col = 0; col < board.length; col++) {

			if (isPlacmentSafe(board, row, col)) {
				board[row][col] = 'Q';
				solveNQueensRecursively(board, row + 1, listOfStringList);
				board[row][col] = '.';
			}
		}
	}

	public static boolean isPlacmentSafe(char[][] board, int row, int col) {
		// check for vertical attack
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}
		// check for left upper diagonal
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		// check for right upper diagonal
		for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		return true;
	}

	public static void addToListOfListOfString(char[][] board, List<List<String>> listOfStringList) {
		List<String> stringList = new ArrayList<>();
		for (char[] arr : board) {
			String solution = String.valueOf(arr);
			stringList.add(solution);
		}
		listOfStringList.add(stringList);
	}
}
