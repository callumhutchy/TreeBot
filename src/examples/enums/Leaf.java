package examples.enums;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.Execution;
import com.runemate.game.api.script.framework.tree.LeafTask;

/**
 * An Enum containing all of the actions in the Tree Script
 * 
 * @author Exia
 */
public enum Leaf {
	OPEN_BANK(() -> Bank.open()),
	CLOSE_BANK(() -> Bank.close()),
	WITHDRAW(() -> Bank.withdraw("Banana", 1)),
	DEPOSIT (() -> Bank.depositInventory()),
	WAIT (() -> Execution.delay(100));

	LeafTask task;
	Leaf(Runnable r) {	
		this.task = new LeafTask(){
			@Override
			public void execute() {
				r.run();
			}
		};
	}
}
