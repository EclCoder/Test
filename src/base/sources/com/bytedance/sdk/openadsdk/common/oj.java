package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj {

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static volatile oj f13308sk;
    private final Map<String, List<com.bytedance.sdk.openadsdk.component.sk.hn>> hnj = new ConcurrentHashMap();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Map<String, List<String>> f13309hn = new ConcurrentHashMap();
    private final Map<String, AdSlot> qor = new ConcurrentHashMap();
    private final Object gjv = new Object();
    private final Runnable dkl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.oj.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(2);
            com.bytedance.sdk.component.dkl.hnj.dse.hnj.hnj().postDelayed(oj.this.dkl, com.bytedance.sdk.openadsdk.component.dse.hnj.ta());
        }
    };

    private oj() {
    }

    private com.bytedance.sdk.openadsdk.component.sk.hn hn(as asVar, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        if (asVar == null || asVar.aip() == null || hnjVar == null) {
            return null;
        }
        String codeId = asVar.aip().getCodeId();
        String strJp = asVar.jp();
        return new com.bytedance.sdk.openadsdk.component.sk.hn(codeId, hnjVar.dnm(), asVar.jpm(), System.currentTimeMillis(), asVar.ud(), strJp);
    }

    public void gjv() {
        com.bytedance.sdk.component.dkl.hnj.dse.hnj.hnj().postDelayed(this.dkl, com.bytedance.sdk.openadsdk.component.dse.hnj.ta());
    }

    public Map<String, AdSlot> qor() {
        return this.qor;
    }

    public static oj hnj() {
        if (f13308sk == null) {
            synchronized (oj.class) {
                try {
                    if (f13308sk == null) {
                        f13308sk = new oj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f13308sk;
    }

    private List<com.bytedance.sdk.openadsdk.component.sk.hn> hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strHn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), (String) null);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strHn)) {
            try {
                JSONArray jSONArray = new JSONArray(strHn);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(com.bytedance.sdk.openadsdk.component.sk.hn.hnj(jSONArray.getJSONObject(i10)));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public void hn() {
        try {
            synchronized (this.gjv) {
                this.hnj.clear();
                this.f13309hn.clear();
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_material_cache_origin");
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_material_cache_encrypt");
            }
        } catch (Exception unused) {
        }
    }

    private void hn(String str) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)));
    }

    private void hn(AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        if (this.qor.size() < com.bytedance.sdk.openadsdk.component.dse.hnj.bug() && !this.qor.containsKey(codeId)) {
            this.qor.put(codeId, adSlot);
            Objects.toString(this.qor.keySet());
        }
    }

    private void hnj(String str, List<com.bytedance.sdk.openadsdk.component.sk.hn> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.component.sk.hn hnVar : list) {
            if (hnVar != null) {
                try {
                    jSONArray.put(hnVar.hnj());
                } catch (Exception unused) {
                }
            }
        }
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), jSONArray.toString());
    }

    public void hnj(as asVar, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        AdSlot adSlotAip;
        if (asVar == null || hnjVar == null || (adSlotAip = asVar.aip()) == null || asVar.era() || !TextUtils.isEmpty(adSlotAip.getBidAdm()) || asVar.sgl() == 2) {
            return;
        }
        String codeId = adSlotAip.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        synchronized (this.gjv) {
            try {
                int iBug = com.bytedance.sdk.openadsdk.component.dse.hnj.bug();
                if (!this.hnj.containsKey(codeId) && this.hnj.size() >= iBug) {
                    this.hnj.size();
                    return;
                }
                com.bytedance.sdk.openadsdk.component.sk.hn hnVarHn = hn(asVar, hnjVar);
                List<com.bytedance.sdk.openadsdk.component.sk.hn> arrayList = this.hnj.get(codeId);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                hnj(arrayList);
                int iAq = com.bytedance.sdk.openadsdk.component.dse.hnj.aq();
                if (arrayList.size() < iAq) {
                    arrayList.size();
                    com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(asVar, arrayList.size(), adSlotAip.getCacheScene(), false);
                    arrayList.add(hnVarHn);
                    this.hnj.put(codeId, arrayList);
                    hnj(adSlotAip, asVar.jp());
                    hnj(codeId, arrayList);
                    return;
                }
                if (hnj(arrayList, adSlotAip) && arrayList.size() < iAq) {
                    arrayList.add(hnVarHn);
                    hnj(codeId, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean hnj(String str, int i10, int i11) {
        boolean z10 = true;
        if (!com.bytedance.sdk.openadsdk.component.dse.hnj.sk()) {
            return i11 <= 0;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iAq = com.bytedance.sdk.openadsdk.component.dse.hnj.aq();
        synchronized (this.gjv) {
            try {
                List<com.bytedance.sdk.openadsdk.component.sk.hn> list = this.hnj.get(str);
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jOjm = com.bytedance.sdk.openadsdk.component.dse.hnj.ojm();
                    for (com.bytedance.sdk.openadsdk.component.sk.hn hnVar : list) {
                        if (hnVar != null && (jCurrentTimeMillis / 1000 > hnVar.qor() || jCurrentTimeMillis - hnVar.gjv() > jOjm)) {
                            size--;
                        }
                    }
                    if (i10 + size >= iAq) {
                        z10 = false;
                    }
                    list.size();
                    return z10;
                }
                if (i10 >= iAq) {
                    z10 = false;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.bytedance.sdk.openadsdk.component.sk.hn hnj(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return null;
        }
        synchronized (this.gjv) {
            try {
                hnj(codeId, adSlot);
                List<com.bytedance.sdk.openadsdk.component.sk.hn> list = this.hnj.get(codeId);
                List<String> list2 = this.f13309hn.get(codeId);
                if (list != null && !list.isEmpty()) {
                    boolean zHnj = hnj(list);
                    if (list.isEmpty()) {
                        list.size();
                        hnj(codeId, (String) null);
                        return null;
                    }
                    if (zHnj) {
                        hnj(codeId, list);
                    }
                    List<com.bytedance.sdk.openadsdk.component.sk.hn> listHnj = hnj(list, adSlot, list2);
                    if (listHnj != null && !listHnj.isEmpty()) {
                        Collections.sort(listHnj, com.bytedance.sdk.openadsdk.component.sk.hn.hnj);
                        com.bytedance.sdk.openadsdk.component.sk.hn hnVar = listHnj.get(0);
                        if (com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(adSlot) && list2 != null) {
                            if (list2.size() >= list.size()) {
                                return null;
                            }
                            list2.add(hnVar.dkl());
                        }
                        return hnVar;
                    }
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void hnj(AdSlot adSlot, String str) {
        if (adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        boolean z10 = adSlot.getCacheScene() != 0;
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId) || z10 || !com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(adSlot)) {
            return;
        }
        List<String> arrayList = this.f13309hn.get(codeId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        this.f13309hn.put(codeId, arrayList);
    }

    private void hnj(String str, AdSlot adSlot) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iBug = com.bytedance.sdk.openadsdk.component.dse.hnj.bug();
        if (!this.hnj.containsKey(str) && this.hnj.size() >= iBug) {
            this.hnj.size();
            return;
        }
        List<com.bytedance.sdk.openadsdk.component.sk.hn> list = this.hnj.get(str);
        if (list == null || list.isEmpty()) {
            List<com.bytedance.sdk.openadsdk.component.sk.hn> listHnj = hnj(str);
            if (listHnj == null) {
                listHnj = new ArrayList<>();
            }
            this.hnj.put(str, listHnj);
        }
        if (!this.f13309hn.containsKey(str)) {
            this.f13309hn.put(str, new ArrayList());
        }
        hn(adSlot);
    }

    private boolean hnj(List<com.bytedance.sdk.openadsdk.component.sk.hn> list) {
        boolean z10 = false;
        if (list != null && !list.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<com.bytedance.sdk.openadsdk.component.sk.hn> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.sk.hn next = it.next();
                if (next != null && jCurrentTimeMillis > next.qor()) {
                    com.bytedance.sdk.openadsdk.component.dkl.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()).hnj(next.hn());
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    private boolean hnj(List<com.bytedance.sdk.openadsdk.component.sk.hn> list, AdSlot adSlot) {
        if (list != null && !list.isEmpty() && adSlot != null) {
            long jOjm = com.bytedance.sdk.openadsdk.component.dse.hnj.ojm();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<com.bytedance.sdk.openadsdk.component.sk.hn> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.sk.hn next = it.next();
                if (next != null && jCurrentTimeMillis - next.gjv() > jOjm) {
                    it.remove();
                    com.bytedance.sdk.openadsdk.component.gjv.hnj.hnj(next.hn(), list.size(), adSlot.getCacheScene(), true);
                    return true;
                }
            }
        }
        return false;
    }

    private List<com.bytedance.sdk.openadsdk.component.sk.hn> hnj(List<com.bytedance.sdk.openadsdk.component.sk.hn> list, AdSlot adSlot, List<String> list2) {
        if (adSlot == null || list == null || list.isEmpty() || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.component.sk.hn hnVar : list) {
            if (hnVar != null) {
                if (com.bytedance.sdk.openadsdk.component.dse.hnj.hnj(adSlot) && list2.contains(hnVar.dkl())) {
                    adSlot.getCodeId();
                    hnVar.dkl();
                } else {
                    arrayList.add(hnVar);
                }
            }
        }
        return arrayList;
    }

    public void hnj(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.gjv) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.hnj.remove(str);
                    hn(str);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.component.sk.hn> list = this.hnj.get(str);
                if (list != null && !list.isEmpty()) {
                    Iterator<com.bytedance.sdk.openadsdk.component.sk.hn> it = list.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.openadsdk.component.sk.hn next = it.next();
                        if (next != null && str2.equals(next.dkl())) {
                            list.size();
                            it.remove();
                        }
                    }
                    if (list.isEmpty()) {
                        list.size();
                        this.hnj.remove(str);
                        hn(str);
                    } else if (list.size() < com.bytedance.sdk.openadsdk.component.dse.hnj.aq()) {
                        list.size();
                        hnj(str, list);
                    }
                    List<String> list2 = this.f13309hn.get(str);
                    if (list2 != null && !list2.isEmpty()) {
                        if (TextUtils.isEmpty(str2)) {
                            this.f13309hn.remove(str);
                        } else {
                            list2.remove(str2);
                            if (list2.isEmpty()) {
                                this.f13309hn.remove(str);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
