/*
 * LoadRunner Java script. (Build: 3020)
 * 
 * Script Description: 
 *                     
 */

import lrapi.lr;

public class Actions
{

	public int init() throws Throwable {
		

	

return 0;
	}//end of init


	public int action() throws Throwable {
		
		
       
	lr.start_transaction("SingletoneGet");

		
		
		SingletoneGet get = new SingletoneGet();
        get.xPopulate();
        get.testGet();

	lr.end_transaction("SingletoneGet", lr.AUTO);


	lr.start_transaction("SingletoneChange");

        SingletoneChange change = new SingletoneChange();
        change.xPopulate();
        change.testChange(10,"test");

	lr.end_transaction("SingletoneChange", lr.AUTO);
        
        return 0;
	}//end of action


	public int end() throws Throwable {
		return 0;
	}//end of end
}
