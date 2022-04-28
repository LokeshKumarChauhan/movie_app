package moviebookingapp;

public class DemoExample {
	package collectionsAndArray;

import collectionsAndArray.Test1;
import collectionsAndArray.Test2;

class Test1<T>{
	    T a, b;
	    public void setData(T x, T y){
	        a = x;
	        b = y;
	    }

	    public void display(){
	        System.out.println(a + "  "+b);
	    }
	}

	class Test2<T,T1>{
	    T a;
	    T1 b;
	    public void setData(T x, T1 y){
	        a = x;
	        b = y;
	    }

	    public void display(){
	        System.out.println(a + "  "+b);
	    }
	}
	public class Generics {
	    public static void main(String[] args) {
	        Test1<Integer> obj= new Test1<>();
	        obj.setData(100,200);
	        obj.display();
	        Test1<String>obj1= new Test1<>();
	        obj1.setData("Sunil","Gavaskar");
	        obj1.display();


	        Test2<String,Integer>obj3= new Test2<>();
	        obj3.setData("Sunil",10000);
	        obj3.display();

	    }
	}

}
