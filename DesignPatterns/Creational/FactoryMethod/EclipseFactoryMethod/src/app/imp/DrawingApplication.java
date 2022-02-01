package app.imp;

import app.Application;
import app.doc.Document;
import app.doc.imp.DrawingDocument;

public class DrawingApplication extends Application {

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return new DrawingDocument();
	}

}
