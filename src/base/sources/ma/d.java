package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f45379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f45380f;

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
        this.f45376b = str;
        this.f45377c = z10;
        this.f45378d = z11;
        this.f45379e = strArr;
        this.f45380f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45377c == dVar.f45377c && this.f45378d == dVar.f45378d && r0.c(this.f45376b, dVar.f45376b) && Arrays.equals(this.f45379e, dVar.f45379e) && Arrays.equals(this.f45380f, dVar.f45380f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f45377c ? 1 : 0)) * 31) + (this.f45378d ? 1 : 0)) * 31;
        String str = this.f45376b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45376b);
        parcel.writeByte(this.f45377c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f45378d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f45379e);
        parcel.writeInt(this.f45380f.length);
        for (i iVar : this.f45380f) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    d(Parcel parcel) {
        super(ChapterTocFrame.ID);
        this.f45376b = (String) r0.j(parcel.readString());
        this.f45377c = parcel.readByte() != 0;
        this.f45378d = parcel.readByte() != 0;
        this.f45379e = (String[]) r0.j(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f45380f = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f45380f[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
