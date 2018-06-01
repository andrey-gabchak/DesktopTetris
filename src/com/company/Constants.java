package com.company;

final class Constants {
    static final String TITLE_OF_PROGRAM = "Tetris";
    static final int BLOCK_SIZE = 25;
    static final int ARC_RADIUS = 6;
    static final int FIELD_WIDTH = 10;
    static final int FIELD_HEIGHT = 18;
    static final int START_LOCATION = 180;
    static final int FIELD_DX = 7; // determined experimentally
    static final int FIELD_DY = 26;
    static final int LEFT = 37; // key codes
    static final int UP = 38;
    static final int RIGHT = 39;
    static final int DOWN = 40;
    static final int SHOW_DELAY = 400; // delay for animation
    static final int[][][] SHAPES = {
            {{0,0,0,0}, {1,1,1,1}, {0,0,0,0}, {0,0,0,0}, {4, 0x00f0f0}}, // I
            {{0,0,0,0}, {0,1,1,0}, {0,1,1,0}, {0,0,0,0}, {4, 0xf0f000}}, // O
            {{1,0,0,0}, {1,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0x0000f0}}, // J
            {{0,0,1,0}, {1,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xf0a000}}, // L
            {{0,1,1,0}, {1,1,0,0}, {0,0,0,0}, {0,0,0,0}, {3, 0x00f000}}, // S
            {{1,1,1,0}, {0,1,0,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xa000f0}}, // T
            {{1,1,0,0}, {0,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xf00000}}  // Z
    };

}
