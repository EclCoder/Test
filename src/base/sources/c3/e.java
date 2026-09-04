package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9516d;

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
        this.f9514b = str;
        this.f9515c = str2;
        this.f9516d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (c0.c(this.f9515c, eVar.f9515c) && c0.c(this.f9514b, eVar.f9514b) && c0.c(this.f9516d, eVar.f9516d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9514b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9515c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9516d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // c3.i
    public String toString() {
        return this.f9526a + ": language=" + this.f9514b + ", description=" + this.f9515c + ", text=" + this.f9516d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9526a);
        parcel.writeString(this.f9514b);
        parcel.writeString(this.f9516d);
    }

    e(Parcel parcel) {
        super(CommentFrame.ID);
        this.f9514b = (String) c0.h(parcel.readString());
        this.f9515c = (String) c0.h(parcel.readString());
        this.f9516d = (String) c0.h(parcel.readString());
    }
}
