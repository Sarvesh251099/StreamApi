package NestedLoop;

import java.lang.reflect.Constructor;

class Student {
    void show() {
        System.out.println("Object created using Constructor.newInstance()");
    }
}

 class Main {
    public static void main(String[] args) throws Exception {
        Constructor<Student> cons = Student.class.getDeclaredConstructor();
        Student s1 = cons.newInstance();
        s1.show();
    }
}
 class Try {

}
