
package Interface;

public interface Labyrinth {
    
    int getRowCount();
    int getColumnCount();
    boolean isFreeAt(int row,int col);
    boolean isWallAt(int row,int col);
    int getStartCell();
    int getFinishCell();
}
