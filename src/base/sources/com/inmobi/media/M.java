package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f25234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25237d;

    public M(RectF visibleRect, ArrayList obstructions, int i10, int i11) {
        kotlin.jvm.internal.s.h(visibleRect, "visibleRect");
        kotlin.jvm.internal.s.h(obstructions, "obstructions");
        this.f25234a = visibleRect;
        this.f25235b = obstructions;
        this.f25236c = i10;
        this.f25237d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return kotlin.jvm.internal.s.c(this.f25234a, m10.f25234a) && kotlin.jvm.internal.s.c(this.f25235b, m10.f25235b) && this.f25236c == m10.f25236c && this.f25237d == m10.f25237d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25237d) + AbstractC3305si.a(this.f25236c, (this.f25235b.hashCode() + (this.f25234a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.f25234a + ", obstructions=" + this.f25235b + ", screenWidth=" + this.f25236c + ", screenHeight=" + this.f25237d + ")";
    }
}
