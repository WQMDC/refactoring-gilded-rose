package com.gildedrose;

public class CalculateGeneralMerchandiseQuality {

    private int quality;
    private int LOWER_LIMIT = 0;

    CalculateGeneralMerchandiseQuality(int quality) {
        this.quality = quality;
    }

    public int updateQualityWithDuringSelfLife() {
        return this.quality == LOWER_LIMIT ? this.quality : this.quality - 1;
    }

    public int updateQualityWithExpire() {
        return this.quality == LOWER_LIMIT ? this.quality : this.quality - 2;
    }
}
