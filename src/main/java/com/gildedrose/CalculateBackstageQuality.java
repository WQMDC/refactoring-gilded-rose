package com.gildedrose;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CalculateBackstageQuality {

    private int quality;
    private int self_in;
    private List<Integer> RANGE = new ArrayList<>();
    private int CAP = 50;

    CalculateBackstageQuality(int quality, int self_in) {
        this.quality = quality;
        this.self_in = self_in;
        RANGE.add(6);
        RANGE.add(11);
    }

    public int updateQualityWithDuringSelfLife() {
        if (this.quality == CAP) {
            return this.quality;
        }

        if (this.self_in >= RANGE.get(0) && this.self_in < RANGE.get(1)) {
            return this.quality + 2;
        }

        if (this.self_in < RANGE.get(0)) {
            return this.quality + 3;
        }

        return this.quality + 1;
    }

    public int updateQualityWithExpire() {
        return 0;
    }
}
