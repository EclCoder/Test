package com.inmobi.media;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.da, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2910da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f26400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f26401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3453yb f26402c;

    public C2910da(JSONObject vitals, JSONArray logs, C3453yb data) {
        kotlin.jvm.internal.s.h(vitals, "vitals");
        kotlin.jvm.internal.s.h(logs, "logs");
        kotlin.jvm.internal.s.h(data, "data");
        this.f26400a = vitals;
        this.f26401b = logs;
        this.f26402c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2910da)) {
            return false;
        }
        C2910da c2910da = (C2910da) obj;
        return kotlin.jvm.internal.s.c(this.f26400a, c2910da.f26400a) && kotlin.jvm.internal.s.c(this.f26401b, c2910da.f26401b) && kotlin.jvm.internal.s.c(this.f26402c, c2910da.f26402c);
    }

    public final int hashCode() {
        return this.f26402c.hashCode() + ((this.f26401b.hashCode() + (this.f26400a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f26400a + ", logs=" + this.f26401b + ", data=" + this.f26402c + ")";
    }
}
