package practise;

public enum SeasonEnumn {

    SPRING ("春天","万物复苏"),
    SUMMER("夏天","骄阳似火"),
    AUTUMN ("秋天","秋风习习"),
    WINTER ("冬天","寒冬腊月");
    private final  String season;
    private final  String seasonDesc;

    public String getSeason() {
        return season;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


    private SeasonEnumn(String season, String seasonDesc) {
        this.season = season;
        this.seasonDesc = seasonDesc;
    }


}
