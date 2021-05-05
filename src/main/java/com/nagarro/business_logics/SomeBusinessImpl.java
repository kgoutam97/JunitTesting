package com.nagarro.business_logics;

public class SomeBusinessImpl {
	
	private SomeDtaService someDataService;
	
	

	public void setSomeDataService(SomeDtaService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int a[]) {
		int sum =0;
		for(int b:a) {
			sum +=b;
		}
		return sum;	
	}
	
	public int calculateSumUsingDataSevices() {
		//testing class
		int sum =0;
		int[] data =someDataService.retieveDataServices();
		for(int b:data) {
			sum +=b;
		}
		return sum;	
	}

}
