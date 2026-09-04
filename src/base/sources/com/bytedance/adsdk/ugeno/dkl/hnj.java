package com.bytedance.adsdk.ugeno.dkl;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj<T> extends FrameLayout implements com.bytedance.adsdk.ugeno.aq.qor.gjv {
    private static final Interpolator xyo = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.dkl.hnj.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private int apu;
    private int aq;
    private com.bytedance.adsdk.ugeno.dkl.hnj.hnj as;
    private boolean bug;
    private int dkl;
    private float dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private C0166hnj f8do;
    private int dse;
    private int eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f12226fc;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.aq.qor f12227hn;
    protected List<T> hnj;
    private final Runnable hqh;
    private boolean jip;
    private boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private int f12228oj;
    private int ojm;
    private boolean orl;
    protected Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f12229sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f12230ta;
    private Scroller tgn;
    private com.bytedance.adsdk.ugeno.dkl.qor tu;
    private boolean uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private final Runnable f12231vf;
    private FrameLayout wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private int f12232xn;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hn extends Scroller {
        public hn(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, hnj.this.dkl);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13) {
            super.startScroll(i10, i11, i12, i13, hnj.this.dkl);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.dkl.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0166hnj extends com.bytedance.adsdk.ugeno.aq.hn {
        C0166hnj() {
        }

        @Override // com.bytedance.adsdk.ugeno.aq.hn
        public int hnj(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.aq.hn
        public boolean hnj(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.aq.hn
        public int hnj() {
            return hnj.this.mjg ? UserVerificationMethods.USER_VERIFY_ALL : hnj.this.hnj.size();
        }

        @Override // com.bytedance.adsdk.ugeno.aq.hn
        public Object hnj(ViewGroup viewGroup, int i10) {
            View viewHnj = hnj.this.hnj(i10, gjv.hnj(hnj.this.mjg, i10, hnj.this.hnj.size()));
            viewGroup.addView(viewHnj);
            return viewHnj;
        }

        @Override // com.bytedance.adsdk.ugeno.aq.hn
        public void hnj(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.aq.hn
        public float hnj(int i10) {
            if (hnj.this.dnm <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / hnj.this.dnm;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class qor extends com.bytedance.adsdk.ugeno.aq.qor {
        public qor(Context context) {
            super(context);
        }

        private MotionEvent hnj(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.aq.qor, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!hnj.this.f12226fc) {
                return false;
            }
            try {
                if (hnj.this.eum != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(hnj(motionEvent));
                hnj(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.aq.qor, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!hnj.this.f12226fc) {
                return false;
            }
            try {
                return hnj.this.eum == 1 ? super.onTouchEvent(hnj(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public hnj(Context context) {
        super(context);
        this.hnj = new CopyOnWriteArrayList();
        this.gjv = 2000;
        this.f12229sk = 500;
        this.dkl = 500;
        this.dse = 0;
        this.aq = -1;
        this.ojm = -1;
        this.f12230ta = "normal";
        this.dnm = 1.0f;
        this.bug = true;
        this.orl = true;
        this.mjg = true;
        this.f12226fc = true;
        this.f12228oj = 0;
        this.f12232xn = 0;
        this.apu = 0;
        this.eum = 0;
        this.f12231vf = new Runnable() { // from class: com.bytedance.adsdk.ugeno.dkl.hnj.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = hnj.this.f12227hn.getCurrentItem() + 1;
                if (hnj.this.mjg) {
                    if (currentItem >= 1024) {
                        hnj.this.f12227hn.hnj(512, false);
                        return;
                    } else {
                        hnj.this.f12227hn.hnj(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.aq.hn adapter = hnj.this.f12227hn.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.hnj()) {
                        hnj.this.f12227hn.hnj(0, false);
                    } else {
                        hnj.this.f12227hn.hnj(currentItem, true);
                    }
                }
            }
        };
        this.hqh = new Runnable() { // from class: com.bytedance.adsdk.ugeno.dkl.hnj.3
            @Override // java.lang.Runnable
            public void run() {
                if (hnj.this.orl) {
                    int currentItem = hnj.this.f12227hn.getCurrentItem() + 1;
                    if (hnj.this.mjg) {
                        if (currentItem >= 1024) {
                            hnj.this.f12227hn.hnj(512, false);
                        } else {
                            hnj.this.f12227hn.hnj(currentItem, true);
                        }
                        hnj hnjVar = hnj.this;
                        hnjVar.postDelayed(hnjVar.hqh, hnj.this.gjv);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.aq.hn adapter = hnj.this.f12227hn.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.hnj()) {
                            hnj.this.f12227hn.hnj(0, false);
                            hnj hnjVar2 = hnj.this;
                            hnjVar2.postDelayed(hnjVar2.hqh, hnj.this.gjv);
                        } else {
                            hnj.this.f12227hn.hnj(currentItem, true);
                            hnj hnjVar3 = hnj.this;
                            hnjVar3.postDelayed(hnjVar3.hqh, hnj.this.gjv);
                        }
                    }
                }
            }
        };
        this.qor = context;
        this.wu = new FrameLayout(context);
        this.f12227hn = hnj();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.wu.addView(this.f12227hn, layoutParams);
        addView(this.wu);
    }

    @Override // com.bytedance.adsdk.ugeno.aq.qor.gjv
    public void bug(int i10) {
        if (i10 == 1 && this.jip) {
            dkl();
        }
        com.bytedance.adsdk.ugeno.dkl.qor qorVar = this.tu;
        if (qorVar != null) {
            qorVar.hnj(this.mjg, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.orl) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.jip) {
                    sk();
                }
            } else if (action == 0) {
                dkl();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.adsdk.ugeno.aq.qor.gjv
    public void dnm(int i10) {
        int i11;
        if (this.tu != null) {
            int iHnj = gjv.hnj(this.mjg, i10, this.hnj.size());
            i11 = i10;
            this.tu.hnj(this.mjg, iHnj, i11, iHnj == 0, iHnj == this.hnj.size() - 1);
        } else {
            i11 = i10;
        }
        if (this.bug) {
            this.as.hnj(i11);
        }
    }

    public com.bytedance.adsdk.ugeno.aq.hn getAdapter() {
        return this.f12227hn.getAdapter();
    }

    public int getCurrentItem() {
        return this.f12227hn.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.aq.qor getViewPager() {
        return this.f12227hn;
    }

    public hnj ojm(int i10) {
        this.ojm = i10;
        hnj(this.f12230ta, this.dse, this.aq, i10, true);
        return this;
    }

    public void orl(int i10) {
        hnj(this.f12230ta, this.dse, this.aq, this.ojm, true);
        if (this.f8do == null) {
            this.f8do = new C0166hnj();
            this.f12227hn.hnj((com.bytedance.adsdk.ugeno.aq.qor.gjv) this);
            this.f12227hn.setAdapter(this.f8do);
        }
        if (this.mjg) {
            if (i10 >= 1024) {
                this.f12227hn.hnj(512, false);
                return;
            } else {
                this.f12227hn.hnj(i10, true);
                return;
            }
        }
        if (i10 < 0 || i10 >= this.hnj.size()) {
            return;
        }
        this.f12227hn.hnj(i10, true);
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.dkl.qor qorVar) {
        this.tu = qorVar;
    }

    public void setTwoItems(boolean z10) {
        this.uua = z10;
    }

    public abstract View ta(int i10);

    public hnj<T> aq(int i10) {
        this.aq = i10;
        hnj(this.f12230ta, this.dse, i10, this.ojm, true);
        return this;
    }

    public hnj dkl(int i10) {
        this.as.setUnSelectedColor(i10);
        return this;
    }

    public hnj dse(int i10) {
        this.dse = i10;
        hnj(this.f12230ta, i10, this.aq, this.ojm, true);
        return this;
    }

    public hnj gjv(float f10) {
        this.as.setIndicatorY(f10);
        return this;
    }

    public hnj hn(float f10) {
        this.as.setIndicatorHeight((int) f10);
        return this;
    }

    public com.bytedance.adsdk.ugeno.aq.qor hnj() {
        return new qor(getContext());
    }

    public hnj qor(float f10) {
        this.as.setIndicatorX(f10);
        return this;
    }

    public hnj sk(int i10) {
        this.as.setSelectedColor(i10);
        return this;
    }

    public void dkl() {
        removeCallbacks(this.hqh);
    }

    public hnj gjv(int i10) {
        this.gjv = i10;
        sk();
        return this;
    }

    public hnj hn() {
        this.as.hnj();
        return this;
    }

    public hnj hnj(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.as = new com.bytedance.adsdk.ugeno.dkl.hnj.qor(this.qor);
        } else {
            this.as = new com.bytedance.adsdk.ugeno.dkl.hnj.hn(this.qor);
        }
        addView(this.as, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public hnj qor(int i10) {
        this.dkl = i10;
        if (this.tgn == null) {
            this.tgn = new hn(this.qor, xyo);
        }
        this.f12227hn.setScroller(this.tgn);
        return this;
    }

    public hnj sk(float f10) {
        this.dnm = f10;
        return this;
    }

    private boolean dse() {
        return this.hnj.size() <= 2 && this.mjg;
    }

    public hnj hn(String str) {
        this.as.setIndicatorDirection(str);
        return this;
    }

    public hnj sk(boolean z10) {
        this.jip = z10;
        return this;
    }

    public hnj gjv(boolean z10) {
        this.as.setLoop(z10);
        if (this.mjg != z10) {
            int iHnj = gjv.hnj(z10, this.f12227hn.getCurrentItem(), this.hnj.size());
            this.mjg = z10;
            C0166hnj c0166hnj = this.f8do;
            if (c0166hnj != null) {
                c0166hnj.qor();
                this.f12227hn.setCurrentItem(iHnj);
            }
        }
        return this;
    }

    public hnj hn(int i10) {
        this.f12229sk = i10;
        return this;
    }

    public void sk() {
        removeCallbacks(this.hqh);
        postDelayed(this.hqh, this.gjv);
    }

    public hnj hn(boolean z10) {
        this.f12226fc = z10;
        return this;
    }

    public hnj hnj(float f10) {
        this.as.setIndicatorWidth((int) f10);
        return this;
    }

    public hnj qor(boolean z10) {
        this.bug = z10;
        return this;
    }

    public hnj hnj(int i10) {
        this.eum = i10;
        return this;
    }

    public hnj qor(String str) {
        this.f12230ta = str;
        hnj(str, this.dse, this.aq, this.ojm, true);
        return this;
    }

    public hnj hnj(boolean z10) {
        this.orl = z10;
        sk();
        return this;
    }

    public void qor() {
        int i10;
        hnj(this.f12230ta, this.dse, this.aq, this.ojm, true);
        if (this.f8do == null) {
            this.f8do = new C0166hnj();
            this.f12227hn.hnj((com.bytedance.adsdk.ugeno.aq.qor.gjv) this);
            this.f12227hn.setAdapter(this.f8do);
        }
        int i11 = this.f12228oj;
        if (i11 < 0 || i11 >= this.hnj.size()) {
            this.f12228oj = 0;
        }
        if (this.mjg) {
            i10 = this.f12228oj + 512;
        } else {
            i10 = this.f12228oj;
        }
        this.f12227hn.hnj(i10, true);
        if (!this.mjg) {
            dnm(i10);
        }
        if (this.orl) {
            sk();
        }
    }

    public void hnj(String str, int i10, int i11, int i12, boolean z10) {
        C0166hnj c0166hnj = this.f8do;
        if (c0166hnj != null) {
            c0166hnj.qor();
        }
        this.f12227hn.setPageMargin(i10);
        if (i11 > 0 || i12 > 0) {
            if (this.eum == 1) {
                this.f12227hn.setPadding(0, i11 + i10, 0, i12 + i10);
            } else {
                this.f12227hn.setPadding(i11 + i10, 0, i12 + i10, 0);
            }
            this.wu.setClipChildren(false);
            this.f12227hn.setClipChildren(false);
            this.f12227hn.setClipToPadding(false);
        }
        if (this.eum == 1) {
            com.bytedance.adsdk.ugeno.dkl.hn.gjv gjvVar = new com.bytedance.adsdk.ugeno.dkl.hn.gjv();
            gjvVar.hnj(str);
            this.f12227hn.hnj(true, (com.bytedance.adsdk.ugeno.aq.qor.sk) gjvVar);
            this.f12227hn.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.f12227hn.hnj(false, (com.bytedance.adsdk.ugeno.aq.qor.sk) new com.bytedance.adsdk.ugeno.dkl.hn.qor());
        } else if (TextUtils.equals(str, "cube")) {
            this.f12227hn.hnj(false, (com.bytedance.adsdk.ugeno.aq.qor.sk) new com.bytedance.adsdk.ugeno.dkl.hn.hnj());
        } else if (TextUtils.equals(str, "fade")) {
            this.f12227hn.hnj(false, (com.bytedance.adsdk.ugeno.aq.qor.sk) new com.bytedance.adsdk.ugeno.dkl.hn.hn());
        } else {
            this.f12227hn.hnj(false, (com.bytedance.adsdk.ugeno.aq.qor.sk) null);
        }
        this.f12227hn.setOffscreenPageLimit((int) this.dnm);
    }

    public void gjv() {
        dkl();
        if (this.f8do != null) {
            this.f12227hn.hn((com.bytedance.adsdk.ugeno.aq.qor.gjv) this);
            this.f12227hn.setAdapter(null);
            this.f8do = null;
            this.f12227hn.removeAllViews();
            this.hnj.clear();
            this.as.qor();
        }
    }

    public View hnj(int i10, int i11) {
        if (this.hnj.size() == 0) {
            return new View(getContext());
        }
        View viewTa = ta(i11);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewTa instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (dse()) {
            viewTa.setTag("two_items_tag");
        }
        if (viewTa.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewTa.getParent()).removeView(viewTa);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewTa, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (dse()) {
            frameLayout.setTag(Integer.valueOf(i10));
        }
        return frameLayout;
    }

    public hnj<T> hnj(T t10) {
        if (t10 != null) {
            this.hnj.add(t10);
            if (this.bug) {
                this.as.hn();
            }
        }
        C0166hnj c0166hnj = this.f8do;
        if (c0166hnj != null) {
            c0166hnj.qor();
            this.as.hnj(this.f12228oj, this.f12227hn.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.aq.qor.gjv
    public void hnj(int i10, float f10, int i11) {
        com.bytedance.adsdk.ugeno.dkl.qor qorVar = this.tu;
        if (qorVar != null) {
            boolean z10 = this.mjg;
            qorVar.hnj(z10, gjv.hnj(z10, i10, this.hnj.size()), f10, i11);
        }
        if (dse()) {
            hnj(i10, findViewWithTag(Integer.valueOf(i10)));
            if (f10 > 0.0f) {
                int i12 = i10 + 1;
                hnj(i12, findViewWithTag(Integer.valueOf(i12)));
            }
        }
    }

    private void hnj(int i10, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t10 = this.hnj.get(gjv.hnj(true, i10, this.hnj.size()));
            if (t10 == null) {
                return;
            }
            if (t10 instanceof com.bytedance.adsdk.ugeno.hn.qor) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.hn.qor) t10).dnm();
            } else if (t10 instanceof View) {
                viewFindViewWithTag = (View) t10;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }
}
