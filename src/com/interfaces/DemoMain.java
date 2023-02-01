package com.interfaces;

public class DemoMain {

	public static void main(String args[]) {

		/**
		 * Interface object creation Interface_Name object_name = name
		 * InterfaceImpl_classname();
		 */

		DemoInterface demo = new DemoImpl();
		demo.show();
		demo.get();
	}

}
