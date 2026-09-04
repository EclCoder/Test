package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;

/* JADX INFO: renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2911db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InlineParams f26407e;

    public C2911db(boolean z10, String landingScheme, boolean z11, boolean z12, InlineParams inlineParams) {
        kotlin.jvm.internal.s.h(landingScheme, "landingScheme");
        this.f26403a = z10;
        this.f26404b = landingScheme;
        this.f26405c = z11;
        this.f26406d = z12;
        this.f26407e = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2911db)) {
            return false;
        }
        C2911db c2911db = (C2911db) obj;
        return this.f26403a == c2911db.f26403a && kotlin.jvm.internal.s.c(this.f26404b, c2911db.f26404b) && this.f26405c == c2911db.f26405c && this.f26406d == c2911db.f26406d && kotlin.jvm.internal.s.c(this.f26407e, c2911db.f26407e);
    }

    public final int hashCode() {
        int iHashCode = (Boolean.hashCode(this.f26406d) + ((Boolean.hashCode(this.f26405c) + ((this.f26404b.hashCode() + (Boolean.hashCode(this.f26403a) * 31)) * 31)) * 31)) * 31;
        InlineParams inlineParams = this.f26407e;
        return iHashCode + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f26403a + ", landingScheme=" + this.f26404b + ", isCCTEnabled=" + this.f26405c + ", isPartialTabsEnabled=" + this.f26406d + ", inlineParams=" + this.f26407e + ")";
    }

    public /* synthetic */ C2911db(boolean z10, String str, boolean z11, int i10) {
        this(z10, (i10 & 2) != 0 ? "DEFAULT" : str, z11, false, null);
    }
}
