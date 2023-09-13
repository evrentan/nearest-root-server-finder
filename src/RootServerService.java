import java.util.List;

public interface RootServerService {

    void printNearestRootServers();
    List<NearestRootServerInfo> getNearestRootServers();
}
