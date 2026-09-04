package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.inmobi.media.fb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2962fb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        kotlin.jvm.internal.s.h(parcel, "parcel");
        long j10 = parcel.readLong();
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        String str6 = string6 == null ? "" : string6;
        boolean z10 = parcel.readByte() != 0;
        String string7 = parcel.readString();
        C3014hb c3014hb = new C3014hb(j10, str, str2, str3, str4, str5, str6, z10, string7 == null ? "" : string7);
        String string8 = parcel.readString();
        C2988gb c2988gb = new C2988gb(c3014hb, string8 == null ? "" : string8, parcel.readInt(), parcel.readLong());
        c2988gb.f26601e = parcel.readInt();
        c2988gb.f26602f = parcel.readString();
        return c2988gb;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C2988gb[i10];
    }
}
