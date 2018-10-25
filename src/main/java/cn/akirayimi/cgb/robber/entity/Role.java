package cn.akirayimi.cgb.robber.entity;

/**
 * 角色信息
 */
public class Role {
    // 角色订单号
    private String gameOrdersn;
    // 售价，单位：分
    private Long price;
    // 服务器ID
    private Integer serverid;
    // 服务器名称
    private String serverName;
    // 收藏人数
    private Integer collectNum;
    // 安卓，苹果
    private Integer platformType;
    // 装备等级
    private Integer equipLevel;
    //大区名称
    private String areaName;
    // 公示期
    private Integer passFairShow;
    // 过期时间
    private Long expireRemainSeconds;

    //============================= 下面的属性要手动添加=============================
    // 评分
    private Integer score;
    // 门派
    private Integer schoolName;
    // 等级
    private String levelDesc;
    private Integer level;

    public String getGameOrdersn() {
        return gameOrdersn;
    }

    public void setGameOrdersn(String gameOrdersn) {
        this.gameOrdersn = gameOrdersn;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getServerid() {
        return serverid;
    }

    public void setServerid(Integer serverid) {
        this.serverid = serverid;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Integer getEquipLevel() {
        return equipLevel;
    }

    public void setEquipLevel(Integer equipLevel) {
        this.equipLevel = equipLevel;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPassFairShow() {
        return passFairShow;
    }

    public void setPassFairShow(Integer passFairShow) {
        this.passFairShow = passFairShow;
    }

    public Long getExpireRemainSeconds() {
        return expireRemainSeconds;
    }

    public void setExpireRemainSeconds(Long expireRemainSeconds) {
        this.expireRemainSeconds = expireRemainSeconds;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(Integer schoolName) {
        this.schoolName = schoolName;
    }
}
