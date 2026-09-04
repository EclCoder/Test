package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45383d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f45381b = str;
        this.f45382c = str2;
        this.f45383d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (r0.c(this.f45382c, eVar.f45382c) && r0.c(this.f45381b, eVar.f45381b) && r0.c(this.f45383d, eVar.f45383d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45381b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45382c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45383d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // ma.i
    public String toString() {
        return this.f45393a + ": language=" + this.f45381b + ", description=" + this.f45382c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45393a);
        parcel.writeString(this.f45381b);
        parcel.writeString(this.f45383d);
    }

    e(Parcel parcel) {
        super(CommentFrame.ID);
        this.f45381b = (String) r0.j(parcel.readString());
        this.f45382c = (String) r0.j(parcel.readString());
        this.f45383d = (String) r0.j(parcel.readString());
    }
}
