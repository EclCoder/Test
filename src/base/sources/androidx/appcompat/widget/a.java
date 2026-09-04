package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import n0.a1;
import n0.b1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0013a f1504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f1505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ActionMenuView f1506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c f1507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f1508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected a1 f1509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1511h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected class C0013a implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1512a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1513b;

        protected C0013a() {
        }

        @Override // n0.b1
        public void a(View view) {
            this.f1512a = true;
        }

        @Override // n0.b1
        public void b(View view) {
            if (this.f1512a) {
                return;
            }
            a aVar = a.this;
            aVar.f1509f = null;
            a.super.setVisibility(this.f1513b);
        }

        @Override // n0.b1
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1512a = false;
        }

        public C0013a d(a1 a1Var, int i10) {
            a.this.f1509f = a1Var;
            this.f1513b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1504a = new C0013a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(h.a.f39848a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1505b = context;
        } else {
            this.f1505b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public a1 f(int i10, long j10) {
        a1 a1Var = this.f1509f;
        if (a1Var != null) {
            a1Var.c();
        }
        if (i10 != 0) {
            a1 a1VarB = n0.q0.e(this).b(0.0f);
            a1VarB.e(j10);
            a1VarB.g(this.f1504a.d(a1VarB, i10));
            return a1VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        a1 a1VarB2 = n0.q0.e(this).b(1.0f);
        a1VarB2.e(j10);
        a1VarB2.g(this.f1504a.d(a1VarB2, i10));
        return a1VarB2;
    }

    public int getAnimatedVisibility() {
        return this.f1509f != null ? this.f1504a.f1513b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1508e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h.j.f39995a, h.a.f39850c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(h.j.f40048j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f1507d;
        if (cVar != null) {
            cVar.I(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1511h = false;
        }
        if (!this.f1511h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1511h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1511h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1510g = false;
        }
        if (!this.f1510g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1510g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1510g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            a1 a1Var = this.f1509f;
            if (a1Var != null) {
                a1Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
