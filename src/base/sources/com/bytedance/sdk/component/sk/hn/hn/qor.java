package com.bytedance.sdk.component.sk.hn.hn;

import com.bytedance.sdk.component.sk.oj;
import com.bytedance.sdk.component.sk.xn;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements dkl {
    private void hn(final com.bytedance.sdk.component.sk.hn hnVar, final com.bytedance.sdk.component.sk.hn.qor.dkl dklVar, final String str, final byte[] bArr) {
        if (hnVar == null || !hnVar.dse()) {
            return;
        }
        dklVar.aq().submit(new Runnable() { // from class: com.bytedance.sdk.component.sk.hn.hn.qor.1
            @Override // java.lang.Runnable
            public void run() {
                dklVar.qor(hnVar).hnj(str, bArr);
            }
        });
    }

    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public boolean hnj(com.bytedance.sdk.component.sk.hn.qor.qor qorVar, xn xnVar, com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        com.bytedance.sdk.component.sk.hn hnVarUua = qorVar.uua();
        com.bytedance.sdk.component.sk.hn.qor.dkl dklVarJip = qorVar.jip();
        byte[] bArrHnj = null;
        if (hnVarUua != null && dklVarJip != null) {
            if (hnVarUua.dkl()) {
                if (xnVar != null) {
                    xnVar.hnj("data_cache", qorVar);
                }
                oj ojVarHn = dklVarJip.hn(hnVarUua);
                bArrHnj = ojVarHn != null ? ojVarHn.hnj(qorVar.dse()) : null;
                if (xnVar != null) {
                    xnVar.hn("data_cache", qorVar);
                }
                qorVar.dse();
                qorVar.hnj();
            }
            if (hnVarUua.dse() && bArrHnj == null) {
                if (xnVar != null) {
                    xnVar.hnj("disk_cache", qorVar);
                }
                byte[] bArrHnj2 = hnj(hnVarUua, dklVarJip, qorVar.dse());
                if (bArrHnj2 != null) {
                    hnj(qorVar.uua(), dklVarJip, qorVar.dse(), bArrHnj2);
                }
                if (xnVar != null) {
                    xnVar.hn("disk_cache", qorVar);
                }
                qorVar.dse();
                qorVar.hnj();
                bArrHnj = bArrHnj2;
            }
        }
        if (dklVarJip != null && bArrHnj == null) {
            if (xnVar != null) {
                xnVar.hnj("net_request", qorVar);
            }
            bArrHnj = hnj(dklVarJip, qorVar, hnjVar);
            qorVar.dse();
            qorVar.hnj();
            if (xnVar != null) {
                xnVar.hn("net_request", qorVar);
            }
        }
        if (bArrHnj != null) {
            qorVar.hnj(bArrHnj);
            return true;
        }
        qorVar.dse();
        qorVar.hnj();
        return false;
    }

    @Override // com.bytedance.sdk.component.sk.hn.hn.dkl
    public String hnj() {
        return "data_intercept";
    }

    private byte[] hnj(com.bytedance.sdk.component.sk.hn.qor.dkl dklVar, com.bytedance.sdk.component.sk.hn.qor.qor qorVar, com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar) {
        com.bytedance.sdk.component.sk.gjv gjvVarSk = dklVar.sk();
        qorVar.hnj(false);
        try {
            com.bytedance.sdk.component.sk.dkl dklVarHnj = gjvVarSk.hnj(new com.bytedance.sdk.component.sk.hnj.hn(qorVar.hnj(), false, false, qorVar.oj()));
            if (dklVarHnj == null) {
                hnjVar.hnj(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iHnj = dklVarHnj.hnj();
            if (iHnj == 200) {
                byte[] bArr = (byte[]) dklVarHnj.hn();
                if (bArr == null) {
                    hnjVar.hnj(iHnj, dklVarHnj.qor(), new Exception("net data is empty"));
                    return null;
                }
                hnj(qorVar.uua(), dklVar, qorVar.dse(), bArr);
                hn(qorVar.uua(), dklVar, qorVar.dse(), bArr);
                return bArr;
            }
            Object objHn = dklVarHnj.hn();
            hnjVar.hnj(iHnj, dklVarHnj.qor(), objHn instanceof Throwable ? (Throwable) objHn : null);
            return null;
        } catch (Throwable th2) {
            hnjVar.hnj(1004, "net request failed!", th2);
            return null;
        }
    }

    private byte[] hnj(com.bytedance.sdk.component.sk.hn hnVar, com.bytedance.sdk.component.sk.hn.qor.dkl dklVar, String str) {
        dklVar.qor(hnVar);
        Collection<com.bytedance.sdk.component.sk.qor> collectionGjv = dklVar.gjv();
        if (collectionGjv == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.sk.qor> it = collectionGjv.iterator();
        while (it.hasNext()) {
            byte[] bArrHnj = it.next().hnj(str);
            if (bArrHnj != null) {
                return bArrHnj;
            }
        }
        return null;
    }

    private void hnj(com.bytedance.sdk.component.sk.hn hnVar, com.bytedance.sdk.component.sk.hn.qor.dkl dklVar, String str, byte[] bArr) {
        if (hnVar == null || !hnVar.dkl()) {
            return;
        }
        dklVar.hn(hnVar).hnj(str, bArr);
    }
}
