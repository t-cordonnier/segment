package net.sourceforge.segment.srx.io;

import net.sourceforge.segment.srx.SrxDocument;
import net.sourceforge.segment.srx.SrxParser;

import java.io.Reader;


/**
 * Represents SRX 2.0 document parser. Responsible for creating and initializing
 * Document according to given SRX. 
 * Kept here only for compatibility, will not use JAXB but redirect to Srx2SaxParser instead
 * 
 * @author cordoth
 */
public class Srx2Parser implements SrxParser {

	private SrxParser parser;

	/**
	 * Creates SRX any parser using given SRX 2.0 parser.
	 * @param parser
	 */
	public Srx2Parser(SrxParser parser) {
		this.parser = parser;
	}
	
	/**
	 * Creates SRX any parser using default SRX 2.0 parser.
	 */
	public Srx2Parser() {
		this(new Srx2SaxParser());
	}

	public SrxDocument parse(Reader reader) {
		return parser.parse(reader);
	}

}
