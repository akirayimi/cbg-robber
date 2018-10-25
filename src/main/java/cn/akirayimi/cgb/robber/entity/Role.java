package cn.akirayimi.cgb.robber.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 角色信息
 */
@Entity
@Table(name = "role")
public class Role {
//    private Long id;
    // 角色订单号
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="role_id_seq")
    @SequenceGenerator(name="role_id_seq", sequenceName="role_id_seq", allocationSize = 1)
    private Long id;

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

    // 门派
    private Integer school;
    // 等级
    private String levelDesc;

    private String descSumup;

    private String formatEquipName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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


    private LocalDateTime createTime;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }


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
}
