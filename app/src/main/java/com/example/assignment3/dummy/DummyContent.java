package com.example.assignment3.dummy;

import android.widget.ArrayAdapter;

import com.example.assignment3.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ImageItem> IMAGE_ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ImageItem> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 10;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(ImageItem item) {
        IMAGE_ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static ImageItem createDummyItem(int position) {
        return new ImageItem(String.valueOf(position), "Item " + (position));
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ImageItem {
        public final String id;
        public final String content;
        public String imagePath;

        public ImageItem(String id, String content) {
            this.id = id;
            this.content = content;
            this.imagePath = "";
        }

        @Override
        public String toString() {
            return content;
        }
    }
}