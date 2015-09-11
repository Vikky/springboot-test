/**
 * 
 */
package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author viagrawal
 *
 */
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	private String type;
	private Value value;

}
