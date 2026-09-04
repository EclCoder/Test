package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.inmobi.media.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3339u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        kotlin.jvm.internal.s.h(source, "source");
        return new C3365v0(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C3365v0[i10];
    }
}
