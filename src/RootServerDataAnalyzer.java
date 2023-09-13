import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class RootServerDataAnalyzer {

    private static RootServerDataAnalyzer rootServerDataAnalyzer;
    private List<RootServer> rootServerList = new ArrayList<>();

    private RootServerDataAnalyzer() {

        List<File> rootServerFiles = Stream.of(Objects.requireNonNull(new File(Constants.ROOT_SERVERS_DATA_DIRECTORY).listFiles()))
                .filter(file -> !file.isDirectory() && file.getName().endsWith(".json"))
                .toList();

        rootServerFiles.forEach(file -> {
            try (JsonReader reader = new JsonReader(new FileReader(file))) {
                this.rootServerList.add(new GsonBuilder().create().fromJson(reader, RootServer.class));
            } catch (IOException exception) {
                System.out.println(String.format("Error during Root Server Analyzer of %s file: %s", file.getName(), exception.getMessage()));
            }
        });
    }

    public static RootServerDataAnalyzer getInstance() {
        if (rootServerDataAnalyzer == null) {
            rootServerDataAnalyzer = new RootServerDataAnalyzer();
        }
        return rootServerDataAnalyzer;
    }

    public List<RootServer> getRootServerList() {
        return this.rootServerList;
    }
}
