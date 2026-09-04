package com.facebook;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends FilterOutputStream implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f16108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z0 f16114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(OutputStream out, n0 requests, Map progressMap, long j10) {
        super(out);
        kotlin.jvm.internal.s.h(out, "out");
        kotlin.jvm.internal.s.h(requests, "requests");
        kotlin.jvm.internal.s.h(progressMap, "progressMap");
        this.f16108a = requests;
        this.f16109b = progressMap;
        this.f16110c = j10;
        this.f16111d = h0.D();
    }

    private final void h(long j10) {
        z0 z0Var = this.f16114g;
        if (z0Var != null) {
            z0Var.a(j10);
        }
        long j11 = this.f16112e + j10;
        this.f16112e = j11;
        if (j11 >= this.f16113f + this.f16111d || j11 >= this.f16110c) {
            k();
        }
    }

    private final void k() {
        if (this.f16112e > this.f16113f) {
            for (n0.a aVar : this.f16108a.p()) {
            }
            this.f16113f = this.f16112e;
        }
    }

    @Override // com.facebook.y0
    public void a(j0 j0Var) {
        this.f16114g = j0Var != null ? (z0) this.f16109b.get(j0Var) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator it = this.f16109b.values().iterator();
        while (it.hasNext()) {
            ((z0) it.next()).c();
        }
        k();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) throws IOException {
        kotlin.jvm.internal.s.h(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        h(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) throws IOException {
        kotlin.jvm.internal.s.h(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        h(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        h(1L);
    }
}
