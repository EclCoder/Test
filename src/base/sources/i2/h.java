package i2;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements q {
    @Override // i2.q
    public int a(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        decoderInputBuffer.i(4);
        return -4;
    }

    @Override // i2.q
    public boolean isReady() {
        return true;
    }

    @Override // i2.q
    public int skipData(long j10) {
        return 0;
    }

    @Override // i2.q
    public void maybeThrowError() {
    }
}
