package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.a2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a2 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f16450a = ob.r0.y0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g.a f16451b = new g.a() { // from class: o9.g0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return a2.b(bundle);
        }
    };

    a2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a2 b(Bundle bundle) {
        int i10 = bundle.getInt(f16450a, -1);
        if (i10 == 0) {
            return (a2) w0.f18935g.a(bundle);
        }
        if (i10 == 1) {
            return (a2) t1.f18334e.a(bundle);
        }
        if (i10 == 2) {
            return (a2) d2.f16750g.a(bundle);
        }
        if (i10 == 3) {
            return (a2) g2.f16955g.a(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i10);
    }
}
