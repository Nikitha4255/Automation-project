package test;

import java.awt.AWTException;
import java.net.URL;

import org.testng.annotations.Test;

import base.wpjobbase;
import page.wpjobpage;
import utilities.wpjobutilities;

public class wpjobtest extends wpjobbase {
	
	
	@Test
	public void test1() throws InterruptedException, AWTException {
		wpjobpage ob = new wpjobpage(driver);
		ob.test();
			String xlpath ="C:\\Users\\Vineetha\\Downloads\\wpjob.xlsx";
			String sheet ="sheet1";
			int rowcount =wpjobutilities.getRowcount(xlpath,sheet);
			for(int i=1;i<=rowcount;i++) {
				String email = wpjobutilities.getcellvalue(xlpath, sheet, i, 0);
				String password = wpjobutilities.getcellvalue(xlpath, sheet, i, 1);
	ob.setvalue(email, password);
			}
			ob.afterlogin();
			ob.jobs();
	}

	
}
