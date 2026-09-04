package com.bytedance.sdk.openadsdk.qor;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    private String bug;
    private String dnm;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f14601fc;
    private int jip;
    private as mjg;
    private JSONObject orl;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f14602ta;
    private FilterWord uua;
    public static FilterWord hnj = new FilterWord("", "");

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static int f14599hn = 1;
    public static int qor = 2;
    public static int gjv = 3;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public static int f14600sk = 4;
    private final Set<qor> dkl = new HashSet();
    private final Set<hn> dse = new HashSet();
    private final Set<gjv> aq = new HashSet();
    private final Set<hnj> ojm = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface gjv {
        void hnj(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hnj(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(List<FilterWord> list);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface qor {
        void hnj(FilterWord filterWord);
    }

    private void ta() {
        Iterator<qor> it = this.dkl.iterator();
        while (it.hasNext()) {
            it.next().hnj(this.uua);
        }
    }

    public int aq() {
        return this.f14601fc;
    }

    public void dkl() {
        Iterator<hn> it = this.dse.iterator();
        while (it.hasNext()) {
            it.next().hnj(f14600sk);
        }
    }

    public String dse() {
        return this.bug;
    }

    public void gjv() {
        as asVar;
        if (!qor() && !TextUtils.isEmpty(this.bug)) {
            this.uua = new FilterWord("0:00", this.bug);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.uua);
        if (!TextUtils.isEmpty(this.f14602ta)) {
            if (TextUtils.isEmpty(this.bug)) {
                com.bytedance.sdk.openadsdk.qor.hn.hnj().hnj(this.f14602ta, arrayList, this.dnm);
            } else {
                if (this.orl == null && (asVar = this.mjg) != null) {
                    this.orl = asVar.orl(true);
                }
                com.bytedance.sdk.openadsdk.qor.hn.hnj().hnj(this.f14602ta, arrayList, this.orl, this.bug, this.dnm);
            }
        }
        Iterator<hn> it = this.dse.iterator();
        while (it.hasNext()) {
            it.next().hnj(f14599hn);
        }
        hnj(hnj);
        qor("");
    }

    public void hn(String str) {
        this.dnm = str;
    }

    public void hnj() {
        this.dkl.clear();
        this.dse.clear();
        this.aq.clear();
        this.ojm.clear();
    }

    public boolean ojm() {
        return this.f14601fc < this.jip;
    }

    public boolean qor() {
        FilterWord filterWord = this.uua;
        return (filterWord == null || filterWord.equals(hnj)) ? false : true;
    }

    public void sk() {
        Iterator<hn> it = this.dse.iterator();
        while (it.hasNext()) {
            it.next().hnj(qor);
        }
    }

    public FilterWord hn() {
        return this.uua;
    }

    public void qor(String str) {
        this.bug = str;
        Iterator<gjv> it = this.aq.iterator();
        while (it.hasNext()) {
            it.next().hnj(this.bug);
        }
    }

    public void hnj(String str) {
        this.f14602ta = str;
    }

    public void hnj(FilterWord filterWord) {
        this.uua = filterWord;
        ta();
    }

    public void hnj(qor qorVar) {
        this.dkl.add(qorVar);
    }

    public void hnj(hn hnVar) {
        this.dse.add(hnVar);
    }

    public void hnj(gjv gjvVar) {
        this.aq.add(gjvVar);
    }

    public void hnj(hnj hnjVar) {
        this.ojm.add(hnjVar);
    }

    public void hnj(List<FilterWord> list) {
        Iterator<hnj> it = this.ojm.iterator();
        while (it.hasNext()) {
            it.next().hnj(list);
        }
    }

    public void hnj(as asVar) {
        this.mjg = asVar;
    }

    public void hnj(int i10, int i11) {
        this.f14601fc = i10;
        this.jip = i11;
    }
}
