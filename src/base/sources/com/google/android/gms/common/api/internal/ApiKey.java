package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa;
    private final Api zab;
    private final Api.ApiOptions zac;
    private final String zad;

    private ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.zab = api;
        this.zac = apiOptions;
        this.zad = str;
        this.zaa = Objects.hashCode(api, apiOptions, str);
    }

    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(Api<O> api, O o10, String str) {
        return new ApiKey<>(api, o10, str);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.equal(this.zab, apiKey.zab) && Objects.equal(this.zac, apiKey.zac) && Objects.equal(this.zad, apiKey.zad);
    }

    public final int hashCode() {
        return this.zaa;
    }

    public final String zaa() {
        return this.zab.zad();
    }
}
