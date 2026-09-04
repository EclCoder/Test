package gc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class i extends gc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f39103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f39104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f39105i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f39106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39107b;

        a(boolean z10, int i10) {
            this.f39106a = z10;
            this.f39107b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f39079b.setTranslationX(0.0f);
            i.this.k(0.0f, this.f39106a, this.f39107b);
        }
    }

    public i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f39103g = resources.getDimension(sb.e.f51728x);
        this.f39104h = resources.getDimension(sb.e.f51726w);
        this.f39105i = resources.getDimension(sb.e.f51730y);
    }

    private boolean g(int i10, int i11) {
        return (Gravity.getAbsoluteGravity(i10, this.f39079b.getLayoutDirection()) & i11) == i11;
    }

    private int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f39079b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f39079b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f39082e);
        animatorSet.start();
    }

    public void h(androidx.activity.b bVar, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = bVar.b() == 0;
        boolean zG = g(i10, 3);
        float width = (this.f39079b.getWidth() * this.f39079b.getScaleX()) + i(zG);
        View view = this.f39079b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new m1.b());
        objectAnimatorOfFloat.setDuration(tb.b.c(this.f39080c, this.f39081d, bVar.a()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void j(androidx.activity.b bVar) {
        super.d(bVar);
    }

    public void k(float f10, boolean z10, int i10) {
        float fA = a(f10);
        boolean zG = g(i10, 3);
        boolean z11 = z10 == zG;
        int width = this.f39079b.getWidth();
        int height = this.f39079b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f39103g / f11;
            float f14 = this.f39104h / f11;
            float f15 = this.f39105i / f12;
            View view = this.f39079b;
            if (zG) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fA2 = tb.b.a(0.0f, f14, fA);
            float f16 = fA2 + 1.0f;
            float fA3 = 1.0f - tb.b.a(0.0f, f15, fA);
            if (Float.isNaN(f16) || Float.isNaN(fA3)) {
                return;
            }
            this.f39079b.setScaleX(f16);
            this.f39079b.setScaleY(fA3);
            View view2 = this.f39079b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(zG ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fA2 : 1.0f;
                    float f18 = fA3 != 0.0f ? (f16 / fA3) * f17 : 1.0f;
                    if (!Float.isNaN(f17) && !Float.isNaN(f18)) {
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }

    public void l(androidx.activity.b bVar, int i10) {
        if (super.e(bVar) == null) {
            return;
        }
        k(bVar.a(), bVar.b() == 0, i10);
    }
}
