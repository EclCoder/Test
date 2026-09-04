package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30669c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator<BatchReportMessage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f30669c = str;
        this.f30667a = str2;
        this.f30668b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f30667a;
    }

    public long getTimestamp() {
        return this.f30668b;
    }

    public String getUuid() {
        return this.f30669c;
    }

    public void setReportMessage(String str) {
        this.f30667a = str;
    }

    public void setTimestamp(long j10) {
        this.f30668b = j10;
    }

    public void setUuid(String str) {
        this.f30669c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f30669c);
        parcel.writeString(this.f30667a);
        parcel.writeLong(this.f30668b);
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f30669c = parcel.readString();
        this.f30667a = parcel.readString();
        this.f30668b = parcel.readLong();
    }
}
