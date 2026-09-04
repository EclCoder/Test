package com.bytedance.sdk.openadsdk.core.orl;

import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    protected String aq;
    private as bug;
    protected List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> dkl;
    protected List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> dse;
    protected com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected int f14132hn;
    protected int hnj;
    protected com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected String f14133sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f14134ta;
    private final AtomicBoolean dnm = new AtomicBoolean(false);
    protected String ojm = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.orl.qor$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.values().length];
            hnj = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public qor(int i10, int i11, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar, String str, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list, List<com.bytedance.sdk.openadsdk.core.orl.hn.qor> list2, String str2) {
        this.dkl = new ArrayList();
        this.dse = new ArrayList();
        this.hnj = i10;
        this.f14132hn = i11;
        this.qor = enumC0231hnj;
        this.gjv = hnVar;
        this.f14133sk = str;
        this.dkl = list;
        this.dse = list2;
        this.aq = str2;
    }

    public String gjv() {
        if (this.gjv == com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.STATIC_RESOURCE && this.qor == com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.IMAGE) {
            return this.f14133sk;
        }
        return null;
    }

    public int hn() {
        return this.f14132hn;
    }

    public int hnj() {
        return this.hnj;
    }

    public String qor() {
        int i10 = AnonymousClass1.hnj[this.gjv.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.f14133sk;
            }
            if (i10 != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.hnj + "\" height=\"" + this.f14132hn + "\" src=\"" + this.f14133sk + "\"></iframe>";
        }
        com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj = this.qor;
        if (enumC0231hnj == com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f14133sk + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0231hnj != com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.f14133sk + "\"></script>";
    }

    public String sk() {
        return this.f14133sk;
    }

    public void hn(long j10) {
        if (this.dnm.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn((as) null, this.dse, (com.bytedance.sdk.openadsdk.core.orl.hnj.hnj) null, j10, this.f14134ta, (String) null);
        }
    }

    public void hnj(long j10) {
        com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(null, this.dkl, null, j10, this.f14134ta, new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn(this.ojm, this.bug), null);
    }

    public static float hnj(int i10, int i11, int i12, int i13, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return hnj(hnVar, enumC0231hnj) / ((Math.abs((f10 / i11) - (f11 / i13)) + Math.abs((f10 - f11) / f10)) + 1.0f);
    }

    public static qor hn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONArrayOptJSONArray.optString(i10)).hnj());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(jSONArrayOptJSONArray2.optString(i11)).hnj());
        }
        return new qor(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float hnj(com.bytedance.sdk.openadsdk.core.orl.qor.hnj.hn hnVar, com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj enumC0231hnj) {
        int i10 = AnonymousClass1.hnj[hnVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.JAVASCRIPT.equals(enumC0231hnj)) {
            return 1.0f;
        }
        return com.bytedance.sdk.openadsdk.core.orl.qor.hnj.EnumC0231hnj.IMAGE.equals(enumC0231hnj) ? 0.8f : 0.0f;
    }

    public void hnj(String str) {
        this.f14134ta = str;
    }

    public void hnj(as asVar) {
        this.bug = asVar;
    }
}
