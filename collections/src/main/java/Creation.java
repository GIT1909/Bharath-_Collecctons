import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Creation
{
	private static final Logger logger = LogManager.getLogger(Creation.class);
    private static Scanner sc;

	public static void main(String[] args) 
    {
    	sc = new Scanner(System.in);
    	ImplementaionOfList<Integer> list = new ImplementaionOfList<Integer>();
    	logger.info("Initial list:");
    	logger.info(list);
    	logger.info("Number of elements");
        int noOfAdd=sc.nextInt();
        logger.info("enter elements:");
        for (int i=0;i<noOfAdd;i++)
        {
        	int adding=sc.nextInt();
        	list.add(adding);
        }
        logger.info("list after adding elements:");
        logger.info(list);
        logger.info("enter index to remove");
        int rm;
        rm=sc.nextInt();
        list.remove(rm);
        logger.info("list after removing element:"+list);
         

        logger.info("value at  0 is "+ list.fetch(0));

        logger.info("value at  1 is:"+list.fetch(1));
 
     
        logger.info("total size"+list.size());
    }
}