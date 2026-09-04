package gc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class e extends gc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f39091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f39092h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.f39079b.setTranslationY(0.0f);
            e.this.k(0.0f);
        }
    }

    public e(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f39091g = resources.getDimension(sb.e.f51718s);
        this.f39092h = resources.getDimension(sb.e.f51720t);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f39079b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new m1.b());
        return animatorSet;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f39082e);
        animatorG.start();
    }

    public void h(androidx.activity.b bVar, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f39079b, (Property<View, Float>) View.TRANSLATION_Y, this.f39079b.getHeight() * this.f39079b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new m1.b());
        objectAnimatorOfFloat.setDuration(tb.b.c(this.f39080c, this.f39081d, bVar.a()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void i(androidx.activity.b bVar, Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(tb.b.c(this.f39080c, this.f39081d, bVar.a()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(androidx.activity.b bVar) {
        super.d(bVar);
    }

    public void k(float f10) {
        float fA = a(f10);
        float width = this.f39079b.getWidth();
        float height = this.f39079b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f39091g / width;
        float f12 = this.f39092h / height;
        float fA2 = 1.0f - tb.b.a(0.0f, f11, fA);
        float fA3 = 1.0f - tb.b.a(0.0f, f12, fA);
        if (Float.isNaN(fA2) || Float.isNaN(fA3)) {
            return;
        }
        this.f39079b.setScaleX(fA2);
        this.f39079b.setPivotY(height);
        this.f39079b.setScaleY(fA3);
        View view = this.f39079b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA3 != 0.0f ? fA2 / fA3 : 1.0f);
            }
        }
    }

    public void l(androidx.activity.b bVar) {
        if (super.e(bVar) == null) {
            return;
        }
        k(bVar.a());
    }
}
