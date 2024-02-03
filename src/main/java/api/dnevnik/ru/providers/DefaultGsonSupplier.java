package api.dnevnik.ru.providers;

import api.dnevnik.ru.model.response.feed.items.FeedItem;
import api.dnevnik.ru.model.response.info.Credentials;
import api.dnevnik.ru.utils.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.function.Supplier;

public class DefaultGsonSupplier implements Supplier<Gson> {
    @Override
    public Gson get() {
        return new GsonBuilder()
//                .setPrettyPrinting()
                .registerTypeAdapter(Credentials.class, new CredentialsDeserializer())
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer())
                .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeDeserializer())
                .registerTypeAdapter(FeedItem.class, new FeedItemDeserializer())
                .create();
    }
}
