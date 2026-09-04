package com.google.android.material.bottomsheet;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import n0.q0;
import o0.p;
import o0.s;
import sb.k;
import sb.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f19525l = l.f51875s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityManager f19526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BottomSheetBehavior f19527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GestureDetector f19528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f19533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f19534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BottomSheetBehavior.g f19535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final GestureDetector.OnGestureListener f19536k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (BottomSheetDragHandleView.this.f19527b == null || !BottomSheetDragHandleView.this.f19527b.I0()) {
                return super.onDoubleTap(motionEvent);
            }
            BottomSheetDragHandleView.this.f19527b.l1(5);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return BottomSheetDragHandleView.this.isClickable();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            BottomSheetDragHandleView.this.performLongClick(motionEvent.getX(), motionEvent.getY());
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return BottomSheetDragHandleView.this.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends n0.a {
        c() {
        }

        @Override // n0.a
        public void g(View view, p pVar) {
            String string;
            super.g(view, pVar);
            if (BottomSheetDragHandleView.this.k()) {
                CharSequence contentDescription = BottomSheetDragHandleView.this.getContentDescription();
                int iA0 = BottomSheetDragHandleView.this.f19527b.A0();
                if (iA0 == 3) {
                    string = BottomSheetDragHandleView.this.getResources().getString(k.f51837i);
                } else if (iA0 != 4) {
                    string = iA0 != 6 ? null : BottomSheetDragHandleView.this.getResources().getString(k.f51838j);
                } else {
                    string = BottomSheetDragHandleView.this.getResources().getString(k.f51836h);
                }
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                if (!TextUtils.isEmpty(contentDescription)) {
                    string = string + ". " + ((Object) contentDescription);
                }
                pVar.y0(string);
            }
        }

        @Override // n0.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.h();
            }
        }
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i10) {
        super(pc.a.d(context, attributeSet, i10, f19525l), attributeSet, i10);
        this.f19530e = false;
        this.f19531f = false;
        this.f19532g = getResources().getString(k.f51832d);
        this.f19533h = getResources().getString(k.f51834f);
        this.f19534i = getResources().getString(k.f51830b);
        this.f19535j = new a();
        b bVar = new b();
        this.f19536k = bVar;
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 26) {
            setTooltipText(getResources().getString(k.f51835g));
        }
        this.f19528c = new GestureDetector(context2, bVar, new Handler(Looper.getMainLooper()));
        this.f19526a = (AccessibilityManager) context2.getSystemService("accessibility");
        q0.m0(this, new c());
    }

    private int getNextState() {
        if (!k()) {
            return -1;
        }
        boolean z10 = (this.f19527b.G0() || this.f19527b.r1()) ? false : true;
        int iA0 = this.f19527b.A0();
        if (iA0 == 3) {
            if (z10) {
                return 6;
            }
            return this.f19527b.n0() ? 4 : -1;
        }
        if (iA0 == 4) {
            return z10 ? 6 : 3;
        }
        if (iA0 != 6) {
            return -1;
        }
        if (this.f19529d) {
            return 3;
        }
        return this.f19527b.n0() ? 4 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        if (!k()) {
            return false;
        }
        int nextState = getNextState();
        if (nextState == -1) {
            return true;
        }
        this.f19527b.l1(nextState);
        return true;
    }

    private BottomSheetBehavior i() {
        View viewJ = this;
        while (true) {
            viewJ = j(viewJ);
            if (viewJ == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = viewJ.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
                if (cVarF instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) cVarF;
                }
            }
        }
    }

    private static View j(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        return this.f19527b != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i10) {
        String str;
        if (i10 == 4) {
            this.f19529d = true;
        } else if (i10 == 3) {
            this.f19529d = false;
        }
        int nextState = getNextState();
        if (nextState == 3) {
            str = this.f19532g;
        } else if (nextState != 4) {
            str = nextState != 6 ? null : this.f19533h;
        } else {
            str = this.f19534i;
        }
        q0.i0(this, p.a.f47928i, str, new s() { // from class: wb.a
            @Override // o0.s
            public final boolean a(View view, s.a aVar) {
                return this.f56164a.h();
            }
        });
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f19527b;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.Q0(this.f19535j);
            this.f19527b.V0(null);
            this.f19527b.W0(null);
        }
        this.f19527b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.V0(this);
            this.f19527b.W0(this);
            l(this.f19527b.A0());
            this.f19527b.f0(this.f19535j);
        }
        setClickable(k());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(i());
        AccessibilityManager accessibilityManager = this.f19526a;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f19526a.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f19526a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (i10 == 23 || i10 == 66) {
            return this.f19531f ? performClick() : h();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f19531f || this.f19530e) ? super.onTouchEvent(motionEvent) : this.f19528c.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f19531f = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f19530e = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends BottomSheetBehavior.g {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            BottomSheetDragHandleView.this.l(i10);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }
    }
}
