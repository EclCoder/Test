package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;
import sb.g;
import tb.c;
import tb.e;
import tb.h;
import tb.i;
import tb.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f21550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f21551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f21552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f21553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f21554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f21555h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f21557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f21558c;

        a(boolean z10, View view, View view2) {
            this.f21556a = z10;
            this.f21557b = view;
            this.f21558c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f21556a) {
                return;
            }
            this.f21557b.setVisibility(4);
            this.f21558c.setAlpha(1.0f);
            this.f21558c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f21556a) {
                this.f21557b.setVisibility(0);
                this.f21558c.setAlpha(0.0f);
                this.f21558c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f21560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f21561b;

        protected b() {
        }
    }

    public FabTransformationBehavior() {
        this.f21550c = new Rect();
        this.f21551d = new RectF();
        this.f21552e = new RectF();
        this.f21553f = new int[2];
    }

    private ViewGroup O(View view) {
        View viewFindViewById = view.findViewById(g.E);
        return viewFindViewById != null ? e0(viewFindViewById) : e0(view);
    }

    private void P(View view, b bVar, i iVar, i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float fU = U(bVar, iVar, f10, f12);
        float fU2 = U(bVar, iVar2, f11, f13);
        Rect rect = this.f21550c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f21551d;
        rectF2.set(rect);
        RectF rectF3 = this.f21552e;
        V(view, rectF3);
        rectF3.offset(fU, fU2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void Q(View view, RectF rectF) {
        V(view, rectF);
        rectF.offset(this.f21554g, this.f21555h);
    }

    private Pair R(float f10, float f11, boolean z10, b bVar) {
        i iVarH;
        i iVarH2;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVarH = bVar.f21560a.h("translationXLinear");
            iVarH2 = bVar.f21560a.h("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            iVarH = bVar.f21560a.h("translationXCurveDownwards");
            iVarH2 = bVar.f21560a.h("translationYCurveDownwards");
        } else {
            iVarH = bVar.f21560a.h("translationXCurveUpwards");
            iVarH2 = bVar.f21560a.h("translationYCurveUpwards");
        }
        return new Pair(iVarH, iVarH2);
    }

    private float S(View view, View view2, j jVar) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f21551d;
        RectF rectF2 = this.f21552e;
        Q(view, rectF);
        V(view2, rectF2);
        int i10 = jVar.f53293a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i10 != 3) {
                if (i10 != 5) {
                    f10 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f10 + jVar.f53294b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + jVar.f53294b;
    }

    private float T(View view, View view2, j jVar) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f21551d;
        RectF rectF2 = this.f21552e;
        Q(view, rectF);
        V(view2, rectF2);
        int i10 = jVar.f53293a & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i10 != 48) {
                if (i10 != 80) {
                    f10 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f10 + jVar.f53295c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + jVar.f53295c;
    }

    private float U(b bVar, i iVar, float f10, float f11) {
        long jC = iVar.c();
        long jD = iVar.d();
        i iVarH = bVar.f21560a.h("expansion");
        return tb.b.a(f10, f11, iVar.e().getInterpolation((((iVarH.c() + iVarH.d()) + 17) - jC) / jD));
    }

    private void V(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f21553f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void W(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ViewGroup viewGroupO;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupO = O(view2)) != null) {
            if (z10) {
                if (!z11) {
                    e.f53281a.set(viewGroupO, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, (Property<ViewGroup, Float>) e.f53281a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, (Property<ViewGroup, Float>) e.f53281a, 0.0f);
            }
            bVar.f21560a.h("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    private void Y(View view, View view2, boolean z10, b bVar, List list) {
        float fS = S(view, view2, bVar.f21561b);
        float fT = T(view, view2, bVar.f21561b);
        Pair pairR = R(fS, fT, z10, bVar);
        i iVar = (i) pairR.first;
        i iVar2 = (i) pairR.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fS = this.f21554g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fS);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fT = this.f21555h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fT);
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void Z(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        bVar.f21560a.h("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    private void c0(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2, RectF rectF) {
        i iVar;
        i iVar2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fS = S(view, view2, bVar.f21561b);
        float fT = T(view, view2, bVar.f21561b);
        Pair pairR = R(fS, fT, z10, bVar);
        i iVar3 = (i) pairR.first;
        i iVar4 = (i) pairR.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fS);
                view2.setTranslationY(-fT);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            iVar = iVar4;
            iVar2 = iVar3;
            P(view2, bVar, iVar2, iVar, -fS, -fT, 0.0f, 0.0f, rectF);
        } else {
            iVar = iVar4;
            iVar2 = iVar3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fS);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fT);
        }
        iVar2.a(objectAnimatorOfFloat);
        iVar.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private ViewGroup e0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        b bVarD0 = d0(view2.getContext(), z10);
        if (z10) {
            this.f21554g = view.getTranslationX();
            this.f21555h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Z(view, view2, z10, z11, bVarD0, arrayList, arrayList2);
        RectF rectF = this.f21551d;
        c0(view, view2, z10, z11, bVarD0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        Y(view, view2, z10, bVarD0, arrayList);
        b0(view, view2, z10, z11, bVarD0, arrayList, arrayList2);
        a0(view, view2, z10, z11, bVarD0, fWidth, fHeight, arrayList, arrayList2);
        X(view, view2, z10, z11, bVarD0, arrayList, arrayList2);
        W(view, view2, z10, z11, bVarD0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    protected abstract b d0(Context context, boolean z10);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        if (fVar.f3179h == 0) {
            fVar.f3179h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21550c = new Rect();
        this.f21551d = new RectF();
        this.f21552e = new RectF();
        this.f21553f = new int[2];
    }

    private void X(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void b0(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void a0(View view, View view2, boolean z10, boolean z11, b bVar, float f10, float f11, List list, List list2) {
    }
}
