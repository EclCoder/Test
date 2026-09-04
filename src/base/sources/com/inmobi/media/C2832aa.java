package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2832aa {
    private final boolean GPID;

    public C2832aa() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2832aa) && this.GPID == ((C2832aa) obj).GPID;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.GPID);
    }

    public C2832aa(boolean z10) {
        this.GPID = z10;
    }

    public final String toString() {
        return HqKnbV.McyUdifI + this.GPID + ")";
    }

    public /* synthetic */ C2832aa(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
