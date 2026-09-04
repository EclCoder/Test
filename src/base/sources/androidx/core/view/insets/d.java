package androidx.core.view.insets;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n0.b0;
import n0.f1;
import n0.k1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f3357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f3358b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0.b f3359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e0.b f3360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3361e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends View {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f3362a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ViewGroup viewGroup) {
            super(context);
            this.f3362a = viewGroup;
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.f3362a.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            if (d.this.f3361e != color) {
                d.this.f3361e = color;
                for (int size = d.this.f3358b.size() - 1; size >= 0; size--) {
                    ((InterfaceC0030d) d.this.f3358b.get(size)).e(color);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends f1.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap f3364c;

        b(int i10) {
            super(i10);
            this.f3364c = new HashMap();
        }

        private boolean f(f1 f1Var) {
            return (f1Var.d() & k1.s.g()) != 0;
        }

        @Override // n0.f1.b
        public void b(f1 f1Var) {
            if (f(f1Var)) {
                this.f3364c.remove(f1Var);
                for (int size = d.this.f3358b.size() - 1; size >= 0; size--) {
                    ((InterfaceC0030d) d.this.f3358b.get(size)).a();
                }
            }
        }

        @Override // n0.f1.b
        public void c(f1 f1Var) {
            if (f(f1Var)) {
                for (int size = d.this.f3358b.size() - 1; size >= 0; size--) {
                    ((InterfaceC0030d) d.this.f3358b.get(size)).c();
                }
            }
        }

        @Override // n0.f1.b
        public k1 d(k1 k1Var, List list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i10 = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                f1 f1Var = (f1) list.get(size);
                Integer num = (Integer) this.f3364c.get(f1Var);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fA = f1Var.a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA;
                    }
                    i10 |= iIntValue;
                }
            }
            e0.b bVarJ = d.this.j(k1Var);
            for (int size2 = d.this.f3358b.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC0030d) d.this.f3358b.get(size2)).b(i10, bVarJ, rectF);
            }
            return k1Var;
        }

        @Override // n0.f1.b
        public f1.a e(f1 f1Var, f1.a aVar) {
            if (!f(f1Var)) {
                return aVar;
            }
            e0.b bVarB = aVar.b();
            e0.b bVarA = aVar.a();
            int i10 = bVarB.f37000a != bVarA.f37000a ? 1 : 0;
            if (bVarB.f37001b != bVarA.f37001b) {
                i10 |= 2;
            }
            if (bVarB.f37002c != bVarA.f37002c) {
                i10 |= 4;
            }
            if (bVarB.f37003d != bVarA.f37003d) {
                i10 |= 8;
            }
            this.f3364c.put(f1Var, Integer.valueOf(i10));
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f3366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3368c;

        c(ViewGroup viewGroup, View view, int i10) {
            this.f3366a = viewGroup;
            this.f3367b = view;
            this.f3368c = i10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3366a.addView(this.f3367b, this.f3368c);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f3366a.addView(this.f3367b, this.f3368c);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.insets.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface InterfaceC0030d {
        void a();

        void b(int i10, e0.b bVar, RectF rectF);

        void c();

        void d(e0.b bVar, e0.b bVar2);

        void e(int i10);
    }

    d(ViewGroup viewGroup) {
        e0.b bVar = e0.b.f36999e;
        this.f3359c = bVar;
        this.f3360d = bVar;
        Drawable background = viewGroup.getBackground();
        this.f3361e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.f3357a = aVar;
        aVar.setVisibility(8);
        aVar.setWillNotDraw(true);
        q0.w0(aVar, new b0() { // from class: androidx.core.view.insets.b
            @Override // n0.b0
            public final k1 a(View view, k1 k1Var) {
                return d.b(this.f3355a, view, k1Var);
            }
        });
        q0.E0(aVar, new b(0));
        h(viewGroup, aVar, 0);
    }

    public static /* synthetic */ void a(d dVar) {
        ViewParent parent = dVar.f3357a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(dVar.f3357a);
        }
    }

    public static /* synthetic */ k1 b(d dVar, View view, k1 k1Var) {
        e0.b bVarJ = dVar.j(k1Var);
        e0.b bVarK = dVar.k(k1Var);
        if (!bVarJ.equals(dVar.f3359c) || !bVarK.equals(dVar.f3360d)) {
            dVar.f3359c = bVarJ;
            dVar.f3360d = bVarK;
            for (int size = dVar.f3358b.size() - 1; size >= 0; size--) {
                ((InterfaceC0030d) dVar.f3358b.get(size)).d(bVarJ, bVarK);
            }
        }
        return k1Var;
    }

    private static void h(ViewGroup viewGroup, View view, int i10) {
        View childAt;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(view, i10);
        } else {
            childAt.addOnAttachStateChangeListener(new c(viewGroup, view, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e0.b j(k1 k1Var) {
        return e0.b.b(k1Var.g(k1.s.g()), k1Var.g(k1.s.i()));
    }

    private e0.b k(k1 k1Var) {
        return e0.b.b(k1Var.h(k1.s.g()), k1Var.h(k1.s.i()));
    }

    void g(InterfaceC0030d interfaceC0030d) {
        if (this.f3358b.contains(interfaceC0030d)) {
            return;
        }
        this.f3358b.add(interfaceC0030d);
        interfaceC0030d.d(this.f3359c, this.f3360d);
        interfaceC0030d.e(this.f3361e);
    }

    void i() {
        this.f3357a.post(new Runnable() { // from class: androidx.core.view.insets.c
            @Override // java.lang.Runnable
            public final void run() {
                d.a(this.f3356a);
            }
        });
    }

    boolean l() {
        return !this.f3358b.isEmpty();
    }

    void m(InterfaceC0030d interfaceC0030d) {
        this.f3358b.remove(interfaceC0030d);
    }
}
