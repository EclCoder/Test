package em;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum q0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ ml.a f38049f = ml.b.a(d());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38050a;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38050a = iArr;
        }
    }

    public final void e(tl.o oVar, Object obj, kl.f fVar) {
        int i10 = a.f38050a[ordinal()];
        if (i10 == 1) {
            km.a.c(oVar, obj, fVar);
            return;
        }
        if (i10 == 2) {
            kl.h.a(oVar, obj, fVar);
        } else if (i10 == 3) {
            km.b.c(oVar, obj, fVar);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean g() {
        return this == LAZY;
    }
}
