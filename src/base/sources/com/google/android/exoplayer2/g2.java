package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g2 extends a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16953e = ob.r0.y0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f16954f = ob.r0.y0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a f16955g = new g.a() { // from class: o9.l0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return g2.d(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16957d;

    public g2() {
        this.f16956c = false;
        this.f16957d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g2 d(Bundle bundle) {
        ob.a.a(bundle.getInt(a2.f16450a, -1) == 3);
        return bundle.getBoolean(f16953e, false) ? new g2(bundle.getBoolean(f16954f, false)) : new g2();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f16957d == g2Var.f16957d && this.f16956c == g2Var.f16956c;
    }

    public int hashCode() {
        return sc.l.b(Boolean.valueOf(this.f16956c), Boolean.valueOf(this.f16957d));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a2.f16450a, 3);
        bundle.putBoolean(f16953e, this.f16956c);
        bundle.putBoolean(f16954f, this.f16957d);
        return bundle;
    }

    public g2(boolean z10) {
        this.f16956c = true;
        this.f16957d = z10;
    }
}
