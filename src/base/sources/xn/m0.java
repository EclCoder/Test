package xn;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f56960a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f56961b = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l0 f56962c = new l0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f56963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f56964e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f56963d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f56964e = atomicReferenceArr;
    }

    private m0() {
    }

    private final AtomicReference a() {
        return f56964e[(int) (Thread.currentThread().getId() & (((long) f56963d) - 1))];
    }

    public static final void b(l0 segment) {
        kotlin.jvm.internal.s.h(segment, "segment");
        if (segment.f56957f != null || segment.f56958g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f56955d) {
            return;
        }
        AtomicReference atomicReferenceA = f56960a.a();
        l0 l0Var = f56962c;
        l0 l0Var2 = (l0) atomicReferenceA.getAndSet(l0Var);
        if (l0Var2 == l0Var) {
            return;
        }
        int i10 = l0Var2 != null ? l0Var2.f56954c : 0;
        if (i10 >= f56961b) {
            atomicReferenceA.set(l0Var2);
            return;
        }
        segment.f56957f = l0Var2;
        segment.f56953b = 0;
        segment.f56954c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final l0 c() {
        AtomicReference atomicReferenceA = f56960a.a();
        l0 l0Var = f56962c;
        l0 l0Var2 = (l0) atomicReferenceA.getAndSet(l0Var);
        if (l0Var2 == l0Var) {
            return new l0();
        }
        if (l0Var2 == null) {
            atomicReferenceA.set(null);
            return new l0();
        }
        atomicReferenceA.set(l0Var2.f56957f);
        l0Var2.f56957f = null;
        l0Var2.f56954c = 0;
        return l0Var2;
    }
}
