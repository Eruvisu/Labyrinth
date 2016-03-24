/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.*;

public class LabyrinthViewImpl implements LabyrinthView {

    private String[][] representation;

    @Override
    public String[][] getLabyrinth() {
        return representation;
    }

    @Override
    public void setLabyrinth(Labyrinth maze) {
        int rCount = maze.getRowCount();
        int cCount = maze.getColumnCount();
        representation = new String[rCount][cCount];
        int finish = maze.getFinishCell();
        int start = maze.getStartCell();
        representation[finish / cCount][finish % cCount] = "F";
        representation[start / cCount][start % cCount] = "S";
        for (int i = 0; i < rCount; i++) {
            for (int j = 0; j < cCount; j++) {
                if (representation[i][j] != "F" && representation[i][j] != "S") {
                    if (maze.isWallAt(i, j)) {
                        representation[i][j] = "*";
                    } else {
                        representation[i][j] = " ";
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < representation.length; i++) {
            for (int j = 0; j < representation[0].length; j++) {
                System.out.print(representation[i][j]);
                if (j < representation[0].length) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return "";
    }

}
