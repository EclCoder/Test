package nm;

import jm.d0;
import jm.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f47851a = g0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0 f47852b = new d0("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d0 f47853c = new d0("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d0 f47854d = new d0("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d0 f47855e = new d0("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f47856f = g0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(long j10, k kVar) {
        return new k(j10, kVar, 0);
    }
}
