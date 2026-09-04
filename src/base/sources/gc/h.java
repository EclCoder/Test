package gc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class h extends gc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f39095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f39096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f39097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f39098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f39099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f39100l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f39101a;

        a(View view) {
            this.f39101a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f39101a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f39095g = resources.getDimension(sb.e.f51724v);
        this.f39096h = resources.getDimension(sb.e.f51722u);
    }

    private float[] h() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f39079b.getRootWindowInsets()) == null) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        DisplayMetrics displayMetrics = this.f39079b.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.f39079b.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        int width = this.f39079b.getWidth();
        int height = this.f39079b.getHeight();
        int iQ = (i12 == 0 && i13 == 0) ? q(rootWindowInsets, 0) : 0;
        int i14 = width + i12;
        int iQ2 = (i14 < i10 || i13 != 0) ? 0 : q(rootWindowInsets, 1);
        int iQ3 = (i14 < i10 || i13 + height < i11) ? 0 : q(rootWindowInsets, 2);
        int iQ4 = (i12 != 0 || i13 + height < i11) ? 0 : q(rootWindowInsets, 3);
        float f10 = iQ;
        float f11 = iQ2;
        float f12 = iQ3;
        float f13 = iQ4;
        return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
    }

    private ValueAnimator k(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: gc.f
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f10, Object obj, Object obj2) {
                return h.s((float[]) obj, (float[]) obj2, f10);
            }
        }, clippableRoundedCornerLayout.getCornerRadii(), n());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gc.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                clippableRoundedCornerLayout.e((float[]) valueAnimator.getAnimatedValue());
            }
        });
        return valueAnimatorOfObject;
    }

    private AnimatorSet l(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new a(view));
        return animatorSet;
    }

    private int q(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static float[] r(float[] fArr, float f10, float f11) {
        return new float[]{tb.b.a(fArr[0], f10, f11), tb.b.a(fArr[1], f10, f11), tb.b.a(fArr[2], f10, f11), tb.b.a(fArr[3], f10, f11), tb.b.a(fArr[4], f10, f11), tb.b.a(fArr[5], f10, f11), tb.b.a(fArr[6], f10, f11), tb.b.a(fArr[7], f10, f11)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float[] s(float[] fArr, float[] fArr2, float f10) {
        return new float[]{tb.b.a(fArr[0], fArr2[0], f10), tb.b.a(fArr[1], fArr2[1], f10), tb.b.a(fArr[2], fArr2[2], f10), tb.b.a(fArr[3], fArr2[3], f10), tb.b.a(fArr[4], fArr2[4], f10), tb.b.a(fArr[5], fArr2[5], f10), tb.b.a(fArr[6], fArr2[6], f10), tb.b.a(fArr[7], fArr2[7], f10)};
    }

    private void t() {
        this.f39097i = 0.0f;
        this.f39098j = null;
        this.f39099k = null;
    }

    public void i(View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSetL = l(view);
        View view2 = this.f39079b;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            animatorSetL.playTogether(k((ClippableRoundedCornerLayout) view2));
        }
        animatorSetL.setDuration(this.f39082e);
        animatorSetL.start();
        t();
    }

    public void j() {
        this.f39100l = null;
    }

    public void m(long j10, View view) {
        AnimatorSet animatorSetL = l(view);
        animatorSetL.setDuration(j10);
        animatorSetL.start();
        t();
    }

    public float[] n() {
        if (this.f39100l == null) {
            this.f39100l = h();
        }
        return this.f39100l;
    }

    public Rect o() {
        return this.f39099k;
    }

    public Rect p() {
        return this.f39098j;
    }

    public void u(float f10, View view) {
        this.f39098j = c0.c(this.f39079b);
        if (view != null) {
            this.f39099k = c0.b(this.f39079b, view);
        }
        this.f39097i = f10;
    }

    public void v(androidx.activity.b bVar, View view) {
        super.d(bVar);
        u(bVar.c(), view);
    }

    public void w(float f10, boolean z10, float f11, float f12) {
        float fA = a(f10);
        float width = this.f39079b.getWidth();
        float height = this.f39079b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fA2 = tb.b.a(1.0f, 0.9f, fA);
        float fA3 = tb.b.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - this.f39095g), fA) * (z10 ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, ((height - (fA2 * height)) / 2.0f) - this.f39095g), this.f39096h);
        float f13 = f11 - this.f39097i;
        float fA4 = tb.b.a(0.0f, fMin, Math.abs(f13) / height) * Math.signum(f13);
        if (Float.isNaN(fA2) || Float.isNaN(fA3) || Float.isNaN(fA4)) {
            return;
        }
        this.f39079b.setScaleX(fA2);
        this.f39079b.setScaleY(fA2);
        this.f39079b.setTranslationX(fA3);
        this.f39079b.setTranslationY(fA4);
        View view = this.f39079b;
        if (view instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) view).e(r(n(), f12, fA));
        }
    }

    public void x(androidx.activity.b bVar, View view, float f10) {
        if (super.e(bVar) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        w(bVar.a(), bVar.b() == 0, bVar.c(), f10);
    }
}
