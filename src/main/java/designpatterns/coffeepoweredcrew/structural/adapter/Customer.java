package designpatterns.coffeepoweredcrew.structural.adapter;

/**
 * Target interface required by new client code
 */
public interface Customer {

	String getName();
	
	String getDesignation();
	
	String getAddress();
}
