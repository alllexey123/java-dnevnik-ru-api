package api.dnevnik.ru.model.response.feed.items;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FeedBannerContent implements FeedItemContent {

    private String bannerId;

    private Integer maximumViewsCount;

    private String imageUrl;

    private String internalLink;

    private String externalLink;

    private String linkType;
}
