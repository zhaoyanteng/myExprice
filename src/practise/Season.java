package practise;

public enum Season {
    SPRING("春天","春暖花开"),
    SUMMER("夏天","烈日炎炎"),
    AUTUMN("秋天","秋分习习"),
    WINTER("冬天","天寒地冻");

    private final String season;

    public String getSeason() {
        return season;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    private final String seasonDesc;

    private Season(String season, String seasonDesc) {
        this.season = season;
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "season='" + season + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
