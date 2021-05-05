//package com.nagarro.business_logics;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//
//
//
//@RunWith(MockitoJUnitRunner.class)
//public class SomeBusinessMockTest {
//	
//	//@InjectMocks
//	//SomeBusinessImpl business;
//	SomeBusinessImpl business=new SomeBusinessImpl();
//	
//	@Mock
//	SomeDtaService dataServicemock;
////	
////	@Before
////	public void before() {
////		business.setSomeDataService(dataServicemock);
////	}
//		
//	@Test
//	public void calculateSumUsingDataSevicesTest() {
//		SomeBusinessImpl someBusinessImpl=new SomeBusinessImpl();
//		//someBusinessImpl.setSomeDataService(new SomeDtaService());
//		int actualResult=someBusinessImpl.calculateSum(new int[] {1,2,3});
//		int expectedResult=6;
//		assertEquals(expectedResult, actualResult);
//	}
//	
//	@Test
//	public void calculateSumUsingDataServiceTest() {
//		
//		
//		when(dataServicemock.retieveDataServices()).thenReturn(new int[] {1,2});
//		//int actualResult=;
//		int expectedResult=3;
//		assertEquals(expectedResult, business.calculateSumUsingDataSevices());
//	}
//	
//	
//
//}
