package sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame game) throws IOException;
//    SudokuGame sudokuGameData() throws IOException;

    SudokuGame getGameData() throws Exception;
}
