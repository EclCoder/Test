package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.b0;
import androidx.lifecycle.s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements r4.a {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements androidx.lifecycle.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f3827a;

        a(s sVar) {
            this.f3827a = sVar;
        }

        @Override // androidx.lifecycle.j
        public void h(b0 b0Var) {
            EmojiCompatInitializer.this.d();
            this.f3827a.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3829a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends e.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.i f3830a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f3831b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3830a = iVar;
                this.f3831b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th2) {
                try {
                    this.f3830a.a(th2);
                } finally {
                    this.f3831b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                try {
                    this.f3830a.b(mVar);
                } finally {
                    this.f3831b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f3829a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(final e.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3871a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = androidx.emoji2.text.c.a(this.f3829a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j0.o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.i()) {
                    e.c().l();
                }
            } finally {
                j0.o.b();
            }
        }
    }

    @Override // r4.a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // r4.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        e.h(new b(context));
        c(context);
        return Boolean.TRUE;
    }

    void c(Context context) {
        s lifecycle = ((b0) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    void d() {
        androidx.emoji2.text.b.c().postDelayed(new d(), 500L);
    }
}
