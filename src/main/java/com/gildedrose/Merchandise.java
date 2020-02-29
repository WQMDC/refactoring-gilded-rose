package com.gildedrose;

public class Merchandise {

    public String name;

    public int sell_in;

    public int quality;

    public Merchandise(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    public void updateSellIn() {
        if (this.name == "Sulfuras, Hand of Ragnaros") {
            return;
        }

        this.sell_in = this.sell_in--;
    }

    public void updateQualityWithDuringShelfLife() {
        this.quality = this.quality--;
    }

    public void updateQualityWithExpire() {
        this.quality = this.quality - 2;
    }

}
