package com.bytedance.adsdk.hnj.hn;

import com.bytedance.adsdk.hnj.hn.qor.hnj.aq;
import com.bytedance.adsdk.hnj.hn.qor.hnj.dkl;
import com.bytedance.adsdk.hnj.hn.qor.hnj.dse;
import com.bytedance.adsdk.hnj.hn.qor.hnj.gjv;
import com.bytedance.adsdk.hnj.hn.qor.hnj.hn;
import com.bytedance.adsdk.hnj.hn.qor.hnj.ojm;
import com.bytedance.adsdk.hnj.hn.qor.hnj.qor;
import com.bytedance.adsdk.hnj.hn.qor.hnj.sk;
import com.bytedance.adsdk.hnj.hn.qor.hnj.ta;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static final com.bytedance.adsdk.hnj.hn.qor.hnj hnj;
    private Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> gjv = new LinkedList();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.hnj.hn.qor.hnj f12158hn;
    private com.bytedance.adsdk.hnj.hn.hn.hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f12159sk;

    static {
        int i10 = 8;
        dkl[] dklVarArr = {new ta(), new gjv(), new ojm(), new hn(), new sk(), new com.bytedance.adsdk.hnj.hn.qor.hnj.hnj(), new dse(), new qor(), new aq()};
        final com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar = new com.bytedance.adsdk.hnj.hn.qor.hnj() { // from class: com.bytedance.adsdk.hnj.hn.hnj.1
            @Override // com.bytedance.adsdk.hnj.hn.qor.hnj
            public int hnj(String str, int i11, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final dkl dklVar = dklVarArr[i10];
            i10--;
            hnjVar = new com.bytedance.adsdk.hnj.hn.qor.hnj() { // from class: com.bytedance.adsdk.hnj.hn.hnj.2
                @Override // com.bytedance.adsdk.hnj.hn.qor.hnj
                public int hnj(String str, int i11, Deque<com.bytedance.adsdk.hnj.hn.hn.hnj> deque) {
                    return dklVar.hnj(str, i11, deque, hnjVar);
                }
            };
        }
        hnj = hnjVar;
    }

    private hnj(String str, com.bytedance.adsdk.hnj.hn.qor.hnj hnjVar) {
        this.f12158hn = hnjVar;
        this.f12159sk = str;
        try {
            hnj();
        } catch (Exception e10) {
            throw new com.bytedance.adsdk.hnj.hnj.hn(str, e10);
        }
    }

    public static hnj hnj(String str) {
        return new hnj(str, hnj);
    }

    private void hnj() {
        int length = this.f12159sk.length();
        int i10 = 0;
        while (i10 < length) {
            int iHnj = this.f12158hn.hnj(this.f12159sk, i10, this.gjv);
            if (iHnj == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.f12159sk.substring(0, i10));
            }
            i10 = iHnj;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.hnj.hn.hn.hnj hnjVarPollFirst = this.gjv.pollFirst();
            if (hnjVarPollFirst == null) {
                this.qor = com.bytedance.adsdk.hnj.hn.sk.hn.hnj(arrayList, this.f12159sk, i10);
                this.gjv = null;
                return;
            }
            arrayList.add(0, hnjVarPollFirst);
        }
    }

    public <T> T hnj(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) hnj(map);
    }

    public <T> T hnj(Map<String, JSONObject> map) {
        return (T) this.qor.hnj(map);
    }
}
