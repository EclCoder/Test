package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f18582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mb.b f18583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f18585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f18586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f18590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f18591j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        void a(List list, mb.b bVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18582a = Collections.EMPTY_LIST;
        this.f18583b = mb.b.f45412g;
        this.f18584c = 0;
        this.f18585d = 0.0533f;
        this.f18586e = 0.08f;
        this.f18587f = true;
        this.f18588g = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f18590i = aVar;
        this.f18591j = aVar;
        addView(aVar);
        this.f18589h = 1;
    }

    private bb.b a(bb.b bVar) {
        bb.b.C0112b c0112bB = bVar.b();
        if (!this.f18587f) {
            b0.c(c0112bB);
        } else if (!this.f18588g) {
            b0.d(c0112bB);
        }
        return c0112bB.a();
    }

    private void c(int i10, float f10) {
        this.f18584c = i10;
        this.f18585d = f10;
        f();
    }

    private void f() {
        this.f18590i.a(getCuesWithStylingPreferencesApplied(), this.f18583b, this.f18585d, this.f18584c, this.f18586e);
    }

    private List<bb.b> getCuesWithStylingPreferencesApplied() {
        if (this.f18587f && this.f18588g) {
            return this.f18582a;
        }
        ArrayList arrayList = new ArrayList(this.f18582a.size());
        for (int i10 = 0; i10 < this.f18582a.size(); i10++) {
            arrayList.add(a((bb.b) this.f18582a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (r0.f48425a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private mb.b getUserCaptionStyle() {
        if (r0.f48425a < 19 || isInEditMode()) {
            return mb.b.f45412g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? mb.b.f45412g : mb.b.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f18591j);
        View view = this.f18591j;
        if (view instanceof d0) {
            ((d0) view).g();
        }
        this.f18591j = t10;
        this.f18590i = t10;
        addView(t10);
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f18588g = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f18587f = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f18586e = f10;
        f();
    }

    public void setCues(List<bb.b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f18582a = list;
        f();
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    public void setStyle(mb.b bVar) {
        this.f18583b = bVar;
        f();
    }

    public void setViewType(int i10) {
        if (this.f18589h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new d0(getContext()));
        }
        this.f18589h = i10;
    }
}
