package com.examples.tree;

import com.examples.tree.tasks.RootTask;
import com.runemate.game.api.script.framework.tree.TreeBot;
import com.runemate.game.api.script.framework.tree.TreeTask;

/**
 * Created by Mihael on 26.11.2016.
 */
public class Script extends TreeBot {

	@Override
	public TreeTask createRootTask() {
		return new RootTask();
	}
}
