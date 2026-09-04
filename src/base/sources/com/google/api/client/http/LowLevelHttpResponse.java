package com.google.api.client.http;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class LowLevelHttpResponse {
    public abstract InputStream getContent();

    public abstract String getContentEncoding();

    public abstract long getContentLength();

    public abstract String getContentType();

    public abstract int getHeaderCount();

    public abstract String getHeaderName(int i10);

    public abstract String getHeaderValue(int i10);

    public abstract String getReasonPhrase();

    public abstract int getStatusCode();

    public abstract String getStatusLine();

    public void disconnect() {
    }
}
