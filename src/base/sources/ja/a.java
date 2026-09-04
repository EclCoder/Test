package ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ha.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f42199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v0 f42193g = new v0.b().g0(MimeTypes.APPLICATION_ID3).G();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v0 f42194h = new v0.b().g0(MimeTypes.APPLICATION_SCTE35).G();
    public static final Parcelable.Creator<a> CREATOR = new C0640a();

    /* JADX INFO: renamed from: ja.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0640a implements Parcelable.Creator {
        C0640a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f42195a = str;
        this.f42196b = str2;
        this.f42197c = j10;
        this.f42198d = j11;
        this.f42199e = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f42197c == aVar.f42197c && this.f42198d == aVar.f42198d && r0.c(this.f42195a, aVar.f42195a) && r0.c(this.f42196b, aVar.f42196b) && Arrays.equals(this.f42199e, aVar.f42199e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f42200f == 0) {
            String str = this.f42195a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f42196b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f42197c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f42198d;
            this.f42200f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f42199e);
        }
        return this.f42200f;
    }

    @Override // ha.a.b
    public v0 k() {
        String str = this.f42195a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f42194h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f42193g;
            default:
                return null;
        }
    }

    @Override // ha.a.b
    public byte[] m() {
        if (k() != null) {
            return this.f42199e;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f42195a + ", id=" + this.f42198d + ", durationMs=" + this.f42197c + ", value=" + this.f42196b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42195a);
        parcel.writeString(this.f42196b);
        parcel.writeLong(this.f42197c);
        parcel.writeLong(this.f42198d);
        parcel.writeByteArray(this.f42199e);
    }

    a(Parcel parcel) {
        this.f42195a = (String) r0.j(parcel.readString());
        this.f42196b = (String) r0.j(parcel.readString());
        this.f42197c = parcel.readLong();
        this.f42198d = parcel.readLong();
        this.f42199e = (byte[]) r0.j(parcel.createByteArray());
    }
}
