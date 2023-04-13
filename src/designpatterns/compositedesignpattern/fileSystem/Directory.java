package designpatterns.compositedesignpattern.fileSystem;

import java.util.List;

public class Directory implements IFileSystem {
    String dirName;
    List<IFileSystem> fileSystem;

    public Directory(String dirName, List<IFileSystem> fileSystem) {
        this.dirName = dirName;
        this.fileSystem = fileSystem;
    }

    @Override
    public void ls() {
        System.out.println("Directory name: " + dirName);
        for (IFileSystem dirOrFile: this.fileSystem)
            dirOrFile.ls();
    }
}
