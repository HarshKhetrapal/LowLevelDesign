package designpatterns.compositedesignpattern.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) {
        List<IFileSystem> comedyMovieFiles = new ArrayList<>();
        comedyMovieFiles.add(new File("Hera Pheri"));
        comedyMovieFiles.add(new File("Humgama"));
        Directory comedyMovie = new Directory("Comedy movie", comedyMovieFiles);
        List<IFileSystem> comedyAndSuspense = new ArrayList<>();
        comedyAndSuspense.add(new File("Dirshyam"));
        comedyAndSuspense.add(comedyMovie);
        IFileSystem fileSystem = new Directory("Movies", comedyAndSuspense);
        fileSystem.ls();
    }
}
