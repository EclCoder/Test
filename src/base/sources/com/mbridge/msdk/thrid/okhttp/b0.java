package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b0 implements Closeable {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f32982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f32983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okio.e f32984c;

        a(u uVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
            this.f32982a = uVar;
            this.f32983b = j10;
            this.f32984c = eVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public long k() {
            return this.f32983b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public u l() {
            return this.f32982a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public com.mbridge.msdk.thrid.okio.e m() {
            return this.f32984c;
        }
    }

    public static b0 a(u uVar, byte[] bArr) {
        return a(uVar, bArr.length, new com.mbridge.msdk.thrid.okio.c().write(bArr));
    }

    private Charset h() {
        u uVarL = l();
        return uVarL != null ? uVarL.a(com.mbridge.msdk.thrid.okhttp.internal.c.f33116j) : com.mbridge.msdk.thrid.okhttp.internal.c.f33116j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(m());
    }

    public final InputStream d() {
        return m().j();
    }

    public abstract long k();

    public abstract u l();

    public abstract com.mbridge.msdk.thrid.okio.e m();

    public final String n() {
        com.mbridge.msdk.thrid.okio.e eVarM = m();
        try {
            return eVarM.a(com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM, h()));
        } finally {
            com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM);
        }
    }

    public static b0 a(u uVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        if (eVar != null) {
            return new a(uVar, j10, eVar);
        }
        throw new NullPointerException("source == null");
    }
}
