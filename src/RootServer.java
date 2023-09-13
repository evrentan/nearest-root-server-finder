import java.util.List;

public class RootServer {

    private String Operator;
    private String Homepage;
    private String IPv4;
    private String IPv6;
    private List<Site> Sites;

    public String getOperator() {
        return Operator;
    }

    public String getHomepage() {
        return Homepage;
    }

    public String getIPv4() {
        return IPv4;
    }

    public String getIPv6() {
        return IPv6;
    }

    public List<Site> getSites() {
        return Sites;
    }

    public void setSites(List<Site> sites) {
        Sites = sites;
    }

    @Override
    public String toString() {
        return "RootServer{" +
                "Operator='" + Operator + '\'' +
                ", HomePage='" + Homepage + '\'' +
                ", IPv4='" + IPv4 + '\'' +
                ", IPv6='" + IPv6 + '\'' +
                ", Sites=" + Sites +
                '}';
    }
}
