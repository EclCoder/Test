package xl;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends wl.a {
    @Override // wl.a
    public Random j() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        s.g(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
