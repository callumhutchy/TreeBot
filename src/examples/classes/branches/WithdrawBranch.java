package examples.classes.branches;

import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

import examples.classes.leafs.CloseBank;
import examples.classes.leafs.Withdraw;

/**
 * Created by Mihael on 26.11.2016.
 */
public class WithdrawBranch extends BranchTask {

	private Withdraw withdrawLeaf = new Withdraw();
	private CloseBank closeBankLeaf = new CloseBank();


	@Override
	public TreeTask successTask() {
		return closeBankLeaf;
	}

	@Override
	public TreeTask failureTask() {
		return withdrawLeaf;
	}

	@Override
	public boolean validate() {
		return Inventory.contains("Banana");
	}
}
