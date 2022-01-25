package com.simplilearn.AccessSpecifier;

import com.simplilearn.AccessSpecifier.AccessSpecifier;

public class ProtectedAccess extends AccessSpecifier{

	public static void main(String[] args) {
		
		ProtectedAccess p=new ProtectedAccess();
		p.display();
		
		//child can access protected property but not private
	}
}
