package i2;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface q {
    int a(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10);

    boolean isReady();

    void maybeThrowError();

    int skipData(long j10);
}
