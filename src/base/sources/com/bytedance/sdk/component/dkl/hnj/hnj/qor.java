package com.bytedance.sdk.component.dkl.hnj.hnj;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dse;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements gjv {
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj aq;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj bug;
    private com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.sk dkl;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj dnm;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj dse;
    private dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hnj f12818hn;
    private com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.gjv hnj;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj ojm;
    private com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dkl f12819sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj f12820ta;

    public qor() {
        Context contextSk = com.bytedance.sdk.component.dkl.hnj.dse.dkl().sk();
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj()) {
            this.dse = com.bytedance.sdk.component.dkl.hnj.dse.dkl().dnm();
            this.hnj = new com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.gjv(contextSk, this.dse);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk()) {
            if (com.bytedance.sdk.component.dkl.hnj.dse.dkl().ojm() != null) {
                this.ojm = com.bytedance.sdk.component.dkl.hnj.dse.dkl().ojm();
            } else {
                this.ojm = com.bytedance.sdk.component.dkl.hnj.dse.dkl().bug();
            }
            this.qor = new com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hn(contextSk, this.ojm);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn()) {
            this.aq = com.bytedance.sdk.component.dkl.hnj.dse.dkl().bug();
            this.f12818hn = new com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hnj(contextSk, this.aq);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor()) {
            this.f12820ta = com.bytedance.sdk.component.dkl.hnj.dse.dkl().bug();
            this.gjv = new dse(contextSk, this.f12820ta);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv()) {
            this.dnm = com.bytedance.sdk.component.dkl.hnj.dse.dkl().orl();
            this.f12819sk = new com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dkl(contextSk, this.dnm);
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl()) {
            this.bug = com.bytedance.sdk.component.dkl.hnj.dse.dkl().mjg();
            this.dkl = new com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.sk(contextSk, this.bug);
        }
    }

    public List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hn(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, int i10) {
        if (hnjVar.gjv() == 0 && hnjVar.sk() == 1 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj()) {
            if (this.dse.hn() <= i10) {
                return null;
            }
            List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj = this.hnj.hnj(this.dse.hn() - i10, "_id");
            if (listHnj != null && listHnj.size() != 0) {
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.xyo(), 1);
            }
            return listHnj;
        }
        if (hnjVar.gjv() == 3 && hnjVar.sk() == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk()) {
            if (this.ojm.hn() > i10) {
                return this.qor.hnj(this.ojm.hn() - i10, "_id");
            }
        } else if (hnjVar.gjv() == 0 && hnjVar.sk() == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn()) {
            if (this.aq.hn() > i10) {
                List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj2 = this.f12818hn.hnj(this.aq.hn() - i10, "_id");
                if (listHnj2 != null && listHnj2.size() != 0) {
                    com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.vf(), 1);
                }
                return listHnj2;
            }
        } else if (hnjVar.gjv() == 1 && hnjVar.sk() == 2 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor()) {
            if (this.f12820ta.hn() > i10) {
                List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj3 = this.gjv.hnj(this.f12820ta.hn() - i10, "_id");
                if (listHnj3 != null && listHnj3.size() != 0) {
                    com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.hqh(), 1);
                }
                return listHnj3;
            }
        } else if (hnjVar.gjv() == 1 && hnjVar.sk() == 3 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv()) {
            if (this.dnm.hn() > i10) {
                List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj4 = this.f12819sk.hnj(this.dnm.hn() - i10, "_id");
                if (listHnj4 != null && listHnj4.size() != 0) {
                    com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.nyv(), 1);
                }
                return listHnj4;
            }
        } else if (hnjVar.gjv() == 2 && hnjVar.sk() == 3 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl() && this.bug.hn() > i10) {
            return this.dkl.hnj(this.bug.hn() - i10, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, int i10) {
        if (hnjVar == null) {
            return;
        }
        try {
            hnjVar.hn(System.currentTimeMillis());
            if (hnjVar.gjv() == 0 && hnjVar.sk() == 1) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj()) {
                    this.hnj.hnj(hnjVar);
                    return;
                }
                return;
            }
            if (hnjVar.gjv() == 3 && hnjVar.sk() == 2) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk()) {
                    this.qor.hnj(hnjVar);
                    return;
                }
                return;
            }
            if (hnjVar.gjv() == 0 && hnjVar.sk() == 2) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn()) {
                    this.f12818hn.hnj(hnjVar);
                    return;
                }
                return;
            }
            if (hnjVar.gjv() == 1 && hnjVar.sk() == 2) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor()) {
                    this.gjv.hnj(hnjVar);
                }
            } else if (hnjVar.gjv() == 1 && hnjVar.sk() == 3) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv()) {
                    this.f12819sk.hnj(hnjVar);
                }
            } else if (hnjVar.gjv() == 2 && hnjVar.sk() == 3 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl()) {
                this.dkl.hnj(hnjVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.ul(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public void hnj(int i10, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar = list.get(0);
        if (i10 == 200 || i10 == -1) {
            com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj hnjVar2 = com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv;
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar2.ka(), list.size());
            if (i10 != 200) {
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(hnjVar2.mkl(), list.size());
            }
            if (hnjVar.gjv() == 0 && hnjVar.sk() == 1) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj()) {
                    this.hnj.hn(list);
                    return;
                }
                return;
            }
            if (hnjVar.gjv() == 3 && hnjVar.sk() == 2) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk()) {
                    this.qor.hn(list);
                    return;
                }
                return;
            }
            if (hnjVar.gjv() == 0 && hnjVar.sk() == 2) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn()) {
                    this.f12818hn.hn(list);
                    return;
                }
                return;
            }
            if (hnjVar.gjv() == 1 && hnjVar.sk() == 2) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor()) {
                    this.gjv.hn(list);
                }
            } else if (hnjVar.gjv() == 1 && hnjVar.sk() == 3) {
                if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv()) {
                    this.f12819sk.hn(list);
                }
            } else if (hnjVar.gjv() == 2 && hnjVar.sk() == 3 && com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl()) {
                this.dkl.hn(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hnj(int i10, int i11, List<String> list) {
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj()) {
            List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj = this.hnj.hnj("_id");
            if (hnj(listHnj, list)) {
                listHnj.size();
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.as(), 1);
                return listHnj;
            }
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk()) {
            List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj2 = this.qor.hnj("_id");
            if (hnj(listHnj2, list)) {
                listHnj2.size();
                return listHnj2;
            }
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn()) {
            List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj3 = this.f12818hn.hnj("_id");
            if (hnj(listHnj3, list)) {
                listHnj3.size();
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.m12do(), 1);
                return listHnj3;
            }
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor()) {
            List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHn = this.gjv.hn("_id");
            if (hnj(listHn, list)) {
                listHn.size();
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.tu(), 1);
                return listHn;
            }
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv()) {
            List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHn2 = this.f12819sk.hn("_id");
            if (hnj(listHn2, list)) {
                listHn2.size();
                com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.tgn(), 1);
                return listHn2;
            }
        }
        if (!com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl()) {
            return null;
        }
        List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHn3 = this.dkl.hn("_id");
        if (!hnj(listHn3, list)) {
            return null;
        }
        listHn3.size();
        return listHn3;
    }

    private boolean hnj(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.dkl.hnj.gjv.hnj next = it.next();
                    if (next != null) {
                        String strQor = next.qor();
                        if (!TextUtils.isEmpty(strQor) && list2.contains(strQor)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public boolean hnj(int i10, boolean z10) {
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.sk skVar;
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dkl dklVar;
        dse dseVar;
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hnj hnjVar;
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hn hnVar;
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.gjv gjvVar;
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj() && (gjvVar = this.hnj) != null && gjvVar.hnj(i10)) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.mjg(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.sk() && (hnVar = this.qor) != null && hnVar.hnj(i10)) {
            return true;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.hn() && (hnjVar = this.f12818hn) != null && hnjVar.hnj(i10)) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.fc(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.dkl.hnj.hn.hnj.qor() && (dseVar = this.gjv) != null && dseVar.hnj(i10)) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.jip(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.dkl.hnj.hn.hnj.gjv() || (dklVar = this.f12819sk) == null || !dklVar.hnj(i10)) {
            return com.bytedance.sdk.component.dkl.hnj.hn.hnj.dkl() && (skVar = this.dkl) != null && skVar.hnj(i10);
        }
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.uua(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public void hnj(int i10, long j10) {
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.hnj(i10, j10);
        }
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hn hnVar = this.qor;
        if (hnVar != null) {
            hnVar.hnj(i10, j10);
        }
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.hnj hnjVar = this.f12818hn;
        if (hnjVar != null) {
            hnjVar.hnj(i10, j10);
        }
        dse dseVar = this.gjv;
        if (dseVar != null) {
            dseVar.hnj(i10, j10);
        }
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.dkl dklVar = this.f12819sk;
        if (dklVar != null) {
            dklVar.hnj(i10, j10);
        }
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.sk skVar = this.dkl;
        if (skVar != null) {
            skVar.hnj(i10, j10);
        }
    }
}
