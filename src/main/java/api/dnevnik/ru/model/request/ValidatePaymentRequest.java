package api.dnevnik.ru.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class ValidatePaymentRequest {

    String subscriptionId;

    String token;
}
