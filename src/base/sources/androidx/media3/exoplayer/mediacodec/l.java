package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5629a = new l() { // from class: g2.f
        @Override // androidx.media3.exoplayer.mediacodec.l
        public final List a(String str, boolean z10, boolean z11) {
            return MediaCodecUtil.t(str, z10, z11);
        }
    };

    List a(String str, boolean z10, boolean z11);
}
