package com.gildedrose;

public class CalculateGeneralMerchandiseQuality {

    private int quality;

    CalculateGeneralMerchandiseQuality(int quality) {
        this.quality = quality;
    }

    public int updateQualityWithDuringSelfLife() {
        return this.quality == 0 ? 0 : this.quality --;
    }

    public int updateQualityWithExpire() {
        return this.quality == 0 ? 0 : this.quality - 2;
    }
}
