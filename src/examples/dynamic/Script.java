package examples.dynamic;

import com.runemate.game.api.script.framework.tree.TreeBot;
import com.runemate.game.api.script.framework.tree.TreeTask;

/**
 * 
 * This example demonstrates how to dynamically generate a TreeBot
 * based on some existing data know about the current game state.
 * This is a very flexible implementation and it allows the author
 * to support many different trees all in the same bot based on 
 * the user's input in the gui.
 * 
 * @author Exia
 */
public class Script extends TreeBot {

	@Override
	public TreeTask createRootTask() {
		// TODO: actually make this example.
		return null;
	}
}
