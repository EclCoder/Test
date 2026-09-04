package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends OutputStream implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16082b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f16083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f16084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16085e;

    public w0(Handler handler) {
        this.f16081a = handler;
    }

    @Override // com.facebook.y0
    public void a(j0 j0Var) {
        this.f16083c = j0Var;
        this.f16084d = j0Var != null ? (z0) this.f16082b.get(j0Var) : null;
    }

    public final void h(long j10) {
        j0 j0Var = this.f16083c;
        if (j0Var == null) {
            return;
        }
        if (this.f16084d == null) {
            z0 z0Var = new z0(this.f16081a, j0Var);
            this.f16084d = z0Var;
            this.f16082b.put(j0Var, z0Var);
        }
        z0 z0Var2 = this.f16084d;
        if (z0Var2 != null) {
            z0Var2.b(j10);
        }
        this.f16085e += (int) j10;
    }

    public final int k() {
        return this.f16085e;
    }

    public final Map l() {
        return this.f16082b;
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        kotlin.jvm.internal.s.h(buffer, "buffer");
        h(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.s.h(buffer, "buffer");
        h(i11);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        h(1L);
    }
}
