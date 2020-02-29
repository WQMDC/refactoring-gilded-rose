package com.gildedrose;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ExpiredMerchandiseQualityTest {

    @Test
    public void should_decrement_two_quality_with_self_life_when_general_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("foo", -1, 5)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("foo", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(-2));
        assertThat(merchandises[0].quality, is(3));
    }

    @Test
    public void should_not_decrement_quality_with_self_life_when_general_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("foo", -1, 0)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("foo", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(-2));
        assertThat(merchandises[0].quality, is(0));
    }

    @Test
    public void should_increasing_two_quality_with_self_life_when_AgedBrie_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Aged Brie", -1, 0)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Aged Brie", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(-2));
        assertThat(merchandises[0].quality, is(2));
    }

    @Test
    public void should_not_increasing_quality_with_self_life_when_AgedBrie_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Aged Brie", -1, 50)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Aged Brie", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(-2));
        assertThat(merchandises[0].quality, is(50));
    }

    @Test
    public void should_not_have_quality_when_BackstagePassesToATAFKAL80ETC_concert_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Backstage passes to a TAFKAL80ETC concert", -1, 4)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(-2));
        assertThat(merchandises[0].quality, is(0));
    }

    @Test
    public void should_not_calculate_quality_and_self_life_when_SulfurasHandOfRagnaros_merchandise() {
        Merchandise[] merchandises = new Merchandise[] {new Merchandise("Sulfuras, Hand of Ragnaros", -1, 30)};
        GildedRose gildedRose = new GildedRose(merchandises);

        gildedRose.update_quality();

        assertEquals("Sulfuras, Hand of Ragnaros", merchandises[0].name);
        assertThat(merchandises[0].sell_in, is(-1));
        assertThat(merchandises[0].quality, is(30));
    }
}