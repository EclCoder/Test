package com.google.api.client.http.apache;

import com.google.api.client.util.Preconditions;
import io.f;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class HttpExtensionMethod extends f {
    private final String methodName;

    public HttpExtensionMethod(String str, String str2) {
        this.methodName = (String) Preconditions.checkNotNull(str);
        setURI(URI.create(str2));
    }

    @Override // io.n, io.q
    public String getMethod() {
        return this.methodName;
    }
}
