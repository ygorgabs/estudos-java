package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("");
        Files.walkFileTree(path, new ListJavaClassFiles());
    }
}

class ListJavaClassFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        String glob = "glob:**/*Test??.{java,class}";
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);

        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}
