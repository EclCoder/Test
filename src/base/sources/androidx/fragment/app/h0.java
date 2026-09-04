package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f4132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList f4133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b[] f4134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f4135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f4136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f4137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f4138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList f4139h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 createFromParcel(Parcel parcel) {
            return new h0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0[] newArray(int i10) {
            return new h0[i10];
        }
    }

    public h0() {
        this.f4136e = null;
        this.f4137f = new ArrayList();
        this.f4138g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4132a);
        parcel.writeStringList(this.f4133b);
        parcel.writeTypedArray(this.f4134c, i10);
        parcel.writeInt(this.f4135d);
        parcel.writeString(this.f4136e);
        parcel.writeStringList(this.f4137f);
        parcel.writeTypedList(this.f4138g);
        parcel.writeTypedList(this.f4139h);
    }

    public h0(Parcel parcel) {
        this.f4136e = null;
        this.f4137f = new ArrayList();
        this.f4138g = new ArrayList();
        this.f4132a = parcel.createStringArrayList();
        this.f4133b = parcel.createStringArrayList();
        this.f4134c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f4135d = parcel.readInt();
        this.f4136e = parcel.readString();
        this.f4137f = parcel.createStringArrayList();
        this.f4138g = parcel.createTypedArrayList(c.CREATOR);
        this.f4139h = parcel.createTypedArrayList(f0.m.CREATOR);
    }
}
