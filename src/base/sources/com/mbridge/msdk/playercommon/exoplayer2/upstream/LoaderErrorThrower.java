package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface LoaderErrorThrower {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Dummy implements LoaderErrorThrower {
        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int i10) {
        }
    }

    void maybeThrowError();

    void maybeThrowError(int i10);
}
