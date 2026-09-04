package w2;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55875b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f55876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f55878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f55879d;

        public a(String str, String str2, long j10, long j11) {
            this.f55876a = str;
            this.f55877b = str2;
            this.f55878c = j10;
            this.f55879d = j11;
        }
    }

    public c(long j10, List list) {
        this.f55874a = j10;
        this.f55875b = list;
    }

    public d3.a a(long j10) {
        long j11;
        if (this.f55875b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f55875b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f55875b.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(aVar.f55876a) | z10;
            if (size == 0) {
                j12 -= aVar.f55879d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f55878c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new d3.a(j13, j14, this.f55874a, j15, j16);
    }
}
