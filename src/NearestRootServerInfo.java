public class NearestRootServerInfo {
    private String operator;
    private String homePage;
    private boolean ipv4;
    private boolean ipv6;
    private String town;

    public NearestRootServerInfo(String operator, String homePage, boolean ipv4, boolean ipv6, String town) {
        this.operator = operator;
        this.homePage = homePage;
        this.ipv4 = ipv4;
        this.ipv6 = ipv6;
        this.town = town;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public boolean isIpv4() {
        return ipv4;
    }

    public void setIpv4(boolean ipv4) {
        this.ipv4 = ipv4;
    }

    public boolean isIpv6() {
        return ipv6;
    }

    public void setIpv6(boolean ipv6) {
        this.ipv6 = ipv6;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "NearestRootServerInfo{" +
                "operator='" + operator + '\'' +
                ", homePage='" + homePage + '\'' +
                ", ipv4=" + ipv4 +
                ", ipv6=" + ipv6 +
                ", town='" + town + '\'' +
                '}';
    }
}
