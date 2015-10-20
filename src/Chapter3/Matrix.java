package Chapter3;

import java.util.Random;


public class Matrix {
    Random rand = new Random(47);
    private int matrix[][];

    public Matrix(){}
    public int getVertical(){
        return matrix.length;
    }

    public int getHorizontal(){
        return matrix[0].length;
    }

    public Matrix(int row, int column){
        matrix = new int[row][column];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
            
        }
    }
    public int getElement(int i, int j){
        return matrix[i][j];
    }
    public void setElement(int i, int j,int value){
        matrix[i][j]= value;
    }

    public Matrix multiply(Matrix first, Matrix second){
        int ver = first.getVertical();
        int hor = second.getHorizontal();
        int temp = first.getHorizontal();
        if(temp != second.getVertical()){
            System.out.println("Can not by multiply");
            throw new RuntimeException();
        }
        Matrix result = new Matrix(ver, hor);
        for (int i = 0; i <ver ; i++) {
            for (int j = 0; j <hor ; j++) {
                int value = 0;
                for (int k = 0; k <temp ; k++) {
                    value += first.getElement(i,k) * second.getElement(k,i);
                }
                result.setElement(i,j,value);
            }

        }
        return result;
    }


    @Override
    public String toString(){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        return "";
    }
    
 }
