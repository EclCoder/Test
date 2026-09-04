package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a0 extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f58826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Rect f58827h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.this.f58879c.setVisibility(4);
        }
    }

    public a0(Context context) {
        super(context);
        this.f58826g = (this.f58878b.width * 5) / 4;
        this.f58827h = new Rect();
        d((FrameLayout) LayoutInflater.from(context).inflate(R.layout.trash_view, (ViewGroup) null));
        this.f58879c.setVisibility(4);
    }

    public static /* synthetic */ void p(a0 a0Var, ValueAnimator valueAnimator) {
        a0Var.f58878b.y = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        a0Var.e();
    }

    public static /* synthetic */ void q(final a0 a0Var) {
        a0Var.getClass();
        try {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(a0Var.f58878b.y, a0Var.f58880d.bottom);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zg.y
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a0.p(this.f58959a, valueAnimator);
                }
            });
            valueAnimatorOfInt.addListener(a0Var.new a());
            valueAnimatorOfInt.start();
        } catch (NullPointerException e10) {
            a0Var.f58879c.setVisibility(4);
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public static /* synthetic */ void r(a0 a0Var, ValueAnimator valueAnimator) {
        a0Var.f58878b.y = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        a0Var.e();
        Point pointF = a0Var.f();
        Rect rect = a0Var.f58827h;
        int i10 = pointF.x;
        int i11 = a0Var.f58826g;
        int i12 = pointF.y;
        rect.set(i10 - i11, i12 - i11, i10 + i11, i12 + i11);
    }

    @Override // zg.o
    protected int i() {
        return super.i() | 784;
    }

    @Override // zg.o
    public int j() {
        return this.f58881e.getResources().getDimensionPixelSize(R.dimen.dimen_trash);
    }

    @Override // zg.o
    protected int l() {
        return this.f58881e.getResources().getDimensionPixelSize(R.dimen.dimen_trash);
    }

    public void s() {
        this.f58879c.setVisibility(0);
        WindowManager.LayoutParams layoutParams = this.f58878b;
        Rect rect = this.f58880d;
        layoutParams.x = ((rect.right + rect.left) / 2) - (layoutParams.width / 2);
        int i10 = rect.bottom;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i10 - (((i10 - rect.top) * 30) / 100));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zg.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                a0.r(this.f58960a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    public void t() {
        if (this.f58879c.getVisibility() != 0) {
            return;
        }
        this.f58879c.post(new Runnable() { // from class: zg.x
            @Override // java.lang.Runnable
            public final void run() {
                a0.q(this.f58958a);
            }
        });
    }
}
