public class StaircaseBuilder {
    
    public static void main(String[] args) {

        int d = Integer.parseInt(args[0]);
        int bricks = Integer.parseInt(args[1]);
        String[][] stairCase = new String[d][d];
        


        // Building Stair Case in the 2d Array
        for(int x = 0; x < stairCase[0].length; x++){
            int brickRow = x + 1;
            for(int y = stairCase[0].length-1; y >= 0; y--){
                if(bricks > 0 && brickRow > 0){
                    stairCase[y][x] = "X";
                    bricks--;
                    brickRow--;
                }
                else{
                    stairCase[y][x] = " ";
                }
            }
        }

        
        for(int y = 0; y < stairCase.length; y++){

            for(int x = 0; x < stairCase[0].length; x++){
                System.out.print(stairCase[y][x]);
            }
            System.out.println();
        }

        System.out.println("Bricks remaining: " + bricks);
    }
}
