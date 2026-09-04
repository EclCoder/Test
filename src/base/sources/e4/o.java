package e4;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OnBackInvokedDispatcher f37143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final OnBackInvokedCallback f37145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37146f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements OnBackAnimationCallback {
        a() {
        }

        public void onBackCancelled() {
            o.this.a();
        }

        public void onBackInvoked() {
            o.this.b();
        }

        public void onBackProgressed(BackEvent backEvent) {
            s.h(backEvent, "backEvent");
            o.this.c(k.a(backEvent));
        }

        public void onBackStarted(BackEvent backEvent) {
            s.h(backEvent, "backEvent");
            o.this.d(k.a(backEvent));
        }
    }

    public /* synthetic */ o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(onBackInvokedDispatcher, i10);
    }

    private final OnBackInvokedCallback n() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(o oVar) {
        oVar.b();
    }

    private final void p(boolean z10) {
        if (z10 && !this.f37146f) {
            this.f37143c.registerOnBackInvokedCallback(this.f37144d, this.f37145e);
            this.f37146f = true;
        } else {
            if (z10 || !this.f37146f) {
                return;
            }
            this.f37143c.unregisterOnBackInvokedCallback(this.f37145e);
            this.f37146f = false;
        }
    }

    @Override // e4.h
    protected void j(boolean z10) {
        p(z10);
    }

    private o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10) {
        this.f37143c = onBackInvokedDispatcher;
        this.f37144d = i10;
        this.f37145e = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: e4.n
            public final void onBackInvoked() {
                o.o(this.f37142a);
            }
        } : n();
    }
}
