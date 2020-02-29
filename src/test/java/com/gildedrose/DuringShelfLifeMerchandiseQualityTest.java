package com.gildedrose;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DuringShelfLifeMerchandiseQualityTest {

    @Test
    public void should_decrement_quality_with_self_life_when_general_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("foo", 3, 5)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("foo", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(2));
        assertThat(merchandises[0].quality, is(4));
    }

    @Test
    public void should_not_decrement_quality_with_self_life_when_general_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("foo", 3, 0)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("foo", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(2));
        assertThat(merchandises[0].quality, is(0));
    }

    @Test
    public void should_increasing_quality_with_self_life_when_AgedBrie_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Aged Brie", 2, 5)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Aged Brie", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(1));
        assertThat(merchandises[0].quality, is(6));
    }

    @Test
    public void should_not_increasing_quality_with_self_life_when_AgedBrie_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Aged Brie", 3, 50)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Aged Brie", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(2));
        assertThat(merchandises[0].quality, is(50));
    }

    @Test
    public void should_increasing_quality_when_BackstagePassesToATAFKAL80ETC_concert_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Backstage passes to a TAFKAL80ETC concert", 11, 8)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(10));
        assertThat(merchandises[0].quality, is(9));
    }

    @Test
    public void should_increasing_two_quality_when_BackstagePassesToATAFKAL80ETC_concert_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Backstage passes to a TAFKAL80ETC concert", 8, 7)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(7));
        assertThat(merchandises[0].quality, is(9));
    }

    @Test
    public void should_increasing_three_quality_when_BackstagePassesToATAFKAL80ETC_concert_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Backstage passes to a TAFKAL80ETC concert", 5, 6)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(4));
        assertThat(merchandises[0].quality, is(9));
    }

    @Test
    public void should_not_increasing_quality_when_BackstagePassesToATAFKAL80ETC_concert_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Backstage passes to a TAFKAL80ETC concert", 2, 50)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(1));
        assertThat(merchandises[0].quality, is(50));
    }
}
