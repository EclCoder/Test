package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3365v0 implements Parcelable {
    public static final Parcelable.Creator<C3365v0> CREATOR = new C3339u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27669k;

    public C3365v0(long j10, String str, String str2, String str3) {
        this.f27666h = "";
        this.f27667i = "activity";
        this.f27659a = j10;
        this.f27663e = str2;
        this.f27660b = str;
        this.f27664f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3365v0)) {
            return false;
        }
        C3365v0 c3365v0 = (C3365v0) obj;
        return this.f27659a == c3365v0.f27659a && kotlin.jvm.internal.s.c(this.f27667i, c3365v0.f27667i) && kotlin.jvm.internal.s.c(this.f27660b, c3365v0.f27660b) && kotlin.jvm.internal.s.c(this.f27663e, c3365v0.f27663e);
    }

    public final int hashCode() {
        long j10 = this.f27659a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f27663e;
        return this.f27667i.hashCode() + ((i10 + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.f27659a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.s.h(dest, "dest");
        dest.writeLong(this.f27659a);
        dest.writeString(this.f27667i);
        dest.writeString(this.f27663e);
    }

    public C3365v0(Parcel parcel) {
        this.f27666h = "";
        String str = "activity";
        this.f27667i = "activity";
        this.f27659a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !kotlin.jvm.internal.s.c(string, "activity") && kotlin.jvm.internal.s.c(string, "others")) {
            str = "others";
        }
        this.f27667i = str;
        this.f27663e = parcel.readString();
    }
}
