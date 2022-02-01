package app;

import app.doc.Document;

public abstract class Application {
	
	public abstract Document createDocument();
	
	public Document importDocument() {
		Document doc = createDocument();
		
		// read content and add elements
		String elem = null;
		boolean EOF = false;
		
		while(!EOF) {
			// real elem
			doc.addElement(elem);
		}

		return doc;
	}
}
