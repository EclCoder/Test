package qh;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f50801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f50802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f50803d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            s.h(parcel, "parcel");
            return new b(parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String path, float f10, float f11, float f12) {
        s.h(path, "path");
        this.f50800a = path;
        this.f50801b = f10;
        this.f50802c = f11;
        this.f50803d = f12;
    }

    public final String a() {
        return this.f50800a;
    }

    public final float b() {
        return this.f50801b;
    }

    public final float c() {
        return this.f50802c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.f50803d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.c(this.f50800a, bVar.f50800a) && Float.compare(this.f50801b, bVar.f50801b) == 0 && Float.compare(this.f50802c, bVar.f50802c) == 0 && Float.compare(this.f50803d, bVar.f50803d) == 0;
    }

    public final void f(String str) {
        s.h(str, "<set-?>");
        this.f50800a = str;
    }

    public final void g(float f10) {
        this.f50801b = f10;
    }

    public int hashCode() {
        return (((((this.f50800a.hashCode() * 31) + Float.hashCode(this.f50801b)) * 31) + Float.hashCode(this.f50802c)) * 31) + Float.hashCode(this.f50803d);
    }

    public final void i(float f10) {
        this.f50802c = f10;
    }

    public final void j(float f10) {
        this.f50803d = f10;
    }

    public String toString() {
        return "BackgroundItem(path=" + this.f50800a + ", relX=" + this.f50801b + ", relY=" + this.f50802c + ", scale=" + this.f50803d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeString(this.f50800a);
        dest.writeFloat(this.f50801b);
        dest.writeFloat(this.f50802c);
        dest.writeFloat(this.f50803d);
    }
}
