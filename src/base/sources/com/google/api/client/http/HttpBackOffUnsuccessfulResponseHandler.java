package com.google.api.client.http;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class HttpBackOffUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {
    private final BackOff backOff;
    private BackOffRequired backOffRequired = BackOffRequired.ON_SERVER_ERROR;
    private Sleeper sleeper = Sleeper.DEFAULT;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface BackOffRequired {
        public static final BackOffRequired ALWAYS = new BackOffRequired() { // from class: com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired.1
            @Override // com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired
            public boolean isRequired(HttpResponse httpResponse) {
                return true;
            }
        };
        public static final BackOffRequired ON_SERVER_ERROR = new BackOffRequired() { // from class: com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired.2
            @Override // com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired
            public boolean isRequired(HttpResponse httpResponse) {
                return httpResponse.getStatusCode() / 100 == 5;
            }
        };

        boolean isRequired(HttpResponse httpResponse);
    }

    public HttpBackOffUnsuccessfulResponseHandler(BackOff backOff) {
        this.backOff = (BackOff) Preconditions.checkNotNull(backOff);
    }

    public final BackOff getBackOff() {
        return this.backOff;
    }

    public final BackOffRequired getBackOffRequired() {
        return this.backOffRequired;
    }

    public final Sleeper getSleeper() {
        return this.sleeper;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z10) {
        if (z10 && this.backOffRequired.isRequired(httpResponse)) {
            try {
                return BackOffUtils.next(this.sleeper, this.backOff);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return false;
    }

    public HttpBackOffUnsuccessfulResponseHandler setBackOffRequired(BackOffRequired backOffRequired) {
        this.backOffRequired = (BackOffRequired) Preconditions.checkNotNull(backOffRequired);
        return this;
    }

    public HttpBackOffUnsuccessfulResponseHandler setSleeper(Sleeper sleeper) {
        this.sleeper = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }
}
