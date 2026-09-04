package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.Cdo;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.utils.mjg;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends qor {
    private com.bytedance.sdk.openadsdk.component.reward.top.qor aq;
    private com.bytedance.sdk.openadsdk.core.dkl.aq bug;
    public mjg dkl;
    private com.bytedance.sdk.openadsdk.core.dkl.qor dnm;
    private final List<aq> dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private sk f13201fc;
    private aq jip;
    private int mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean f13202oj;
    private com.bytedance.sdk.openadsdk.fc.hnj ojm;
    private hn.AbstractC0199hn orl;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.qor f13203ta;
    private int uua;

    public ojm(Activity activity, as asVar, hn hnVar) {
        super(activity, asVar, hnVar);
        this.dse = new ArrayList();
        this.f13202oj = false;
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(activity);
        this.f13203ta = qorVar;
        if (Build.VERSION.SDK_INT >= 35) {
            qorVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.f13203ta);
    }

    private void eum() {
        boolean zMjg = dnm.hn().mjg(String.valueOf(this.f13205hn.atw()));
        int iHn = this.gjv.dkl() ? hn(0, zMjg) : 0;
        if (this.dse.isEmpty() && !hqh.qor(this.f13205hn)) {
            int i10 = iHn + 1;
            this.dse.add(hnj(this.gjv, this.f13205hn, iHn, i10, true));
            iHn = i10;
        }
        hnj(iHn, zMjg);
    }

    private void gjv(aq aqVar) {
        com.bytedance.sdk.openadsdk.fc.hnj hnjVar = this.ojm;
        if (hnjVar != null) {
            sq.dse(hnjVar);
            this.ojm = null;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = this.aq;
        if (qorVar != null) {
            sq.dse(qorVar);
            sq.dse(this.aq.getITopLayout());
            this.aq = null;
        }
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn != null) {
            abstractC0199hn.qor();
        }
        if (aqVar instanceof dse) {
            ((dse) aqVar).lu();
        }
        mjg mjgVar = this.dkl;
        if (mjgVar != null) {
            mjgVar.qor();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011c A[PHI: r11
      0x011c: PHI (r11v3 int) = (r11v2 int), (r11v4 int), (r11v2 int), (r11v2 int) binds: [B:28:0x00b7, B:42:0x0106, B:32:0x00c7, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    private int hn(int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        List<as> listMr = this.f13205hn.mr();
        if (listMr.isEmpty()) {
            return i10;
        }
        int size = listMr.size();
        this.mjg = size;
        int i14 = i10;
        int i15 = 0;
        while (i15 < size) {
            boolean z11 = i15 == size + (-1);
            as asVar = listMr.get(i15);
            if (asVar != null) {
                asVar.orp(this.f13206sk);
            }
            if (hqh.hn(asVar)) {
                if (hqh.qor(asVar)) {
                    List<aq> list = this.dse;
                    i11 = i14 + 1;
                    sk skVar = new sk(this.gjv, asVar, i14, i15, true, z11, false);
                    asVar = asVar;
                    list.add(skVar);
                    i13 = i11;
                } else {
                    this.dse.add(hnj(this.gjv, asVar, i14, i15, z11));
                    i12 = i14 + 2;
                    this.dse.add(new sk(this.gjv, asVar, i14 + 1, i15, true, z11, false));
                    i13 = i12;
                }
            } else if (!apu.sk(asVar) && apu.dkl(asVar)) {
                this.dse.add(hnj(this.gjv, asVar, i14, i15, z11));
                i12 = i14 + 2;
                this.dse.add(new sk(this.gjv, asVar, i14 + 1, i15, false, z11, false));
                i13 = i12;
            } else {
                i11 = i14 + 1;
                this.dse.add(hnj(this.gjv, asVar, i14, i15, z11));
                i13 = i11;
            }
            if (z10) {
                boolean zHnj = this.gjv.hnj(asVar);
                if (z11) {
                    if (this.gjv.gjv() && zHnj && !hqh.hn(asVar)) {
                        this.dse.add(new sk(this.gjv, asVar, i13, i15, false, z11, false));
                        i13++;
                    }
                    if (TextUtils.isEmpty(asVar.aq())) {
                        i14 = i13;
                    } else {
                        sk skVar2 = new sk(this.gjv, asVar, i13, i15, false, z11, true);
                        this.f13201fc = skVar2;
                        this.dse.add(skVar2);
                        i14 = i13 + 1;
                    }
                } else if (this.gjv.sk() && zHnj) {
                    this.dse.add(new sk(this.gjv, asVar, i13, i15, false, z11, false));
                    i14 = i13 + 1;
                } else {
                    i14 = i13;
                }
            } else {
                i14 = i13;
            }
            i15++;
        }
        return i14;
    }

    private void qor(aq aqVar) {
        try {
            this.bug.setText(this.hnj.getString(wu.hn(oj.hnj(), "tt_multiple_ad_indicator"), Integer.valueOf(aqVar.dnm + 1), Integer.valueOf(this.mjg)));
            this.bug.setVisibility(0);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th2);
        }
    }

    private void wu() {
        this.dkl = com.bytedance.sdk.openadsdk.utils.ojm.hnj(this.hnj, new com.bytedance.sdk.openadsdk.utils.ojm.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.ojm.1
            @Override // com.bytedance.sdk.openadsdk.utils.ojm.hnj
            public void hn() {
                if (ojm.this.aq != null) {
                    ojm.this.aq.setSkipInvisiable();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ojm.hnj
            public View hnj() {
                if (ojm.this.aq != null) {
                    return ojm.this.aq.getCloseButton();
                }
                return null;
            }
        });
    }

    public int apu() {
        aq aqVar = this.jip;
        if (aqVar != null) {
            return aqVar.f13131ta;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public int aq() {
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn != null) {
            return abstractC0199hn.hnj();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public com.bytedance.sdk.openadsdk.component.reward.top.qor bug() {
        return this.aq;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void dkl() {
        super.dkl();
        aq aqVar = this.jip;
        if (aqVar != null) {
            aqVar.orl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public aq dnm() {
        return this.jip;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void dse() {
        super.dse();
        aq aqVar = this.jip;
        if (aqVar != null) {
            aqVar.gjv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public List<as> fc() {
        return this.f13205hn.mr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public sk mjg() {
        sk skVar = this.f13201fc;
        if (skVar != null) {
            return skVar;
        }
        aq aqVar = this.jip;
        int i10 = aqVar != null ? aqVar.f13131ta : -1;
        for (int size = this.dse.size() - 1; size > i10; size--) {
            aq aqVar2 = this.dse.get(size);
            if (aqVar2 instanceof sk) {
                sk skVar2 = (sk) aqVar2;
                if (skVar2.hnj) {
                    this.f13201fc = skVar2;
                    break;
                }
            }
        }
        return this.f13201fc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void oj() {
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn != null) {
            abstractC0199hn.aq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void ojm() {
        super.ojm();
        aq aqVar = this.jip;
        if (aqVar != null) {
            aqVar.apu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public aq orl() {
        aq aqVar = this.jip;
        if (aqVar == null) {
            return null;
        }
        int i10 = aqVar.f13131ta;
        while (true) {
            i10++;
            if (i10 >= this.dse.size()) {
                return null;
            }
            aq aqVar2 = this.dse.get(i10);
            if (aqVar2 instanceof hnj) {
                return aqVar2;
            }
            if ((aqVar2 instanceof sk) && hqh.qor(aqVar2.dkl) && aqVar2.jip) {
                return aqVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public int ta() {
        return this.uua;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void xn() {
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn != null) {
            abstractC0199hn.ojm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj() {
        super.hnj();
        eum();
    }

    private static aq hnj(hn hnVar, as asVar, int i10, int i11, boolean z10) {
        boolean zHhw = asVar.hhw();
        AdSlot adSlotAip = asVar.aip();
        if (adSlotAip != null) {
            zHhw = adSlotAip.getDurationSlotType() == 7;
        }
        if (zHhw) {
            return new dse(hnVar, asVar, i10, i11, z10);
        }
        return new dkl(hnVar, asVar, i10, i11, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void qor() {
        super.qor();
        aq aqVar = this.jip;
        if (aqVar != null) {
            aqVar.mjg();
        }
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn != null) {
            abstractC0199hn.hnj(-1);
        }
        mjg mjgVar = this.dkl;
        if (mjgVar != null) {
            mjgVar.hn();
        }
    }

    private void hnj(int i10, boolean z10) {
        if (mjg() == null && this.gjv.dkl()) {
            wu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(Bundle bundle) {
        super.hnj(bundle);
        this.dnm = new com.bytedance.sdk.openadsdk.core.dkl.qor(this.hnj);
        this.f13203ta.addView(this.dnm, new FrameLayout.LayoutParams(-1, -1));
        this.ojm = new com.bytedance.sdk.openadsdk.fc.hnj(this.hnj);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, sq.hn(this.hnj, 2.0f));
        layoutParams.gravity = 80;
        this.f13203ta.addView(this.ojm, layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(this.hnj);
        this.bug = aqVar;
        aqVar.setTextColor(-1);
        this.bug.setTextSize(15.0f);
        this.bug.setShadowLayer(1.0f, 0.0f, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = sq.hn(this.hnj, 60.0f);
        layoutParams2.rightMargin = sq.hn(this.hnj, 16.0f);
        layoutParams2.gravity = 8388661;
        this.f13203ta.addView(this.bug, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.qor qorVar = new com.bytedance.sdk.openadsdk.component.reward.top.qor(this.hnj);
        this.aq = qorVar;
        this.f13203ta.addView(qorVar, new FrameLayout.LayoutParams(-1, -2));
        this.aq.hnj(this.f13205hn);
        this.aq.setShowDislike(true);
        hnj(null, null, new hn.sk(1, null));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public boolean gjv() {
        if (this.dse.isEmpty()) {
            return false;
        }
        List<aq> list = this.dse;
        aq aqVar = list.get(list.size() - 1);
        return (aqVar instanceof sk) && ((sk) aqVar).hnj;
    }

    private void hn(aq aqVar, aq aqVar2, hn.sk skVar) {
        as asVar;
        if (this.orl == null) {
            if (aqVar2 != null && aqVar2.c_()) {
                this.orl = new hn.gjv(this.gjv, this.f13205hn, this.aq);
            } else {
                this.orl = new hn.hnj(this.gjv, this.f13205hn, this.aq);
            }
        }
        this.orl.hn();
        int iHn = hn(aqVar2);
        boolean z10 = aqVar2 instanceof sk;
        if (z10 && !((sk) aqVar2).hnj && !aqVar2.jip && (asVar = aqVar2.dkl) != null && asVar.rbd()) {
            this.orl.gjv();
        } else {
            this.orl.hnj(iHn, aqVar2.dkl);
            boolean z11 = aqVar2 instanceof sk;
            if (z11 && ((sk) aqVar2).hnj) {
                gjv(aqVar);
            } else if (aqVar2.dkl.btk()) {
                boolean z12 = false;
                boolean z13 = (aqVar2 instanceof hnj) && apu.sk(aqVar2.dkl);
                if (z11 && (aqVar2.jip || apu.dkl(aqVar2.dkl))) {
                    z12 = true;
                }
                if (z13 || z12) {
                    this.orl.hnj(aqVar2);
                }
            } else if (aqVar2.jip) {
                this.orl.hnj(aqVar2.dkl, aqVar2.uua);
            } else if (z11) {
                this.orl.qor(aqVar2.dkl.jlw().gjv());
            }
        }
        mjg mjgVar = this.dkl;
        if (mjgVar != null && aqVar == null) {
            mjgVar.hnj(iHn * 1000);
        }
        if (aqVar2 instanceof hnj) {
            this.uua++;
            hnj(0.0f);
            if (apu.sk(aqVar2.dkl)) {
                this.bug.setVisibility(8);
                return;
            } else {
                qor(aqVar2);
                return;
            }
        }
        if (z10) {
            if (((sk) aqVar2).hnj) {
                this.bug.setVisibility(8);
                return;
            }
            if (aqVar2.jip && hqh.qor(aqVar2.dkl)) {
                this.uua++;
            }
            if (!aqVar2.jip && !apu.dkl(aqVar2.dkl)) {
                qor(aqVar2);
            } else {
                this.bug.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(aq aqVar, aq aqVar2, hn.sk skVar) {
        aq aqVar3 = this.jip;
        if ((aqVar3 == null || aqVar3 == aqVar) && !com.bytedance.sdk.component.utils.hn.hnj(this.hnj)) {
            apu();
            if (aqVar2 == null) {
                aq aqVar4 = this.jip;
                int i10 = aqVar4 != null ? aqVar4.f13131ta + 1 : 0;
                if (i10 < this.dse.size()) {
                    aqVar2 = this.dse.get(i10);
                }
                if (aqVar2 == null) {
                    this.gjv.dse();
                    return;
                }
            }
            aq aqVar5 = this.jip;
            if (aqVar5 != null) {
                if (aqVar5 == aqVar2) {
                    return;
                }
                aqVar5.mjg();
                this.jip.gjv();
                com.bytedance.sdk.openadsdk.component.reward.view.aq aqVarHnj = this.jip.hnj();
                if (aqVarHnj != null) {
                    this.dnm.removeView(aqVarHnj);
                }
                this.jip.xn();
                this.jip.bug = false;
                if (this.gjv.sk()) {
                    aq aqVar6 = this.jip;
                    if (aqVar6 instanceof hnj) {
                        int i11 = aqVar6.f13131ta + 1;
                        aq aqVar7 = i11 < this.dse.size() ? this.dse.get(i11) : null;
                        if ((aqVar7 instanceof sk) && aqVar7 != aqVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.aq aqVarHnj2 = aqVar7.hnj();
                            if (aqVarHnj2 != null && aqVarHnj2.getParent() != null && (aqVarHnj2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) aqVarHnj2.getParent()).removeView(aqVarHnj2);
                            }
                            aqVar7.xn();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.hn.hnj(this.hnj)) {
                return;
            }
            aqVar2.bug = true;
            aq aqVar8 = this.jip;
            this.jip = aqVar2;
            hn(aqVar8, aqVar2, skVar);
            aqVar2.hn(this.hnj, skVar);
            com.bytedance.sdk.openadsdk.component.reward.view.aq aqVarHnj3 = aqVar2.hnj();
            if (aqVarHnj3 != null) {
                ViewParent parent = aqVarHnj3.getParent();
                if (parent != null) {
                    if (parent == this.dnm) {
                        aqVarHnj3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(aqVarHnj3);
                    }
                }
                if (aqVarHnj3.getParent() == null) {
                    this.dnm.addView(aqVarHnj3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i12 = aqVar8 != null ? aqVar8.f13131ta : 0; i12 < this.dse.size(); i12++) {
                this.dse.get(i12).hnj(aqVar8, this.jip, skVar);
            }
            this.gjv.hn(this.jip);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    private int hn(aq aqVar) {
        as asVar;
        int iGjv = 0;
        for (int i10 = aqVar.f13131ta; i10 < this.dse.size(); i10++) {
            aq aqVar2 = this.dse.get(i10);
            if ((aqVar2 instanceof sk) && ((sk) aqVar2).hnj) {
                break;
            }
            boolean z10 = aqVar2.jip;
            boolean zDkl = apu.dkl(aqVar2.dkl);
            boolean zSk = apu.sk(aqVar2.dkl);
            Cdo cdoHnj = aqVar2.dkl.hnj();
            int iQor = cdoHnj != null ? cdoHnj.qor() : 10;
            if (aqVar2 instanceof hnj) {
                if (zSk) {
                    iGjv += iQor;
                } else {
                    com.bykv.vk.openvk.hnj.hnj.hnj.qor.a aVarPwt = aqVar2.dkl.pwt();
                    iGjv = aVarPwt != null ? (int) (((double) iGjv) + aVarPwt.e()) : (int) (((long) iGjv) + 10);
                }
            } else if (aqVar2 instanceof sk) {
                if (zDkl) {
                    iGjv += iQor;
                } else if (z10) {
                    if (aqVar2.dkl.btk()) {
                        iGjv += iQor;
                    } else {
                        iGjv += hqh.eum(aqVar2.dkl) + hqh.tu(aqVar2.dkl);
                    }
                } else if (this.gjv.sk() && (asVar = aqVar2.dkl) != null && !asVar.rbd()) {
                    iGjv += aqVar2.dkl.jlw().gjv();
                }
            }
        }
        return iGjv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(int i10, int i11) {
        super.hnj(i10, i11);
        if (i10 >= 0) {
            if (TextUtils.isEmpty(this.qor)) {
                this.bug.setText(this.hnj.getString(wu.hn(oj.hnj(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i10)));
            } else {
                this.bug.setText(String.format(this.qor, Integer.valueOf(i10)));
            }
            this.bug.setVisibility(0);
            return;
        }
        this.bug.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hn() {
        super.hn();
        aq aqVar = this.jip;
        if (aqVar != null) {
            aqVar.qor();
        }
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn != null) {
            abstractC0199hn.hn(-1);
        }
        mjg mjgVar = this.dkl;
        if (mjgVar != null) {
            mjgVar.hnj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(Activity activity) {
        super.hnj(activity);
        aq aqVar = this.jip;
        if (aqVar != null) {
            aqVar.hn(activity);
        }
        int iApu = apu();
        for (aq aqVar2 : this.dse) {
            if (aqVar2.f13131ta >= iApu) {
                aqVar2.xn();
            }
        }
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn != null) {
            abstractC0199hn.qor();
        }
        mjg mjgVar = this.dkl;
        if (mjgVar != null) {
            mjgVar.qor();
        }
        aq aqVar3 = this.jip;
        if (aqVar3 != null && !aqVar3.wu() && !this.f13205hn.era()) {
            fc.hn().post(new hn.qor(this.f13205hn));
        }
        this.jip = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hn(aq aqVar, int i10) {
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn == null) {
            return;
        }
        if (i10 == 2) {
            abstractC0199hn.hnj(i10);
            mjg mjgVar = this.dkl;
            if (mjgVar != null) {
                mjgVar.hn();
                return;
            }
            return;
        }
        if (i10 == 1) {
            abstractC0199hn.hn(i10);
            mjg mjgVar2 = this.dkl;
            if (mjgVar2 != null) {
                mjgVar2.hnj();
                return;
            }
            return;
        }
        if (i10 == 3 || i10 == 4) {
            try {
                this.jip.mo16do().eum.gm();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("SeqSwitchLayoutManager", th2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hn(Activity activity) {
        super.hn(activity);
        aq aqVar = this.jip;
        if (aqVar != null) {
            aqVar.hnj(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(float f10) {
        com.bytedance.sdk.openadsdk.fc.hnj hnjVar = this.ojm;
        if (hnjVar == null) {
            return;
        }
        hnjVar.setProgress(f10);
        if (f10 == 0.0f && this.ojm.getVisibility() == 0) {
            this.ojm.setVisibility(4);
        } else {
            if (f10 <= 0.0f || this.ojm.getVisibility() == 0) {
                return;
            }
            this.ojm.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(int i10) {
        hn.AbstractC0199hn abstractC0199hn = this.orl;
        if (abstractC0199hn != null) {
            if (i10 == 2) {
                abstractC0199hn.hnj(2);
            } else if (i10 == 1) {
                abstractC0199hn.hn(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(aq aqVar, hn.sk skVar) {
        aq aqVar2 = this.jip;
        if (aqVar2 == null || aqVar2 == aqVar) {
            if (aqVar2 != null && (aqVar2 instanceof hnj)) {
                final long jMjg = (aqVar2.mo16do() == null || this.jip.mo16do().eum == null) ? 0L : this.jip.mo16do().eum.mjg();
                final int i10 = this.jip.dnm + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                aq aqVar3 = this.jip;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(jCurrentTimeMillis, aqVar3.dkl, aqVar3.d_(), "dislike_skip", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.ojm.2
                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hn() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", jMjg);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hnj() {
                        return com.bytedance.sdk.openadsdk.gjv.qor.hnj(i10);
                    }
                });
            }
            aq aqVarOrl = orl();
            if (aqVarOrl == null) {
                aqVarOrl = mjg();
            }
            hnj(this.jip, aqVarOrl, skVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(aq aqVar, boolean z10, boolean z11, boolean z12, int i10) {
        sk skVarMjg;
        aq aqVar2 = this.jip;
        if ((aqVar2 == null || aqVar2 == aqVar) && (skVarMjg = mjg()) != null) {
            hn.sk skVar = new hn.sk(i10, aqVar != null ? aqVar.mo16do() : null);
            skVar.hnj.putBoolean("isSkip", z10);
            skVar.hnj.putBoolean("force", z11);
            skVar.hnj.putBoolean("isFromLandingPage", z12);
            hnj(this.jip, skVarMjg, skVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(hnj hnjVar, boolean z10) {
        hn.AbstractC0199hn abstractC0199hn;
        super.hnj(hnjVar, z10);
        if (hnjVar == null || hnjVar != this.jip || (abstractC0199hn = this.orl) == null) {
            return;
        }
        abstractC0199hn.hn(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(aq aqVar) {
        hn.AbstractC0199hn abstractC0199hn;
        super.hnj(aqVar);
        if (aqVar == null) {
            return;
        }
        aqVar.toString();
        if (aqVar.bug && (abstractC0199hn = this.orl) != null) {
            abstractC0199hn.dkl();
        }
        aq aqVarOrl = orl();
        if (aqVarOrl instanceof hnj) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarMo16do = aqVarOrl.mo16do();
            if (hnjVarMo16do == null || !apu.sk(hnjVarMo16do.f13456hn)) {
                ((hnj) aqVarOrl).eum();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(aq aqVar, boolean z10) {
        hn.AbstractC0199hn abstractC0199hn;
        super.hnj(aqVar, z10);
        if (aqVar == null) {
            return;
        }
        aqVar.toString();
        if (!aqVar.bug || (abstractC0199hn = this.orl) == null) {
            return;
        }
        abstractC0199hn.hnj(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(View view) {
        super.hnj(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.dnm.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(View view, boolean z10) {
        super.hnj(view, z10);
        if (view.getParent() == null && this.dnm != null) {
            view.setVisibility(4);
            int childCount = this.dnm.getChildCount();
            if (z10) {
                this.dnm.addView(view, 0);
            } else {
                this.dnm.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public boolean hnj(aq aqVar, int i10) {
        return i10 == this.dse.size() - 1 && this.dse.get(i10) != null && (this.dse.get(i10) instanceof sk);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.qor
    public void hnj(boolean z10) {
        super.hnj(z10);
        aq aqVar = this.jip;
        if (aqVar != null) {
            aqVar.qor(z10);
        }
    }
}
