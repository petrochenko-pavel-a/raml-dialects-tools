package org.raml.dialects.core;

import java.io.Reader;
import java.net.URI;

public interface IParser<T> {

	Class<T>result();
	
	String[] supportedExtensions();
	
	T parse(Reader reader,URI location, Class<? extends T> target);
}
