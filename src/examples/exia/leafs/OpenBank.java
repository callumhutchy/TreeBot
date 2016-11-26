package com.examples.tree.leafs;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.LeafTask;

/**
 * Created by Mihael on 26.11.2016.
 */
public class OpenBank extends LeafTask {

	@Override
	public void execute() {
		if (Bank.open()) {
			System.out.println("Bank opened.");
		}
	}
}
