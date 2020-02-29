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

    public void updateMerchandise() {
        this.updateSellIn();
        this.updateQuality();
    }

    private void updateQuality() {
        boolean isExpired = this.sell_in < 0;
        this.quality = isExpired ? this.updateExpiredQuality() : this.updateDuringSelfLifeQuality();
    }

    private int updateDuringSelfLifeQuality() {
        int quality;

        switch (this.name) {
            case "Backstage passes to a TAFKAL80ETC concert":
                quality = new CalculateBackstageQuality(this.quality, this.sell_in).updateQualityWithDuringSelfLife();
                break;
            case "Sulfuras, Hand of Ragnaros":
                quality = new CalculateSulfurasMerchandiseQuality(this.quality).updateQuality();
                break;
            case "Aged Brie":
                quality = new CalculateAgedBrieQuality(this.quality).updateQualityWithDuringSelfLife();
                break;
            default:
                quality = new CalculateGeneralMerchandiseQuality(this.quality).updateQualityWithDuringSelfLife();
                break;
        }

        return quality;
    }

    private int updateExpiredQuality() {
        int quality;

        switch (this.name) {
            case "Backstage passes to a TAFKAL80ETC concert":
                quality = new CalculateBackstageQuality(this.quality, this.sell_in).updateQualityWithExpire();
                break;
            case "Sulfuras, Hand of Ragnaros":
                quality = new CalculateSulfurasMerchandiseQuality(this.quality).updateQuality();
                break;
            case "Aged Brie":
                quality = new CalculateAgedBrieQuality(this.quality).updateQualityWithExpire();
                break;
            default:
                quality = new CalculateGeneralMerchandiseQuality(this.quality).updateQualityWithExpire();
                break;
        }

        return quality;
    }

    private void updateSellIn() {
        if (this.name == "Sulfuras, Hand of Ragnaros") {
            return;
        }

        this.sell_in = this.sell_in--;
    }

}
