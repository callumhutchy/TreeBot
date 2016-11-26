package com.examples.tree.branches;

import com.examples.tree.leafs.OpenBank;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

/**
 * Created by Mihael on 26.11.2016.
 */
public class RootBranch extends BranchTask {

	private BankBranch bankBranch = new BankBranch();
	private OpenBank openBankLeaf = new OpenBank();


	@Override
	public TreeTask successTask() {
		return bankBranch;
	}

	@Override
	public TreeTask failureTask() {
		return openBankLeaf;
	}

	@Override
	public boolean validate() {
		return Bank.isOpen();
	}
}
