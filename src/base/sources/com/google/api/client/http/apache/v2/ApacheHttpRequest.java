package com.google.api.client.http.apache.v2;

import co.k;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Preconditions;
import fo.h;
import go.a;
import io.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class ApacheHttpRequest extends LowLevelHttpRequest {
    private final h httpClient;
    private final n request;
    private a.C0598a requestConfig = a.e().o(false).l(false).r(false);

    ApacheHttpRequest(h hVar, n nVar) {
        this.httpClient = hVar;
        this.request = nVar;
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.request.addHeader(str, str2);
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() {
        if (getStreamingContent() != null) {
            n nVar = this.request;
            Preconditions.checkState(nVar instanceof k, "Apache HTTP client does not support %s requests with content.", nVar.getRequestLine().getMethod());
            ContentEntity contentEntity = new ContentEntity(getContentLength(), getStreamingContent());
            contentEntity.setContentEncoding(getContentEncoding());
            contentEntity.setContentType(getContentType());
            if (getContentLength() == -1) {
                contentEntity.setChunked(true);
            }
            ((k) this.request).setEntity(contentEntity);
        }
        this.request.setConfig(this.requestConfig.a());
        n nVar2 = this.request;
        return new ApacheHttpResponse(nVar2, this.httpClient.execute(nVar2));
    }

    @Override // com.google.api.client.http.LowLevelHttpRequest
    public void setTimeout(int i10, int i11) {
        this.requestConfig.d(i10).q(i11);
    }
}
