package com.bytedance.sdk.component.dkl.hnj.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.component.dkl.hnj.dse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final qor f12811hn;
    private final gjv hnj;
    private final Queue<String> qor;

    public hn() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.qor = concurrentLinkedQueue;
        this.hnj = new dkl(concurrentLinkedQueue);
        this.f12811hn = new qor();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public synchronized void hnj(com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar, int i10) {
        gjv gjvVar;
        if (i10 != 5) {
            try {
                if (dse.dkl().fc().hnj(dse.dkl().sk()) && (gjvVar = this.hnj) != null && hnjVar != null) {
                    gjvVar.hnj(hnjVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        qor qorVar = this.f12811hn;
        if (qorVar != null && hnjVar != null) {
            qorVar.hnj(hnjVar, i10);
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public synchronized void hnj(int i10, List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        try {
            Iterator<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> it = list.iterator();
            while (it.hasNext()) {
                this.qor.remove(it.next().qor());
            }
            gjv gjvVar = this.hnj;
            if (gjvVar != null) {
                gjvVar.hnj(i10, list);
            }
            qor qorVar = this.f12811hn;
            if (qorVar != null) {
                qorVar.hnj(i10, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public synchronized List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hnj(int i10, int i11, List<String> list) {
        List list2;
        try {
            List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj = this.hnj.hnj(i10, i11, list);
            int i12 = 0;
            if (listHnj != null && listHnj.size() != 0) {
                listHnj.size();
                if (i10 == 1 || i10 == 2) {
                    list2 = listHnj;
                    List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHn = this.f12811hn.hn((com.bytedance.sdk.component.dkl.hnj.gjv.hnj) listHnj.get(0), listHnj.size());
                    list2 = listHnj;
                    if (listHn != null && listHn.size() != 0) {
                        list2 = listHnj;
                        listHn.size();
                        HashMap map = new HashMap();
                        for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar : listHn) {
                            map.put(hnjVar.qor(), hnjVar);
                        }
                        ArrayList arrayList = new ArrayList(this.qor);
                        for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar2 : listHn) {
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                if (TextUtils.equals(hnjVar2.qor(), (String) obj)) {
                                    map.remove(hnjVar2.qor());
                                    break;
                                }
                            }
                        }
                        for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar3 : listHnj) {
                            map.put(hnjVar3.qor(), hnjVar3);
                        }
                        listHnj.clear();
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext()) {
                            listHnj.add(map.get((String) it.next()));
                        }
                        listHn.clear();
                        list2 = listHnj;
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList(this.qor);
                if (list != null && !list.isEmpty()) {
                    arrayList2.addAll(list);
                }
                List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> listHnj2 = this.f12811hn.hnj(i10, i11, arrayList2);
                if (listHnj2 != null && listHnj2.size() != 0) {
                    HashMap map2 = new HashMap();
                    for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar4 : listHnj2) {
                        map2.put(hnjVar4.qor(), hnjVar4);
                    }
                    arrayList2.size();
                    if (arrayList2.size() != 0) {
                        int size2 = arrayList2.size();
                        while (i12 < size2) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            String str = (String) obj2;
                            if (map2.get(str) != null) {
                                map2.remove(str);
                            }
                        }
                    }
                    listHnj2.clear();
                    Iterator it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        listHnj2.add(map2.get((String) it2.next()));
                    }
                }
                list2 = listHnj2;
            }
            if (list2 != null && !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    this.qor.offer(((com.bytedance.sdk.component.dkl.hnj.gjv.hnj) it3.next()).qor());
                }
                return list2;
            }
            return new ArrayList();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public synchronized boolean hnj(int i10, boolean z10) {
        if (this.hnj.hnj(i10, z10)) {
            com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.pty(), 1);
            return true;
        }
        if ((i10 != 1 && i10 != 2) || !this.f12811hn.hnj(i10, z10)) {
            return false;
        }
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.gm(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.gjv
    public void hnj(int i10, long j10) {
        this.f12811hn.hnj(i10, j10);
        this.hnj.hnj(i10, j10);
    }
}
