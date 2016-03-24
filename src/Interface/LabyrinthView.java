/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Eruvisu
 */
public interface LabyrinthView {
    String[][] getLabyrinth();
    void setLabyrinth(Labyrinth maze);
    @Override
    public String toString();
}
