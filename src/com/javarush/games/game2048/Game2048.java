package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
    }

    private void createNewNumber() {
        int score = getMaxTileValue();
        if (score == 2048) {
            win();
        }
        boolean isCreated = false;
        do {
            int x = getRandomNumber(SIDE);
            int y = getRandomNumber(SIDE);
            if (gameField[y][x] == 0) {
                gameField[y][x] = getRandomNumber(10) < 9 ? 2 : 4;
                isCreated = true;
            }
        }
        while (!isCreated);
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        String str = value > 0 ? "" + value : "";
        setCellValueEx(x, y, color, str);
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.WHITE;
            case 2:
                return Color.PLUM;
            case 4:
                return Color.SLATEBLUE;
            case 8:
                return Color.DODGERBLUE;
            case 16:
                return Color.DARKTURQUOISE;
            case 32:
                return Color.MEDIUMSEAGREEN;
            case 64:
                return Color.LIMEGREEN;
            case 128:
                return Color.DARKORANGE;
            case 256:
                return Color.SALMON;
            case 512:
                return Color.ORANGERED;
            case 1024:
                return Color.DEEPPINK;
            case 2048:
                return Color.MEDIUMVIOLETRED;
            default:
                return Color.NONE;
        }
    }
    private void drawScene() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private boolean compressRow(int[] row) {
        boolean result = false;
        int temp = 0;
        int[] newArr = new int[row.length];
        for (int j : row) {
            if (j > 0) {
                newArr[temp] = j;
                temp++;
            }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i] != newArr[i]) {
                result = true;
                row[i] = newArr[i];
            }
        }
        return result;
    }

    private boolean mergeRow(int[] row) {
        boolean isTrue = false;
        for (int i = 0; i < SIDE-1; i++) {
            if (row[i]==row[i+1] && row[i]!=0) {
                row[i]+=row[i+1];
                row[i+1] = 0;
                isTrue = true;
                score += row[i];
                setScore(score);
            }
        }
        return isTrue;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                setScore(0);
                score = 0;
                isGameStopped = false;
                createGame();
                drawScene();
            }
            return;
        }
        if (!canUserMove()) {
            gameOver();
        }else if (key == Key.LEFT) {
            moveLeft();
            drawScene();
        } else if (key == Key.RIGHT) {
            moveRight();
            drawScene();
        } else if (key == Key.UP) {
            moveUp();
            drawScene();
        } else if (key == Key.DOWN) {
            moveDown();
            drawScene();
        }
    }

    private void moveLeft() {
        boolean a;
        boolean b;
        boolean c;
        boolean isChanged = false;
        for (int[] row : gameField) {
            a = compressRow(row);
            b = mergeRow(row);
            c = compressRow(row);
            if (a || b || c) {
                isChanged = true;
            }
        }
        if (isChanged) {
            createNewNumber();
        }
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private boolean canUserMove() {
        boolean canMove = false;
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (gameField[x][y]==2048) {
                    canMove = true;
                }
                if (gameField[x][y]==0) {
                    canMove = true;
                } else if (x < SIDE-1 && gameField[x][y]==gameField[x+1][y]) {
                    canMove = true;
                } else if (y < SIDE-1 && gameField[x][y]==gameField[x][y+1]) {
                    canMove = true;
                }
            }
        }
        return canMove;
    }

    private void rotateClockwise() {
        int[][] newField = new int[SIDE][SIDE];
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                newField[x][y] = gameField[SIDE-1-y][x];
            }
        }
        gameField = newField;

    }

    private int getMaxTileValue() {
        int maxValue = 0;
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (gameField[x][y] > maxValue) {
                    maxValue = gameField[x][y];
                }
            }
        }
        return maxValue;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "You win", Color.GREEN, 50);
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "You lose", Color.RED, 50);
    }
}
