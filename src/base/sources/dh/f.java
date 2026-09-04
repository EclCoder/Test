package dh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import dg.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f36870i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f36871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f36872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dk.a f36873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dk.a f36874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f36875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f36876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Button f36877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f36878h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            View viewE = f.this.e();
            if (viewE == null || (viewTreeObserver = viewE.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            s.h(animation, "animation");
            f.this.h();
        }
    }

    public f(WindowManager windowManager, LayoutInflater inflater, dk.a recordingController, dk.a preferenceManager) {
        s.h(windowManager, "windowManager");
        s.h(inflater, "inflater");
        s.h(recordingController, "recordingController");
        s.h(preferenceManager, "preferenceManager");
        this.f36871a = windowManager;
        this.f36872b = inflater;
        this.f36873c = recordingController;
        this.f36874d = preferenceManager;
        this.f36878h = AzRecorderApp.e().getApplicationContext();
    }

    private final void i() {
        View view = this.f36875e;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.f36871a.removeView(view);
        this.f36875e = null;
    }

    private final void j() {
        View view = this.f36876f;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.f36871a.removeView(view);
        this.f36876f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(j0 j0Var, f fVar, View view) {
        if (SystemClock.elapsedRealtime() - j0Var.f43595a < 300) {
            return;
        }
        j0Var.f43595a = SystemClock.elapsedRealtime();
        if (ef.a.h()) {
            ((l) fVar.f36873c.get()).k0();
        } else {
            fVar.h();
            ((l) fVar.f36873c.get()).w0("magic_button");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(f fVar, View view) {
        if (ef.a.h()) {
            ((l) fVar.f36873c.get()).x0("magic_button");
            return true;
        }
        fVar.h();
        ((l) fVar.f36873c.get()).w0("magic_button");
        return true;
    }

    private final void n(int i10, int i11, int i12) {
        View viewInflate = this.f36872b.inflate(R.layout.hint_with_9_patch, (ViewGroup) null);
        this.f36875e = viewInflate;
        if (viewInflate == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, AzRecorderApp.e().f(), 262696, -3);
        layoutParams.gravity = i10 | 48;
        float f10 = this.f36878h.getResources().getDisplayMetrics().density;
        View view = this.f36875e;
        TextView textView = view != null ? (TextView) view.findViewById(R.id.tv_hint) : null;
        if (textView != null) {
            textView.setMaxWidth((int) ((f10 * 200) + 0.5f));
        }
        View view2 = this.f36875e;
        View viewFindViewById = view2 != null ? view2.findViewById(R.id.btn_got_it) : null;
        if (textView != null) {
            textView.setText(R.string.hint_magic_button);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: dh.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    f.o(this.f36869a, view3);
                }
            });
        }
        View view3 = this.f36875e;
        if (view3 != null) {
            view3.measure(0, 0);
        }
        if (i10 == 5) {
            View view4 = this.f36875e;
            if (view4 != null) {
                view4.setBackground(androidx.core.content.a.getDrawable(this.f36878h, R.drawable.hint_right));
            }
        } else {
            View view5 = this.f36875e;
            if (view5 != null) {
                view5.setBackground(androidx.core.content.a.getDrawable(this.f36878h, R.drawable.hint_left));
            }
        }
        layoutParams.x = i11 / 2;
        layoutParams.y = i12;
        this.f36871a.addView(this.f36875e, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(f fVar, View view) {
        fVar.i();
        View view2 = fVar.f36876f;
        if (view2 != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat.addListener(fVar.new c());
            objectAnimatorOfFloat.setDuration(300L).start();
        }
    }

    public final View e() {
        return this.f36876f;
    }

    public final void f() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        Button button = this.f36877g;
        if (button != null) {
            button.setText(this.f36878h.getString(R.string.resume));
        }
        View view = this.f36876f;
        if (view == null || (viewPropertyAnimatorAnimate = view.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(200L)) == null) {
            return;
        }
        duration.start();
    }

    public final void g(boolean z10) {
        ViewTreeObserver viewTreeObserver;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        Button button = this.f36877g;
        if (button != null) {
            button.setText("");
        }
        if (z10) {
            View view = this.f36876f;
            if (view == null || (viewPropertyAnimatorAnimate = view.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(200L)) == null) {
                return;
            }
            duration.start();
            return;
        }
        View view2 = this.f36876f;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        View view3 = this.f36876f;
        if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    public final void h() {
        j();
        i();
    }

    public final void k(int i10) {
        h();
        Resources resources = this.f36878h.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.overlay_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.overlay_height);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(dimensionPixelSize, dimensionPixelSize2, AzRecorderApp.e().f(), Build.VERSION.SDK_INT < 30 ? 66088 : 552, -3);
        int iD = d();
        layoutParams.gravity = iD | 48;
        View viewInflate = this.f36872b.inflate(R.layout.magic_button_layout, (ViewGroup) null);
        this.f36876f = viewInflate;
        this.f36877g = viewInflate != null ? (Button) viewInflate.findViewById(R.id.btn_magic) : null;
        final j0 j0Var = new j0();
        Button button = this.f36877g;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: dh.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.l(j0Var, this, view);
                }
            });
        }
        Button button2 = this.f36877g;
        if (button2 != null) {
            button2.setOnLongClickListener(new View.OnLongClickListener() { // from class: dh.d
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return f.m(this.f36868a, view);
                }
            });
        }
        View view = this.f36876f;
        if (view != null) {
            view.setAlpha(i10 == 0 ? 0.0f : 1.0f);
        }
        try {
            this.f36871a.addView(this.f36876f, layoutParams);
            if (i10 == 2) {
                n(iD, dimensionPixelSize, dimensionPixelSize2);
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    private final int d() {
        lg.a aVar = (lg.a) this.f36874d.get();
        String str = dmHT.TkfLdvcdkoFYavE;
        return s.c(aVar.h(R.string.pref_magic_button_position, str), str) ? 5 : 3;
    }
}
