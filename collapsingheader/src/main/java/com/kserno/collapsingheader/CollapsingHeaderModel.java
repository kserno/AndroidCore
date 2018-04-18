package com.kserno.collapsingheader;

import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;

/**
 * Created by filipsollar on 5.4.18.
 */

public class CollapsingHeaderModel {

    private TextModel collapsedText;
    private TextModel expandedText;
    @ColorInt
    private int toolbarColor;

    private int expandedTitleMarginStart;
    private int expandedTitleMarginEnd;
    private int expandedTitleMarginTop;
    private int expandedTitleMarginBottom;

    @DrawableRes
    private int imagePlaceholder;

    private String imageUrl;
    @DrawableRes
    private int imageResId;

    private int height;

    private CollapsingHeaderModel() {

    }

    public int getToolbarColor() {
        return toolbarColor;
    }

    public TextModel getCollapsedText() {
        return collapsedText;
    }

    public TextModel getExpandedText() {
        return expandedText;
    }

    public int getExpandedTitleMarginStart() {
        return expandedTitleMarginStart;
    }

    public int getExpandedTitleMarginEnd() {
        return expandedTitleMarginEnd;
    }

    public int getExpandedTitleMarginTop() {
        return expandedTitleMarginTop;
    }

    public int getExpandedTitleMarginBottom() {
        return expandedTitleMarginBottom;
    }

    public int getImagePlaceholder() {
        return imagePlaceholder;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getImageResId() {
        return imageResId;
    }

    public int getHeight() {
        return height;
    }

    private void setCollapsedText(TextModel collapsedText) {
        this.collapsedText = collapsedText;
    }

    private void setExpandedText(TextModel expandedText) {
        this.expandedText = expandedText;
    }

    private void setToolbarColor(int toolbarColor) {
        this.toolbarColor = toolbarColor;
    }

    private void setExpandedTitleMarginStart(int expandedTitleMarginStart) {
        this.expandedTitleMarginStart = expandedTitleMarginStart;
    }

    private void setExpandedTitleMarginEnd(int expandedTitleMarginEnd) {
        this.expandedTitleMarginEnd = expandedTitleMarginEnd;
    }

    private void setExpandedTitleMarginTop(int expandedTitleMarginTop) {
        this.expandedTitleMarginTop = expandedTitleMarginTop;
    }

    private void setExpandedTitleMarginBottom(int expandedTitleMarginBottom) {
        this.expandedTitleMarginBottom = expandedTitleMarginBottom;
    }

    private void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    private void setImagePlaceholder(int imagePlaceholder) {
        this.imagePlaceholder = imagePlaceholder;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    public static class Builder {

        private TextModel collapsedText;
        private TextModel expandedText;
        @ColorInt
        private int toolbarColor;

        private int expandedTitleMarginStart;
        private int expandedTitleMarginEnd;
        private int expandedTitleMarginTop;
        private int expandedTitleMarginBottom;

        private String imageUrl;
        @DrawableRes
        private int imageResId;
        @DrawableRes
        private int imagePlaceholder;
        private int height;

        public Builder setCollapsedText(TextModel collapsedText) {
            this.collapsedText = collapsedText;
            return this;
        }

        public Builder setExpandedText(TextModel expandedText) {
            this.expandedText = expandedText;
            return this;
        }

        public Builder setToolbarColor(int toolbarColor) {
            this.toolbarColor = toolbarColor;
            return this;
        }

        public Builder setExpandedTitleMarginStart(int expandedTitleMarginStart) {
            this.expandedTitleMarginStart = expandedTitleMarginStart;
            return this;
        }

        public Builder setExpandedTitleMarginEnd(int expandedTitleMarginEnd) {
            this.expandedTitleMarginEnd = expandedTitleMarginEnd;
            return this;
        }

        public Builder setExpandedTitleMarginTop(int expandedTitleMarginTop) {
            this.expandedTitleMarginTop = expandedTitleMarginTop;
            return this;
        }

        public Builder setExpandedTitleMarginBottom(int expandedTitleMarginBottom) {
            this.expandedTitleMarginBottom = expandedTitleMarginBottom;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setImageResId(int imageResId) {
            this.imageResId = imageResId;
            return this;
        }

        public Builder setImagePlaceholder(int imagePlaceholder) {
            this.imagePlaceholder = imagePlaceholder;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public CollapsingHeaderModel build() {
            CollapsingHeaderModel header = new CollapsingHeaderModel();

            header.setCollapsedText(collapsedText);
            header.setExpandedText(expandedText);

            header.setExpandedTitleMarginBottom(expandedTitleMarginBottom);
            header.setExpandedTitleMarginTop(expandedTitleMarginTop);
            header.setExpandedTitleMarginStart(expandedTitleMarginStart);
            header.setExpandedTitleMarginEnd(expandedTitleMarginEnd);

            header.setImageResId(imageResId);
            header.setToolbarColor(toolbarColor);
            header.setImageUrl(imageUrl);
            header.setImagePlaceholder(imagePlaceholder);
            header.setHeight(height);

            return header;
        }
    }
}
