package com.google.api.client.http;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class HttpBackOffIOExceptionHandler implements HttpIOExceptionHandler {
    private final BackOff backOff;
    private Sleeper sleeper = Sleeper.DEFAULT;

    public HttpBackOffIOExceptionHandler(BackOff backOff) {
        this.backOff = (BackOff) Preconditions.checkNotNull(backOff);
    }

    public final BackOff getBackOff() {
        return this.backOff;
    }

    public final Sleeper getSleeper() {
        return this.sleeper;
    }

    @Override // com.google.api.client.http.HttpIOExceptionHandler
    public boolean handleIOException(HttpRequest httpRequest, boolean z10) {
        if (!z10) {
            return false;
        }
        try {
            return BackOffUtils.next(this.sleeper, this.backOff);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public HttpBackOffIOExceptionHandler setSleeper(Sleeper sleeper) {
        this.sleeper = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }
}
