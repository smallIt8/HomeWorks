package src.edu.lukyanov.task4.class2;

import java.util.Arrays;
import static src.edu.lukyanov.task4.util.Random.getRandomDoubToStr;
import static src.edu.lukyanov.task4.util.Random.getRandomName;


public class Array {
    private final int lengthRow = 10;
    private final int lengthColumn = 10;
    private String[][] matrix;
    private String[] mainDiagonal;
    private String[] secondaryDiagonal;
    private String[][] matrixDiagonal;
    private double[] matrixSymbol;
    private String [] stringMatrixSymbol;

    public void start () {
        createMatrix();
        compareDiagonals();
        createMatrixDiagonal();
        createNewStrDoubleSymbol();
    }

    public void createMatrix(){
        matrix = new String[lengthRow][lengthColumn];
        for (int r = 0; r < lengthRow; r++) {
            for (int c = 0; c < lengthColumn; c++) {
                if ((r * lengthColumn + c) % 3 == 2) {
                    matrix[r][c] = getRandomDoubToStr();
                } else {
                    matrix[r][c] = getRandomName();
                }
            }
        }
        System.out.println("Вывод матрицы 10х10:");
        printMatrix();
    }

    public void printMatrix() {
        for (int r = 0; r < lengthRow; r++) {
            for (int c = 0; c < lengthColumn; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public void compareDiagonals() {
        mainDiagonal = new String[lengthRow];
        secondaryDiagonal = new String[lengthRow];
        for (int r = 0; r < lengthRow; r++) {
            mainDiagonal[r] = matrix[r][r];
            secondaryDiagonal[r] = matrix[lengthRow - 1 - r][r];
        }
        System.out.println("Главная диагональ: " + Arrays.toString(mainDiagonal));
        System.out.println("Побочная диагональ: " + Arrays.toString(secondaryDiagonal));
        System.out.println(" ");

        if (Arrays.equals(mainDiagonal, secondaryDiagonal)) {
            System.out.println("Диагонали одинаковы");
        } else {
            System.out.println("Диагонали не одинаковы");
          }
        System.out.println(" ");
    }

    public void createMatrixDiagonal() {
        matrixDiagonal = new String[2][lengthColumn];
        for (int i = 0; i < lengthColumn; i++) {
            matrixDiagonal[0][i] = mainDiagonal[i];
            matrixDiagonal[1][i] = secondaryDiagonal[i];
        }
        System.out.println("Вывод матрицы из диагоналей:");
        printMatrixDiagonal();
    }

    public void printMatrixDiagonal() {
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < lengthColumn; c++) {
                System.out.print(matrixDiagonal[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public void createNewStrDoubleSymbol() {
        matrixSymbol = new double[3];
        stringMatrixSymbol = new String[3];
        int index = 0;
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < lengthColumn; c++) {
                StringBuilder sb = new StringBuilder();
                if (matrixDiagonal[r][c].matches("[a-zA-Z]+")) {
                    sb.append(matrixDiagonal[r][c], 1, 4).append(", ");
                    System.out.print(sb);
                } else {
                    if (index < matrixSymbol.length) {
                        double number = Double.parseDouble(matrixDiagonal[r][c].replace(',', '.'));
                        if (number >= 1.7) {
                            matrixSymbol[index] = Math.ceil(number);
                        } else {
                            matrixSymbol[index] = Math.floor(number);
                        }
                        index++;
                        for (int i = 0; i < matrixSymbol.length; i++) {
                            stringMatrixSymbol[i] = String.valueOf(matrixSymbol[i]);
                        }
                    }
                }
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Вывод массива через знак подчеркивания:");
        printMatrixSymbol();
    }

    public void printMatrixSymbol() {
        String result = String.join("_", stringMatrixSymbol);
        System.out.println(result);
    }
}