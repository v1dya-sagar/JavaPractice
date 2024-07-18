package com.vsk.practice.exercise;

/**
 * created by : v1dya-sagar on 18-07-2024
 *
 * @author : v1dya-sagar
 * @date : 18-07-2024
 * @project : JavaPractice
 */
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        boolean returns = false;

        int x = 0, y = 0;

        for(char c : moves.toCharArray()){
            switch(c){
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    continue;
            }
        }
        returns = x == 0 && y == 0 ? true : false;


        return returns;
    }
}
