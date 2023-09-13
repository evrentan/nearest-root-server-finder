public class Site {

    private String Country;
    private boolean IPv4;
    private boolean IPv6;
    private String Town;
    private String Type;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public boolean isIPv4() {
        return IPv4;
    }

    public void setIPv4(boolean IPv4) {
        this.IPv4 = IPv4;
    }

    public boolean isIPv6() {
        return IPv6;
    }

    public void setIPv6(boolean IPv6) {
        this.IPv6 = IPv6;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Site{" +
                "Country='" + Country + '\'' +
                ", IPv4=" + IPv4 +
                ", IPv6=" + IPv6 +
                ", Town='" + Town + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
