package Solarii;

import java.util.Random;
import Solarii.Display;

public class Tasktype {

    public static void main(String[]args){

    int maxquick = 5;
    int maxprolonged = 3;
    int maxvisual = 4;
    int maxcommon = 5;

    Random rng = new Random();

    Display.qran = rng.nextInt(maxquick);
    Display.pran = rng.nextInt(maxprolonged);
    Display.vran = rng.nextInt(maxvisual);
    Display.cran = rng.nextInt(maxcommon);
    }

    public static int qran;
    public static int pran;
    public static int vran;
    public static int cran;
}

