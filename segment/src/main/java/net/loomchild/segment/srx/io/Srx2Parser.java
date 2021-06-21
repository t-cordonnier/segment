package net.loomchild.segment.srx.io;

import java.io.Reader;

import net.loomchild.segment.srx.SrxDocument;
import net.loomchild.segment.srx.SrxParser;

/**
 * Class for compatibility with original API (when JAXB was default)
 * 
 * @author loomchild
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
	
	/**
	 * Parses SRX document from reader. Selects appropriate SRX parser for
	 * document version.
	 * 
	 * @param reader
	 * @return Return initialized document
	 */
	public SrxDocument parse(Reader reader) {
		return parser.parse(reader);
	}

}
