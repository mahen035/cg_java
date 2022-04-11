package com.training.cg.dp;

public class FactoryDesign {
	
	public static void main(String args[]) {
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.createNotification("sms");
		notification.notifyUser();
	}

}

// Super class or interface can point to subclass objects

// Factory Design Pattern: It is creational design pattern:
// It says that create an interface and let the subclass decide
// which object to create.

// Singleton Design Pattern: When only one instance of a particular class
// is needed, we go for singleton design pattern.
// This is also creational design pattern.

//: Structural Design Pattern

//1. Decorator Design pattern: It allows to add functionality dynamically 
//   without affecting objects of same class.

//2. Facade Design Pattern:Hides the complexity of the application and provides a simplet
//   interface to the client.


