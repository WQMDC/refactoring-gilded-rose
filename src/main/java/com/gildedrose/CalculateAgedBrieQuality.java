package com.gildedrose;

public class CalculateAgedBrieQuality {

    private int quality;
    private int CAP = 50;

    CalculateAgedBrieQuality(int quality) {
        this.quality = quality;
    }

    public int updateQualityWithDuringSelfLife() {
        return this.quality == CAP ? this.quality : this.quality + 1;
    }

    public int updateQualityWithExpire() {
        return this.quality == CAP ? this.quality : this.quality + 2;
    }
}
