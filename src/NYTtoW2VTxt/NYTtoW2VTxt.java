package NYTtoW2VTxt;

import com.nytlabs.corpus.NYTCorpusDocumentParser;
import com.nytlabs.corpus.NYTCorpusDocument;
import java.io.File;
import java.io.IOException;
import Jet.Lex.*;
import Jet.Tipster.Span;
import Jet.Zoner.SentenceSplitter;


public class NYTtoW2VTxt {
		public static void main(String[] args) throws IOException {
			NYTCorpusDocumentParser parser = new NYTCorpusDocumentParser();
			File file = new File("0000038.xml");
			NYTCorpusDocument timesDocument = parser.parseNYTCorpusDocumentFromFile(file, false);
			System.out.println (timesDocument.getBody());
			Span span = new Span(0, timesDocument.getWordCount()-1);
			SentenceSplitter.split(timesDocument, span);;
		}
}
