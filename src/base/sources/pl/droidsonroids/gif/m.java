package pl.droidsonroids.gif;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
abstract class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f50249a;

    m(b bVar) {
        this.f50249a = bVar;
    }

    abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f50249a.e()) {
                return;
            }
            a();
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
            throw th2;
        }
    }
}
