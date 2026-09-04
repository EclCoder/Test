package com.bytedance.adsdk.ugeno.dkl.hnj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.dkl.gjv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj extends LinearLayout {
    private boolean aq;
    private String bug;
    private int dkl;
    private float dnm;
    private int dse;
    private List<View> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected int f12233hn;
    protected Context hnj;
    private int ojm;
    protected int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12234sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private float f12235ta;

    public hnj(Context context) {
        super(context);
        this.f12234sk = -65536;
        this.dkl = -16776961;
        this.dse = 5;
        this.f12233hn = 40;
        this.qor = 20;
        this.bug = "row";
        this.hnj = context;
        this.gjv = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        float height2 = getHeight();
        float f10 = this.dnm;
        layoutParams.topMargin = (int) (((int) ((height * f10) / 100.0f)) - ((height2 * f10) / 100.0f));
        float f11 = this.f12235ta;
        layoutParams.leftMargin = (int) (((int) ((width * f11) / 100.0f)) - ((width2 * f11) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.gjv.size();
    }

    public abstract Drawable hn(int i10);

    public void hn() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof hn) {
            this.qor = this.f12233hn;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f12233hn, this.qor);
        if (getOrientation() == 1) {
            int i10 = this.dse;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = i10;
        } else {
            int i11 = this.dse;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
        }
        addView(view, layoutParams);
        view.setBackground(hn(this.dkl));
        this.gjv.add(view);
    }

    public void qor() {
        this.gjv.clear();
        removeAllViews();
    }

    public void setIndicatorDirection(String str) {
        this.bug = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i10) {
        this.qor = i10;
    }

    public void setIndicatorWidth(int i10) {
        this.f12233hn = i10;
    }

    public void setIndicatorX(float f10) {
        this.f12235ta = f10;
    }

    public void setIndicatorY(float f10) {
        this.dnm = f10;
    }

    public void setLoop(boolean z10) {
        this.aq = z10;
    }

    public void setSelectedColor(int i10) {
        this.f12234sk = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.dkl = i10;
    }

    public void hnj(int i10, int i11) {
        Iterator<View> it = this.gjv.iterator();
        while (it.hasNext()) {
            it.next().setBackground(hn(this.dkl));
        }
        if (i10 < 0 || i10 >= this.gjv.size()) {
            i10 = 0;
        }
        if (this.gjv.size() > 0) {
            this.gjv.get(i10).setBackground(hn(this.f12234sk));
            this.ojm = i11;
        }
    }

    public void hnj() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.dkl.hnj.hnj.1
            @Override // java.lang.Runnable
            public void run() {
                hnj.this.gjv();
            }
        });
    }

    public void hnj(int i10) {
        if (this instanceof hn) {
            this.qor = this.f12233hn;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f12233hn, this.qor);
        if (getOrientation() == 1) {
            int i11 = this.dse;
            layoutParams.topMargin = i11;
            layoutParams.bottomMargin = i11;
        } else {
            int i12 = this.dse;
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i12;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f12233hn, this.qor);
        if (getOrientation() == 1) {
            int i13 = this.dse;
            layoutParams2.topMargin = i13;
            layoutParams2.bottomMargin = i13;
        } else {
            int i14 = this.dse;
            layoutParams2.leftMargin = i14;
            layoutParams2.rightMargin = i14;
        }
        int iHnj = gjv.hnj(this.aq, this.ojm, this.gjv.size());
        int iHnj2 = gjv.hnj(this.aq, i10, this.gjv.size());
        if (this.gjv.size() == 0) {
            iHnj2 = 0;
        }
        if (!this.gjv.isEmpty() && gjv.hnj(iHnj, this.gjv) && gjv.hnj(iHnj2, this.gjv)) {
            this.gjv.get(iHnj).setBackground(hn(this.dkl));
            this.gjv.get(iHnj).setLayoutParams(layoutParams2);
            this.gjv.get(iHnj2).setBackground(hn(this.f12234sk));
            this.gjv.get(iHnj2).setLayoutParams(layoutParams);
            this.ojm = i10;
        }
    }
}
