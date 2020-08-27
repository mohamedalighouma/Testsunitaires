package com.areyes1.junitreport.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class JUnitReportServiceExampleTest {


	private JUnitReportServiceExample junitAssertEqualsServiceSample;
	private ServiceObject serviceObject;
	@Before
	public void setData() {
		serviceObject = new ServiceObject();
		junitAssertEqualsServiceSample = new JUnitReportServiceExample();
		junitAssertEqualsServiceSample.initiateMetaData(serviceObject);
	}

	@Test
	public void testAssertEqualsFalse() {
		junitAssertEqualsServiceSample.processObject(serviceObject);
		assertEquals(serviceObject,this.serviceObject);
		
		//	processed the item
	//	ServiceObject newServiceObject = new ServiceObject();
		////junitAssertEqualsServiceSample.initiateMetaData(newServiceObject);
		//junitAssertEqualsServiceSample.processObject(serviceObject);
		//assertEquals(serviceObject,newServiceObject);
	}
	
	@Test
	public void testAssertEquals() {
		junitAssertEqualsServiceSample.processObject(serviceObject);
		assertEquals(serviceObject,this.serviceObject);
	}

	@Test
	public void testAssertEqualsWithMessage() {
		junitAssertEqualsServiceSample.processObject(serviceObject);
		assertEquals(serviceObject,this.serviceObject);
		
		//junitAssertEqualsServiceSample.processObject(serviceObject);
		//assertEquals(
			////	"Same Object",
				//serviceObject,serviceObject);
	}
	@Test
	public void testAssertEqualsFalseWithMessage() {
junitAssertEqualsServiceSample.processObject(serviceObject);
		assertEquals(serviceObject,this.serviceObject);
	}


	
}
