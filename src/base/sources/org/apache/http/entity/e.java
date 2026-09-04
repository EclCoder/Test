package org.apache.http.entity;

import co.j;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected j f49262a;

    public e(j jVar) {
        this.f49262a = (j) ip.a.h(jVar, "Wrapped entity");
    }

    @Override // co.j
    public InputStream getContent() {
        return this.f49262a.getContent();
    }

    @Override // co.j
    public co.d getContentEncoding() {
        return this.f49262a.getContentEncoding();
    }

    @Override // co.j
    public long getContentLength() {
        return this.f49262a.getContentLength();
    }

    @Override // co.j
    public co.d getContentType() {
        return this.f49262a.getContentType();
    }

    @Override // co.j
    public boolean isChunked() {
        return this.f49262a.isChunked();
    }

    @Override // co.j
    public boolean isRepeatable() {
        return this.f49262a.isRepeatable();
    }

    @Override // co.j
    public boolean isStreaming() {
        return this.f49262a.isStreaming();
    }

    @Override // co.j
    public void writeTo(OutputStream outputStream) {
        this.f49262a.writeTo(outputStream);
    }
}
