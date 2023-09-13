public class NearestRootServerFinder {
    public static void main(String[] args) {

        RootServerService rootServerService = new RootServerServiceImpl();
        rootServerService.printNearestRootServers();
    }
}