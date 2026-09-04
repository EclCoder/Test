package com.bytedance.adsdk.ugeno.aq;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends ViewGroup {
    private float apu;
    private final hn aq;
    private int as;
    private ClassLoader bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private int f12167cm;
    private Parcelable dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f7do;
    private final ArrayList<hn> dse;
    private ArrayList<View> dy;
    private int dzo;
    private boolean eta;
    private float eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private dkl f12168fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private int f12169ff;
    private int fr;
    private float fvt;
    int gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private int f12170gm;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private int f12171gn;
    private final Runnable hkr;
    private int hnj;
    private boolean hqh;
    private gjv izk;
    private VelocityTracker jbd;
    private int jip;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private List<gjv> f12172ka;
    private List<Object> lhi;
    private boolean lu;
    private boolean mjg;
    private gjv mkl;
    private int nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private int f12173oj;
    private final Rect ojm;
    private Scroller orl;
    private float orp;
    private boolean pnz;
    private int pty;
    private EdgeEffect pv;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private sk f12174qb;
    com.bytedance.adsdk.ugeno.aq.hn qor;
    private boolean rmr;
    private int sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f12175ta;
    private boolean tgn;
    private int tll;
    private boolean tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private float f12176ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private float f12177ul;
    private Drawable uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private boolean f12178vf;
    private int wu;
    private int xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private int f12179xn;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private EdgeEffect f12180xo;
    private int xyo;
    private int zt;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    static final int[] f12165hn = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static final Comparator<hn> f12166sk = new Comparator<hn>() { // from class: com.bytedance.adsdk.ugeno.aq.qor.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public int compare(hn hnVar, hn hnVar2) {
            return hnVar.f12182hn - hnVar2.f12182hn;
        }
    };
    private static final Interpolator dkl = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.aq.qor.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final aq idl = new aq();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class aq implements Comparator<View> {
        aq() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0164qor c0164qor = (C0164qor) view.getLayoutParams();
            C0164qor c0164qor2 = (C0164qor) view2.getLayoutParams();
            boolean z10 = c0164qor.hnj;
            if (z10 != c0164qor2.hnj) {
                return z10 ? 1 : -1;
            }
            return c0164qor.f12185sk - c0164qor2.f12185sk;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class dkl extends DataSetObserver {
        dkl() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            qor.this.hn();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            qor.this.hn();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class dse extends com.bytedance.adsdk.ugeno.aq.hnj {
        public static final Parcelable.Creator<dse> CREATOR = new Parcelable.ClassLoaderCreator<dse>() { // from class: com.bytedance.adsdk.ugeno.aq.qor.dse.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public dse createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new dse(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public dse createFromParcel(Parcel parcel) {
                return new dse(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public dse[] newArray(int i10) {
                return new dse[i10];
            }
        };
        ClassLoader gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f12181hn;
        Parcelable qor;

        public dse(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f12181hn + "}";
        }

        @Override // com.bytedance.adsdk.ugeno.aq.hnj, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f12181hn);
            parcel.writeParcelable(this.qor, i10);
        }

        dse(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f12181hn = parcel.readInt();
            this.qor = parcel.readParcelable(classLoader);
            this.gjv = classLoader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface gjv {
        void bug(int i10);

        void dnm(int i10);

        void hnj(int i10, float f10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hn {
        float gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f12182hn;
        Object hnj;
        boolean qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        float f12183sk;

        hn() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface hnj {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface sk {
        void hnj(View view, float f10);
    }

    public qor(Context context) {
        super(context);
        this.dse = new ArrayList<>();
        this.aq = new hn();
        this.ojm = new Rect();
        this.f12175ta = -1;
        this.dnm = null;
        this.bug = null;
        this.apu = -3.4028235E38f;
        this.eum = Float.MAX_VALUE;
        this.xyo = 1;
        this.sq = -1;
        this.lu = true;
        this.rmr = false;
        this.hkr = new Runnable() { // from class: com.bytedance.adsdk.ugeno.aq.qor.3
            @Override // java.lang.Runnable
            public void run() {
                qor.this.setScrollState(0);
                qor.this.qor();
            }
        };
        this.tll = 0;
        hnj();
    }

    private boolean aq() {
        this.sq = -1;
        ta();
        this.pv.onRelease();
        this.f12180xo.onRelease();
        return this.pv.isFinished() || this.f12180xo.isFinished();
    }

    private void dkl() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0164qor) getChildAt(i10).getLayoutParams()).hnj) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void dse() {
        if (this.f12171gn != 0) {
            ArrayList<View> arrayList = this.dy;
            if (arrayList == null) {
                this.dy = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.dy.add(getChildAt(i10));
            }
            Collections.sort(this.dy, idl);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean gjv(int i10) {
        if (this.dse.size() == 0) {
            if (this.lu) {
                return false;
            }
            this.eta = false;
            hnj(0, 0.0f, 0);
            if (this.eta) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        hn hnVarOjm = ojm();
        int clientWidth = getClientWidth();
        int i11 = this.jip;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = hnVarOjm.f12182hn;
        float f11 = ((i10 / f10) - hnVarOjm.f12183sk) / (hnVarOjm.gjv + (i11 / f10));
        this.eta = false;
        hnj(i13, f11, (int) (i12 * f11));
        if (this.eta) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private hn ojm() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.jip / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        hn hnVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.dse.size()) {
            hn hnVar2 = this.dse.get(i11);
            if (!z10 && hnVar2.f12182hn != (i10 = i12 + 1)) {
                hnVar2 = this.aq;
                hnVar2.f12183sk = f10 + f12 + f11;
                hnVar2.f12182hn = i10;
                hnVar2.gjv = this.qor.hnj(i10);
                i11--;
            }
            hn hnVar3 = hnVar2;
            f10 = hnVar3.f12183sk;
            float f13 = hnVar3.gjv + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.dse.size() - 1) {
                return hnVar3;
            }
            int i13 = hnVar3.f12182hn;
            float f14 = hnVar3.gjv;
            i11++;
            i12 = i13;
            f12 = f14;
            hnVar = hnVar3;
            z10 = false;
        }
        return hnVar;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.tu != z10) {
            this.tu = z10;
        }
    }

    private void sk(int i10) {
        gjv gjvVar = this.izk;
        if (gjvVar != null) {
            gjvVar.dnm(i10);
        }
        List<gjv> list = this.f12172ka;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                gjv gjvVar2 = this.f12172ka.get(i11);
                if (gjvVar2 != null) {
                    gjvVar2.dnm(i10);
                }
            }
        }
        gjv gjvVar3 = this.mkl;
        if (gjvVar3 != null) {
            gjvVar3.dnm(i10);
        }
    }

    private void ta() {
        this.f12178vf = false;
        this.hqh = false;
        VelocityTracker velocityTracker = this.jbd;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.jbd = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        hn hnVarHnj;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (hnVarHnj = hnj(childAt)) != null && hnVarHnj.f12182hn == this.gjv) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        hn hnVarHnj;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (hnVarHnj = hnj(childAt)) != null && hnVarHnj.f12182hn == this.gjv) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0164qor c0164qor = (C0164qor) layoutParams;
        boolean zQor = c0164qor.hnj | qor(view);
        c0164qor.hnj = zQor;
        if (!this.f7do) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zQor) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0164qor.gjv = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.qor == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.apu));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.eum));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0164qor) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mjg = true;
        if (this.orl.isFinished() || !this.orl.computeScrollOffset()) {
            hnj(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.orl.getCurrX();
        int currY = this.orl.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!gjv(currX)) {
                this.orl.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || hnj(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        hn hnVarHnj;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (hnVarHnj = hnj(childAt)) != null && hnVarHnj.f12182hn == this.gjv && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.aq.hn hnVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (hnVar = this.qor) != null && hnVar.hnj() > 1)) {
            if (!this.pv.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.apu * width);
                this.pv.setSize(height, width);
                zDraw = this.pv.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f12180xo.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.eum + 1.0f)) * width2);
                this.f12180xo.setSize(height2, width2);
                zDraw |= this.f12180xo.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.pv.finish();
            this.f12180xo.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.uua;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0164qor();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.aq.hn getAdapter() {
        return this.qor;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f12171gn == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0164qor) this.dy.get(i11).getLayoutParams()).dkl;
    }

    public int getCurrentItem() {
        return this.gjv;
    }

    public int getOffscreenPageLimit() {
        return this.xyo;
    }

    public int getPageMargin() {
        return this.jip;
    }

    public void hn(gjv gjvVar) {
        List<gjv> list = this.f12172ka;
        if (list != null) {
            list.remove(gjvVar);
        }
    }

    void hnj() {
        setWillNotDraw(false);
        setDescendantFocusability(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        setFocusable(true);
        Context context = getContext();
        this.orl = new Scroller(context, dkl);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f12170gm = viewConfiguration.getScaledPagingTouchSlop();
        this.f12169ff = (int) (400.0f * f10);
        this.xad = viewConfiguration.getScaledMaximumFlingVelocity();
        this.pv = new EdgeEffect(context);
        this.f12180xo = new EdgeEffect(context);
        this.f12167cm = (int) (25.0f * f10);
        this.dzo = (int) (2.0f * f10);
        this.nyv = (int) (f10 * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lu = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.hkr);
        Scroller scroller = this.orl;
        if (scroller != null && !scroller.isFinished()) {
            this.orl.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.jip <= 0 || this.uua == null || this.dse.size() <= 0 || this.qor == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.jip / f11;
        int i11 = 0;
        hn hnVar = this.dse.get(0);
        float f13 = hnVar.f12183sk;
        int size = this.dse.size();
        int i12 = hnVar.f12182hn;
        int i13 = this.dse.get(size - 1).f12182hn;
        while (i12 < i13) {
            while (true) {
                i10 = hnVar.f12182hn;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                hnVar = this.dse.get(i11);
            }
            if (i12 == i10) {
                float f14 = hnVar.f12183sk;
                float f15 = hnVar.gjv;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float fHnj = this.qor.hnj(i12);
                f10 = (f13 + fHnj) * f11;
                f13 += fHnj + f12;
            }
            if (this.jip + f10 > scrollX) {
                this.uua.setBounds(Math.round(f10), this.f12173oj, Math.round(this.jip + f10), this.f12179xn);
                this.uua.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            aq();
            return false;
        }
        if (action != 0) {
            if (this.f12178vf) {
                return true;
            }
            if (this.hqh) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.fvt = x10;
            this.f12177ul = x10;
            float y10 = motionEvent.getY();
            this.orp = y10;
            this.f12176ua = y10;
            this.sq = motionEvent.getPointerId(0);
            this.hqh = false;
            this.mjg = true;
            this.orl.computeScrollOffset();
            if (this.tll != 2 || Math.abs(this.orl.getFinalX() - this.orl.getCurrX()) <= this.dzo) {
                hnj(false);
                this.f12178vf = false;
            } else {
                this.orl.abortAnimation();
                this.tgn = false;
                qor();
                this.f12178vf = true;
                qor(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.sq;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f12177ul;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.orp);
                if (f10 != 0.0f && !hnj(this.f12177ul, f10) && hnj(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f12177ul = x11;
                    this.f12176ua = y11;
                    this.hqh = true;
                    return false;
                }
                int i11 = this.f12170gm;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f12178vf = true;
                    qor(true);
                    setScrollState(1);
                    this.f12177ul = f10 > 0.0f ? this.fvt + this.f12170gm : this.fvt - this.f12170gm;
                    this.f12176ua = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.hqh = true;
                }
                if (this.f12178vf && hn(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            hnj(motionEvent);
        }
        if (this.jbd == null) {
            this.jbd = VelocityTracker.obtain();
        }
        this.jbd.addMovement(motionEvent);
        return this.f12178vf;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        hn hnVarHnj;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C0164qor c0164qor = (C0164qor) childAt.getLayoutParams();
                if (c0164qor.hnj) {
                    int i18 = c0164qor.f12184hn;
                    int i19 = i18 & 7;
                    int i20 = i18 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, paddingTop + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                C0164qor c0164qor2 = (C0164qor) childAt2.getLayoutParams();
                if (!c0164qor2.hnj && (hnVarHnj = hnj(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (hnVarHnj.f12183sk * f10)) + paddingLeft;
                    if (c0164qor2.gjv) {
                        c0164qor2.gjv = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * c0164qor2.qor), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f12173oj = paddingTop;
        this.f12179xn = i15 - paddingBottom;
        this.zt = i16;
        if (this.lu) {
            z11 = false;
            hnj(this.gjv, false, 0, false);
        } else {
            z11 = false;
        }
        this.lu = z11;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        C0164qor c0164qor;
        C0164qor c0164qor2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.pty = Math.min(measuredWidth / 10, this.nyv);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0164qor2 = (C0164qor) childAt.getLayoutParams()) != null && c0164qor2.hnj) {
                int i15 = c0164qor2.f12184hn;
                int i16 = i15 & 7;
                int i17 = i15 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0164qor2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0164qor2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.wu = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.as = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f7do = true;
        qor();
        this.f7do = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0164qor = (C0164qor) childAt2.getLayoutParams()) == null || !c0164qor.hnj)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0164qor.qor), 1073741824), this.as);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        hn hnVarHnj;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (hnVarHnj = hnj(childAt)) != null && hnVarHnj.f12182hn == this.gjv && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof dse)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dse dseVar = (dse) parcelable;
        super.onRestoreInstanceState(dseVar.hnj());
        if (this.qor != null) {
            hnj(dseVar.f12181hn, false, true);
            return;
        }
        this.f12175ta = dseVar.f12181hn;
        this.dnm = dseVar.qor;
        this.bug = dseVar.gjv;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        dse dseVar = new dse(super.onSaveInstanceState());
        dseVar.f12181hn = this.gjv;
        com.bytedance.adsdk.ugeno.aq.hn hnVar = this.qor;
        if (hnVar != null) {
            dseVar.qor = hnVar.hn();
        }
        return dseVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.jip;
            hnj(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.aq.hn hnVar;
        int iFindPointerIndex;
        if (this.pnz) {
            return true;
        }
        boolean zAq = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (hnVar = this.qor) == null || hnVar.hnj() == 0) {
            return false;
        }
        if (this.jbd == null) {
            this.jbd = VelocityTracker.obtain();
        }
        this.jbd.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.orl.abortAnimation();
            this.tgn = false;
            qor();
            float x10 = motionEvent.getX();
            this.fvt = x10;
            this.f12177ul = x10;
            float y10 = motionEvent.getY();
            this.orp = y10;
            this.f12176ua = y10;
            this.sq = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.f12177ul = motionEvent.getX(actionIndex);
                            this.sq = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        hnj(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.sq);
                        if (iFindPointerIndex2 != -1) {
                            this.f12177ul = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.f12178vf) {
                    hnj(this.gjv, true, 0, false);
                    zAq = aq();
                }
            } else if (!this.f12178vf) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.sq);
                if (iFindPointerIndex3 == -1) {
                    zAq = aq();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.f12177ul);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.f12176ua);
                    if (fAbs > this.f12170gm && fAbs > fAbs2) {
                        this.f12178vf = true;
                        qor(true);
                        float f10 = this.fvt;
                        this.f12177ul = x11 - f10 > 0.0f ? f10 + this.f12170gm : f10 - this.f12170gm;
                        this.f12176ua = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f12178vf) {
                        zAq = hn(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.f12178vf && (iFindPointerIndex = motionEvent.findPointerIndex(this.sq)) != -1) {
                zAq = hn(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.f12178vf) {
            VelocityTracker velocityTracker = this.jbd;
            velocityTracker.computeCurrentVelocity(1000, this.xad);
            int xVelocity = (int) velocityTracker.getXVelocity(this.sq);
            this.tgn = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            hn hnVarOjm = ojm();
            float f11 = clientWidth;
            float f12 = this.jip / f11;
            int i10 = hnVarOjm.f12182hn;
            float f13 = ((scrollX / f11) - hnVarOjm.f12183sk) / (hnVarOjm.gjv + f12);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.sq);
            if (iFindPointerIndex4 != -1) {
                hnj(hnj(i10, f13, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.fvt)), true, true, xVelocity);
                zAq = aq();
            }
        }
        if (zAq) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    void qor() {
        hnj(this.gjv);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f7do) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.aq.hn hnVar) {
        com.bytedance.adsdk.ugeno.aq.hn hnVar2 = this.qor;
        if (hnVar2 != null) {
            hnVar2.hnj((DataSetObserver) null);
            for (int i10 = 0; i10 < this.dse.size(); i10++) {
                hn hnVar3 = this.dse.get(i10);
                this.qor.hnj((ViewGroup) this, hnVar3.f12182hn, hnVar3.hnj);
            }
            this.dse.clear();
            dkl();
            this.gjv = 0;
            scrollTo(0, 0);
        }
        this.qor = hnVar;
        this.hnj = 0;
        if (hnVar != null) {
            if (this.f12168fc == null) {
                this.f12168fc = new dkl();
            }
            this.qor.hnj((DataSetObserver) this.f12168fc);
            this.tgn = false;
            boolean z10 = this.lu;
            this.lu = true;
            this.hnj = this.qor.hnj();
            int i11 = this.f12175ta;
            if (i11 >= 0) {
                hnj(i11, false, true);
                this.f12175ta = -1;
                this.dnm = null;
                this.bug = null;
            } else if (z10) {
                requestLayout();
            } else {
                qor();
            }
        }
        List<Object> list = this.lhi;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.lhi.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.lhi.get(i12);
        }
    }

    public void setCurrentItem(int i10) {
        this.tgn = false;
        hnj(i10, !this.lu, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.xyo) {
            this.xyo = i10;
            qor();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(gjv gjvVar) {
        this.izk = gjvVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.jip;
        this.jip = i10;
        int width = getWidth();
        hnj(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.uua = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.tll == i10) {
            return;
        }
        this.tll = i10;
        if (this.f12174qb != null) {
            hn(i10 != 0);
        }
        dkl(i10);
    }

    public void setScroller(Scroller scroller) {
        this.orl = scroller;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.uua;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.aq.qor$qor, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0164qor extends ViewGroup.LayoutParams {
        int dkl;
        boolean gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public int f12184hn;
        public boolean hnj;
        float qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        int f12185sk;

        public C0164qor() {
            super(-1, -1);
            this.qor = 0.0f;
        }

        public C0164qor(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.qor = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qor.f12165hn);
            this.f12184hn = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean qor(View view) {
        return view.getClass().getAnnotation(hnj.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0164qor(getContext(), attributeSet);
    }

    void hn() {
        int iHnj = this.qor.hnj();
        this.hnj = iHnj;
        boolean z10 = this.dse.size() < (this.xyo * 2) + 1 && this.dse.size() < iHnj;
        int iMax = this.gjv;
        int i10 = 0;
        while (i10 < this.dse.size()) {
            hn hnVar = this.dse.get(i10);
            int iHnj2 = this.qor.hnj(hnVar.hnj);
            if (iHnj2 != -1) {
                if (iHnj2 == -2) {
                    this.dse.remove(i10);
                    i10--;
                    this.qor.hnj((ViewGroup) this, hnVar.f12182hn, hnVar.hnj);
                    int i11 = this.gjv;
                    if (i11 == hnVar.f12182hn) {
                        iMax = Math.max(0, Math.min(i11, iHnj - 1));
                    }
                } else {
                    int i12 = hnVar.f12182hn;
                    if (i12 != iHnj2) {
                        if (i12 == this.gjv) {
                            iMax = iHnj2;
                        }
                        hnVar.f12182hn = iHnj2;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        Collections.sort(this.dse, f12166sk);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0164qor c0164qor = (C0164qor) getChildAt(i13).getLayoutParams();
                if (!c0164qor.hnj) {
                    c0164qor.qor = 0.0f;
                }
            }
            hnj(iMax, false, true);
            requestLayout();
        }
    }

    private void qor(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private void dkl(int i10) {
        gjv gjvVar = this.izk;
        if (gjvVar != null) {
            gjvVar.bug(i10);
        }
        List<gjv> list = this.f12172ka;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                gjv gjvVar2 = this.f12172ka.get(i11);
                if (gjvVar2 != null) {
                    gjvVar2.bug(i10);
                }
            }
        }
        gjv gjvVar3 = this.mkl;
        if (gjvVar3 != null) {
            gjvVar3.bug(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    public boolean qor(int i10) {
        boolean zGjv;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zGjv = gjv();
            } else if (i10 == 66 || i10 == 2) {
                zGjv = sk();
            } else {
                zGjv = false;
            }
        } else if (i10 == 17) {
            int i11 = hnj(this.ojm, viewFindNextFocus).left;
            int i12 = hnj(this.ojm, viewFindFocus).left;
            if (viewFindFocus != null && i11 >= i12) {
                zGjv = gjv();
            } else {
                zGjv = viewFindNextFocus.requestFocus();
            }
        } else if (i10 == 66) {
            int i13 = hnj(this.ojm, viewFindNextFocus).left;
            int i14 = hnj(this.ojm, viewFindFocus).left;
            if (viewFindFocus == null || i13 > i14) {
                zGjv = viewFindNextFocus.requestFocus();
            } else {
                zGjv = sk();
            }
        } else {
            zGjv = false;
        }
        if (zGjv) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zGjv;
    }

    boolean sk() {
        com.bytedance.adsdk.ugeno.aq.hn hnVar = this.qor;
        if (hnVar == null || this.gjv >= hnVar.hnj() - 1) {
            return false;
        }
        hnj(this.gjv + 1, true);
        return true;
    }

    boolean gjv() {
        int i10 = this.gjv;
        if (i10 <= 0) {
            return false;
        }
        hnj(i10 - 1, true);
        return true;
    }

    public void hnj(int i10, boolean z10) {
        this.tgn = false;
        hnj(i10, z10, false);
    }

    void hnj(int i10, boolean z10, boolean z11) {
        hnj(i10, z10, z11, 0);
    }

    void hnj(int i10, boolean z10, boolean z11, int i11) {
        com.bytedance.adsdk.ugeno.aq.hn hnVar = this.qor;
        if (hnVar != null && hnVar.hnj() > 0) {
            if (!z11 && this.gjv == i10 && this.dse.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.qor.hnj()) {
                i10 = this.qor.hnj() - 1;
            }
            int i12 = this.xyo;
            int i13 = this.gjv;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.dse.size(); i14++) {
                    this.dse.get(i14).qor = true;
                }
            }
            boolean z12 = this.gjv != i10;
            if (this.lu) {
                this.gjv = i10;
                if (z12) {
                    sk(i10);
                }
                requestLayout();
                return;
            }
            hnj(i10);
            hnj(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    hn hn(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return hnj(view);
            }
        }
    }

    hn hn(int i10) {
        for (int i11 = 0; i11 < this.dse.size(); i11++) {
            hn hnVar = this.dse.get(i11);
            if (hnVar.f12182hn == i10) {
                return hnVar;
            }
        }
        return null;
    }

    private void hn(int i10, float f10, int i11) {
        gjv gjvVar = this.izk;
        if (gjvVar != null) {
            gjvVar.hnj(i10, f10, i11);
        }
        List<gjv> list = this.f12172ka;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                gjv gjvVar2 = this.f12172ka.get(i12);
                if (gjvVar2 != null) {
                    gjvVar2.hnj(i10, f10, i11);
                }
            }
        }
        gjv gjvVar3 = this.mkl;
        if (gjvVar3 != null) {
            gjvVar3.hnj(i10, f10, i11);
        }
    }

    private void hnj(int i10, boolean z10, int i11, boolean z11) {
        hn hnVarHn = hn(i10);
        int clientWidth = hnVarHn != null ? (int) (getClientWidth() * Math.max(this.apu, Math.min(hnVarHn.f12183sk, this.eum))) : 0;
        if (z10) {
            hnj(clientWidth, 0, i11);
            if (z11) {
                sk(i10);
                return;
            }
            return;
        }
        if (z11) {
            sk(i10);
        }
        hnj(false);
        scrollTo(clientWidth, 0);
        gjv(clientWidth);
    }

    private void hn(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.fr : 0, null);
        }
    }

    private boolean hn(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f12177ul - f10;
        this.f12177ul = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.apu * clientWidth;
        float f13 = this.eum * clientWidth;
        boolean z12 = false;
        hn hnVar = this.dse.get(0);
        ArrayList<hn> arrayList = this.dse;
        hn hnVar2 = arrayList.get(arrayList.size() - 1);
        if (hnVar.f12182hn != 0) {
            f12 = hnVar.f12183sk * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (hnVar2.f12182hn != this.qor.hnj() - 1) {
            f13 = hnVar2.f12183sk * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.pv.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f12180xo.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f12177ul += scrollX - i10;
        scrollTo(i10, getScrollY());
        gjv(i10);
        return z12;
    }

    public void hnj(gjv gjvVar) {
        if (this.f12172ka == null) {
            this.f12172ka = new ArrayList();
        }
        this.f12172ka.add(gjvVar);
    }

    public void hnj(boolean z10, sk skVar) {
        hnj(z10, skVar, 2);
    }

    public void hnj(boolean z10, sk skVar, int i10) {
        boolean z11 = skVar != null;
        boolean z12 = z11 != (this.f12174qb != null);
        this.f12174qb = skVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.f12171gn = z10 ? 2 : 1;
            this.fr = i10;
        } else {
            this.f12171gn = 0;
        }
        if (z12) {
            qor();
        }
    }

    float hnj(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    void hnj(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.orl;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.mjg ? this.orl.getCurrX() : this.orl.getStartX();
            this.orl.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            hnj(false);
            qor();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fHnj = f11 + (hnj(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fHnj / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.qor.hnj(this.gjv)) + this.jip)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);
        this.mjg = false;
        this.orl.startScroll(i13, scrollY, i14, i15, iMin);
        postInvalidateOnAnimation();
    }

    hn hnj(int i10, int i11) {
        hn hnVar = new hn();
        hnVar.f12182hn = i10;
        hnVar.hnj = this.qor.hnj((ViewGroup) this, i10);
        hnVar.gjv = this.qor.hnj(i10);
        if (i11 >= 0 && i11 < this.dse.size()) {
            this.dse.add(i11, hnVar);
            return hnVar;
        }
        this.dse.add(hnVar);
        return hnVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c6 A[PHI: r7 r10 r15
      0x00c6: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    void hnj(int i10) {
        hn hnVarHn;
        String hexString;
        hn hnVarHnj;
        hn hnVarHnj2;
        hn hnVar;
        int i11 = this.gjv;
        if (i11 != i10) {
            hnVarHn = hn(i11);
            this.gjv = i10;
        } else {
            hnVarHn = null;
        }
        if (this.qor == null) {
            dse();
            return;
        }
        if (this.tgn) {
            dse();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i12 = this.xyo;
        int iMax = Math.max(0, this.gjv - i12);
        int iHnj = this.qor.hnj();
        int iMin = Math.min(iHnj - 1, this.gjv + i12);
        if (iHnj == this.hnj) {
            int i13 = 0;
            while (true) {
                if (i13 < this.dse.size()) {
                    hnVarHnj = this.dse.get(i13);
                    int i14 = hnVarHnj.f12182hn;
                    int i15 = this.gjv;
                    if (i14 >= i15) {
                        if (i14 != i15) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i13++;
                }
                hnVarHnj = null;
                break;
            }
            if (hnVarHnj == null && iHnj > 0) {
                hnVarHnj = hnj(this.gjv, i13);
            }
            if (hnVarHnj != null) {
                int i16 = i13 - 1;
                hn hnVar2 = i16 >= 0 ? this.dse.get(i16) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - hnVarHnj.gjv) + (getPaddingLeft() / clientWidth);
                float f10 = 0.0f;
                for (int i17 = this.gjv - 1; i17 >= 0; i17--) {
                    if (f10 >= paddingLeft && i17 < iMax) {
                        if (hnVar2 == null) {
                            break;
                        }
                        if (i17 == hnVar2.f12182hn && !hnVar2.qor) {
                            this.dse.remove(i16);
                            this.qor.hnj((ViewGroup) this, i17, hnVar2.hnj);
                            i16--;
                            i13--;
                            if (i16 >= 0) {
                                hnVar = this.dse.get(i16);
                            } else {
                                hnVar = null;
                            }
                            hnVar2 = hnVar;
                        }
                    } else {
                        if (hnVar2 != null && i17 == hnVar2.f12182hn) {
                            f10 += hnVar2.gjv;
                            i16--;
                            if (i16 >= 0) {
                                hnVar = this.dse.get(i16);
                            } else {
                                hnVar = null;
                            }
                        } else {
                            f10 += hnj(i17, i16 + 1).gjv;
                            i13++;
                            if (i16 >= 0) {
                                hnVar = this.dse.get(i16);
                            } else {
                                hnVar = null;
                            }
                        }
                        hnVar2 = hnVar;
                    }
                }
                float f11 = hnVarHnj.gjv;
                int i18 = i13 + 1;
                if (f11 < 2.0f) {
                    hn hnVar3 = i18 < this.dse.size() ? this.dse.get(i18) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i19 = this.gjv;
                    while (true) {
                        i19++;
                        if (i19 >= iHnj) {
                            break;
                        }
                        if (f11 >= paddingRight && i19 > iMin) {
                            if (hnVar3 == null) {
                                break;
                            }
                            if (i19 == hnVar3.f12182hn && !hnVar3.qor) {
                                this.dse.remove(i18);
                                this.qor.hnj((ViewGroup) this, i19, hnVar3.hnj);
                                if (i18 < this.dse.size()) {
                                    hnVar3 = this.dse.get(i18);
                                }
                            }
                        } else if (hnVar3 != null && i19 == hnVar3.f12182hn) {
                            f11 += hnVar3.gjv;
                            i18++;
                            if (i18 < this.dse.size()) {
                                hnVar3 = this.dse.get(i18);
                            }
                        } else {
                            hn hnVarHnj3 = hnj(i19, i18);
                            i18++;
                            f11 += hnVarHnj3.gjv;
                            hnVar3 = i18 < this.dse.size() ? this.dse.get(i18) : null;
                        }
                    }
                }
                hnj(hnVarHnj, i13, hnVarHn);
            }
            int childCount = getChildCount();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt = getChildAt(i20);
                C0164qor c0164qor = (C0164qor) childAt.getLayoutParams();
                c0164qor.dkl = i20;
                if (!c0164qor.hnj && c0164qor.qor == 0.0f && (hnVarHnj2 = hnj(childAt)) != null) {
                    c0164qor.qor = hnVarHnj2.gjv;
                    c0164qor.f12185sk = hnVarHnj2.f12182hn;
                }
            }
            dse();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                hn hnVarHn2 = viewFindFocus != null ? hn(viewFindFocus) : null;
                if (hnVarHn2 == null || hnVarHn2.f12182hn != this.gjv) {
                    for (int i21 = 0; i21 < getChildCount(); i21++) {
                        View childAt2 = getChildAt(i21);
                        hn hnVarHnj4 = hnj(childAt2);
                        if (hnVarHnj4 != null && hnVarHnj4.f12182hn == this.gjv && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.hnj + ", found: " + iHnj + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.qor.getClass());
    }

    private void hnj(hn hnVar, int i10, hn hnVar2) {
        int i11;
        int i12;
        hn hnVar3;
        hn hnVar4;
        int iHnj = this.qor.hnj();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.jip / clientWidth : 0.0f;
        if (hnVar2 != null) {
            int i13 = hnVar2.f12182hn;
            int i14 = hnVar.f12182hn;
            if (i13 < i14) {
                float fHnj = hnVar2.f12183sk + hnVar2.gjv + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= hnVar.f12182hn && i16 < this.dse.size()) {
                    hn hnVar5 = this.dse.get(i16);
                    while (true) {
                        hnVar4 = hnVar5;
                        if (i15 <= hnVar4.f12182hn || i16 >= this.dse.size() - 1) {
                            break;
                        }
                        i16++;
                        hnVar5 = this.dse.get(i16);
                    }
                    while (i15 < hnVar4.f12182hn) {
                        fHnj += this.qor.hnj(i15) + f10;
                        i15++;
                    }
                    hnVar4.f12183sk = fHnj;
                    fHnj += hnVar4.gjv + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.dse.size() - 1;
                float fHnj2 = hnVar2.f12183sk;
                while (true) {
                    i13--;
                    if (i13 < hnVar.f12182hn || size < 0) {
                        break;
                    }
                    hn hnVar6 = this.dse.get(size);
                    while (true) {
                        hnVar3 = hnVar6;
                        if (i13 >= hnVar3.f12182hn || size <= 0) {
                            break;
                        }
                        size--;
                        hnVar6 = this.dse.get(size);
                    }
                    while (i13 > hnVar3.f12182hn) {
                        fHnj2 -= this.qor.hnj(i13) + f10;
                        i13--;
                    }
                    fHnj2 -= hnVar3.gjv + f10;
                    hnVar3.f12183sk = fHnj2;
                }
            }
        }
        int size2 = this.dse.size();
        float fHnj3 = hnVar.f12183sk;
        int i17 = hnVar.f12182hn;
        int i18 = i17 - 1;
        this.apu = i17 == 0 ? fHnj3 : -3.4028235E38f;
        int i19 = iHnj - 1;
        this.eum = i17 == i19 ? (hnVar.gjv + fHnj3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            hn hnVar7 = this.dse.get(i20);
            while (true) {
                i12 = hnVar7.f12182hn;
                if (i18 <= i12) {
                    break;
                }
                fHnj3 -= this.qor.hnj(i18) + f10;
                i18--;
            }
            fHnj3 -= hnVar7.gjv + f10;
            hnVar7.f12183sk = fHnj3;
            if (i12 == 0) {
                this.apu = fHnj3;
            }
            i20--;
            i18--;
        }
        float fHnj4 = hnVar.f12183sk + hnVar.gjv + f10;
        int i21 = hnVar.f12182hn + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            hn hnVar8 = this.dse.get(i22);
            while (true) {
                i11 = hnVar8.f12182hn;
                if (i21 >= i11) {
                    break;
                }
                fHnj4 += this.qor.hnj(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.eum = (hnVar8.gjv + fHnj4) - 1.0f;
            }
            hnVar8.f12183sk = fHnj4;
            fHnj4 += hnVar8.gjv + f10;
            i22++;
            i21++;
        }
        this.rmr = false;
    }

    hn hnj(View view) {
        for (int i10 = 0; i10 < this.dse.size(); i10++) {
            hn hnVar = this.dse.get(i10);
            if (this.qor.hnj(view, hnVar.hnj)) {
                return hnVar;
            }
        }
        return null;
    }

    private void hnj(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.dse.isEmpty()) {
            if (!this.orl.isFinished()) {
                this.orl.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        hn hnVarHn = hn(this.gjv);
        int iMin = (int) ((hnVarHn != null ? Math.min(hnVarHn.f12183sk, this.eum) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            hnj(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    protected void hnj(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.zt > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C0164qor c0164qor = (C0164qor) childAt.getLayoutParams();
                if (c0164qor.hnj) {
                    int i13 = c0164qor.f12184hn & 7;
                    if (i13 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        hn(i10, f10, i11);
        if (this.f12174qb != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((C0164qor) childAt2.getLayoutParams()).hnj) {
                    this.f12174qb.hnj(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.eta = true;
    }

    private void hnj(boolean z10) {
        boolean z11 = this.tll == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.orl.isFinished()) {
                this.orl.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.orl.getCurrX();
                int currY = this.orl.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        gjv(currX);
                    }
                }
            }
        }
        this.tgn = false;
        for (int i10 = 0; i10 < this.dse.size(); i10++) {
            hn hnVar = this.dse.get(i10);
            if (hnVar.qor) {
                hnVar.qor = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.hkr);
            } else {
                this.hkr.run();
            }
        }
    }

    private boolean hnj(float f10, float f11) {
        if (f10 >= this.pty || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.pty)) && f11 < 0.0f;
        }
        return true;
    }

    private int hnj(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f12167cm || Math.abs(i11) <= this.f12169ff) {
            i10 += (int) (f10 + (i10 >= this.gjv ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.dse.size() <= 0) {
            return i10;
        }
        hn hnVar = this.dse.get(0);
        ArrayList<hn> arrayList = this.dse;
        return Math.max(hnVar.f12182hn, Math.min(i10, arrayList.get(arrayList.size() - 1).f12182hn));
    }

    private void hnj(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.sq) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f12177ul = motionEvent.getX(i10);
            this.sq = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.jbd;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    protected boolean hnj(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && hnj(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean hnj(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return gjv();
            }
            return qor(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return sk();
            }
            return qor(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return qor(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return qor(1);
        }
        return false;
    }

    private Rect hnj(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
