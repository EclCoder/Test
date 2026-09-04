package f6;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.z;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f38252a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f38253b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f38254a;

        /* JADX INFO: renamed from: f6.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0573a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f38256a;

            RunnableC0573a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f38256a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                z.b().h();
                h.this.f38253b = true;
                h.b(a.this.f38254a, this.f38256a);
                h.this.f38252a.clear();
            }
        }

        a(View view) {
            this.f38254a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            m6.l.v(new RunnableC0573a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // f6.i
    public void a(Activity activity) {
        if (!this.f38253b && this.f38252a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
