package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class t {
    private static int a(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        }
        return z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    static a b(Context context, Fragment fragment, boolean z10, boolean z11) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int iA = a(fragment, z10, z11);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = i1.b.f40741c;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (zEquals) {
                            throw e11;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? i1.a.f40737e : i1.a.f40738f;
        }
        if (i10 == 8194) {
            return z10 ? i1.a.f40733a : i1.a.f40734b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? i1.a.f40735c : i1.a.f40736d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f4278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f4279b;

        a(Animation animation) {
            this.f4278a = animation;
            this.f4279b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f4278a = null;
            this.f4279b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f4280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f4281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4284e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4284e = true;
            this.f4280a = viewGroup;
            this.f4281b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f4284e = true;
            if (this.f4282c) {
                return !this.f4283d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f4282c = true;
                n0.e0.a(this.f4280a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4282c || !this.f4284e) {
                this.f4280a.endViewTransition(this.f4281b);
                this.f4283d = true;
            } else {
                this.f4284e = false;
                this.f4280a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f4284e = true;
            if (this.f4282c) {
                return !this.f4283d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f4282c = true;
                n0.e0.a(this.f4280a, this);
            }
            return true;
        }
    }
}
