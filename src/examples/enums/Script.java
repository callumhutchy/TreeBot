package examples.enums;

import com.runemate.game.api.script.framework.tree.TreeBot;
import com.runemate.game.api.script.framework.tree.TreeTask;

/**
 * 
 * This is an implementation of the TreeBot that is set up to run a very static
 * tree of tasks. Due to the nature of enums, the tree structure is determined
 * at compile time and cannot be changed at runtime. This is great for simple
 * bots and is very space efficient. 
 * 
 * @author Exia
 */
public class Script extends TreeBot {

	@Override
	public TreeTask createRootTask() {
		return Branch.SHOULD_WITHDRAW.task;
	}
}
