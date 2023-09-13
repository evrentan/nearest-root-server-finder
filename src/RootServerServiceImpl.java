import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RootServerServiceImpl implements RootServerService {

    @Override
    public void printNearestRootServers() {

        List<NearestRootServerInfo> nearestRootServerInfoList = this.getNearestRootServers();

        nearestRootServerInfoList.sort(Comparator.comparing(NearestRootServerInfo::getTown));

        System.out.println("Nearest Root Servers to Your Current Location are: ");

        AtomicInteger i = new AtomicInteger(1);

        nearestRootServerInfoList.forEach(nearestRootServerInfo ->
                System.out.println(
                        String.format("%d. City: %s -> Operator: %s, Operator's Home Page: %s, IPv4 Enabled: %s, IPv6 Enabled: %s",
                                i.getAndIncrement(),
                                nearestRootServerInfo.getTown(),
                                nearestRootServerInfo.getOperator(),
                                nearestRootServerInfo.getHomePage(),
                                nearestRootServerInfo.isIpv4(),
                                nearestRootServerInfo.isIpv6()
                        )
                )
        );
    }

    @Override
    public List<NearestRootServerInfo> getNearestRootServers() {

        List<String> nearestCities = ApiUtils.getNearbyCities();

        List<RootServer> rootServerList = RootServerDataAnalyzer.getInstance().getRootServerList();

        List<NearestRootServerInfo> nearestRootServerInfoList = new ArrayList<>();

        this.generateNearestRootServerInfoList(nearestCities, rootServerList, nearestRootServerInfoList);

        return nearestRootServerInfoList;
    }

    private void generateNearestRootServerInfoList(List<String> nearestCities, List<RootServer> rootServerList, List<NearestRootServerInfo> nearestRootServerInfoList) {
        rootServerList.forEach(rootServer -> {
            List<Site> rootServerSites = rootServer.getSites();
            rootServerSites.forEach(site -> {
               String siteTown = site.getTown();
                    if (nearestCities.contains(siteTown)) {
                        nearestRootServerInfoList.add(new NearestRootServerInfo(rootServer.getOperator(), rootServer.getHomepage(), site.isIPv4(), site.isIPv6(), siteTown));
                    }
            });
        });
    }
}
