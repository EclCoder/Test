package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.w1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w1 f18938d = new w1(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f18939e = ob.r0.y0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f18940f = ob.r0.y0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a f18941g = new g.a() { // from class: o9.d0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return w1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18944c;

    public w1(float f10) {
        this(f10, 1.0f);
    }

    public static /* synthetic */ w1 a(Bundle bundle) {
        return new w1(bundle.getFloat(f18939e, 1.0f), bundle.getFloat(f18940f, 1.0f));
    }

    public long b(long j10) {
        return j10 * ((long) this.f18944c);
    }

    public w1 c(float f10) {
        return new w1(f10, this.f18943b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w1.class == obj.getClass()) {
            w1 w1Var = (w1) obj;
            if (this.f18942a == w1Var.f18942a && this.f18943b == w1Var.f18943b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f18942a)) * 31) + Float.floatToRawIntBits(this.f18943b);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f18939e, this.f18942a);
        bundle.putFloat(f18940f, this.f18943b);
        return bundle;
    }

    public String toString() {
        return ob.r0.D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f18942a), Float.valueOf(this.f18943b));
    }

    public w1(float f10, float f11) {
        ob.a.a(f10 > 0.0f);
        ob.a.a(f11 > 0.0f);
        this.f18942a = f10;
        this.f18943b = f11;
        this.f18944c = Math.round(f10 * 1000.0f);
    }
}
