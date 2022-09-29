package rs.ac.bg.etf.pp1;

import rs.etf.pp1.symboltable.concepts.Struct;

public class MyDeclaration{
		
		String name;
		Object decl = null;
		Struct type = null;

		Integer intval = null;
		Boolean boolval = null;
		Character chval = null;
		
		boolean isarray;

		public MyDeclaration(String n, boolean arr) {
			name = n;
			isarray = arr;
		}

		public MyDeclaration(String n) {
			name = n;
			isarray = false;
		}

		public MyDeclaration(String n, Struct t) {
			type = t;
			name = n;
		}

		public MyDeclaration(String n, Struct t, Integer i) {
			type = t;
			name = n;
			intval = i;
		}

		public MyDeclaration(String n, Struct t, Boolean b) {
			type = t;
			name = n;
			boolval = b;
		}

		public MyDeclaration(String n, Struct t, Character c) {
			type = t;
			name = n;
			chval = c;
		}
		
		public String getName() {
			return name;
		}

	}