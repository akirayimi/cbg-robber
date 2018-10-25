package cn.akirayimi.cgb.robber.entity;

public class OtherInfo {
    // 门派
    private Integer school;
    // 等级
    private String levelDesc;

    private String descSumup;

    private String formatEquipName;

    public Integer getSchool() {
        return school;
    }

    public void setSchool(Integer school) {
        this.school = school;
    }

    public String getLevelDesc() {
        return levelDesc;
    }

    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc;
    }

    public String getDescSumup() {
        return descSumup;
}

    public void setDescSumup(String descSumup) {
        this.descSumup = descSumup;
    }

    public String getFormatEquipName() {
        return formatEquipName;
    }

    public void setFormatEquipName(String formatEquipName) {
        this.formatEquipName = formatEquipName;
    }
}
