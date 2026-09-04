package fl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38761a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38761a = iArr;
        }
    }

    public static k a(o mode, tl.a initializer) {
        kotlin.jvm.internal.s.h(mode, "mode");
        kotlin.jvm.internal.s.h(initializer, "initializer");
        int i10 = a.f38761a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new u(initializer, defaultConstructorMarker, i11, defaultConstructorMarker);
        }
        if (i10 == 2) {
            return new t(initializer);
        }
        if (i10 == 3) {
            return new h0(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static k b(tl.a initializer) {
        kotlin.jvm.internal.s.h(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new u(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }
}
