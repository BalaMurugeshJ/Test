package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Singleton {

	private static Singleton obj;

    private Singleton() {
        System.out.println("Singleton Instance Created!");
    }

    public static Singleton getInstance() {
        if (obj == null) { 
        	System.out.println(obj);
            obj = new Singleton();
            System.out.println(obj);
        }
        return obj;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton Instance!");
    }
}

enum singletonenum{
	INSTANCE;
	int i;
	void show() {
		System.out.println(i);
	}
}

public class test {
    public static void main(String[] args) {

    	Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();
        obj2.showMessage();

        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Objects are different instances.");
        }
        
        singletonenum oobj1 = singletonenum.INSTANCE;
        oobj1.i = 5;
        oobj1.show();
        
        singletonenum oobj2 = singletonenum.INSTANCE;
        oobj2.i = 6;
        oobj2.show();
        
        oobj1.show();
        
        
        List<String> names = Arrays.asList("John", "Alex", "Emma");

        // Without Lambda
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sorted without lambda: " + names);

        // Using Lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted with lambda: " + names);
        
    }
}
