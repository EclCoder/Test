package org.apache.http.impl.client;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class v extends c0 implements co.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private co.j f49324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49325g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends org.apache.http.entity.e {
        a(co.j jVar) {
            super(jVar);
        }

        @Override // org.apache.http.entity.e, co.j
        public InputStream getContent() {
            v.this.f49325g = true;
            return super.getContent();
        }

        @Override // org.apache.http.entity.e, co.j
        public void writeTo(OutputStream outputStream) {
            v.this.f49325g = true;
            super.writeTo(outputStream);
        }
    }

    public v(co.k kVar) {
        super(kVar);
        setEntity(kVar.getEntity());
    }

    @Override // co.k
    public boolean expectContinue() {
        co.d firstHeader = getFirstHeader("Expect");
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    @Override // org.apache.http.impl.client.c0
    public boolean f() {
        co.j jVar = this.f49324f;
        return jVar == null || jVar.isRepeatable() || !this.f49325g;
    }

    @Override // co.k
    public co.j getEntity() {
        return this.f49324f;
    }

    @Override // co.k
    public void setEntity(co.j jVar) {
        this.f49324f = jVar != null ? new a(jVar) : null;
        this.f49325g = false;
    }
}
