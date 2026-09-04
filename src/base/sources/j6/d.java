package j6;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import m6.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42075f = com.bumptech.glide.i.f11189a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f42076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f42077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnAttachStateChangeListener f42078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42080e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static Integer f42081e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f42082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f42083b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0636a f42085d;

        /* JADX INFO: renamed from: j6.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class ViewTreeObserverOnPreDrawListenerC0636a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference f42086a;

            ViewTreeObserverOnPreDrawListenerC0636a(a aVar) {
                this.f42086a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f42086a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f42082a = view;
        }

        private static int c(Context context) {
            if (f42081e == null) {
                Display defaultDisplay = ((WindowManager) k.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f42081e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f42081e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f42084c && this.f42082a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f42082a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f42082a.getContext());
        }

        private int f() {
            int paddingTop = this.f42082a.getPaddingTop() + this.f42082a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f42082a.getLayoutParams();
            return e(this.f42082a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f42082a.getPaddingLeft() + this.f42082a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f42082a.getLayoutParams();
            return e(this.f42082a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            ArrayList arrayList = new ArrayList(this.f42083b);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((h) obj).e(i10, i11);
            }
        }

        void a() {
            if (this.f42083b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f42082a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f42085d);
            }
            this.f42085d = null;
            this.f42083b.clear();
        }

        void d(h hVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                hVar.e(iG, iF);
                return;
            }
            if (!this.f42083b.contains(hVar)) {
                this.f42083b.add(hVar);
            }
            if (this.f42085d == null) {
                ViewTreeObserver viewTreeObserver = this.f42082a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0636a viewTreeObserverOnPreDrawListenerC0636a = new ViewTreeObserverOnPreDrawListenerC0636a(this);
                this.f42085d = viewTreeObserverOnPreDrawListenerC0636a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0636a);
            }
        }

        void k(h hVar) {
            this.f42083b.remove(hVar);
        }
    }

    public d(View view) {
        this.f42077b = (View) k.e(view);
        this.f42076a = new a(view);
    }

    private Object i() {
        return this.f42077b.getTag(f42075f);
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42078c;
        if (onAttachStateChangeListener == null || this.f42080e) {
            return;
        }
        this.f42077b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f42080e = true;
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42078c;
        if (onAttachStateChangeListener == null || !this.f42080e) {
            return;
        }
        this.f42077b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f42080e = false;
    }

    private void n(Object obj) {
        this.f42077b.setTag(f42075f, obj);
    }

    @Override // j6.i
    public final void b(h hVar) {
        this.f42076a.k(hVar);
    }

    @Override // j6.i
    public final void c(Drawable drawable) {
        j();
        m(drawable);
    }

    @Override // j6.i
    public final i6.c d() {
        Object objI = i();
        if (objI == null) {
            return null;
        }
        if (objI instanceof i6.c) {
            return (i6.c) objI;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // j6.i
    public final void e(Drawable drawable) {
        this.f42076a.b();
        l(drawable);
        if (this.f42079d) {
            return;
        }
        k();
    }

    @Override // j6.i
    public final void f(i6.c cVar) {
        n(cVar);
    }

    @Override // j6.i
    public final void h(h hVar) {
        this.f42076a.d(hVar);
    }

    protected abstract void l(Drawable drawable);

    public String toString() {
        return "Target for: " + this.f42077b;
    }

    @Override // f6.l
    public void onDestroy() {
    }

    @Override // f6.l
    public void onStart() {
    }

    @Override // f6.l
    public void onStop() {
    }

    protected void m(Drawable drawable) {
    }
}
