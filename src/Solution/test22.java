package Solution;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class test22 {
    public static void main(String[] args) throws Exception {
    // Input files
    List<Path> inputs = Arrays.asList(
            Paths.get("1.txt"),
            Paths.get("2.txt"),
            Paths.get("3.txt")
    );

    // Output file
    Path output = Paths.get("file4.txt");

    // Charset for read and write
    Charset charset = StandardCharsets.UTF_8;

    // Join files (lines)
    for (Path path : inputs) {
        List<String> lines = Files.readAllLines(path, charset);
        Files.write(output, lines, charset, StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    }
}
