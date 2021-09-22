package com.comps;

public class Ertiga implements Car{

	//We cannot create Car object without cartyres object
		private CarTyres cartyre;
		
		public Ertiga(CarTyres cartyre) {
			this.cartyre=cartyre;
		}
		@Override
		public void assemble() {
			// TODO Auto-generated method stub
	System.out.println("Ertiga.assemble()::Assembled");
		}

		@Override
		public void roadTest() {
			// TODO Auto-generated method stub
	System.out.println("Ertiga.roadTest()::Road Tested");
		}
		@Override
		public String toString() {
			return "Ertiga Car With [cartyre=" + cartyre + "]";
		}


}
