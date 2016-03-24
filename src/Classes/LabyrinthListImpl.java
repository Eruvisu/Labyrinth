/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.*;

public class LabyrinthListImpl implements Labyrinth {

    private int mazeList[] = new int[]{1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 14, 15, 18, 19, 20, 21, 23, 24};
    private int rowCount = 5;
    private int columnCount = 5;
    private int startCell = 0;
    private int finishCell = 22;

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public boolean isFreeAt(int row, int col) {
        for (int i = 0; i < mazeList.length; i++) {
            if (mazeList[i] == row * columnCount + col) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isWallAt(int row, int col) {
        for (int i = 0; i < mazeList.length; i++) {
            if (mazeList[i] == row * columnCount + col) {
                return true;
            }
        }
        return false;
    }


@Override
        public int getStartCell() {
        return startCell;
    }

    @Override
        public int getFinishCell() {
        return finishCell;
    }

}
