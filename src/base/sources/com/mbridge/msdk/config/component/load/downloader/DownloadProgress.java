package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28802c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator<DownloadProgress> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    }

    public DownloadProgress(long j10, long j11, int i10) {
        this.f28800a = j10;
        this.f28802c = j11;
        this.f28801b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f28800a;
    }

    public int getCurrentDownloadRate() {
        return this.f28801b;
    }

    public long getTotal() {
        return this.f28802c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f28800a);
        parcel.writeLong(this.f28802c);
        parcel.writeInt(this.f28801b);
    }

    protected DownloadProgress(Parcel parcel) {
        this.f28800a = parcel.readLong();
        this.f28802c = parcel.readLong();
        this.f28801b = parcel.readInt();
    }
}
