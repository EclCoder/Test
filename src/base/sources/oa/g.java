package oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import ob.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48341b;

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

    static g a(d0 d0Var, long j10, n0 n0Var) {
        long jB = b(d0Var, j10);
        return new g(jB, n0Var.b(jB));
    }

    static long b(d0 d0Var, long j10) {
        long jH = d0Var.H();
        return (128 & jH) != 0 ? 8589934591L & ((((jH & 1) << 32) | d0Var.J()) + j10) : C.TIME_UNSET;
    }

    @Override // oa.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f48340a + ", playbackPositionUs= " + this.f48341b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f48340a);
        parcel.writeLong(this.f48341b);
    }

    private g(long j10, long j11) {
        this.f48340a = j10;
        this.f48341b = j11;
    }
}
