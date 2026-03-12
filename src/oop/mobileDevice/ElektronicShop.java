package oop.mobileDevice;

import oop.school.School;

public class ElektronicShop {

    public static void main(String[] args) {

        mobileDevice nokia = new mobileDevice ("Nokia", "G22", 2020, 400.00, 16, "Grey" );
                 nokia.printTabletDetails();
        mobileDevice sonyEricson = new mobileDevice("Sony Ericson", "JX787", 2016, 550.00, 24, "Black");
                 sonyEricson.printTabletDetails();



    }
}
