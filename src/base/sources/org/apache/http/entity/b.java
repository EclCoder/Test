package org.apache.http.entity;

import co.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f49235b;

    public b(j jVar) throws IOException {
        super(jVar);
        if (jVar.isRepeatable() && jVar.getContentLength() >= 0) {
            this.f49235b = null;
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        jVar.writeTo(byteArrayOutputStream);
        byteArrayOutputStream.flush();
        this.f49235b = byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.http.entity.e, co.j
    public InputStream getContent() {
        return this.f49235b != null ? new ByteArrayInputStream(this.f49235b) : super.getContent();
    }

    @Override // org.apache.http.entity.e, co.j
    public long getContentLength() {
        byte[] bArr = this.f49235b;
        return bArr != null ? bArr.length : super.getContentLength();
    }

    @Override // org.apache.http.entity.e, co.j
    public boolean isChunked() {
        return this.f49235b == null && super.isChunked();
    }

    @Override // org.apache.http.entity.e, co.j
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.entity.e, co.j
    public boolean isStreaming() {
        return this.f49235b == null && super.isStreaming();
    }

    @Override // org.apache.http.entity.e, co.j
    public void writeTo(OutputStream outputStream) throws IOException {
        ip.a.h(outputStream, "Output stream");
        byte[] bArr = this.f49235b;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.writeTo(outputStream);
        }
    }
}
