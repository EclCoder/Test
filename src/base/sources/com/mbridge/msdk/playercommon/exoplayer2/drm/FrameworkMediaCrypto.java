package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.media.MediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class FrameworkMediaCrypto implements ExoMediaCrypto {
    private final boolean forceAllowInsecureDecoderComponents;
    private final MediaCrypto mediaCrypto;

    public FrameworkMediaCrypto(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public MediaCrypto getWrappedMediaCrypto() {
        return this.mediaCrypto;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto
    public boolean requiresSecureDecoderComponent(String str) {
        return !this.forceAllowInsecureDecoderComponents && this.mediaCrypto.requiresSecureDecoderComponent(str);
    }

    public FrameworkMediaCrypto(MediaCrypto mediaCrypto, boolean z10) {
        this.mediaCrypto = (MediaCrypto) Assertions.checkNotNull(mediaCrypto);
        this.forceAllowInsecureDecoderComponents = z10;
    }
}
