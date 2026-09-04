package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector
        public MediaCodecInfo getDecoderInfo(String str, boolean z10) {
            return MediaCodecUtil.getDecoderInfo(str, z10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector
        public MediaCodecInfo getPassthroughDecoderInfo() {
            return MediaCodecUtil.getPassthroughDecoderInfo();
        }
    };

    MediaCodecInfo getDecoderInfo(String str, boolean z10);

    MediaCodecInfo getPassthroughDecoderInfo();
}
