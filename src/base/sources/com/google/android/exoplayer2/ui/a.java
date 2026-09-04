package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f18609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f18611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private mb.b f18612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f18613f;

    public a(Context context) {
        this(context, null);
    }

    private static bb.b b(bb.b bVar) {
        bb.b.C0112b c0112bP = bVar.b().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (bVar.f8746f == 0) {
            c0112bP.h(1.0f - bVar.f8745e, 0);
        } else {
            c0112bP.h((-bVar.f8745e) - 1.0f, 1);
        }
        int i10 = bVar.f8747g;
        if (i10 == 0) {
            c0112bP.i(2);
        } else if (i10 == 2) {
            c0112bP.i(0);
        }
        return c0112bP.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List list, mb.b bVar, float f10, int i10, float f11) {
        this.f18609b = list;
        this.f18612e = bVar;
        this.f18611d = f10;
        this.f18610c = i10;
        this.f18613f = f11;
        while (this.f18608a.size() < list.size()) {
            this.f18608a.add(new y(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f18609b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float f10 = b0.f(this.f18610c, this.f18611d, height, i10);
        if (f10 <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            bb.b bVarB = (bb.b) list.get(i11);
            if (bVarB.f8756p != Integer.MIN_VALUE) {
                bVarB = b(bVarB);
            }
            ((y) this.f18608a.get(i11)).b(bVarB, this.f18612e, f10, b0.f(bVarB.f8754n, bVarB.f8755o, height, i10), this.f18613f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18608a = new ArrayList();
        this.f18609b = Collections.EMPTY_LIST;
        this.f18610c = 0;
        this.f18611d = 0.0533f;
        this.f18612e = mb.b.f45412g;
        this.f18613f = 0.08f;
    }
}
