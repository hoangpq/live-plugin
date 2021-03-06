package liveplugin.toolwindow;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.fileChooser.FileSystemTree;
import liveplugin.IDEUtil;

import static liveplugin.LivePluginAppComponent.kotlinCompilerIsOnClassPath;

public class NewKotlinFileAction extends NewFileAction {
	public NewKotlinFileAction() {
		super("Kotlin File", IDEUtil.KOTLIN_FILE_TYPE);
	}

	@Override protected void update(FileSystemTree fileSystemTree, AnActionEvent e) {
		super.update(fileSystemTree, e);
		e.getPresentation().setVisible(kotlinCompilerIsOnClassPath());
	}
}
