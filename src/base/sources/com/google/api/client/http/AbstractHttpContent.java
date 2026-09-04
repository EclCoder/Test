package com.google.api.client.http;

import com.google.api.client.util.Charsets;
import com.google.api.client.util.IOUtils;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractHttpContent implements HttpContent {
    private long computedLength;
    private HttpMediaType mediaType;

    protected AbstractHttpContent(String str) {
        this(str == null ? null : new HttpMediaType(str));
    }

    protected long computeLength() {
        return computeLength(this);
    }

    protected final Charset getCharset() {
        HttpMediaType httpMediaType = this.mediaType;
        return (httpMediaType == null || httpMediaType.getCharsetParameter() == null) ? Charsets.ISO_8859_1 : this.mediaType.getCharsetParameter();
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        if (this.computedLength == -1) {
            this.computedLength = computeLength();
        }
        return this.computedLength;
    }

    public final HttpMediaType getMediaType() {
        return this.mediaType;
    }

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        HttpMediaType httpMediaType = this.mediaType;
        if (httpMediaType == null) {
            return null;
        }
        return httpMediaType.build();
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public AbstractHttpContent setMediaType(HttpMediaType httpMediaType) {
        this.mediaType = httpMediaType;
        return this;
    }

    protected AbstractHttpContent(HttpMediaType httpMediaType) {
        this.computedLength = -1L;
        this.mediaType = httpMediaType;
    }

    public static long computeLength(HttpContent httpContent) {
        if (httpContent.retrySupported()) {
            return IOUtils.computeLength(httpContent);
        }
        return -1L;
    }
}
