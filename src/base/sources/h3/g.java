package h3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
interface g extends j0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends j0.b implements g {
        public a() {
            super(C.TIME_UNSET);
        }

        @Override // h3.g
        public long a() {
            return -1L;
        }

        @Override // h3.g
        public int g() {
            return -2147483647;
        }

        @Override // h3.g
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    long a();

    int g();

    long getTimeUs(long j10);
}
