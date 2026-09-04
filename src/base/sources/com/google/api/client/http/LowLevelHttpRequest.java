package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class LowLevelHttpRequest {
    private String contentEncoding;
    private long contentLength = -1;
    private String contentType;
    private StreamingContent streamingContent;

    public abstract void addHeader(String str, String str2);

    public abstract LowLevelHttpResponse execute();

    public final String getContentEncoding() {
        return this.contentEncoding;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final StreamingContent getStreamingContent() {
        return this.streamingContent;
    }

    public final void setContentEncoding(String str) {
        this.contentEncoding = str;
    }

    public final void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setStreamingContent(StreamingContent streamingContent) {
        this.streamingContent = streamingContent;
    }

    public void setWriteTimeout(int i10) {
    }

    public void setTimeout(int i10, int i11) {
    }
}
