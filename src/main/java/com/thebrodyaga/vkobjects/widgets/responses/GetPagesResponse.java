package com.thebrodyaga.vkobjects.widgets.responses;


import com.thebrodyaga.vkobjects.widgets.WidgetPage;

import java.util.List;
import java.util.Objects;

/**
 * GetPagesResponse object
 */
public class GetPagesResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<WidgetPage> pages;

    public Integer getCount() {
        return count;
    }

    public List<WidgetPage> getPages() {
        return pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPagesResponse getPagesResponse = (GetPagesResponse) o;
        return Objects.equals(count, getPagesResponse.count) &&
                Objects.equals(pages, getPagesResponse.pages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetPagesResponse{");
        sb.append("count=").append(count);
        sb.append(", com.thebrodyaga.vkobjects.pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}
