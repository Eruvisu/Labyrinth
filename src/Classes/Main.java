package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eruvisu
 */
import Interface.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Labyrinth maze=new LabyrinthMatrixImpl();
        LabyrinthView mazeView=new LabyrinthViewImpl();
        mazeView.setLabyrinth(maze);
        mazeView.toString();
    }
    
}