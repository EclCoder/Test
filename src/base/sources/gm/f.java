package gm;

import jm.d0;
import jm.g0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f39367a = new l(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39368b = g0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f39369c = g0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f39370d = new d0("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d0 f39371e = new d0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d0 f39372f = new d0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d0 f39373g = new d0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d0 f39374h = new d0("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d0 f39375i = new d0("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d0 f39376j = new d0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final d0 f39377k = new d0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final d0 f39378l = new d0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final d0 f39379m = new d0("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final d0 f39380n = new d0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final d0 f39381o = new d0("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final d0 f39382p = new d0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final d0 f39383q = new d0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final d0 f39384r = new d0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final d0 f39385s = new d0("NO_CLOSE_CAUSE");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final /* synthetic */ class a extends kotlin.jvm.internal.p implements tl.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39386a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final l b(long j10, l lVar) {
            return f.x(j10, lVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (l) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(em.o oVar, Object obj, Function3 function3) {
        Object objX = oVar.x(obj, null, function3);
        if (objX == null) {
            return false;
        }
        oVar.z(objX);
        return true;
    }

    static /* synthetic */ boolean C(em.o oVar, Object obj, Function3 function3, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function3 = null;
        }
        return B(oVar, obj, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l x(long j10, l lVar) {
        return new l(j10, lVar, lVar.y(), 0);
    }

    public static final zl.f y() {
        return a.f39386a;
    }

    public static final d0 z() {
        return f39378l;
    }
}
