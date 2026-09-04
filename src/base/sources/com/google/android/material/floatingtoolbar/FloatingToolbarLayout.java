package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.o0;
import com.google.android.material.internal.z;
import e0.b;
import mc.i;
import mc.p;
import n0.b0;
import n0.k1;
import n0.q0;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class FloatingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f20172j = "FloatingToolbarLayout";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f20173k = l.f51878v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f20178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20182i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b0 {
        a() {
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            if (!FloatingToolbarLayout.this.f20174a && !FloatingToolbarLayout.this.f20176c && !FloatingToolbarLayout.this.f20175b && !FloatingToolbarLayout.this.f20177d) {
                return k1Var;
            }
            b bVarG = k1Var.g(k1.s.g() | k1.s.a() | k1.s.b());
            FloatingToolbarLayout.this.f20179f = bVarG.f37003d;
            FloatingToolbarLayout.this.f20180g = bVarG.f37001b;
            FloatingToolbarLayout.this.f20182i = bVarG.f37002c;
            FloatingToolbarLayout.this.f20181h = bVarG.f37000a;
            FloatingToolbarLayout.this.j();
            return k1Var;
        }
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, f20173k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.f20178e;
        if (rect == null) {
            Log.w(f20172j, "Unable to update margins because original view margins are not set");
            return;
        }
        int i10 = rect.left + (this.f20174a ? this.f20181h : 0);
        int i11 = rect.right + (this.f20176c ? this.f20182i : 0);
        int i12 = rect.top + (this.f20175b ? this.f20180g : 0);
        int i13 = rect.bottom + (this.f20177d ? this.f20179f : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i13 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.topMargin == i12) {
            return;
        }
        marginLayoutParams.bottomMargin = i13;
        marginLayoutParams.leftMargin = i10;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.topMargin = i12;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.f20178e = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f20178e = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        j();
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        o0 o0VarJ = z.j(context2, attributeSet, m.L3, i10, i11, new int[0]);
        int i12 = m.M3;
        if (o0VarJ.s(i12)) {
            int iB = o0VarJ.b(i12, 0);
            i iVar = new i(p.k(context2, attributeSet, i10, i11).m());
            iVar.l0(ColorStateList.valueOf(iB));
            setBackground(iVar);
        }
        this.f20174a = o0VarJ.a(m.O3, true);
        this.f20175b = o0VarJ.a(m.Q3, false);
        this.f20176c = o0VarJ.a(m.P3, true);
        this.f20177d = o0VarJ.a(m.N3, true);
        q0.w0(this, new a());
        o0VarJ.x();
    }
}
