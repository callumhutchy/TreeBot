package com.examples.tree.tasks;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.TreeTask;

/**
 * Created by Mihael on 26.11.2016.
 */
public class CloseBank extends TreeTask {

	@Override
	public TreeTask successTask() {
		return null;
	}

	@Override
	public void execute() {
		if(Bank.close()){
			System.out.println("Bank closed");
		}
	}

	@Override
	public boolean isLeaf() {
		return true;
	}

	@Override
	public TreeTask failureTask() {
		return null;
	}

	@Override
	public boolean validate() {
		return false;
	}
}
