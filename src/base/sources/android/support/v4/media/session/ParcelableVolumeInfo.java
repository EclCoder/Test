package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f536e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f532a = parcel.readInt();
        this.f534c = parcel.readInt();
        this.f535d = parcel.readInt();
        this.f536e = parcel.readInt();
        this.f533b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f532a);
        parcel.writeInt(this.f534c);
        parcel.writeInt(this.f535d);
        parcel.writeInt(this.f536e);
        parcel.writeInt(this.f533b);
    }
}
