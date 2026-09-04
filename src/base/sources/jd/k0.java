package jd;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class k0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f42333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rd.j f42334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f42335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gd.a f42336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f42337e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        void a(rd.j jVar, Thread thread, Throwable th2);
    }

    public k0(a aVar, rd.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, gd.a aVar2) {
        this.f42333a = aVar;
        this.f42334b = jVar;
        this.f42335c = uncaughtExceptionHandler;
        this.f42336d = aVar2;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            gd.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            gd.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f42336d.b()) {
            return true;
        }
        gd.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f42337e.get();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f42337e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f42333a.a(this.f42334b, thread, th2);
                } else {
                    gd.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f42335c != null) {
                    gd.g.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f42335c.uncaughtException(thread, th2);
                } else {
                    gd.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e10) {
                gd.g.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f42335c == null) {
                    gd.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.f42337e.set(false);
        } catch (Throwable th3) {
            if (this.f42335c != null) {
                gd.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f42335c.uncaughtException(thread, th2);
            } else {
                gd.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f42337e.set(false);
            throw th3;
        }
    }
}
