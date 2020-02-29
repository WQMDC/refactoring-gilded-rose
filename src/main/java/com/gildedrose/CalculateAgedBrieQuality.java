package com.gildedrose;

public class CalculateAgedBrieQuality {

    private int quality;

    CalculateAgedBrieQuality(int quality) {
        this.quality = quality;
    }

    public int updateQualityWithDuringSelfLife() {
        return this.quality == 50 ? 50 : this.quality ++;
    }

    public int updateQualityWithExpire() {
        return this.quality == 50 ? 50 : this.quality + 2;
    }
}
