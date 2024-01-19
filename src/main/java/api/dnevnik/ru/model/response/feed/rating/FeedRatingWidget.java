package api.dnevnik.ru.model.response.feed.rating;

import api.dnevnik.ru.model.response.feed.FeedTopRating;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FeedRatingWidget {

    private FeedCommonGroupRating commonGroupRatingEvent;

    private FeedCommonParallelRating commonParallelRatingEvent;

    private FeedTopRating topRatingEvent;

    private List<FeedGroupRatingBySubject> groupRatingBySubjectEvents;

    private List<FeedPersonalRatingBySubject> personalRatingBySubjectEvents;
}
