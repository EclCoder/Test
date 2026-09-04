package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import cc.a;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import sb.c;
import sb.e;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f21212b0 = l.P;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int[][] f21213c0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private final a U;
    private ColorStateList V;
    private ColorStateList W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f21214a0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f21212b0;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.U = new a(context2);
        TypedArray typedArrayI = z.i(context2, attributeSet, m.Nb, i10, i11, new int[0]);
        this.f21214a0 = typedArrayI.getBoolean(m.Ob, false);
        typedArrayI.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.V == null) {
            int iD = ac.a.d(this, c.f51620m);
            int iD2 = ac.a.d(this, h.a.f39866s);
            float dimension = getResources().getDimension(e.f51702m1);
            if (this.U.e()) {
                dimension += c0.k(this);
            }
            int iC = this.U.c(iD, dimension);
            int[][] iArr = f21213c0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = ac.a.j(iD, iD2, 1.0f);
            iArr2[1] = iC;
            iArr2[2] = ac.a.j(iD, iD2, 0.38f);
            iArr2[3] = iC;
            this.V = new ColorStateList(iArr, iArr2);
        }
        return this.V;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.W == null) {
            int[][] iArr = f21213c0;
            int[] iArr2 = new int[iArr.length];
            int iD = ac.a.d(this, c.f51620m);
            int iD2 = ac.a.d(this, h.a.f39866s);
            int iD3 = ac.a.d(this, c.f51614j);
            iArr2[0] = ac.a.j(iD, iD2, 0.54f);
            iArr2[1] = ac.a.j(iD, iD3, 0.32f);
            iArr2[2] = ac.a.j(iD, iD2, 0.12f);
            iArr2[3] = ac.a.j(iD, iD3, 0.12f);
            this.W = new ColorStateList(iArr, iArr2);
        }
        return this.W;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21214a0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f21214a0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f21214a0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
