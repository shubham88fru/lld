package designpatterns.coffeepoweredcrew.structural.bridge;

//This is the implementor. 
//Note that this is also an interface
//As implementor is defining its own hierarchy which is not related
//at all to the abstraction hierarchy. 
public interface LinkedList<T> {
	
	void addFirst(T element);
	
	T removeFirst();
	
	void addLast(T element);
	
	T removeLast();
	
	int getSize();
}
