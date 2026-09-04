package gc;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f39084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gc.b f39085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f39086c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OnBackInvokedCallback f39087a;

        private b() {
        }

        @Override // gc.c.d
        public void a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f39087a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f39087a);
            this.f39087a = null;
        }

        @Override // gc.c.d
        public void b(gc.b bVar, View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f39087a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f39087a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        OnBackInvokedCallback c(final gc.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: gc.d
                public final void onBackInvoked() {
                    bVar.d();
                }
            };
        }

        boolean d() {
            return this.f39087a != null;
        }
    }

    /* JADX INFO: renamed from: gc.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0586c extends b {

        /* JADX INFO: renamed from: gc.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ gc.b f39088a;

            a(gc.b bVar) {
                this.f39088a = bVar;
            }

            public void onBackCancelled() {
                if (C0586c.this.d()) {
                    this.f39088a.a();
                }
            }

            public void onBackInvoked() {
                this.f39088a.d();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C0586c.this.d()) {
                    this.f39088a.c(new androidx.activity.b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C0586c.this.d()) {
                    this.f39088a.b(new androidx.activity.b(backEvent));
                }
            }
        }

        private C0586c() {
            super();
        }

        @Override // gc.c.b
        OnBackInvokedCallback c(gc.b bVar) {
            return new a(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface d {
        void a(View view);

        void b(gc.b bVar, View view, boolean z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(View view) {
        this((gc.b) view, view);
    }

    private static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0586c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    private void d(boolean z10) {
        d dVar = this.f39084a;
        if (dVar != null) {
            dVar.b(this.f39085b, this.f39086c, z10);
        }
    }

    public boolean b() {
        return this.f39084a != null;
    }

    public void c() {
        d(false);
    }

    public void e() {
        d(true);
    }

    public void f() {
        d dVar = this.f39084a;
        if (dVar != null) {
            dVar.a(this.f39086c);
        }
    }

    public c(gc.b bVar, View view) {
        this.f39084a = a();
        this.f39085b = bVar;
        this.f39086c = view;
    }
}
