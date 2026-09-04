package com.bytedance.adsdk.ugeno.aq;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj implements Parcelable {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Parcelable f12164hn;
    public static final hnj hnj = new hnj() { // from class: com.bytedance.adsdk.ugeno.aq.hnj.1
    };
    public static final Parcelable.Creator<hnj> CREATOR = new Parcelable.ClassLoaderCreator<hnj>() { // from class: com.bytedance.adsdk.ugeno.aq.hnj.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public hnj createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public hnj createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return hnj.hnj;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public hnj[] newArray(int i10) {
            return new hnj[i10];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable hnj() {
        return this.f12164hn;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f12164hn, i10);
    }

    private hnj() {
        this.f12164hn = null;
    }

    protected hnj(Parcelable parcelable) {
        if (parcelable != null) {
            this.f12164hn = parcelable == hnj ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected hnj(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f12164hn = parcelable == null ? hnj : parcelable;
    }
}
