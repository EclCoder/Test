package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3460yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27958a;

    public C3460yi(int i10) {
        this.f27958a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3460yi) && this.f27958a == ((C3460yi) obj).f27958a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27958a);
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.f27958a + ")";
    }
}
