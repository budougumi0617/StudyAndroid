package com.yokmama.learn10.chapter06.lesson28;

import java.util.ArrayList;
import java.util.List;
import android.support.v4.app.Fragment;

/**
 * Created by m_iwasaki on 15/03/12.
 */
public class Todo {

    private ColorLabel colorLabel;

    private long createdTime;

    private String value;

//    public static interface ColorLabel {
//
//        public static final int NONE = 1;
//        public static final int PINK = 2;
//        public static final int INDIGO = 3;
//        public static final int GREEN = 4;
//        public static final int AMBER = 5;
//    }

    public enum ColorLabel{
        NONE(1){
            @Override
            int getColorId() {
                return R.color.material_grey_500;
            }

            @Override
            int getBgColor() {
                return R.drawable.bg_colorlabel_grey;
            }
        },
        PINK(2) {
            @Override
            int getColorId() {
                return R.color.material_pink_500;
            }

            @Override
            int getBgColor() {
                return R.drawable.bg_colorlabel_pink;
            }
        },
        INDIGO(3){
            @Override
            int getColorId() {
                return R.color.material_indigo_500;
            }

            @Override
            int getBgColor() {
                return R.drawable.bg_colorlabel_indigo;
            }

        },
        GREEN(4) {
            @Override
            int getColorId() {
                return R.color.material_green_500;
            }

            @Override
            int getBgColor() {
                return R.drawable.bg_colorlabel_green;
            }
        },
        AMBER(5){
            @Override
            int getColorId() {
                return R.color.material_amber_500;
            }

            @Override
            int getBgColor() {
                return R.drawable.bg_colorlabel_amber;
            }
        };

        private final int id;
        private ColorLabel(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        abstract int getColorId();
        abstract int getBgColor();
    }

    public Todo(ColorLabel colorLabel, String value, long createdTime) {
        this.colorLabel = colorLabel;
        this.value = value;
        this.createdTime = createdTime;
    }

    public ColorLabel getColorLabel() {
        return colorLabel;
    }

    public void setColorLabel(ColorLabel colorLabel) {
        this.colorLabel = colorLabel;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * テスト表示用にダミーのリストアイテムを作成.
     */
    public static List<Todo> addDummyItem() {
        List<Todo> items = new ArrayList<>();
        items.add(new Todo(Todo.ColorLabel.INDIGO, "猫に小判", System.currentTimeMillis() + 1));
        items.add(new Todo(Todo.ColorLabel.PINK, "猫の手も借りたい", System.currentTimeMillis() + 2));
        items.add(new Todo(Todo.ColorLabel.GREEN, "窮鼠猫を噛む", System.currentTimeMillis() + 3));
        items.add(new Todo(Todo.ColorLabel.AMBER,
                "猫は三年飼っても三日で恩を忘れる", System.currentTimeMillis() + 4));
        items.add(new Todo(Todo.ColorLabel.NONE, "猫も杓子も", System.currentTimeMillis() + 5));
        return items;
    }
}