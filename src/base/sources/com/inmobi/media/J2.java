package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class J2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f25045c;

    public J2(int i10, int i11, String str) {
        str = (i11 & 2) != 0 ? null : str;
        this.f25043a = i10;
        this.f25044b = str;
        this.f25045c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J2)) {
            return false;
        }
        J2 j10 = (J2) obj;
        return this.f25043a == j10.f25043a && kotlin.jvm.internal.s.c(this.f25044b, j10.f25044b) && kotlin.jvm.internal.s.c(this.f25045c, j10.f25045c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f25043a) * 31;
        String str = this.f25044b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f25045c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f25043a + ", eventMessage=" + this.f25044b + ", eventData=" + this.f25045c + ")";
    }

    public J2(int i10, String str, Map map) {
        this.f25043a = i10;
        this.f25044b = str;
        this.f25045c = map;
    }
}
