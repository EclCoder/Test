package com.bytedance.sdk.component.dkl.hnj.hnj;

import com.bytedance.sdk.component.dkl.hnj.dse;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl implements gjv {
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj aq;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj bug;
    private com.bytedance.sdk.component.dkl.hnj.hnj.hn.qor dkl;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj dnm;
    private com.bytedance.sdk.component.dkl.hnj.hnj.hn.dkl dse;
    private com.bytedance.sdk.component.dkl.hnj.hnj.hn.hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.component.dkl.hnj.hnj.hn.sk f12808hn;
    sk hnj = dse.dkl().qor();
    private Queue<String> mjg;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj ojm;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj orl;
    private com.bytedance.sdk.component.dkl.hnj.hnj.hn.hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.component.dkl.hnj.hnj.hn.dse f12809sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj f12810ta;

    public dkl(Queue<String> queue) {
        this.mjg = queue;
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj()) {
            com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVarDnm = dse.dkl().dnm();
            this.aq = hnjVarDnm;
            this.f12808hn = new com.bytedance.sdk.component.dkl.hnj.hnj.hn.sk(hnjVarDnm, queue);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk()) {
            if (dse.dkl().ojm() != null) {
                this.f12810ta = dse.dkl().ojm();
            } else {
                this.f12810ta = dse.dkl().bug();
            }
            this.gjv = new com.bytedance.sdk.component.dkl.hnj.hnj.hn.hn(this.f12810ta, queue);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn()) {
            com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVarBug = dse.dkl().bug();
            this.ojm = hnjVarBug;
            this.qor = new com.bytedance.sdk.component.dkl.hnj.hnj.hn.hnj(hnjVarBug, queue);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor()) {
            com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVarBug2 = dse.dkl().bug();
            this.dnm = hnjVarBug2;
            this.f12809sk = new com.bytedance.sdk.component.dkl.hnj.hnj.hn.dse(hnjVarBug2, queue);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv()) {
            com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVarOrl = dse.dkl().orl();
            this.bug = hnjVarOrl;
            this.dkl = new com.bytedance.sdk.component.dkl.hnj.hnj.hn.qor(hnjVarOrl, queue);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl()) {
            com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVarMjg = dse.dkl().mjg();
            this.orl = hnjVarMjg;
            this.dse = new com.bytedance.sdk.component.dkl.hnj.hnj.hn.dkl(hnjVarMjg, queue);
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public void hnj(int i10, long j10) {
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, int i10) {
        try {
            byte bGjv = hnjVar.gjv();
            byte bSk = hnjVar.sk();
            if (bGjv == 0 && bSk == 1 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj()) {
                this.f12808hn.hnj(hnjVar);
                return;
            }
            if (bGjv == 3 && bSk == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk()) {
                this.gjv.hnj(hnjVar);
                return;
            }
            if (bGjv == 0 && bSk == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn()) {
                this.qor.hnj(hnjVar);
                return;
            }
            if (bGjv == 1 && bSk == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor()) {
                this.f12809sk.hnj(hnjVar);
                return;
            }
            if (bGjv == 1 && bSk == 3 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv()) {
                this.dkl.hnj(hnjVar);
            } else if (bGjv == 2 && bSk == 3 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl()) {
                this.dse.hnj(hnjVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public void hnj(int i10, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar = list.get(0);
        byte bSk = hnjVar.sk();
        byte bGjv = hnjVar.gjv();
        if (bGjv == 0 && bSk == 1 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj()) {
            this.f12808hn.hnj(i10, list);
            return;
        }
        if (bGjv == 3 && bSk == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk()) {
            this.gjv.hnj(i10, list);
            return;
        }
        if (bGjv == 0 && bSk == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn()) {
            this.qor.hnj(i10, list);
            return;
        }
        if (bGjv == 1 && bSk == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor()) {
            this.f12809sk.hnj(i10, list);
            return;
        }
        if (bGjv == 1 && bSk == 3 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv()) {
            this.dkl.hnj(i10, list);
        } else if (bGjv == 2 && bSk == 3 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl()) {
            this.dse.hnj(i10, list);
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hnj(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj;
        List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj2;
        List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj3;
        List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj4;
        List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj5;
        List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj6;
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj() && this.f12808hn.hn(i10, i11) && (listHnj6 = this.f12808hn.hnj(i10, i11)) != null && listHnj6.size() != 0) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.oj(), 1);
            return listHnj6;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk() && this.gjv.hn(i10, i11) && (listHnj5 = this.gjv.hnj(i10, i11)) != null && listHnj5.size() != 0) {
            return listHnj5;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn() && this.qor.hn(i10, i11) && (listHnj4 = this.qor.hnj(i10, i11)) != null && listHnj4.size() != 0) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.xn(), 1);
            return listHnj4;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor() && this.f12809sk.hn(i10, i11) && (listHnj3 = this.f12809sk.hnj(i10, i11)) != null && listHnj3.size() != 0) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.apu(), 1);
            return listHnj3;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv() && this.dkl.hn(i10, i11) && (listHnj2 = this.dkl.hnj(i10, i11)) != null && listHnj2.size() != 0) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.eum(), 1);
            return listHnj2;
        }
        if (!com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl() || !this.dse.hn(i10, i11) || (listHnj = this.dse.hnj(i10, i11)) == null || listHnj.size() == 0) {
            return null;
        }
        return listHnj;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public boolean hnj(int i10, boolean z10) {
        com.bytedance.sdk.component.dkl.hnj.hnj.hn.dkl dklVar;
        com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar;
        com.bytedance.sdk.component.dkl.hnj.hnj.hn.qor qorVar;
        com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar2;
        com.bytedance.sdk.component.dkl.hnj.hnj.hn.dse dseVar;
        com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar3;
        com.bytedance.sdk.component.dkl.hnj.hnj.hn.hnj hnjVar4;
        com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar5;
        com.bytedance.sdk.component.dkl.hnj.hnj.hn.hn hnVar;
        com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar6;
        com.bytedance.sdk.component.dkl.hnj.hnj.hn.sk skVar;
        com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar7;
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj() && (skVar = this.f12808hn) != null && (hnjVar7 = this.aq) != null && skVar.hn(i10, hnjVar7.hnj())) {
            return true;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk() && (hnVar = this.gjv) != null && (hnjVar6 = this.f12810ta) != null && hnVar.hn(i10, hnjVar6.hnj())) {
            return true;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn() && (hnjVar4 = this.qor) != null && (hnjVar5 = this.ojm) != null && hnjVar4.hn(i10, hnjVar5.hnj())) {
            return true;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor() && (dseVar = this.f12809sk) != null && (hnjVar3 = this.dnm) != null && dseVar.hn(i10, hnjVar3.hnj())) {
            return true;
        }
        if (!com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv() || (qorVar = this.dkl) == null || (hnjVar2 = this.bug) == null || !qorVar.hn(i10, hnjVar2.hnj())) {
            return com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl() && (dklVar = this.dse) != null && (hnjVar = this.orl) != null && dklVar.hn(i10, hnjVar.hnj());
        }
        return true;
    }
}
