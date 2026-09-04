package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.d2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d2 extends a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16748e = ob.r0.y0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f16749f = ob.r0.y0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a f16750g = new g.a() { // from class: o9.k0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return d2.d(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16752d;

    public d2(int i10) {
        ob.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f16751c = i10;
        this.f16752d = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d2 d(Bundle bundle) {
        ob.a.a(bundle.getInt(a2.f16450a, -1) == 2);
        int i10 = bundle.getInt(f16748e, 5);
        float f10 = bundle.getFloat(f16749f, -1.0f);
        return f10 == -1.0f ? new d2(i10) : new d2(i10, f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f16751c == d2Var.f16751c && this.f16752d == d2Var.f16752d;
    }

    public int hashCode() {
        return sc.l.b(Integer.valueOf(this.f16751c), Float.valueOf(this.f16752d));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a2.f16450a, 2);
        bundle.putInt(f16748e, this.f16751c);
        bundle.putFloat(f16749f, this.f16752d);
        return bundle;
    }

    public d2(int i10, float f10) {
        boolean z10 = false;
        ob.a.b(i10 > 0, "maxStars must be a positive integer");
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        ob.a.b(z10, "starRating is out of range [0, maxStars]");
        this.f16751c = i10;
        this.f16752d = f10;
    }
}
