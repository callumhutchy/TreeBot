package examples.classes.branches;

import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

import examples.classes.leafs.Deposit;

/**
 * Created by Mihael on 26.11.2016.
 */
public class BankBranch extends BranchTask {

	private WithdrawBranch withdrawBranch = new WithdrawBranch();
	private Deposit depositLeaf = new Deposit();

	@Override
	public TreeTask successTask() {
		return withdrawBranch;
	}

	@Override
	public TreeTask failureTask() {
		return depositLeaf;
	}

	@Override
	public boolean validate() {
		return Inventory.isEmpty() || Inventory.containsOnly("Banana");
	}
}
