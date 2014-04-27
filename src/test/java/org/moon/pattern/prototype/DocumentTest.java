package org.moon.pattern.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

public class DocumentTest {

	@Test
	public void test() {
		Document doc0 = new Document();
		doc0.setContext("SADAKDNFJASDBFKAWEBFKWEBFKAWE");
		doc0.setDocumentType("doc");

		try {
			assertTrue(doc0.clone() != doc0);
			assertEquals(doc0, doc0.clone());
			assertEquals(doc0.getClass(), doc0.clone().getClass());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		assertTrue(doc0.deepClone() != doc0);
		assertEquals(doc0, doc0.deepClone());
		assertEquals(doc0.getClass(), doc0.deepClone().getClass());

	}

}
