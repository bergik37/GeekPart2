package lessons2;

public class Solution {
        private String[][] arr;

        public String[][] getArr() {

            return arr;
        }
        public void setArr(String[][] arr) throws MyArraySizeException {

            if(arr.length==4) {
                this.arr = arr;
            }
            else
                throw new MyArraySizeException();
        }
        public class MyArraySizeException extends Exception {

            @Override
            public String getMessage() {
                return super.getMessage();
            }
        }
        public class MyArrayDataException extends Exception {

            @Override
            public String getMessage() {
                return super.getMessage();
            }
        }


        public static void main(String[] args)  {

            Solution solution=new Solution();
            String arr[][]= new String[5][5];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = "2.2";
                }
            }


            try {
                solution.setArr(arr);
                for (int i = 0; i < solution.getArr().length; i++) {
                    for (int j = 0; j < solution.getArr()[0].length; j++) {
                        System.out.print(" " + arr[i][j]+ " ");
                    }
                    System.out.println();
                }
            } catch (MyArraySizeException e) {
                e.printStackTrace();
                System.out.println("Плохо");
            }

        }
    }

