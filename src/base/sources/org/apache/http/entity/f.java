package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte[] f49263a;

    public f(String str, d dVar) {
        ip.a.h(str, "Source string");
        Charset charsetG = dVar != null ? dVar.g() : null;
        this.f49263a = str.getBytes(charsetG == null ? gp.e.f39837a : charsetG);
        if (dVar != null) {
            setContentType(dVar.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    @Override // co.j
    public InputStream getContent() {
        return new ByteArrayInputStream(this.f49263a);
    }

    @Override // co.j
    public long getContentLength() {
        return this.f49263a.length;
    }

    @Override // co.j
    public boolean isRepeatable() {
        return true;
    }

    @Override // co.j
    public boolean isStreaming() {
        return false;
    }

    @Override // co.j
    public void writeTo(OutputStream outputStream) throws IOException {
        ip.a.h(outputStream, "Output stream");
        outputStream.write(this.f49263a);
        outputStream.flush();
    }
}
