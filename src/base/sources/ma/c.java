package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f45375g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super(ChapterFrame.ID);
        this.f45370b = str;
        this.f45371c = i10;
        this.f45372d = i11;
        this.f45373e = j10;
        this.f45374f = j11;
        this.f45375g = iVarArr;
    }

    @Override // ma.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f45371c == cVar.f45371c && this.f45372d == cVar.f45372d && this.f45373e == cVar.f45373e && this.f45374f == cVar.f45374f && r0.c(this.f45370b, cVar.f45370b) && Arrays.equals(this.f45375g, cVar.f45375g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f45371c) * 31) + this.f45372d) * 31) + ((int) this.f45373e)) * 31) + ((int) this.f45374f)) * 31;
        String str = this.f45370b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45370b);
        parcel.writeInt(this.f45371c);
        parcel.writeInt(this.f45372d);
        parcel.writeLong(this.f45373e);
        parcel.writeLong(this.f45374f);
        parcel.writeInt(this.f45375g.length);
        for (i iVar : this.f45375g) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    c(Parcel parcel) {
        super(ChapterFrame.ID);
        this.f45370b = (String) r0.j(parcel.readString());
        this.f45371c = parcel.readInt();
        this.f45372d = parcel.readInt();
        this.f45373e = parcel.readLong();
        this.f45374f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f45375g = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f45375g[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
