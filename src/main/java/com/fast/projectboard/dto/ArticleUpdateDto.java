package com.fast.projectboard.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.fast.projectboard.domain.Article}
 */
public record ArticleUpdateDto(String title, String content, String hashtag) {
    public static ArticleUpdateDto of(String title, String content, String hashtag) {
        return new ArticleUpdateDto(title, content, hashtag);
    }
}