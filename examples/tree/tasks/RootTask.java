package com.examples.tree.tasks;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.TreeTask;

/**
 * Created by Mihael on 26.11.2016.
 */
public class RootTask extends TreeTask {

	@Override
	public TreeTask successTask() {
		return new CloseBank();
	}

	@Override
	public void execute() {
	}

	@Override
	public boolean isLeaf() {
		return false;
	}

	@Override
	public TreeTask failureTask() {
		return new OpenBank();
	}

	@Override
	public boolean validate() {
		return Bank.isOpen();
	}
}
