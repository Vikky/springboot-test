/**
 * 
 */
package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author viagrawal
 *
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	private Long id;
	private String quote;

}