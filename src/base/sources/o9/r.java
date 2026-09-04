package o9;

import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.h2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface r {
    boolean a(h2 h2Var, ra.k kVar, long j10, float f10, boolean z10, long j11);

    void b(h2 h2Var, ra.k kVar, b2[] b2VarArr, ra.x xVar, lb.r[] rVarArr);

    boolean c(long j10, long j11, float f10);

    nb.b getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    boolean retainBackBufferFromKeyframe();
}
