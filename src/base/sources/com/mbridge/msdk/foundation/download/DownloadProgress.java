package com.mbridge.msdk.foundation.download;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new Parcelable.Creator<DownloadProgress>() { // from class: com.mbridge.msdk.foundation.download.DownloadProgress.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    };
    private long current;
    private int currentDownloadRate;
    private long total;

    public DownloadProgress(long j10, long j11, int i10) {
        this.current = j10;
        this.total = j11;
        this.currentDownloadRate = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.current;
    }

    public int getCurrentDownloadRate() {
        return this.currentDownloadRate;
    }

    public long getTotal() {
        return this.total;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.current);
        parcel.writeLong(this.total);
        parcel.writeInt(this.currentDownloadRate);
    }

    protected DownloadProgress(Parcel parcel) {
        this.current = parcel.readLong();
        this.total = parcel.readLong();
        this.currentDownloadRate = parcel.readInt();
    }
}
