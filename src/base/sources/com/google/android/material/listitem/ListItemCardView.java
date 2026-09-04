package com.google.android.material.listitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.o0;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.internal.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import sb.c;
import sb.e;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ListItemCardView extends MaterialCardView implements ec.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f20435w = {c.f51631r0};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f20437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final LinkedHashSet f20439v;

    public ListItemCardView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, l.f51879w);
    }

    @Override // ec.b
    public void a(int i10) {
        Iterator it = this.f20439v.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // ec.b
    public boolean b() {
        return this.f20438u;
    }

    @Override // ec.b
    public void c(int i10, View view, int i11) {
        this.f20436s = i10 != 3;
        refreshDrawableState();
        Iterator it = this.f20439v.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // ec.b
    public int getSwipeMaxOvershoot() {
        return this.f20437t;
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.f20436s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20435w);
        }
        return iArrOnCreateDrawableState;
    }

    public void setSwipeEnabled(boolean z10) {
        this.f20438u = z10;
    }

    public ListItemCardView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20436s = false;
        this.f20439v = new LinkedHashSet();
        Context context2 = getContext();
        this.f20437t = getResources().getDimensionPixelSize(e.J);
        o0 o0VarJ = z.j(context2, attributeSet, m.f52162s4, i10, i11, new int[0]);
        this.f20438u = o0VarJ.a(m.f52177t4, true);
        o0VarJ.x();
    }
}
