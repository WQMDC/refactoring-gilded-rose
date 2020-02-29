package com.gildedrose;

public class CalculateBackstageQuality {

    private int quality;
    private int self_in;

    CalculateBackstageQuality(int quality, int self_in) {
        this.quality = quality;
        this.self_in = self_in;
    }

    public int updateQualityWithDuringSelfLife() {
        if (this.quality == 50) {
            return this.quality;
        }

        if (this.self_in < 11 && self_in >= 6) {
            return this.quality + 2;
        }

        if (this.self_in < 6) {
            return this.quality + 3;
        }

        return this.quality ++;
    }

    public int updateQualityWithExpire() {
        return 0;
    }
}