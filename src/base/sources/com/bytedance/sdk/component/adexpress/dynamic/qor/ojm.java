package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.bytedance.sdk.component.adexpress.dkl.tu;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ojm extends FrameLayout implements aq {
    private View.OnTouchListener aq;
    private com.bytedance.sdk.component.adexpress.hn.orl bug;
    private String dkl;
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.ta dnm;
    private com.bytedance.sdk.component.adexpress.dkl.uua dse;
    private View gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk f12655hn;
    private Context hnj;
    private int ojm;
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.dse qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private dse f12656sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f12657ta;

    public ojm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        super(context);
        this.hnj = context;
        this.f12655hn = skVar;
        this.qor = dseVar;
        dse();
    }

    private boolean aq() {
        return (this.qor.izk() || TextUtils.equals("9", this.dkl) || TextUtils.equals("16", this.dkl) || TextUtils.equals("17", this.dkl) || TextUtils.equals("18", this.dkl) || TextUtils.equals("20", this.dkl) || TextUtils.equals("29", this.dkl) || TextUtils.equals("10", this.dkl)) ? false : true;
    }

    private void dse() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.dkl = this.qor.xad();
        this.ojm = this.qor.pnz();
        this.f12657ta = this.qor.izk();
        dse dseVarHnj = ta.hnj(this.hnj, this.f12655hn, this.qor, this.dnm, this.bug);
        this.f12656sk = dseVarHnj;
        if (dseVarHnj != null) {
            this.gjv = dseVarHnj.qor();
            if (this.qor.cm()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.dkl, "6")) {
                if (!this.qor.mkl() || TextUtils.isEmpty(this.qor.lhi())) {
                    this.dse = new com.bytedance.sdk.component.adexpress.dkl.uua(this.hnj, Color.parseColor("#99000000"));
                } else {
                    this.dse = new com.bytedance.sdk.component.adexpress.dkl.uua(this.hnj, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(this.qor.lhi()));
                }
                FrameLayout frameLayout = new FrameLayout(this.hnj);
                frameLayout.addView(this.dse, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qor.ojm.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ojm.this.dse.hn();
                    }
                });
            }
            if (hnj(this.dkl) && com.bytedance.sdk.component.adexpress.gjv.hn()) {
                int color = Color.parseColor("#99000000");
                if (this.qor.mkl() && !TextUtils.isEmpty(this.qor.lhi())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(this.qor.lhi());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.hnj);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.f12656sk.qor());
            hnj(this.f12656sk.qor());
            setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojm() {
        if (this.aq != null) {
            setOnClickListener((View.OnClickListener) this.f12655hn.getDynamicClickListener());
            performClick();
            if (this.qor.rq()) {
                return;
            }
            setVisibility(8);
        }
    }

    public void dkl() {
        if (this.gjv != null && TextUtils.equals(this.dkl, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            View view = this.gjv;
            if (view instanceof com.bytedance.sdk.component.adexpress.dkl.qor) {
                ((com.bytedance.sdk.component.adexpress.dkl.qor) view).gjv();
            }
        }
    }

    public void gjv() {
        dse dseVar = this.f12656sk;
        if (dseVar != null) {
            dseVar.hn();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            dse dseVar = this.f12656sk;
            if (dseVar != null) {
                dseVar.hn();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.aq instanceof com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.qor) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void qor() {
        dse dseVar = this.f12656sk;
        if (dseVar != null) {
            dseVar.hnj();
        }
    }

    public void sk() {
        if (this.gjv != null && TextUtils.equals(this.dkl, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            View view = this.gjv;
            if (view instanceof com.bytedance.sdk.component.adexpress.dkl.qor) {
                ((com.bytedance.sdk.component.adexpress.dkl.qor) view).qor();
            }
        }
    }

    private boolean hnj(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.aq
    public void hn() {
        if (aq()) {
            setOnClickListener((View.OnClickListener) this.f12655hn.getDynamicClickListener());
            performClick();
            if (this.qor.rq()) {
                return;
            }
            setVisibility(8);
        }
    }

    public ojm(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.ta taVar, com.bytedance.sdk.component.adexpress.hn.orl orlVar) {
        super(context);
        this.hnj = context;
        this.f12655hn = skVar;
        this.qor = dseVar;
        this.dnm = taVar;
        this.bug = orlVar;
        dse();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void hnj(ViewGroup viewGroup) {
        byte b10 = 2;
        if (this.gjv == null) {
            return;
        }
        String str = this.dkl;
        str.getClass();
        switch (str.hashCode()) {
            case 48:
                b10 = !str.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL) ? (byte) -1 : (byte) 0;
                break;
            case 49:
                b10 = !str.equals("1") ? (byte) -1 : (byte) 1;
                break;
            case 50:
                if (!str.equals(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    b10 = -1;
                }
                break;
            case 53:
                b10 = !str.equals(CampaignEx.CLICKMODE_ON) ? (byte) -1 : (byte) 3;
                break;
            case 54:
                b10 = !str.equals("6") ? (byte) -1 : (byte) 4;
                break;
            case 55:
                b10 = !str.equals("7") ? (byte) -1 : (byte) 5;
                break;
            case AD_VISIBILITY_VALUE:
                b10 = !str.equals("8") ? (byte) -1 : (byte) 6;
                break;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                b10 = !str.equals("9") ? (byte) -1 : (byte) 7;
                break;
            case 1567:
                b10 = !str.equals("10") ? (byte) -1 : (byte) 8;
                break;
            case 1568:
                b10 = !str.equals("11") ? (byte) -1 : (byte) 9;
                break;
            case 1569:
                b10 = !str.equals("12") ? (byte) -1 : (byte) 10;
                break;
            case 1570:
                b10 = !str.equals("13") ? (byte) -1 : (byte) 11;
                break;
            case 1571:
                b10 = !str.equals("14") ? (byte) -1 : (byte) 12;
                break;
            case 1573:
                b10 = !str.equals("16") ? (byte) -1 : (byte) 13;
                break;
            case 1574:
                b10 = !str.equals("17") ? (byte) -1 : (byte) 14;
                break;
            case 1575:
                b10 = !str.equals("18") ? (byte) -1 : (byte) 15;
                break;
            case 1598:
                b10 = !str.equals("20") ? (byte) -1 : (byte) 16;
                break;
            case 1600:
                b10 = !str.equals("22") ? (byte) -1 : (byte) 17;
                break;
            case 1601:
                b10 = !str.equals("23") ? (byte) -1 : (byte) 18;
                break;
            case 1602:
                b10 = !str.equals("24") ? (byte) -1 : (byte) 19;
                break;
            case 1603:
                b10 = !str.equals("25") ? (byte) -1 : (byte) 20;
                break;
            case 1607:
                b10 = !str.equals("29") ? (byte) -1 : (byte) 21;
                break;
            default:
                b10 = -1;
                break;
        }
        String str2 = qEagQqzJZsd.wMYgu;
        switch (b10) {
            case 0:
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.sk(this, this.ojm);
                setBackgroundColor(Color.parseColor(str2));
                break;
            case 1:
            case 4:
                if (!this.qor.mkl() || TextUtils.isEmpty(this.qor.lhi())) {
                    setBackgroundColor(Color.parseColor(str2));
                }
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.dkl(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor(str2));
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.hn(this, this);
                break;
            case 3:
                if (this.qor.mkl() && !TextUtils.isEmpty(this.qor.lhi())) {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(this.qor.lhi()));
                } else {
                    setBackgroundColor(Color.parseColor(str2));
                }
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.qor(this);
                this.gjv.setTag(2);
                break;
            case 6:
            case 9:
                this.f12655hn.setClipChildren(false);
                this.f12655hn.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.f12655hn.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.dkl(this);
                break;
            case 7:
            case 14:
                this.gjv.setTag(2);
                break;
            case 8:
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.gjv(this, this.ojm, this.f12657ta);
                break;
            case 10:
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.qor(this);
                this.gjv.setTag(2);
                break;
            case 11:
            case 19:
                if (this.dkl.equals("24") && com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    this.f12655hn.setClipChildren(false);
                    this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.dkl(this);
                } else {
                    this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.sk(this, this.ojm);
                }
                break;
            case 12:
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.hn(this, this);
                break;
            case 13:
                View view = this.gjv;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.dkl.oj) && ((com.bytedance.sdk.component.adexpress.dkl.oj) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.dkl.oj) this.gjv).getShakeLayout().setTag(2);
                }
                this.gjv.setTag(2);
                break;
            case 15:
                View view2 = this.gjv;
                if (view2 != null && (view2 instanceof tu) && ((tu) view2).getWriggleLayout() != null) {
                    ((tu) this.gjv).getWriggleLayout().setTag(2);
                }
                this.gjv.setTag(2);
                break;
            case 16:
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.hnj(this, this.ojm, viewGroup);
                break;
            case 17:
                if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.aq(this, this.f12657ta);
                } else {
                    this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.dse(this, this.ojm, viewGroup);
                }
                break;
            case 18:
                if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.dkl(this);
                }
                break;
            case 20:
                if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                    this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.aq(this, this.f12657ta);
                }
                break;
            case 21:
                View view3 = this.gjv;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.dkl.dkl) && ((com.bytedance.sdk.component.adexpress.dkl.dkl) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.dkl.dkl) this.gjv).getShakeView().setTag(2);
                }
                this.aq = new com.bytedance.sdk.component.adexpress.dynamic.qor.hnj.sk(this, this.ojm);
                break;
        }
        View.OnTouchListener onTouchListener = this.aq;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (aq()) {
            this.gjv.setTag(2);
            setOnClickListener((View.OnClickListener) this.f12655hn.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.aq
    public void hnj() {
        if (TextUtils.equals(this.dkl, "6")) {
            com.bytedance.sdk.component.adexpress.dkl.uua uuaVar = this.dse;
            if (uuaVar != null) {
                uuaVar.qor();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qor.ojm.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ojm.this.ojm();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.dkl, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qor.ojm.3
                @Override // java.lang.Runnable
                public void run() {
                    ojm.this.ojm();
                }
            }, 400L);
        } else {
            ojm();
        }
    }
}
