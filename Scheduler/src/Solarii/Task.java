package Solarii;

import Display;
import Tasktype;

public class Task {


    public static void main(String[] args){
        String[] quick = {"Fix Weather Node", "Process Data", "Run Diagnostics", "Store Artifacts", "Upload Data"};
        String[] prolonged = {"Align Engine Output", "Fuel Engines", "Reboot Wifi"};
        String[] visual = {"Clear Asteroids", "Empty Garbage", "Prime Shields", "Submit Scan"};
        String[] common = {"Enter Id Code", "Fix Wiring","Insert Keys", "Scan Boarding Pass", "Swipe Card"};

        Display.qset = quick[Tasktype.qran];
        Display.pset = prolonged[Tasktype.pran];
        Display.vset = visual[Tasktype.vran];
        Display.cset = common[Tasktype.cran];
    }
}