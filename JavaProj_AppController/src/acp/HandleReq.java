package acp;

/* Handler-type interface. 
 * This allows for data to go from the Helper class to the 
 * App class and eventually out to the user.
 */
public interface HandleReq {
	void execute(String brand, int price, int speed);
}