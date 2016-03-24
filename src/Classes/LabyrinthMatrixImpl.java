/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.*;

public class LabyrinthMatrixImpl implements Labyrinth {

    private int[][] maze = new int[][]{{-1, 1, 1, 1, 1}, {0, 0, 1, 1, 1}, {1, 0, 1, 1, 1}, {1, 0, 0, 1, 1}, {1, 1, 2, 1, 1}};

    @Override
    public int getRowCount() {
        return maze.length;
    }

    @Override
    public int getColumnCount() {
        return maze[0].length;
    }

    @Override
    public boolean isFreeAt(int row, int col) {
        return (maze[row][col] == 0);
    }

    @Override
    public boolean isWallAt(int row, int col) {
        return (maze[row][col] == 1);
    }

    @Override
    public int getStartCell() {
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                if(maze[i][j]==-1){
                    return i*maze[0].length+j;
                }
            }
        }
        return -3;
    }

    @Override
    public int getFinishCell() {
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                if(maze[i][j]==2){
                    return i*maze[0].length+j;
                }
            }
        }
        return -3;
    }

}
