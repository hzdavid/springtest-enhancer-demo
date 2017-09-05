package springtestenhancer.demo1.ClassNotFoundException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import springtestenhancer.SpringTestEnhancerContextLoader;
import springtestenhancer.demo.bean.HelloWorld;

/**
 * 
 * Tolerance for ClassNotFoundException
 * 
 * In this applicationContext.xml,   bean with id 'orderDAOService',whose class is not configured properly.
 * but this bean is not related to this test.  
 * So we can ignore it by adding  'loader = SpringTestEnhancerContextLoader.class' to @ContextConfiguration 
 * If not ,this test can't be passed.
 * @author david
 *
 */
@ContextConfiguration(locations = { "./applicationContext.xml" }, loader = SpringTestEnhancerContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloWorldTest {

	@Resource
	private HelloWorld helloWorld;

	@Test
	public void testPrint() {
		Assert.isTrue(helloWorld.print().equals("HelloWorld"));
	}
}
