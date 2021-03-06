package jsonld2toplevel;

import org.raml.dialects.core.annotations.CanBeValue;
import org.raml.dialects.core.annotations.ClassTerm;
import org.raml.dialects.core.annotations.PropertyTerm;

@ClassTerm("http://raml.org/vocabularies/meta#External")
public class External {

	@PropertyTerm("http://raml.org/vocabularies/meta#name")
	protected String name;

	@PropertyTerm("http://raml.org/vocabularies/meta#uri")
	@CanBeValue
	protected String uri;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
