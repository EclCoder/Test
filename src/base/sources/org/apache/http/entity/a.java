package org.apache.http.entity;

import co.j;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements j {
    protected static final int OUTPUT_BUFFER_SIZE = 4096;
    protected boolean chunked;
    protected co.d contentEncoding;
    protected co.d contentType;

    protected a() {
    }

    @Deprecated
    public void consumeContent() {
    }

    @Override // co.j
    public co.d getContentEncoding() {
        return this.contentEncoding;
    }

    @Override // co.j
    public co.d getContentType() {
        return this.contentType;
    }

    @Override // co.j
    public boolean isChunked() {
        return this.chunked;
    }

    public void setChunked(boolean z10) {
        this.chunked = z10;
    }

    public void setContentEncoding(co.d dVar) {
        this.contentEncoding = dVar;
    }

    public void setContentType(co.d dVar) {
        this.contentType = dVar;
    }

    public void setContentEncoding(String str) {
        setContentEncoding(str != null ? new org.apache.http.message.b("Content-Encoding", str) : null);
    }

    public void setContentType(String str) {
        setContentType(str != null ? new org.apache.http.message.b("Content-Type", str) : null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this.contentType != null) {
            sb2.append("Content-Type: ");
            sb2.append(this.contentType.getValue());
            sb2.append(',');
        }
        if (this.contentEncoding != null) {
            sb2.append(mTFeqtajA.aTgVyNTnHLi);
            sb2.append(this.contentEncoding.getValue());
            sb2.append(',');
        }
        long contentLength = getContentLength();
        if (contentLength >= 0) {
            sb2.append("Content-Length: ");
            sb2.append(contentLength);
            sb2.append(',');
        }
        sb2.append("Chunked: ");
        sb2.append(this.chunked);
        sb2.append(']');
        return sb2.toString();
    }
}
