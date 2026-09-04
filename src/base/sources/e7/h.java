package e7;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f37209a = new h();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f7.a f37210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f37211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference f37212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final View.OnTouchListener f37213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f37214e;

        public a(f7.a mapping, View rootView, View hostView) {
            s.h(mapping, "mapping");
            s.h(rootView, "rootView");
            s.h(hostView, "hostView");
            this.f37210a = mapping;
            this.f37211b = new WeakReference(hostView);
            this.f37212c = new WeakReference(rootView);
            this.f37213d = f7.f.h(hostView);
            this.f37214e = true;
        }

        public final boolean a() {
            return this.f37214e;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            s.h(view, "view");
            s.h(motionEvent, "motionEvent");
            View view2 = (View) this.f37212c.get();
            View view3 = (View) this.f37211b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                b.d(this.f37210a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f37213d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private h() {
    }

    public static final a a(f7.a mapping, View rootView, View hostView) {
        if (x7.a.c(h.class)) {
            return null;
        }
        try {
            s.h(mapping, "mapping");
            s.h(rootView, "rootView");
            s.h(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            x7.a.b(th2, h.class);
            return null;
        }
    }
}
