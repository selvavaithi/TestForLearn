package com.learn.test;

import java.util.Arrays;
import java.util.List;

import net.serenitybdd.jbehave.SerenityStories;

public class JBehaveTest extends SerenityStories {

	@Override
	public List<String> storyPaths() {
		return Arrays.asList("Stories/testsite_browse.story", "Stories/testsite_cart.story",
				"Stories/testsite_search.story");
	}

}
