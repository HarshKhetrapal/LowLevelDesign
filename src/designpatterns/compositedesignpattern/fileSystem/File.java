package designpatterns.compositedesignpattern.fileSystem;

public class File implements IFileSystem {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File name: " + this.fileName);
    }
}
