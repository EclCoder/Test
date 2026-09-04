package z9;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f58674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f58675b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f58677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f58678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f58679d;

        public a(String str, String str2, long j10, long j11) {
            this.f58676a = str;
            this.f58677b = str2;
            this.f58678c = j10;
            this.f58679d = j11;
        }
    }

    public b(long j10, List list) {
        this.f58674a = j10;
        this.f58675b = list;
    }

    public na.b a(long j10) {
        long j11;
        if (this.f58675b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f58675b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f58675b.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(aVar.f58676a) | z10;
            if (size == 0) {
                j12 -= aVar.f58679d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f58678c;
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
        return new na.b(j13, j14, this.f58674a, j15, j16);
    }
}
