package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class PendingResult<R extends Result> {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface StatusListener {
        void onComplete(Status status);
    }

    public void addStatusListener(StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public abstract R await();

    @ResultIgnorabilityUnspecified
    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(ResultCallback<? super R> resultCallback);

    public abstract void setResultCallback(ResultCallback<? super R> resultCallback, long j10, TimeUnit timeUnit);

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        throw new UnsupportedOperationException();
    }
}
