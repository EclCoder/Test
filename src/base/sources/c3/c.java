package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f9508g;

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
        this.f9503b = str;
        this.f9504c = i10;
        this.f9505d = i11;
        this.f9506e = j10;
        this.f9507f = j11;
        this.f9508g = iVarArr;
    }

    @Override // c3.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f9504c == cVar.f9504c && this.f9505d == cVar.f9505d && this.f9506e == cVar.f9506e && this.f9507f == cVar.f9507f && c0.c(this.f9503b, cVar.f9503b) && Arrays.equals(this.f9508g, cVar.f9508g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f9504c) * 31) + this.f9505d) * 31) + ((int) this.f9506e)) * 31) + ((int) this.f9507f)) * 31;
        String str = this.f9503b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9503b);
        parcel.writeInt(this.f9504c);
        parcel.writeInt(this.f9505d);
        parcel.writeLong(this.f9506e);
        parcel.writeLong(this.f9507f);
        parcel.writeInt(this.f9508g.length);
        for (i iVar : this.f9508g) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    c(Parcel parcel) {
        super(ChapterFrame.ID);
        this.f9503b = (String) c0.h(parcel.readString());
        this.f9504c = parcel.readInt();
        this.f9505d = parcel.readInt();
        this.f9506e = parcel.readLong();
        this.f9507f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f9508g = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f9508g[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
