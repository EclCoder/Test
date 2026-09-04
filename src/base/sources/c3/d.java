package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f9512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f9513f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super(ChapterTocFrame.ID);
        this.f9509b = str;
        this.f9510c = z10;
        this.f9511d = z11;
        this.f9512e = strArr;
        this.f9513f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f9510c == dVar.f9510c && this.f9511d == dVar.f9511d && c0.c(this.f9509b, dVar.f9509b) && Arrays.equals(this.f9512e, dVar.f9512e) && Arrays.equals(this.f9513f, dVar.f9513f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f9510c ? 1 : 0)) * 31) + (this.f9511d ? 1 : 0)) * 31;
        String str = this.f9509b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9509b);
        parcel.writeByte(this.f9510c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9511d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f9512e);
        parcel.writeInt(this.f9513f.length);
        for (i iVar : this.f9513f) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    d(Parcel parcel) {
        super(ChapterTocFrame.ID);
        this.f9509b = (String) c0.h(parcel.readString());
        this.f9510c = parcel.readByte() != 0;
        this.f9511d = parcel.readByte() != 0;
        this.f9512e = (String[]) c0.h(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f9513f = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f9513f[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
