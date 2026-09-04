package io;

import com.google.api.client.http.HttpMethods;
import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class p extends n {
    public p(String str) {
        setURI(URI.create(str));
    }

    @Override // io.n, io.q
    public String getMethod() {
        return HttpMethods.TRACE;
    }
}
