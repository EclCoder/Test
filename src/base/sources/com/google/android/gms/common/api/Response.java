package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    protected T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t10) {
        this.zza = t10;
    }

    protected Response(T t10) {
        this.zza = t10;
    }
}
