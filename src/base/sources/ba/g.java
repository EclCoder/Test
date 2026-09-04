package ba;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
interface g extends z {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends z.b implements g {
        public a() {
            super(C.TIME_UNSET);
        }

        @Override // ba.g
        public long a() {
            return -1L;
        }

        @Override // ba.g
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    long a();

    long getTimeUs(long j10);
}
