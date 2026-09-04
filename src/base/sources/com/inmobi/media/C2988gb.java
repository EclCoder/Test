package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.inmobi.media.gb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2988gb implements Parcelable {
    public static final C2962fb CREATOR = new C2962fb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3014hb f26597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26602f;

    public C2988gb(C3014hb landingPageTelemetryMetaData, String urlType, int i10, long j10) {
        kotlin.jvm.internal.s.h(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        kotlin.jvm.internal.s.h(urlType, "urlType");
        this.f26597a = landingPageTelemetryMetaData;
        this.f26598b = urlType;
        this.f26599c = i10;
        this.f26600d = j10;
        this.f26601e = -1;
    }

    public static C2988gb a(C2988gb c2988gb) {
        C3014hb landingPageTelemetryMetaData = c2988gb.f26597a;
        String urlType = c2988gb.f26598b;
        int i10 = c2988gb.f26599c;
        long j10 = c2988gb.f26600d;
        kotlin.jvm.internal.s.h(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        kotlin.jvm.internal.s.h(urlType, "urlType");
        return new C2988gb(landingPageTelemetryMetaData, urlType, i10, j10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2988gb)) {
            return false;
        }
        C2988gb c2988gb = (C2988gb) obj;
        return kotlin.jvm.internal.s.c(this.f26597a, c2988gb.f26597a) && kotlin.jvm.internal.s.c(this.f26598b, c2988gb.f26598b) && this.f26599c == c2988gb.f26599c && this.f26600d == c2988gb.f26600d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26600d) + AbstractC3305si.a(this.f26599c, (this.f26598b.hashCode() + (this.f26597a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.f26597a + ", urlType=" + this.f26598b + ", counter=" + this.f26599c + ", startTime=" + this.f26600d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        kotlin.jvm.internal.s.h(parcel, "parcel");
        parcel.writeLong(this.f26597a.f26666a);
        parcel.writeString(this.f26597a.f26667b);
        parcel.writeString(this.f26597a.f26668c);
        parcel.writeString(this.f26597a.f26669d);
        parcel.writeString(this.f26597a.f26670e);
        parcel.writeString(this.f26597a.f26671f);
        parcel.writeString(this.f26597a.f26672g);
        parcel.writeByte(this.f26597a.f26673h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f26597a.f26674i);
        parcel.writeString(this.f26598b);
        parcel.writeInt(this.f26599c);
        parcel.writeLong(this.f26600d);
        parcel.writeInt(this.f26601e);
        parcel.writeString(this.f26602f);
    }
}
