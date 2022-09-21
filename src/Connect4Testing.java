import java.util.Arrays;

public class Connect4Testing {

    //IMPORTANT: IF POSTING ON CODEPOST, PUT TWO SPACES AT THE END OF EVERY LINE IN ORDER TO PRESERVE LINE BREAKS




    /*
    Try changing boolean below to true if initial testing isn't working.
     */
    private static boolean tryTramposingMatrix = true;

    //set this to true to display the error messages you get when running with transposed matrix
    //set to false to display error messages for non-transposed matrix (the normal tests)
    private static boolean areTransposedTestsPrimarilyWorking = true;

    public static void main(String args[]){
        int[][][][] tests = new int[][][][]{
                //#0
                {
                        {
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0}
                        },
                        {{0}}
                },
                //#1
                {
                        {
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {1, 0, 0, 0, 0, 0, 0},
                                {1, 0, 0, 0, 0, 0, 2},
                                {1, 0, 0, 0, 0, 0, 2},
                                {1, 0, 0, 0, 0, 0, 2}
                        },
                        {{1}}
                },
                //#2
                {
                        {
                                {0, 0, 0, 0, 0, 0, 2},
                                {0, 0, 0, 0, 0, 0, 2},
                                {0, 0, 0, 0, 0, 0, 2},
                                {1, 1, 0, 0, 0, 0, 2},
                                {2, 2, 1, 0, 0, 0, 1},
                                {1, 1, 1, 0, 0, 0, 2}
                        },
                        {{2}}
                },
                //#3
                {
                        {
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {2, 2, 2, 0, 0, 0, 0},
                                {1, 1, 1, 1, 0, 0, 0},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{1}}
                },
                //#4
                {
                        {
                                {1, 1, 1, 2, 2, 2, 2},
                                {1, 1, 2, 2, 2, 1, 2},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1},
                                {1, 2, 1, 2, 1, 2, 1},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{2}}
                },
                //#5
                {
                        {
                                {2, 1, 2, 1, 2, 0, 1},
                                {2, 2, 1, 2, 1, 2, 1},
                                {1, 2, 1, 2, 1, 2, 1},
                                {1, 2, 1, 2, 1, 2, 1},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{1}}
                },
                //#6
                {
                        {
                                {2, 2, 2, 1, 0, 1, 0},
                                {2, 2, 1, 2, 1, 2, 1},
                                {1, 2, 1, 2, 1, 2, 1},
                                {1, 2, 1, 2, 1, 2, 1},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{2}}
                },
                //#7
                {
                        {
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 2, 0, 1, 0, 0, 0},
                                {1, 2, 1, 2, 1, 2, 1},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{1}}
                },
                //#8
                {
                        {
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {1, 2, 1, 2, 0, 0, 2},
                                {1, 2, 1, 2, 1, 2, 1},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{2}}
                },
                //#9
                {
                        {
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {2, 0, 0, 0, 0, 0, 0},
                                {1, 2, 1, 2, 1, 2, 1},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{2}}
                },
                //#10
                {
                        {
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0},
                                {0, 2, 0, 1, 0, 0, 0},
                                {1, 2, 1, 2, 1, 2, 1},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{1}}
                },
                //#11
                {
                        {
                                {2, 1, 2, 1, 2, 1, 2},
                                {2, 2, 1, 2, 1, 2, 1},
                                {1, 2, 1, 2, 1, 2, 1},
                                {1, 2, 1, 2, 1, 2, 1},
                                {2, 1, 2, 1, 2, 1, 2},
                                {1, 2, 1, 2, 1, 2, 1}
                        },
                        {{3}}
                }
        };


        int testNum = 0;
        System.out.println("Here are the test results for what your checkForWinner method is returning for various board configurations: ");
        for(int[][][] test : tests){
            System.out.println("Test #"+testNum+"  ");
            printConductedTest(test);
            System.out.println("- - - - - - - - - - - - -  ");
            testNum++;
        }

    }

    public static int[][] transposeMatrix(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] transposedMatrix = new int[n][m];

        for(int x = 0; x < n; x++) {
            for(int y = 0; y < m; y++) {
                transposedMatrix[x][y] = matrix[y][x];
            }
        }

        return transposedMatrix;
    }

    public static void printConductedTest(int[][][] test){
        for(int[] row : test[0]){
            System.out.println("`"+Arrays.toString(row)+"`  ");
        }
        int result = 0;
        String errorMessage = "";
        try{
            //result = Main.checkForWinner(test[0]);
        }catch(Exception e){
            result= -1;
            errorMessage= e.toString()+ " " + (e.getStackTrace())[0].toString() + "  ";
        }
        if(result == -1 && tryTramposingMatrix==true){
            try {
                //result = Main.checkForWinner(transposeMatrix(test[0]));
                if(result==test[1][0][0]){
                    System.out.println("Test worked with transposed matrix.  ");
                    errorMessage="";
                }
                errorMessage="Test worked with transposed matrix.";
            }catch(Exception e){
                result = -1;
                if(areTransposedTestsPrimarilyWorking){
                    errorMessage= e.toString()+ " " + (e.getStackTrace())[0].toString() + "  ";
                }
            }
        }

        /*if(tryTramposingMatrix==false){

        }else{

        }*/
        if(result==test[1][0][0]){
            System.out.println("Test passed.  ");
        }else if(result!=test[1][0][0] && errorMessage.equals("")) {
            System.out.println("Test ****failed****.  ");
            System.out.println("Expected checkForWinner to return " + test[1][0][0] + ", but your checkForWinner method instead returned "+result+". ");
        }else{
            System.out.println("Test ****failed****.  ");
            System.out.println("Expected checkForWinner to return " + test[1][0][0] + ", but your checkForWinner method errored out. Error location is listed below. [NOTE from Madden: I change the name of the class where you start running your code to **Main** for testing purposes. The line number of the error message should match up though with the file you submitted.  ");
            System.out.println(errorMessage);
        }

    }

}
