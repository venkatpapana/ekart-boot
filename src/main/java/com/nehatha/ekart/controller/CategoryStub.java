package com.nehatha.ekart.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nehatha.ekart.model.Category;

public class CategoryStub {
        private static Map<Long, Category> categories = new HashMap<Long, Category>();
        private static Long idIndex = 3L;

        //populate initial categories
        static {
                Category a = new Category(1L, "Electronics", "Mobiles, Tablets, Laptops");
                categories.put(1L, a);
                Category b = new Category(2L, "Books", "Books description");
                categories.put(2L, b);
                Category c = new Category(3L, "Fashion", "Fashion description");
                categories.put(3L, c);
        }

        public static List<Category> list() {
                return new ArrayList<Category>(categories.values());
        }

        public static Category create(Category categroy) {
                idIndex += idIndex;
                categroy.setId(idIndex);
                categories.put(idIndex, categroy);
                return categroy;
        }

        public static Category get(Long id) {
                return categories.get(id);
        }

        public static Category update(Long id, Category categroy) {
                categories.put(id, categroy);
                return categroy;
        }

        public static Category delete(Long id) {
                return categories.remove(id);
        }
}
