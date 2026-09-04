package com.bytedance.sdk.component.adexpress.dynamic.gjv;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    private float aq;
    private List<List<aq>> bug;
    private float dkl;
    private aq dnm;
    private float dse;
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12560hn;
    private String hnj;
    private boolean mjg;
    private sk ojm;
    private String orl;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private float f12561sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private List<aq> f12562ta;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private Map<String, String> f12559fc = new HashMap();
    private Map<Integer, String> jip = new HashMap();

    public Map<String, String> apu() {
        return this.f12559fc;
    }

    public float aq() {
        return this.dkl;
    }

    public String as() {
        return this.ojm.sk().as();
    }

    public aq bug() {
        return this.dnm;
    }

    public float dkl() {
        return this.f12560hn;
    }

    public List<aq> dnm() {
        return this.f12562ta;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public boolean m4do() {
        return this.ojm.sk().lko() < 0 || this.ojm.sk().meb() < 0 || this.ojm.sk().znr() < 0 || this.ojm.sk().rq() < 0;
    }

    public float dse() {
        return this.qor;
    }

    public void eum() {
        List<List<aq>> list = this.bug;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<aq> list2 : this.bug) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.bug = arrayList;
    }

    public float fc() {
        dkl dklVarSk = this.ojm.sk();
        return orl() + dklVarSk.fc() + dklVarSk.jip() + (dklVarSk.bug() * 2.0f);
    }

    public float gjv() {
        return this.gjv;
    }

    public Map<Integer, String> hn() {
        return this.jip;
    }

    public String hnj() {
        return this.orl;
    }

    public float jip() {
        dkl dklVarSk = this.ojm.sk();
        return mjg() + dklVarSk.uua() + dklVarSk.mjg() + (dklVarSk.bug() * 2.0f);
    }

    public int mjg() {
        dkl dklVarSk = this.ojm.sk();
        return dklVarSk.pnz() + dklVarSk.pv();
    }

    public boolean oj() {
        List<aq> list = this.f12562ta;
        return list == null || list.size() <= 0;
    }

    public float ojm() {
        return this.dse;
    }

    public int orl() {
        dkl dklVarSk = this.ojm.sk();
        return dklVarSk.xo() + dklVarSk.lu();
    }

    public String qor() {
        return this.hnj;
    }

    public float sk() {
        return this.f12561sk;
    }

    public sk ta() {
        return this.ojm;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.hnj + "', x=" + this.f12560hn + ", y=" + this.qor + ", width=" + this.dkl + ", height=" + this.dse + ", remainWidth=" + this.aq + ", rootBrick=" + this.ojm + ", childrenBrickUnits=" + this.f12562ta + '}';
    }

    public List<List<aq>> uua() {
        return this.bug;
    }

    public boolean wu() {
        return TextUtils.equals(this.ojm.sk().vf(), "flex");
    }

    public boolean xn() {
        return this.mjg;
    }

    public void dkl(float f10) {
        this.dse = f10;
    }

    public void dse(float f10) {
        this.aq = f10;
    }

    public void gjv(float f10) {
        this.qor = f10;
    }

    public void hn(String str) {
        this.hnj = str;
    }

    public void hnj(String str) {
        this.orl = str;
    }

    public void qor(float f10) {
        this.f12560hn = f10;
    }

    public void sk(float f10) {
        this.dkl = f10;
    }

    public void hn(float f10) {
        this.f12561sk = f10;
    }

    public void hnj(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    this.jip.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void qor(String str) {
        this.ojm.sk().dkl(str);
    }

    public void hn(List<List<aq>> list) {
        this.bug = list;
    }

    public void hnj(float f10) {
        this.gjv = f10;
    }

    public void hnj(sk skVar) {
        this.ojm = skVar;
    }

    public void hnj(List<aq> list) {
        this.f12562ta = list;
    }

    public void hnj(aq aqVar) {
        this.dnm = aqVar;
    }

    public void hnj(boolean z10) {
        this.mjg = z10;
    }

    public void hnj(String str, String str2) {
        this.f12559fc.put(str, str2);
    }

    public String hnj(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.ojm.hn());
        sb2.append(":");
        sb2.append(this.hnj);
        if (this.ojm.sk() != null) {
            sb2.append(":");
            sb2.append(this.ojm.sk().pwt());
        }
        sb2.append(":");
        sb2.append(i10);
        return sb2.toString();
    }
}
