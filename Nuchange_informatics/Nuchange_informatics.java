package Internshala_Program;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nuchange_informatics {

    /*
     * Piyush Sharma
     * Git username : piyush97ps
     *
     */

    /**
     * input Format for this program :
     * first line input for the starting point x1 y1
     * Second line input for the Direction orr commands D num, D num, ...
     * D is N,S,E,W
     * num is any natural number
     * Example 1:
     * input:
     * 0 0
     * N 10, E 10, W 10
     * output:
     * 0 10
     * 10
     * Example 2:
     * input:
     * 0 0
     * N 10, S 5
     * output:
     * 0 5
     * 5
     */



    public static void main(String[] args) throws Exception {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String startPoints[] = (br.readLine()).split(" ");
        String commands[] = (br.readLine()).split(", ");

        // x1 and y1 can be negligible
        x2 = x1 = Integer.parseInt(startPoints[0]);
        y2 = y1 = Integer.parseInt(startPoints[1]);

        // Getting and calculating the x2 and y2
        for(String command : commands){
            String com[] = command.split(" ");
            char direction = com[0].toUpperCase().charAt(0);
            int value = Integer.parseInt(com[1]);
            if(direction == 'N'){
                y2 += value;
            } else if(direction == 'S' ){
                y2 -= value;
            } else if(direction == 'E' ){
                x2 += value;
            } else if(direction == 'W' ){
                x2 -= value;
            }
        }

        y2 = Math.abs(y2);
        x2 = Math.abs(x2);

        int displacement = (int) Math.sqrt((Math.pow(x2,2) + Math.pow(y2,2)));

        System.out.println(x2+" "+y2);
        System.out.println(displacement);

    }



}
