/**
 * 
 */
package exception;

/**
 * @author VJ
 *
 */
public class EmptyResultSetException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public EmptyResultSetException()
	{
		super("No Results from SQL Query");
	}
}
