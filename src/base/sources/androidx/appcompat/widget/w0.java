package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class w0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static w0 f1731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static w0 f1732l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f1734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f1736d = new Runnable() { // from class: androidx.appcompat.widget.u0
        @Override // java.lang.Runnable
        public final void run() {
            this.f1729a.h(false);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f1737e = new Runnable() { // from class: androidx.appcompat.widget.v0
        @Override // java.lang.Runnable
        public final void run() {
            this.f1730a.d();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x0 f1740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1742j;

    private w0(View view, CharSequence charSequence) {
        this.f1733a = view;
        this.f1734b = charSequence;
        this.f1735c = n0.t0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1733a.removeCallbacks(this.f1736d);
    }

    private void c() {
        this.f1742j = true;
    }

    private void e() {
        this.f1733a.postDelayed(this.f1736d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(w0 w0Var) {
        w0 w0Var2 = f1731k;
        if (w0Var2 != null) {
            w0Var2.b();
        }
        f1731k = w0Var;
        if (w0Var != null) {
            w0Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        w0 w0Var = f1731k;
        if (w0Var != null && w0Var.f1733a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new w0(view, charSequence);
            return;
        }
        w0 w0Var2 = f1732l;
        if (w0Var2 != null && w0Var2.f1733a == view) {
            w0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1742j && Math.abs(x10 - this.f1738f) <= this.f1735c && Math.abs(y10 - this.f1739g) <= this.f1735c) {
            return false;
        }
        this.f1738f = x10;
        this.f1739g = y10;
        this.f1742j = false;
        return true;
    }

    void d() {
        if (f1732l == this) {
            f1732l = null;
            x0 x0Var = this.f1740h;
            if (x0Var != null) {
                x0Var.c();
                this.f1740h = null;
                c();
                this.f1733a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1731k == this) {
            f(null);
        }
        this.f1733a.removeCallbacks(this.f1737e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f1733a.isAttachedToWindow()) {
            f(null);
            w0 w0Var = f1732l;
            if (w0Var != null) {
                w0Var.d();
            }
            f1732l = this;
            this.f1741i = z10;
            x0 x0Var = new x0(this.f1733a.getContext());
            this.f1740h = x0Var;
            x0Var.e(this.f1733a, this.f1738f, this.f1739g, this.f1741i, this.f1734b);
            this.f1733a.addOnAttachStateChangeListener(this);
            if (this.f1741i) {
                j11 = 2500;
            } else {
                if ((n0.q0.N(this.f1733a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = MBInterstitialActivity.WEB_LOAD_TIME;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1733a.removeCallbacks(this.f1737e);
            this.f1733a.postDelayed(this.f1737e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1740h != null && this.f1741i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1733a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1733a.isEnabled() && this.f1740h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1738f = view.getWidth() / 2;
        this.f1739g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
