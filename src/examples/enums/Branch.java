package examples.enums;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.hybrid.util.Validatable;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

/**
 * An Enum containing all of the logical branches in the Tree Script
 * 
 * @author Exia
 */
public enum Branch {
	SHOULD_DEPOSIT(() -> {return Inventory.isFull();}, Leaf.DEPOSIT.task, Leaf.WITHDRAW.task),
	SHOULD_OPEN_BANK(() -> {return Bank.isOpen();}, SHOULD_DEPOSIT.task, Leaf.OPEN_BANK.task),
	SHOULD_CLOSE_BANK(() -> {return Bank.isOpen();}, Leaf.CLOSE_BANK.task, Leaf.WAIT.task),
	SHOULD_WITHDRAW(() -> {return !Inventory.contains("Banana");}, SHOULD_OPEN_BANK.task, SHOULD_CLOSE_BANK.task);
	
	BranchTask task;
	Branch(Validatable v, TreeTask success, TreeTask failure) {
		this.task = new BranchTask(){
			@Override
			public boolean validate() {
				return v.isValid();
			}
			
			@Override
			public TreeTask successTask() {
				return success;
			}
			
			@Override
			public TreeTask failureTask() {
				return failure;
			}			
		};
	}
}
