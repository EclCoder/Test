package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.w0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f18933e = ob.r0.y0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f18934f = ob.r0.y0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a f18935g = new g.a() { // from class: o9.q
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return w0.d(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18937d;

    public w0() {
        this.f18936c = false;
        this.f18937d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w0 d(Bundle bundle) {
        ob.a.a(bundle.getInt(a2.f16450a, -1) == 0);
        return bundle.getBoolean(f18933e, false) ? new w0(bundle.getBoolean(f18934f, false)) : new w0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f18937d == w0Var.f18937d && this.f18936c == w0Var.f18936c;
    }

    public int hashCode() {
        return sc.l.b(Boolean.valueOf(this.f18936c), Boolean.valueOf(this.f18937d));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a2.f16450a, 0);
        bundle.putBoolean(f18933e, this.f18936c);
        bundle.putBoolean(f18934f, this.f18937d);
        return bundle;
    }

    public w0(boolean z10) {
        this.f18936c = true;
        this.f18937d = z10;
    }
}
