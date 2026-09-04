package zg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import fl.g0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f58922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WindowManager f58923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WindowManager.LayoutParams f58924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f58926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f58927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f58928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f58929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f58930i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        void a();

        void d();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* synthetic */ class b extends kotlin.jvm.internal.p implements tl.a {
        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m();
            return g0.f38750a;
        }

        public final void m() {
            ((t) this.receiver).h();
        }

        b(Object obj) {
            super(0, obj, t.class, dOIDCKnIR.HtOVIJYcmQ, "forceCollapse()V", 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f58931a;

        c(tl.a aVar) {
            this.f58931a = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
            this.f58931a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.s.h(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(t tVar, View view) {
        tVar.e();
    }

    private final void f(ArrayList arrayList, ImageView imageView, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "x", f10, f11);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "y", f12, f13);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "alpha", f14);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, "rotation", f15, f16);
        if (arrayList != null) {
            arrayList.add(objectAnimatorOfFloat);
        }
        if (arrayList != null) {
            arrayList.add(objectAnimatorOfFloat2);
        }
        if (arrayList != null) {
            arrayList.add(objectAnimatorOfFloat3);
        }
        if (arrayList != null) {
            arrayList.add(objectAnimatorOfFloat4);
        }
    }

    private final void k() {
        this.f58927f = false;
        n();
        removeAllViews();
    }

    private final void m(int i10, int i11, boolean z10) {
        t tVar = this;
        int boundRadius = tVar.getBoundRadius();
        double radians = Math.toRadians(((double) 180) / ((double) tVar.f58926e.size()));
        int i12 = z10 ? 1 : -1;
        tVar.f58929h = new ArrayList();
        tVar.f58930i = new ArrayList();
        int size = tVar.f58926e.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = tVar.f58926e.get(i13);
            kotlin.jvm.internal.s.g(obj, "get(...)");
            ImageView imageView = (ImageView) obj;
            double d10 = (((double) i13) + 0.5d) * radians;
            double d11 = boundRadius;
            int i14 = size;
            int i15 = i13;
            float fSin = (float) ((((double) i10) + ((Math.sin(d10) * d11) * ((double) i12))) - ((double) (tVar.f58925d / 2)));
            double dCos = ((double) i11) - (d11 * Math.cos(d10));
            int i16 = tVar.f58925d;
            float f10 = (float) (dCos - ((double) (i16 / 2)));
            float f11 = i10 - (i16 / 2);
            float f12 = i11 - (i16 / 2);
            tVar.f(tVar.f58929h, imageView, fSin, f11, f10, f12, 0.0f, 0.0f, 90.0f);
            tVar.f(tVar.f58930i, imageView, f11, fSin, f12, f10, 1.0f, 90.0f, 0.0f);
            i13 = i15 + 1;
            tVar = this;
            size = i14;
        }
    }

    private final void o(ArrayList arrayList, tl.a aVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (aVar != null) {
            animatorSet.addListener(new c(aVar));
        }
    }

    public final void c(ImageView actionView) {
        kotlin.jvm.internal.s.h(actionView, "actionView");
        if (this.f58926e.contains(actionView)) {
            return;
        }
        this.f58926e.add(actionView);
    }

    public final void d() {
        try {
            if (this.f58928g) {
                this.f58923b.updateViewLayout(this, this.f58924c);
                return;
            }
            wp.a.a("Add rootView", new Object[0]);
            this.f58923b.addView(this, this.f58924c);
            this.f58928g = true;
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public final void e() {
        this.f58927f = false;
        o(this.f58929h, new b(this));
        this.f58922a.d();
    }

    public final void g(int i10, int i11, boolean z10) {
        this.f58927f = true;
        this.f58922a.a();
        removeAllViews();
        Iterator it = this.f58926e.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.s.g(next, "next(...)");
            int i12 = this.f58925d;
            addView((ImageView) next, i12, i12);
        }
        n();
        d();
        m(i10, i11, z10);
        o(this.f58930i, null);
    }

    public final ArrayList<ImageView> getActionViews() {
        return this.f58926e;
    }

    public final int getBoundRadius() {
        return nh.b.a(getContext(), this.f58926e.size() * 7) + this.f58925d;
    }

    public final void h() {
        k();
        d();
        if (Build.VERSION.SDK_INT >= 31) {
            l();
        }
    }

    public final boolean i() {
        return this.f58927f;
    }

    public final void j(ImageView actionView) {
        kotlin.jvm.internal.s.h(actionView, "actionView");
        this.f58926e.remove(actionView);
        removeView(actionView);
    }

    public final void l() {
        k();
        try {
            if (this.f58928g) {
                this.f58923b.removeViewImmediate(this);
                this.f58928g = false;
                wp.a.a("remove rootView", new Object[0]);
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public final void n() {
        if (!this.f58927f) {
            WindowManager.LayoutParams layoutParams = this.f58924c;
            layoutParams.width = 1;
            layoutParams.height = 1;
            layoutParams.flags = 824;
            setVisibility(4);
            return;
        }
        Pair pairK = nh.b.k(getContext());
        this.f58924c.width = ((Number) pairK.first).intValue();
        this.f58924c.height = ((Number) pairK.second).intValue();
        if (ef.a.h()) {
            this.f58924c.flags = 808;
        } else {
            WindowManager.LayoutParams layoutParams2 = this.f58924c;
            layoutParams2.flags = 810;
            layoutParams2.dimAmount = 0.55f;
        }
        setVisibility(0);
    }

    public final void setActionViews(ArrayList<ImageView> arrayList) {
        kotlin.jvm.internal.s.h(arrayList, "<set-?>");
        this.f58926e = arrayList;
    }

    public final void setExpand(boolean z10) {
        this.f58927f = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, a stateChangeListener) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(stateChangeListener, "stateChangeListener");
        this.f58922a = stateChangeListener;
        setLayoutDirection(0);
        Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.s.f(systemService, QGbBllacZSmHKn.UzXyGZQNfCFRe);
        this.f58923b = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(AzRecorderApp.e().f());
        this.f58924c = layoutParams;
        layoutParams.gravity = 8388659;
        layoutParams.format = -3;
        setOnClickListener(new View.OnClickListener() { // from class: zg.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t.b(this.f58921a, view);
            }
        });
        this.f58925d = getResources().getDimensionPixelSize(R.dimen.size_button_bubble);
        this.f58926e = new ArrayList();
    }
}
