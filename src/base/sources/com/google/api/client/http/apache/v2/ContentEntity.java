package com.google.api.client.http.apache.v2;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class ContentEntity extends a {
    private final long contentLength;
    private final StreamingContent streamingContent;

    ContentEntity(long j10, StreamingContent streamingContent) {
        this.contentLength = j10;
        this.streamingContent = (StreamingContent) Preconditions.checkNotNull(streamingContent);
    }

    @Override // co.j
    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    @Override // co.j
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // co.j
    public boolean isRepeatable() {
        return false;
    }

    @Override // co.j
    public boolean isStreaming() {
        return true;
    }

    @Override // co.j
    public void writeTo(OutputStream outputStream) {
        if (this.contentLength != 0) {
            this.streamingContent.writeTo(outputStream);
        }
    }
}
