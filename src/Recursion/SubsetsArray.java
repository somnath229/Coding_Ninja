package Recursion;

public class SubsetsArray {
    public static void main(String[] args) {
        int arr[] = {15, 20, 12};
        int[][] arrFinal = subsets(arr, 0);
        for (int i = 0; i < arrFinal.length; i++) {
            for (int j = 0; j < arrFinal[i].length; j++) {
                System.out.print(arrFinal[i][j]);

            }
            System.out.println();
        }
        System.out.println(arrFinal.length);

    }

    private static int[][] subsets(int[] input, int start) {
        if (start == input.length) return new int[1][0];

        int[][] smallAns = subsets(input, start + 1);
        int[][] arrFinal = new int[smallAns.length * 2][];


        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            arrFinal[k] = new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++) {
                arrFinal[k][j] = smallAns[i][j];
            }
            k++;

        }
        for (int i = 0; i < smallAns.length; i++) {
            arrFinal[k] = new int[smallAns[i].length + 1];
            arrFinal[k][0] = input[start];
            for (int j = 1; j <= smallAns[i].length; j++) {
                arrFinal[k][j] = smallAns[i][j-1];
            }
            k++;
        }
            return arrFinal;
        }
    }

