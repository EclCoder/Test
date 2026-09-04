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
public abstract class j extends j6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f42088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f42089g = com.bumptech.glide.i.f11189a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final View f42090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f42091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnAttachStateChangeListener f42092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42094e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static Integer f42095e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f42096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f42097b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0637a f42099d;

        /* JADX INFO: renamed from: j6.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class ViewTreeObserverOnPreDrawListenerC0637a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference f42100a;

            ViewTreeObserverOnPreDrawListenerC0637a(a aVar) {
                this.f42100a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f42100a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f42096a = view;
        }

        private static int c(Context context) {
            if (f42095e == null) {
                Display defaultDisplay = ((WindowManager) k.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f42095e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f42095e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f42098c && this.f42096a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f42096a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f42096a.getContext());
        }

        private int f() {
            int paddingTop = this.f42096a.getPaddingTop() + this.f42096a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f42096a.getLayoutParams();
            return e(this.f42096a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f42096a.getPaddingLeft() + this.f42096a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f42096a.getLayoutParams();
            return e(this.f42096a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            ArrayList arrayList = new ArrayList(this.f42097b);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((h) obj).e(i10, i11);
            }
        }

        void a() {
            if (this.f42097b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f42096a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f42099d);
            }
            this.f42099d = null;
            this.f42097b.clear();
        }

        void d(h hVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                hVar.e(iG, iF);
                return;
            }
            if (!this.f42097b.contains(hVar)) {
                this.f42097b.add(hVar);
            }
            if (this.f42099d == null) {
                ViewTreeObserver viewTreeObserver = this.f42096a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0637a viewTreeObserverOnPreDrawListenerC0637a = new ViewTreeObserverOnPreDrawListenerC0637a(this);
                this.f42099d = viewTreeObserverOnPreDrawListenerC0637a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0637a);
            }
        }

        void k(h hVar) {
            this.f42097b.remove(hVar);
        }
    }

    public j(View view) {
        this.f42090a = (View) k.e(view);
        this.f42091b = new a(view);
    }

    private Object i() {
        return this.f42090a.getTag(f42089g);
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42092c;
        if (onAttachStateChangeListener == null || this.f42094e) {
            return;
        }
        this.f42090a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f42094e = true;
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f42092c;
        if (onAttachStateChangeListener == null || !this.f42094e) {
            return;
        }
        this.f42090a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f42094e = false;
    }

    private void l(Object obj) {
        f42088f = true;
        this.f42090a.setTag(f42089g, obj);
    }

    @Override // j6.i
    public void b(h hVar) {
        this.f42091b.k(hVar);
    }

    @Override // j6.a, j6.i
    public void c(Drawable drawable) {
        super.c(drawable);
        j();
    }

    @Override // j6.i
    public i6.c d() {
        Object objI = i();
        if (objI == null) {
            return null;
        }
        if (objI instanceof i6.c) {
            return (i6.c) objI;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // j6.a, j6.i
    public void e(Drawable drawable) {
        super.e(drawable);
        this.f42091b.b();
        if (this.f42093d) {
            return;
        }
        k();
    }

    @Override // j6.i
    public void f(i6.c cVar) {
        l(cVar);
    }

    @Override // j6.i
    public void h(h hVar) {
        this.f42091b.d(hVar);
    }

    public String toString() {
        return "Target for: " + this.f42090a;
    }
}
