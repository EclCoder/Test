package com.bytedance.adsdk.ugeno.sk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.dse.dse;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends ViewGroup implements com.bytedance.adsdk.ugeno.sk.hnj {
    private Drawable aq;
    private int bug;
    private int dkl;
    private int dnm;
    private Drawable dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private gjv f12411fc;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12412hn;
    private int hnj;
    private List<qor> jip;
    private SparseIntArray mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private gjv.hnj f12413oj;
    private int ojm;
    private int[] orl;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12414sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f12415ta;
    private com.bytedance.adsdk.ugeno.gjv uua;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj extends ViewGroup.MarginLayoutParams implements hn {
        public static final Parcelable.Creator<hnj> CREATOR = new Parcelable.Creator<hnj>() { // from class: com.bytedance.adsdk.ugeno.sk.sk.hnj.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public hnj createFromParcel(Parcel parcel) {
                return new hnj(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public hnj[] newArray(int i10) {
                return new hnj[i10];
            }
        };
        private int aq;
        private int dkl;
        private int dse;
        private int gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private float f12416hn;
        private int hnj;
        private int ojm;
        private float qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private float f12417sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private boolean f12418ta;

        public hnj(hnj hnjVar) {
            super((ViewGroup.MarginLayoutParams) hnjVar);
            this.hnj = 1;
            this.f12416hn = 0.0f;
            this.qor = 0.0f;
            this.gjv = -1;
            this.f12417sk = -1.0f;
            this.dkl = -1;
            this.dse = -1;
            this.aq = 16777215;
            this.ojm = 16777215;
            this.hnj = hnjVar.hnj;
            this.f12416hn = hnjVar.f12416hn;
            this.qor = hnjVar.qor;
            this.gjv = hnjVar.gjv;
            this.f12417sk = hnjVar.f12417sk;
            this.dkl = hnjVar.dkl;
            this.dse = hnjVar.dse;
            this.aq = hnjVar.aq;
            this.ojm = hnjVar.ojm;
            this.f12418ta = hnjVar.f12418ta;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int aq() {
            return this.dse;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public float bug() {
            return this.f12417sk;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int dkl() {
            return this.gjv;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public boolean dnm() {
            return this.f12418ta;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int dse() {
            return this.dkl;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int fc() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public float gjv() {
            return this.f12416hn;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int hn() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int hnj() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int jip() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int mjg() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int ojm() {
            return this.aq;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int orl() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int qor() {
            return this.hnj;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public float sk() {
            return this.qor;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public int ta() {
            return this.ojm;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.hnj);
            parcel.writeFloat(this.f12416hn);
            parcel.writeFloat(this.qor);
            parcel.writeInt(this.gjv);
            parcel.writeFloat(this.f12417sk);
            parcel.writeInt(this.dkl);
            parcel.writeInt(this.dse);
            parcel.writeInt(this.aq);
            parcel.writeInt(this.ojm);
            parcel.writeByte(this.f12418ta ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public void gjv(int i10) {
            this.gjv = i10;
        }

        public void hn(float f10) {
            this.qor = f10;
        }

        public void hnj(float f10) {
            this.f12416hn = f10;
        }

        public void qor(int i10) {
            this.hnj = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public void hn(int i10) {
            this.dse = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.sk.hn
        public void hnj(int i10) {
            this.dkl = i10;
        }

        public void qor(float f10) {
            this.f12417sk = f10;
        }

        public hnj(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.hnj = 1;
            this.f12416hn = 0.0f;
            this.qor = 0.0f;
            this.gjv = -1;
            this.f12417sk = -1.0f;
            this.dkl = -1;
            this.dse = -1;
            this.aq = 16777215;
            this.ojm = 16777215;
        }

        public hnj(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.hnj = 1;
            this.f12416hn = 0.0f;
            this.qor = 0.0f;
            this.gjv = -1;
            this.f12417sk = -1.0f;
            this.dkl = -1;
            this.dse = -1;
            this.aq = 16777215;
            this.ojm = 16777215;
        }

        public hnj(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.hnj = 1;
            this.f12416hn = 0.0f;
            this.qor = 0.0f;
            this.gjv = -1;
            this.f12417sk = -1.0f;
            this.dkl = -1;
            this.dse = -1;
            this.aq = 16777215;
            this.ojm = 16777215;
        }

        protected hnj(Parcel parcel) {
            super(0, 0);
            this.hnj = 1;
            this.f12416hn = 0.0f;
            this.qor = 0.0f;
            this.gjv = -1;
            this.f12417sk = -1.0f;
            this.dkl = -1;
            this.dse = -1;
            this.aq = 16777215;
            this.ojm = 16777215;
            this.hnj = parcel.readInt();
            this.f12416hn = parcel.readFloat();
            this.qor = parcel.readFloat();
            this.gjv = parcel.readInt();
            this.f12417sk = parcel.readFloat();
            this.dkl = parcel.readInt();
            this.dse = parcel.readInt();
            this.aq = parcel.readInt();
            this.ojm = parcel.readInt();
            this.f12418ta = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public sk(Context context) {
        super(context, null);
        this.dkl = -1;
        this.f12411fc = new gjv(this);
        this.jip = new ArrayList();
        this.f12413oj = new gjv.hnj();
    }

    private boolean dkl(int i10) {
        if (i10 >= 0 && i10 < this.jip.size()) {
            for (int i11 = i10 + 1; i11 < this.jip.size(); i11++) {
                if (this.jip.get(i11).hn() > 0) {
                    return false;
                }
            }
            if (hnj()) {
                return (this.ojm & 4) != 0;
            }
            if ((this.f12415ta & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean gjv(int i10, int i11) {
        if (sk(i10, i11)) {
            if (hnj()) {
                return (this.f12415ta & 1) != 0;
            }
            return (this.ojm & 1) != 0;
        }
        if (hnj()) {
            return (this.f12415ta & 2) != 0;
        }
        return (this.ojm & 2) != 0;
    }

    private boolean sk(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewQor = qor(i10 - i12);
            if (viewQor != null && viewQor.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.mjg == null) {
            this.mjg = new SparseIntArray(getChildCount());
        }
        this.orl = this.f12411fc.hnj(view, i10, layoutParams, this.mjg);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hnj;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof hnj) {
            return new hnj((hnj) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new hnj((ViewGroup.MarginLayoutParams) layoutParams) : new hnj(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int getAlignContent() {
        return this.f12414sk;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int getAlignItems() {
        return this.gjv;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.dse;
    }

    public Drawable getDividerDrawableVertical() {
        return this.aq;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int getFlexDirection() {
        return this.hnj;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<qor> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.jip.size());
        for (qor qorVar : this.jip) {
            if (qorVar.hn() != 0) {
                arrayList.add(qorVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public List<qor> getFlexLinesInternal() {
        return this.jip;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int getFlexWrap() {
        return this.f12412hn;
    }

    public int getJustifyContent() {
        return this.qor;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int getLargestMainSize() {
        Iterator<qor> it = this.jip.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f12409sk);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int getMaxLine() {
        return this.dkl;
    }

    public int getShowDividerHorizontal() {
        return this.ojm;
    }

    public int getShowDividerVertical() {
        return this.f12415ta;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int getSumOfCrossSize() {
        int size = this.jip.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            qor qorVar = this.jip.get(i11);
            if (gjv(i11)) {
                i10 += hnj() ? this.dnm : this.bug;
            }
            if (dkl(i11)) {
                i10 += hnj() ? this.dnm : this.bug;
            }
            i10 += qorVar.dse;
        }
        return i10;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public View hn(int i10) {
        return qor(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int hnj(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.uua;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.uua;
        if (gjvVar != null) {
            gjvVar.aq();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.aq == null && this.dse == null) {
            return;
        }
        if (this.ojm == 0 && this.f12415ta == 0) {
            return;
        }
        int iHnj = dse.hnj(this);
        int i10 = this.hnj;
        if (i10 == 0) {
            hnj(canvas, iHnj == 1, this.f12412hn == 2);
            return;
        }
        if (i10 == 1) {
            hnj(canvas, iHnj != 1, this.f12412hn == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iHnj == 1;
            if (this.f12412hn == 2) {
                z10 = !z10;
            }
            hn(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iHnj == 1;
        if (this.f12412hn == 2) {
            z11 = !z11;
        }
        hn(canvas, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.uua;
        if (gjvVar != null) {
            gjvVar.dkl();
        }
        int iHnj = dse.hnj(this);
        int i14 = this.hnj;
        if (i14 == 0) {
            hnj(iHnj == 1, i10, i11, i12, i13);
        } else if (i14 == 1) {
            hnj(iHnj != 1, i10, i11, i12, i13);
        } else if (i14 == 2) {
            z11 = iHnj == 1;
            if (this.f12412hn == 2) {
                z11 = !z11;
            }
            hnj(z11, false, i10, i11, i12, i13);
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.hnj);
            }
            z11 = iHnj == 1;
            if (this.f12412hn == 2) {
                z11 = !z11;
            }
            hnj(z11, true, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.gjv gjvVar2 = this.uua;
        if (gjvVar2 != null) {
            gjvVar2.hnj(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.uua;
        if (gjvVar != null) {
            int[] iArrHnj = gjvVar.hnj(i10, i11);
            hnj(iArrHnj[0], iArrHnj[1]);
        } else {
            hnj(i10, i11);
        }
        com.bytedance.adsdk.ugeno.gjv gjvVar2 = this.uua;
        if (gjvVar2 != null) {
            gjvVar2.sk();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.gjv gjvVar = this.uua;
        if (gjvVar != null) {
            gjvVar.hn(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public View qor(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.orl;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    public void setAlignContent(int i10) {
        if (this.f12414sk != i10) {
            this.f12414sk = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.gjv != i10) {
            this.gjv = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.dse) {
            return;
        }
        this.dse = drawable;
        if (drawable != null) {
            this.dnm = drawable.getIntrinsicHeight();
        } else {
            this.dnm = 0;
        }
        hn();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.aq) {
            return;
        }
        this.aq = drawable;
        if (drawable != null) {
            this.bug = drawable.getIntrinsicWidth();
        } else {
            this.bug = 0;
        }
        hn();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.hnj != i10) {
            this.hnj = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public void setFlexLines(List<qor> list) {
        this.jip = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f12412hn != i10) {
            this.f12412hn = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.qor != i10) {
            this.qor = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.dkl != i10) {
            this.dkl = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.ojm) {
            this.ojm = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f12415ta) {
            this.f12415ta = i10;
            requestLayout();
        }
    }

    private void hn(int i10, int i11) {
        this.jip.clear();
        this.f12413oj.hnj();
        this.f12411fc.hnj(this.f12413oj, i10, i11);
        this.jip = this.f12413oj.hnj;
        this.f12411fc.hnj(i10, i11);
        if (this.gjv == 3) {
            for (qor qorVar : this.jip) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < qorVar.aq; i12++) {
                    View viewQor = qor(qorVar.f12406fc + i12);
                    if (viewQor != null && viewQor.getVisibility() != 8) {
                        hnj hnjVar = (hnj) viewQor.getLayoutParams();
                        iMax = this.f12412hn != 2 ? Math.max(iMax, viewQor.getMeasuredHeight() + Math.max(qorVar.bug - viewQor.getBaseline(), ((ViewGroup.MarginLayoutParams) hnjVar).topMargin) + ((ViewGroup.MarginLayoutParams) hnjVar).bottomMargin) : Math.max(iMax, viewQor.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hnjVar).topMargin + Math.max((qorVar.bug - viewQor.getMeasuredHeight()) + viewQor.getBaseline(), ((ViewGroup.MarginLayoutParams) hnjVar).bottomMargin));
                    }
                }
                qorVar.dse = iMax;
            }
        }
        this.f12411fc.hn(i10, i11, getPaddingTop() + getPaddingBottom());
        this.f12411fc.hnj();
        hnj(this.hnj, i10, i11, this.f12413oj.f12405hn);
    }

    private void hnj(int i10, int i11) {
        if (this.mjg == null) {
            this.mjg = new SparseIntArray(getChildCount());
        }
        if (this.f12411fc.hn(this.mjg)) {
            this.orl = this.f12411fc.hnj(this.mjg);
        }
        int i12 = this.hnj;
        if (i12 == 0 || i12 == 1) {
            hn(i10, i11);
        } else if (i12 == 2 || i12 == 3) {
            qor(i10, i11);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.hnj);
        }
    }

    private void qor(int i10, int i11) {
        this.jip.clear();
        this.f12413oj.hnj();
        this.f12411fc.hn(this.f12413oj, i10, i11);
        this.jip = this.f12413oj.hnj;
        this.f12411fc.hnj(i10, i11);
        this.f12411fc.hn(i10, i11, getPaddingLeft() + getPaddingRight());
        this.f12411fc.hnj();
        hnj(this.hnj, i10, i11, this.f12413oj.f12405hn);
    }

    private boolean sk(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.jip.get(i11).hn() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean gjv(int i10) {
        if (i10 >= 0 && i10 < this.jip.size()) {
            if (sk(i10)) {
                if (hnj()) {
                    return (this.ojm & 1) != 0;
                }
                return (this.f12415ta & 1) != 0;
            }
            if (hnj()) {
                return (this.ojm & 2) != 0;
            }
            if ((this.f12415ta & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public View hnj(int i10) {
        return getChildAt(i10);
    }

    private void hnj(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, C.DEFAULT_MUXED_BUFFER_SIZE);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, C.DEFAULT_MUXED_BUFFER_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void hn(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.jip.size();
        for (int i12 = 0; i12 < size; i12++) {
            qor qorVar = this.jip.get(i12);
            for (int i13 = 0; i13 < qorVar.aq; i13++) {
                int i14 = qorVar.f12406fc + i13;
                View viewQor = qor(i14);
                if (viewQor != null && viewQor.getVisibility() != 8) {
                    hnj hnjVar = (hnj) viewQor.getLayoutParams();
                    if (gjv(i14, i13)) {
                        if (z11) {
                            top = viewQor.getBottom() + ((ViewGroup.MarginLayoutParams) hnjVar).bottomMargin;
                        } else {
                            top = (viewQor.getTop() - ((ViewGroup.MarginLayoutParams) hnjVar).topMargin) - this.dnm;
                        }
                        hn(canvas, qorVar.hnj, top, qorVar.dse);
                    }
                    if (i13 == qorVar.aq - 1 && (this.ojm & 4) > 0) {
                        if (z11) {
                            bottom = (viewQor.getTop() - ((ViewGroup.MarginLayoutParams) hnjVar).topMargin) - this.dnm;
                        } else {
                            bottom = viewQor.getBottom() + ((ViewGroup.MarginLayoutParams) hnjVar).bottomMargin;
                        }
                        hn(canvas, qorVar.hnj, bottom, qorVar.dse);
                    }
                }
            }
            if (gjv(i12)) {
                if (z10) {
                    i11 = qorVar.qor;
                } else {
                    i11 = qorVar.hnj - this.bug;
                }
                hnj(canvas, i11, paddingTop, iMax);
            }
            if (dkl(i12) && (this.f12415ta & 4) > 0) {
                if (z10) {
                    i10 = qorVar.hnj - this.bug;
                } else {
                    i10 = qorVar.qor;
                }
                hnj(canvas, i10, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public boolean hnj() {
        int i10 = this.hnj;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    private void hnj(boolean z10, int i10, int i11, int i12, int i13) {
        float measuredWidth;
        float f10;
        float f11;
        float fMax;
        int i14;
        int i15;
        View viewQor;
        boolean z11;
        int i16;
        int i17;
        float f12;
        float f13;
        int i18;
        float f14;
        int i19;
        View view;
        qor qorVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i20 = i12 - i10;
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.jip.size();
        for (int i21 = 0; i21 < size; i21++) {
            qor qorVar2 = this.jip.get(i21);
            if (gjv(i21)) {
                int i22 = this.dnm;
                paddingBottom -= i22;
                paddingTop += i22;
            }
            int i23 = paddingBottom;
            int i24 = this.qor;
            char c10 = 4;
            int i25 = 2;
            boolean z12 = true;
            if (i24 == 0) {
                measuredWidth = paddingLeft;
                f10 = i20 - paddingRight;
            } else if (i24 == 1) {
                int i26 = qorVar2.f12409sk;
                f10 = i26 - paddingLeft;
                measuredWidth = (i20 - i26) + paddingRight;
            } else {
                if (i24 == 2) {
                    int i27 = qorVar2.f12409sk;
                    measuredWidth = paddingLeft + ((i20 - i27) / 2.0f);
                    f10 = (i20 - paddingRight) - ((i20 - i27) / 2.0f);
                } else if (i24 == 3) {
                    measuredWidth = paddingLeft;
                    int iHn = qorVar2.hn();
                    f11 = (i20 - qorVar2.f12409sk) / (iHn != 1 ? iHn - 1 : 1.0f);
                    f10 = i20 - paddingRight;
                } else if (i24 == 4) {
                    int iHn2 = qorVar2.hn();
                    float f15 = iHn2 != 0 ? (i20 - qorVar2.f12409sk) / iHn2 : 0.0f;
                    float f16 = f15 / 2.0f;
                    measuredWidth = paddingLeft + f16;
                    float f17 = (i20 - paddingRight) - f16;
                    f11 = f15;
                    f10 = f17;
                } else if (i24 == 5) {
                    int iHn3 = qorVar2.hn();
                    f11 = iHn3 != 0 ? (i20 - qorVar2.f12409sk) / (iHn3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f11;
                    f10 = (i20 - paddingRight) - f11;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.qor);
                }
                fMax = Math.max(f11, 0.0f);
                i14 = 0;
                while (i14 < qorVar2.aq) {
                    i15 = qorVar2.f12406fc + i14;
                    viewQor = qor(i15);
                    char c11 = c10;
                    if (viewQor != null) {
                        z11 = z12;
                        if (viewQor.getVisibility() != 8) {
                            hnj hnjVar = (hnj) viewQor.getLayoutParams();
                            f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) hnjVar).leftMargin;
                            f13 = f10 - ((ViewGroup.MarginLayoutParams) hnjVar).rightMargin;
                            if (gjv(i15, i14)) {
                                int i28 = this.bug;
                                float f18 = i28;
                                f12 += f18;
                                f13 -= f18;
                                i18 = i28;
                            } else {
                                i18 = 0;
                            }
                            f14 = f13;
                            if (i14 == qorVar2.aq - 1 || (this.f12415ta & 4) <= 0) {
                                i19 = 0;
                            } else {
                                i19 = this.bug;
                            }
                            if (this.f12412hn == i25) {
                                if (z10) {
                                    i16 = i25;
                                    view = viewQor;
                                    this.f12411fc.hnj(view, qorVar2, Math.round(f14) - viewQor.getMeasuredWidth(), i23 - viewQor.getMeasuredHeight(), Math.round(f14), i23);
                                } else {
                                    view = viewQor;
                                    i16 = i25;
                                    this.f12411fc.hnj(view, qorVar2, Math.round(f12), i23 - view.getMeasuredHeight(), Math.round(f12) + view.getMeasuredWidth(), i23);
                                }
                                i17 = i23;
                            } else {
                                i14 = i14;
                                view = viewQor;
                                z11 = z11;
                                i16 = i25;
                                i17 = i23;
                                if (z10) {
                                    this.f12411fc.hnj(view, qorVar2, Math.round(f14) - view.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + view.getMeasuredHeight());
                                } else {
                                    int i29 = paddingTop;
                                    this.f12411fc.hnj(view, qorVar2, Math.round(f12), i29, view.getMeasuredWidth() + Math.round(f12), i29 + view.getMeasuredHeight());
                                    paddingTop = i29;
                                }
                            }
                            measuredWidth = f12 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) hnjVar).rightMargin;
                            float measuredWidth2 = f14 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) hnjVar).leftMargin);
                            if (z10) {
                                qorVar = qorVar2;
                                qorVar.hnj(view, i19, 0, i18, 0);
                            } else {
                                qorVar = qorVar2;
                                qorVar.hnj(view, i18, 0, i19, 0);
                            }
                            qorVar2 = qorVar;
                            f10 = measuredWidth2;
                        } else {
                            z11 = z11;
                        }
                        i14++;
                        c10 = c11;
                        i25 = i16;
                        z12 = z11;
                        i23 = i17;
                    } else {
                        z11 = z12;
                    }
                    i16 = i25;
                    i14 = i14;
                    i17 = i23;
                    i14++;
                    c10 = c11;
                    i25 = i16;
                    z12 = z11;
                    i23 = i17;
                }
                int i30 = qorVar2.dse;
                paddingTop += i30;
                paddingBottom = i23 - i30;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, 0.0f);
            i14 = 0;
            while (i14 < qorVar2.aq) {
                i15 = qorVar2.f12406fc + i14;
                viewQor = qor(i15);
                char c12 = c10;
                if (viewQor != null) {
                    z11 = z12;
                    if (viewQor.getVisibility() != 8) {
                        hnj hnjVar2 = (hnj) viewQor.getLayoutParams();
                        f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) hnjVar2).leftMargin;
                        f13 = f10 - ((ViewGroup.MarginLayoutParams) hnjVar2).rightMargin;
                        if (gjv(i15, i14)) {
                            int i210 = this.bug;
                            float f19 = i210;
                            f12 += f19;
                            f13 -= f19;
                            i18 = i210;
                        } else {
                            i18 = 0;
                        }
                        f14 = f13;
                        if (i14 == qorVar2.aq - 1) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                        }
                        if (this.f12412hn == i25) {
                            if (z10) {
                                i16 = i25;
                                view = viewQor;
                                this.f12411fc.hnj(view, qorVar2, Math.round(f14) - viewQor.getMeasuredWidth(), i23 - viewQor.getMeasuredHeight(), Math.round(f14), i23);
                            } else {
                                view = viewQor;
                                i16 = i25;
                                this.f12411fc.hnj(view, qorVar2, Math.round(f12), i23 - view.getMeasuredHeight(), Math.round(f12) + view.getMeasuredWidth(), i23);
                            }
                            i17 = i23;
                        } else {
                            i14 = i14;
                            view = viewQor;
                            z11 = z11;
                            i16 = i25;
                            i17 = i23;
                            if (z10) {
                                this.f12411fc.hnj(view, qorVar2, Math.round(f14) - view.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + view.getMeasuredHeight());
                            } else {
                                int i211 = paddingTop;
                                this.f12411fc.hnj(view, qorVar2, Math.round(f12), i211, view.getMeasuredWidth() + Math.round(f12), i211 + view.getMeasuredHeight());
                                paddingTop = i211;
                            }
                        }
                        measuredWidth = f12 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) hnjVar2).rightMargin;
                        float measuredWidth3 = f14 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) hnjVar2).leftMargin);
                        if (z10) {
                            qorVar = qorVar2;
                            qorVar.hnj(view, i19, 0, i18, 0);
                        } else {
                            qorVar = qorVar2;
                            qorVar.hnj(view, i18, 0, i19, 0);
                        }
                        qorVar2 = qorVar;
                        f10 = measuredWidth3;
                    } else {
                        z11 = z11;
                    }
                    i14++;
                    c10 = c12;
                    i25 = i16;
                    z12 = z11;
                    i23 = i17;
                } else {
                    z11 = z12;
                }
                i16 = i25;
                i14 = i14;
                i17 = i23;
                i14++;
                c10 = c12;
                i25 = i16;
                z12 = z11;
                i23 = i17;
            }
            int i31 = qorVar2.dse;
            paddingTop += i31;
            paddingBottom = i23 - i31;
        }
    }

    private void hn(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.dse;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.dnm + i11);
        this.dse.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int hn(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void hn() {
        if (this.dse == null && this.aq == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01db  */
    private void hnj(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        float measuredHeight;
        float f10;
        float f11;
        float fMax;
        int i14;
        int i15;
        int i16;
        View viewQor;
        char c10;
        int i17;
        int i18;
        float f12;
        float f13;
        int i19;
        float f14;
        int i20;
        qor qorVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i21 = i13 - i11;
        int i22 = (i12 - i10) - paddingRight;
        int size = this.jip.size();
        for (int i23 = 0; i23 < size; i23++) {
            qor qorVar2 = this.jip.get(i23);
            if (gjv(i23)) {
                int i24 = this.bug;
                paddingLeft += i24;
                i22 -= i24;
            }
            int i25 = i22;
            int i26 = this.qor;
            char c11 = 4;
            int i27 = 1;
            if (i26 == 0) {
                measuredHeight = paddingTop;
                f10 = i21 - paddingBottom;
            } else if (i26 == 1) {
                int i28 = qorVar2.f12409sk;
                f10 = i28 - paddingTop;
                measuredHeight = (i21 - i28) + paddingBottom;
            } else {
                if (i26 == 2) {
                    int i29 = qorVar2.f12409sk;
                    measuredHeight = paddingTop + ((i21 - i29) / 2.0f);
                    f10 = (i21 - paddingBottom) - ((i21 - i29) / 2.0f);
                } else if (i26 == 3) {
                    measuredHeight = paddingTop;
                    int iHn = qorVar2.hn();
                    f11 = (i21 - qorVar2.f12409sk) / (iHn != 1 ? iHn - 1 : 1.0f);
                    f10 = i21 - paddingBottom;
                } else if (i26 == 4) {
                    int iHn2 = qorVar2.hn();
                    f11 = iHn2 != 0 ? (i21 - qorVar2.f12409sk) / iHn2 : 0.0f;
                    float f15 = f11 / 2.0f;
                    measuredHeight = paddingTop + f15;
                    f10 = (i21 - paddingBottom) - f15;
                } else if (i26 == 5) {
                    int iHn3 = qorVar2.hn();
                    f11 = iHn3 != 0 ? (i21 - qorVar2.f12409sk) / (iHn3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f11;
                    f10 = (i21 - paddingBottom) - f11;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.qor);
                }
                fMax = Math.max(f11, 0.0f);
                i14 = 0;
                while (i14 < qorVar2.aq) {
                    i15 = qorVar2.f12406fc + i14;
                    i16 = i27;
                    viewQor = qor(i15);
                    if (viewQor != null) {
                        c10 = c11;
                        if (viewQor.getVisibility() != 8) {
                            hnj hnjVar = (hnj) viewQor.getLayoutParams();
                            f12 = measuredHeight + ((ViewGroup.MarginLayoutParams) hnjVar).topMargin;
                            f13 = f10 - ((ViewGroup.MarginLayoutParams) hnjVar).bottomMargin;
                            if (gjv(i15, i14)) {
                                i19 = this.dnm;
                                float f16 = i19;
                                f12 += f16;
                                f13 -= f16;
                            } else {
                                i19 = 0;
                            }
                            f14 = f13;
                            if (i14 == qorVar2.aq - i16 || (this.ojm & 4) <= 0) {
                                i20 = 0;
                            } else {
                                i20 = this.dnm;
                            }
                            if (z10) {
                                if (z11) {
                                    i17 = i14;
                                    this.f12411fc.hnj(viewQor, qorVar2, true, i25 - viewQor.getMeasuredWidth(), Math.round(f14) - viewQor.getMeasuredHeight(), i25, Math.round(f14));
                                } else {
                                    i17 = i14;
                                    this.f12411fc.hnj(viewQor, qorVar2, true, i25 - viewQor.getMeasuredWidth(), Math.round(f12), i25, Math.round(f12) + viewQor.getMeasuredHeight());
                                }
                                i18 = i25;
                            } else {
                                i17 = i14;
                                i16 = i16;
                                i18 = i25;
                                if (z11) {
                                    this.f12411fc.hnj(viewQor, qorVar2, false, paddingLeft, Math.round(f14) - viewQor.getMeasuredHeight(), paddingLeft + viewQor.getMeasuredWidth(), Math.round(f14));
                                } else {
                                    int i30 = paddingLeft;
                                    this.f12411fc.hnj(viewQor, qorVar2, false, i30, Math.round(f12), i30 + viewQor.getMeasuredWidth(), Math.round(f12) + viewQor.getMeasuredHeight());
                                    paddingLeft = i30;
                                }
                            }
                            measuredHeight = f12 + viewQor.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) hnjVar).bottomMargin;
                            float measuredHeight2 = f14 - ((viewQor.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) hnjVar).topMargin);
                            if (z11) {
                                qorVar = qorVar2;
                                qorVar.hnj(viewQor, 0, i20, 0, i19);
                            } else {
                                qorVar = qorVar2;
                                qorVar.hnj(viewQor, 0, i19, 0, i20);
                            }
                            qorVar2 = qorVar;
                            f10 = measuredHeight2;
                        }
                        i14 = i17 + 1;
                        c11 = c10;
                        i27 = i16;
                        i25 = i18;
                    } else {
                        c10 = c11;
                    }
                    i17 = i14;
                    i16 = i16;
                    i18 = i25;
                    i14 = i17 + 1;
                    c11 = c10;
                    i27 = i16;
                    i25 = i18;
                }
                int i31 = qorVar2.dse;
                paddingLeft += i31;
                i22 = i25 - i31;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, 0.0f);
            i14 = 0;
            while (i14 < qorVar2.aq) {
                i15 = qorVar2.f12406fc + i14;
                i16 = i27;
                viewQor = qor(i15);
                if (viewQor != null) {
                    c10 = c11;
                    if (viewQor.getVisibility() != 8) {
                        hnj hnjVar2 = (hnj) viewQor.getLayoutParams();
                        f12 = measuredHeight + ((ViewGroup.MarginLayoutParams) hnjVar2).topMargin;
                        f13 = f10 - ((ViewGroup.MarginLayoutParams) hnjVar2).bottomMargin;
                        if (gjv(i15, i14)) {
                            i19 = this.dnm;
                            float f17 = i19;
                            f12 += f17;
                            f13 -= f17;
                        } else {
                            i19 = 0;
                        }
                        f14 = f13;
                        if (i14 == qorVar2.aq - i16) {
                            i20 = 0;
                        } else {
                            i20 = 0;
                        }
                        if (z10) {
                            if (z11) {
                                i17 = i14;
                                this.f12411fc.hnj(viewQor, qorVar2, true, i25 - viewQor.getMeasuredWidth(), Math.round(f14) - viewQor.getMeasuredHeight(), i25, Math.round(f14));
                            } else {
                                i17 = i14;
                                this.f12411fc.hnj(viewQor, qorVar2, true, i25 - viewQor.getMeasuredWidth(), Math.round(f12), i25, Math.round(f12) + viewQor.getMeasuredHeight());
                            }
                            i18 = i25;
                        } else {
                            i17 = i14;
                            i16 = i16;
                            i18 = i25;
                            if (z11) {
                                this.f12411fc.hnj(viewQor, qorVar2, false, paddingLeft, Math.round(f14) - viewQor.getMeasuredHeight(), paddingLeft + viewQor.getMeasuredWidth(), Math.round(f14));
                            } else {
                                int i32 = paddingLeft;
                                this.f12411fc.hnj(viewQor, qorVar2, false, i32, Math.round(f12), i32 + viewQor.getMeasuredWidth(), Math.round(f12) + viewQor.getMeasuredHeight());
                                paddingLeft = i32;
                            }
                        }
                        measuredHeight = f12 + viewQor.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) hnjVar2).bottomMargin;
                        float measuredHeight3 = f14 - ((viewQor.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) hnjVar2).topMargin);
                        if (z11) {
                            qorVar = qorVar2;
                            qorVar.hnj(viewQor, 0, i20, 0, i19);
                        } else {
                            qorVar = qorVar2;
                            qorVar.hnj(viewQor, 0, i19, 0, i20);
                        }
                        qorVar2 = qorVar;
                        f10 = measuredHeight3;
                    }
                    i14 = i17 + 1;
                    c11 = c10;
                    i27 = i16;
                    i25 = i18;
                } else {
                    c10 = c11;
                }
                i17 = i14;
                i16 = i16;
                i18 = i25;
                i14 = i17 + 1;
                c11 = c10;
                i27 = i16;
                i25 = i18;
            }
            int i33 = qorVar2.dse;
            paddingLeft += i33;
            i22 = i25 - i33;
        }
    }

    private void hnj(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.jip.size();
        for (int i12 = 0; i12 < size; i12++) {
            qor qorVar = this.jip.get(i12);
            for (int i13 = 0; i13 < qorVar.aq; i13++) {
                int i14 = qorVar.f12406fc + i13;
                View viewQor = qor(i14);
                if (viewQor != null && viewQor.getVisibility() != 8) {
                    hnj hnjVar = (hnj) viewQor.getLayoutParams();
                    if (gjv(i14, i13)) {
                        if (z10) {
                            left = viewQor.getRight() + ((ViewGroup.MarginLayoutParams) hnjVar).rightMargin;
                        } else {
                            left = (viewQor.getLeft() - ((ViewGroup.MarginLayoutParams) hnjVar).leftMargin) - this.bug;
                        }
                        hnj(canvas, left, qorVar.f12407hn, qorVar.dse);
                    }
                    if (i13 == qorVar.aq - 1 && (this.f12415ta & 4) > 0) {
                        if (z10) {
                            right = (viewQor.getLeft() - ((ViewGroup.MarginLayoutParams) hnjVar).leftMargin) - this.bug;
                        } else {
                            right = viewQor.getRight() + ((ViewGroup.MarginLayoutParams) hnjVar).rightMargin;
                        }
                        hnj(canvas, right, qorVar.f12407hn, qorVar.dse);
                    }
                }
            }
            if (gjv(i12)) {
                if (z11) {
                    i11 = qorVar.gjv;
                } else {
                    i11 = qorVar.f12407hn - this.dnm;
                }
                hn(canvas, paddingLeft, i11, iMax);
            }
            if (dkl(i12) && (this.ojm & 4) > 0) {
                if (z11) {
                    i10 = qorVar.f12407hn - this.dnm;
                } else {
                    i10 = qorVar.gjv;
                }
                hn(canvas, paddingLeft, i10, iMax);
            }
        }
    }

    private void hnj(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.aq;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.bug + i10, i12 + i11);
        this.aq.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int hnj(View view, int i10, int i11) {
        int i12;
        int i13;
        if (hnj()) {
            i12 = gjv(i10, i11) ? this.bug : 0;
            if ((this.f12415ta & 4) <= 0) {
                return i12;
            }
            i13 = this.bug;
        } else {
            i12 = gjv(i10, i11) ? this.dnm : 0;
            if ((this.ojm & 4) <= 0) {
                return i12;
            }
            i13 = this.dnm;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public void hnj(qor qorVar) {
        if (hnj()) {
            if ((this.f12415ta & 4) > 0) {
                int i10 = qorVar.f12409sk;
                int i11 = this.bug;
                qorVar.f12409sk = i10 + i11;
                qorVar.dkl += i11;
                return;
            }
            return;
        }
        if ((this.ojm & 4) > 0) {
            int i12 = qorVar.f12409sk;
            int i13 = this.dnm;
            qorVar.f12409sk = i12 + i13;
            qorVar.dkl += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public int hnj(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.sk.hnj
    public void hnj(View view, int i10, int i11, qor qorVar) {
        if (gjv(i10, i11)) {
            if (hnj()) {
                int i12 = qorVar.f12409sk;
                int i13 = this.bug;
                qorVar.f12409sk = i12 + i13;
                qorVar.dkl += i13;
                return;
            }
            int i14 = qorVar.f12409sk;
            int i15 = this.dnm;
            qorVar.f12409sk = i14 + i15;
            qorVar.dkl += i15;
        }
    }

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        this.uua = qorVar;
    }
}
