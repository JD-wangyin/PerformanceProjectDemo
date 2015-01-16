/**
 * 
 */
package com.wangyin.jmeter;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * @author wyhubingyin
 * 
 */
public class JmeterMavenDemo extends AbstractJavaSamplerClient {
	
	
	
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult sampleResult = new SampleResult();
		sampleResult.sampleStart();
		boolean isSuccess = true;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sampleResult.sampleEnd();
		sampleResult.setSuccessful(isSuccess);
		return sampleResult;
	}

}
