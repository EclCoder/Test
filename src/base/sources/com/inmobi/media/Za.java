package com.inmobi.media;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Za extends AbstractC2833ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f26134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26137d;

    public Za(Activity activity, String finalUrl, String callerId, boolean z10) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(finalUrl, "finalUrl");
        kotlin.jvm.internal.s.h(callerId, "callerId");
        this.f26134a = activity;
        this.f26135b = finalUrl;
        this.f26136c = callerId;
        this.f26137d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Za)) {
            return false;
        }
        Za za2 = (Za) obj;
        return kotlin.jvm.internal.s.c(this.f26134a, za2.f26134a) && kotlin.jvm.internal.s.c(this.f26135b, za2.f26135b) && kotlin.jvm.internal.s.c(this.f26136c, za2.f26136c) && this.f26137d == za2.f26137d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26137d) + ((this.f26136c.hashCode() + ((this.f26135b.hashCode() + (this.f26134a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.f26134a + ", finalUrl=" + this.f26135b + ", callerId=" + this.f26136c + ", overlay=" + this.f26137d + ")";
    }
}
