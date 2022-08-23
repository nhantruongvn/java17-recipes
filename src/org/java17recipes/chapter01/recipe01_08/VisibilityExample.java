package org.java17recipes.chapter01.recipe01_08;

class TestClass {
    private long visibleOnlyInThisClass;

    // By default, if no modifier has
    // been specified, the class or member is made package-private, meaning that only other
    // classes within the package have access to the member.
    // If a class member is specified as protected, then it is also package-private,
    // except that any subclass of its class in another package also has access.
    double visibleFromEntirePackage;



    void setLong (long val) {
        visibleOnlyInThisClass = val;
    }

    long getLong () {
        return visibleOnlyInThisClass;
    }
}

public class VisibilityExample {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.setLong(32768);
        tc.visibleFromEntirePackage = 3.1415926535;
        System.out.println(tc.getLong());
        System.out.println(tc.visibleFromEntirePackage);
    }
}
