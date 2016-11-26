package examples.classes;

import com.runemate.game.api.script.framework.tree.TreeBot;
import com.runemate.game.api.script.framework.tree.TreeTask;

import examples.classes.branches.RootBranch;

/**
 * Created by Mihael on 26.11.2016.
 */
public class Script extends TreeBot {

	@Override
	public TreeTask createRootTask() {
		return new RootBranch();
	}
}
