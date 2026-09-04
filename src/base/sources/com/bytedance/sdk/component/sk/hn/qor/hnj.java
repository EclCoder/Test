package com.bytedance.sdk.component.sk.hn.qor;

import com.bytedance.sdk.component.sk.dnm;
import com.bytedance.sdk.component.sk.jip;
import com.bytedance.sdk.component.sk.xn;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj<T> {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private xn f12958hn;
    private qor hnj;

    public hnj(qor qorVar, xn xnVar) {
        this.hnj = qorVar;
        this.f12958hn = xnVar;
    }

    public void hnj(dnm<T> dnmVar) {
        try {
            xn xnVar = this.f12958hn;
            if (xnVar != null) {
                xnVar.hnj("success", this.hnj);
            }
            String strXn = this.hnj.xn();
            Map<String, List<qor>> mapOjm = this.hnj.jip().ojm();
            List<qor> list = mapOjm.get(strXn);
            if (list == null) {
                jip jipVarDkl = this.hnj.dkl();
                if (jipVarDkl != null) {
                    jipVarDkl.toString();
                    this.hnj.aq();
                    jipVarDkl.hnj(dnmVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (qor qorVar : list) {
                            jip jipVarDkl2 = qorVar.dkl();
                            if (jipVarDkl2 != null) {
                                jipVarDkl2.toString();
                                qorVar.aq();
                                jipVarDkl2.hnj(dnmVar);
                            }
                        }
                        list.clear();
                        mapOjm.remove(strXn);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            xn xnVar2 = this.f12958hn;
            if (xnVar2 != null) {
                xnVar2.hn("success", this.hnj);
            }
        } catch (Throwable unused) {
        }
    }

    public void hnj(int i10, String str, Throwable th2) {
        try {
            xn xnVar = this.f12958hn;
            if (xnVar != null) {
                xnVar.hnj("failed", this.hnj);
            }
            String strXn = this.hnj.xn();
            Map<String, List<qor>> mapOjm = this.hnj.jip().ojm();
            List<qor> list = mapOjm.get(strXn);
            if (list == null) {
                jip jipVarDkl = this.hnj.dkl();
                if (jipVarDkl != null) {
                    jipVarDkl.hnj(i10, str, th2);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<qor> it = list.iterator();
                        while (it.hasNext()) {
                            jip jipVarDkl2 = it.next().dkl();
                            if (jipVarDkl2 != null) {
                                jipVarDkl2.toString();
                                jipVarDkl2.hnj(i10, str, th2);
                            }
                        }
                        list.clear();
                        mapOjm.remove(strXn);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            xn xnVar2 = this.f12958hn;
            if (xnVar2 != null) {
                xnVar2.hn("failed", this.hnj);
            }
        } catch (Throwable unused) {
        }
    }
}
