package rk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static b a() {
        return uk.c.INSTANCE;
    }

    public static b b(Runnable runnable) {
        vk.b.c(runnable, "run is null");
        return new e(runnable);
    }
}
