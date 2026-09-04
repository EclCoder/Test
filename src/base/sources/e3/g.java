package e3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import w1.u;
import w1.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37096b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* synthetic */ g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static g a(u uVar, long j10, z zVar) {
        long jB = b(uVar, j10);
        return new g(jB, zVar.b(jB));
    }

    static long b(u uVar, long j10) {
        long jG = uVar.G();
        return (128 & jG) != 0 ? 8589934591L & ((((jG & 1) << 32) | uVar.I()) + j10) : C.TIME_UNSET;
    }

    @Override // e3.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f37095a + ", playbackPositionUs= " + this.f37096b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f37095a);
        parcel.writeLong(this.f37096b);
    }

    private g(long j10, long j11) {
        this.f37095a = j10;
        this.f37096b = j11;
    }
}
