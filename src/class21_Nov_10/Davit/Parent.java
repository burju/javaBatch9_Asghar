package class21_Nov_10.Davit;

import class21_Nov_10.Davit.GrandParents;

public class Parent extends GrandParents {
    Parent(){
        System.out.println("Constructor from Parent");

    }

    Parent(int money){
        super(money);
    }

}
