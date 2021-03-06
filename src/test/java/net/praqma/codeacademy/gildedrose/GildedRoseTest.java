package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void bar() {
	Item[] testItems = new Item[] { 
		new Item("Aged Brie", 2, 0)
	};
	GildedRose app = new GildedRose(testItems);
	app.updateQuality();
	assertEquals("Aged Brie", app.items[0].name);
    }
}
