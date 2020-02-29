package com.gildedrose;

class GildedRose {
    Merchandise[] merchandises;

    public GildedRose(Merchandise[] merchandises) {
        this.merchandises = merchandises;
    }

    public void update_quality() {
        for (int i = 0; i < merchandises.length; i++) {
            merchandises[i].updateMerchandise();
        }
    }
}
