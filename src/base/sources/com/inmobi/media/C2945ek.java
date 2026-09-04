package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ek, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2945ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26514b;

    public C2945ek(String tableName, String tableSchema) {
        kotlin.jvm.internal.s.h(tableName, "tableName");
        kotlin.jvm.internal.s.h(tableSchema, "tableSchema");
        this.f26513a = tableName;
        this.f26514b = tableSchema;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2945ek)) {
            return false;
        }
        C2945ek c2945ek = (C2945ek) obj;
        return kotlin.jvm.internal.s.c(this.f26513a, c2945ek.f26513a) && kotlin.jvm.internal.s.c(this.f26514b, c2945ek.f26514b);
    }

    public final int hashCode() {
        return this.f26514b.hashCode() + (this.f26513a.hashCode() * 31);
    }

    public final String toString() {
        return "TableInfo(tableName=" + this.f26513a + ", tableSchema=" + this.f26514b + ")";
    }
}
