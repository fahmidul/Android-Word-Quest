package com.aar.app.wsp.commons;

/**
 * Created by abdularis on 29/06/17.
 */

public class GridIndex {

    public int row;
    public int col;

    public GridIndex(int row, int col) {
        set(row, col);
    }

    public void set(int row, int col) {
        this.row = row;
        this.col = col;
    }

}
