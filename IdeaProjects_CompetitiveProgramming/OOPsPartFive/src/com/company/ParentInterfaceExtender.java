package com.company;

public interface ParentInterfaceExtender extends Parent, Parent2 {

    //One interface may extend one or many other interfaces

    //but one class cant extend more then one class

    //Multiple inheritance is allowed in interfaces and not in classes;

    //interface extends another interfaces
    //class implements interfaces
    //class extends class
    //abstract class also implements interfaces
    //rest see in java crux book cb;

    public void abstractofExtender();
}
