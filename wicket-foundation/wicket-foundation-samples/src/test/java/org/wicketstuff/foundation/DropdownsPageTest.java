package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.DropdownsPage;

public class DropdownsPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(DropdownsPage.class);
		tester.assertRenderedPage(DropdownsPage.class);
	}
}
