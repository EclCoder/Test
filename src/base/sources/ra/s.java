package ra;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface s {
    int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10);

    boolean isReady();

    void maybeThrowError();

    int skipData(long j10);
}
