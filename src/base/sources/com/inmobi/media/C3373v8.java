package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3373v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f27697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27700e;

    public C3373v8(ArrayList omidTrackers, Map macros, String customReferenceData, String str, boolean z10) {
        kotlin.jvm.internal.s.h(omidTrackers, "omidTrackers");
        kotlin.jvm.internal.s.h(macros, "macros");
        kotlin.jvm.internal.s.h(customReferenceData, "customReferenceData");
        this.f27696a = omidTrackers;
        this.f27697b = macros;
        this.f27698c = customReferenceData;
        this.f27699d = str;
        this.f27700e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3373v8)) {
            return false;
        }
        C3373v8 c3373v8 = (C3373v8) obj;
        return kotlin.jvm.internal.s.c(this.f27696a, c3373v8.f27696a) && kotlin.jvm.internal.s.c(this.f27697b, c3373v8.f27697b) && kotlin.jvm.internal.s.c(this.f27698c, c3373v8.f27698c) && kotlin.jvm.internal.s.c(this.f27699d, c3373v8.f27699d) && this.f27700e == c3373v8.f27700e;
    }

    public final int hashCode() {
        int iHashCode = (this.f27698c.hashCode() + ((this.f27697b.hashCode() + (this.f27696a.hashCode() * 31)) * 31)) * 31;
        String str = this.f27699d;
        return Boolean.hashCode(this.f27700e) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.f27696a + ", macros=" + this.f27697b + ", customReferenceData=" + this.f27698c + ", contentUrl=" + this.f27699d + ", isolateVerificationScripts=" + this.f27700e + ")";
    }
}
