package com.comps;

public class Swift implements Car {

	//We cannot create Car object without cartyres object
		private CarTyres cartyre;
		
		public Swift(CarTyres cartyre) {
			this.cartyre=cartyre;
		}
		@Override
		public void assemble() {
			// TODO Auto-generated method stub
	System.out.println("Swift.assemble()::Assembled");
		}

		@Override
		public void roadTest() {
			// TODO Auto-generated method stub
	System.out.println("Swift.roadTest()::Road Tested");
		}
		@Override
		public String toString() {
			return "Swift Car With [cartyre=" + cartyre + "]";
		}


}
