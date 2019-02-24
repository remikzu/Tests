package ZegarBerlinski;

import java.io.IOException;

/**
 * @author nieckarz
 */
public class MengenClockInit {

    static MengenClock mengenCLock = new MengenClock(16 ,51);

    public static void print(){
        for (int i = 0; i <mengenCLock.getHourLine1() ; i++) {
            System.out.print("X");
        }
        System.out.println();
        for (int i = 0; i <mengenCLock.getHourLine2() ; i++) {
            System.out.print("O");
        }
        System.out.println();
        for (int i = 0; i <mengenCLock.getMinutesLine1() ; i++) {
            System.out.print("x");
        }
        System.out.println();
        for (int i = 0; i <mengenCLock.getMinutesLine2() ; i++) {
            System.out.print("o");
        }
    }

    public static void InitClock() throws IOException {
        print();
        //Runtime.getRuntime().exec("cls");

    }

    public static void main(String[] args) throws IOException{
        InitClock();


    }
}