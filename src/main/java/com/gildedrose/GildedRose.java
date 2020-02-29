package com.gildedrose;

class GildedRose {
    Merchandise[] merchandises;

    public GildedRose(Merchandise[] merchandises) {
        this.merchandises = merchandises;
    }

    public void update_quality() {
        for (int i = 0; i < merchandises.length; i++) {
            if (!merchandises[i].name.equals("Aged Brie")
                    && !merchandises[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (merchandises[i].quality > 0) {
                    if (!merchandises[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        merchandises[i].quality = merchandises[i].quality - 1;
                    }
                }
            } else {
                if (merchandises[i].quality < 50) {
                    merchandises[i].quality = merchandises[i].quality + 1;

                    if (merchandises[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (merchandises[i].sell_in < 11) {
                            if (merchandises[i].quality < 50) {
                                merchandises[i].quality = merchandises[i].quality + 1;
                            }
                        }

                        if (merchandises[i].sell_in < 6) {
                            if (merchandises[i].quality < 50) {
                                merchandises[i].quality = merchandises[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!merchandises[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                merchandises[i].sell_in = merchandises[i].sell_in - 1;
            }

            if (merchandises[i].sell_in < 0) {
                if (!merchandises[i].name.equals("Aged Brie")) {
                    if (!merchandises[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (merchandises[i].quality > 0) {
                            if (!merchandises[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                merchandises[i].quality = merchandises[i].quality - 1;
                            }
                        }
                    } else {
                        merchandises[i].quality = merchandises[i].quality - merchandises[i].quality;
                    }
                } else {
                    if (merchandises[i].quality < 50) {
                        merchandises[i].quality = merchandises[i].quality + 1;
                    }
                }
            }
        }
    }
}
