package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import t1.o;
import t1.u;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f58582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f58583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f58584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o f58577g = new o.b().o0(MimeTypes.APPLICATION_ID3).K();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final o f58578h = new o.b().o0(MimeTypes.APPLICATION_SCTE35).K();
    public static final Parcelable.Creator<a> CREATOR = new C0900a();

    /* JADX INFO: renamed from: z2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0900a implements Parcelable.Creator {
        C0900a() {
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
        this.f58579a = str;
        this.f58580b = str2;
        this.f58581c = j10;
        this.f58582d = j11;
        this.f58583e = bArr;
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
            if (this.f58581c == aVar.f58581c && this.f58582d == aVar.f58582d && c0.c(this.f58579a, aVar.f58579a) && c0.c(this.f58580b, aVar.f58580b) && Arrays.equals(this.f58583e, aVar.f58583e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f58584f == 0) {
            String str = this.f58579a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f58580b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f58581c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f58582d;
            this.f58584f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f58583e);
        }
        return this.f58584f;
    }

    @Override // t1.u.b
    public o k() {
        String str = this.f58579a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f58578h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f58577g;
            default:
                return null;
        }
    }

    @Override // t1.u.b
    public byte[] m() {
        if (k() != null) {
            return this.f58583e;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f58579a + ", id=" + this.f58582d + ", durationMs=" + this.f58581c + ", value=" + this.f58580b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f58579a);
        parcel.writeString(this.f58580b);
        parcel.writeLong(this.f58581c);
        parcel.writeLong(this.f58582d);
        parcel.writeByteArray(this.f58583e);
    }

    a(Parcel parcel) {
        this.f58579a = (String) c0.h(parcel.readString());
        this.f58580b = (String) c0.h(parcel.readString());
        this.f58581c = parcel.readLong();
        this.f58582d = parcel.readLong();
        this.f58583e = (byte[]) c0.h(parcel.createByteArray());
    }
}
