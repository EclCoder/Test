package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.t1;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f18333d = ob.r0.y0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g.a f18334e = new g.a() { // from class: o9.c0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return t1.d(bundle);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18335c;

    public t1() {
        this.f18335c = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t1 d(Bundle bundle) {
        ob.a.a(bundle.getInt(a2.f16450a, -1) == 1);
        float f10 = bundle.getFloat(f18333d, -1.0f);
        return f10 == -1.0f ? new t1() : new t1(f10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof t1) && this.f18335c == ((t1) obj).f18335c;
    }

    public int hashCode() {
        return sc.l.b(Float.valueOf(this.f18335c));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a2.f16450a, 1);
        bundle.putFloat(f18333d, this.f18335c);
        return bundle;
    }

    public t1(float f10) {
        ob.a.b(f10 >= 0.0f && f10 <= 100.0f, lkCBSIFlvmyGX.GTzLrwonxIZtP);
        this.f18335c = f10;
    }
}
