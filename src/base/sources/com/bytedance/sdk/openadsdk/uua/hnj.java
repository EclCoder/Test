package com.bytedance.sdk.openadsdk.uua;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements Comparable<hnj> {
    private int dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f14729hn;
    private long mjg;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f14730sk;
    private final ArrayList<Long> hnj = new ArrayList<>();
    private final ArrayList<Long> gjv = new ArrayList<>();
    private final ArrayList<Long> dkl = new ArrayList<>();
    private final ArrayList<Long> aq = new ArrayList<>();
    private final HashMap<String, hn> ojm = new HashMap<>();

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f14731ta = 0;
    private int dnm = 0;
    private final HashMap<String, hn> bug = new HashMap<>();
    private int orl = 0;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final ArrayList<String> f14728fc = new ArrayList<>();

    public hnj(String str) {
        this.f14729hn = str;
    }

    private void hn(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrBug = com.bytedance.sdk.openadsdk.dkl.hnj.hnj().bug();
        if (iArrBug != null) {
            int i13 = 0;
            while (i13 < iArrBug.length) {
                int i14 = iArrBug[i13];
                long j10 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                long j11 = jElapsedRealtime - (((long) i14) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Iterator<String> it = this.bug.keySet().iterator();
                long j12 = 0;
                while (it.hasNext()) {
                    long j13 = j10;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    hn hnVar = this.bug.get(next);
                    if (hnVar != null) {
                        long jHnj = hnVar.hnj(j11, jElapsedRealtime);
                        j12 += jHnj;
                        if (jHnj <= 0 && i13 == iArrBug.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j10 = j13;
                }
                if (j12 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j12);
                    iArr = iArrBug;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14)))) + j12;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), jOptInt);
                    }
                } else {
                    iArr = iArrBug;
                }
                i13++;
                iArrBug = iArr;
            }
        }
        int[] iArrOrl = com.bytedance.sdk.openadsdk.dkl.hnj.hnj().orl();
        if (iArrOrl != null) {
            int i15 = 0;
            while (i15 < iArrOrl.length) {
                int i16 = iArrOrl[i15];
                long j14 = jElapsedRealtime - (((long) i16) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                long j15 = 0;
                int i17 = 0;
                for (String str : this.ojm.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i18 = i16;
                    hn hnVar2 = this.ojm.get(str);
                    if (hnVar2 != null) {
                        long jHnj2 = hnVar2.hnj(j14, jElapsedRealtime);
                        j15 += jHnj2;
                        if (jHnj2 > 20000) {
                            i17++;
                        }
                        if (jHnj2 <= 0 && i15 == iArrOrl.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i16 = i18;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i19 = i16;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i19)), j15);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i19)))) + j15;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i19)), jOptInt2);
                    }
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i19)), i17);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i19))) + i17;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i19)), iOptInt);
                    }
                }
                i15++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.bug.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.ojm.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().fc() && (i12 = this.f14731ta) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.f14731ta;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().mjg() && (i11 = this.orl) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.orl;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.dkl.hnj.hnj().uua() || (i10 = this.dnm) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.dnm;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void hnj(String str, String str2) {
        hn hnVar;
        hn hnVar2;
        hn hnVar3;
        hn hnVar4;
        hn hnVar5;
        hn hnVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (hnVar = this.bug.get(str2)) != null) {
                    hnVar.gjv(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (hnVar2 = this.bug.get(str2)) != null) {
                    hnVar2.qor(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.bug.get(str2) == null) {
                    hn hnVar7 = new hn();
                    this.bug.put(str2, hnVar7);
                    hnVar7.hnj(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (hnVar3 = this.ojm.get(str2)) != null && hnVar3.hnj() != hn.f14726sk) {
                    hnVar3.hn(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().fc()) {
                        this.f14731ta = (int) (((long) this.f14731ta) + hnVar3.hnj(this.mjg, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "feed_play":
                this.dkl.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().aq()) {
                    this.dse++;
                }
                if (!TextUtils.isEmpty(str2) && this.ojm.get(str2) == null) {
                    hn hnVar8 = new hn();
                    this.ojm.put(str2, hnVar8);
                    hnVar8.hnj(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.hnj.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().dkl()) {
                    this.qor++;
                    break;
                }
                break;
            case "click":
                if (!this.f14728fc.contains(str2)) {
                    if (this.f14728fc.size() > 50) {
                        this.f14728fc.subList(0, 25).clear();
                    }
                    this.f14728fc.add(str2);
                    this.gjv.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().dse()) {
                        this.f14730sk++;
                    }
                    break;
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (hnVar4 = this.ojm.get(str2)) != null) {
                    hnVar4.gjv(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (hnVar5 = this.ojm.get(str2)) != null) {
                    hnVar5.qor(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (hnVar6 = this.bug.get(str2)) != null && hnVar6.hnj() != hn.f14726sk) {
                    hnVar6.hn(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().mjg()) {
                        this.orl = (int) (((long) this.orl) + hnVar6.hnj(this.mjg, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().uua()) {
                    this.dnm++;
                    break;
                }
                break;
            case "dislike":
                this.aq.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public String hn() {
        return this.f14729hn;
    }

    public JSONObject hnj(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            hnj(jSONObject2, jSONObject);
            hn(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th2) {
            apu.qor(th2.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    private void hnj(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (((long) i11) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void hnj(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        hnj("show_c_", jSONObject, this.hnj, com.bytedance.sdk.openadsdk.dkl.hnj.hnj().ojm(), jElapsedRealtime, jSONObject2);
        hnj("click_c_", jSONObject, this.gjv, com.bytedance.sdk.openadsdk.dkl.hnj.hnj().ta(), jElapsedRealtime, jSONObject2);
        hnj("v_play_c_", jSONObject, this.dkl, com.bytedance.sdk.openadsdk.dkl.hnj.hnj().dnm(), jElapsedRealtime, jSONObject2);
        hnj("dislike_c_", jSONObject, this.aq, com.bytedance.sdk.openadsdk.dkl.hnj.hnj().jip(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().dkl() && (i12 = this.qor) != 0) {
            jSONObject.put("show_c_s", i12);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.qor;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.dkl.hnj.hnj().dse() && (i11 = this.f14730sk) != 0) {
            jSONObject.put("click_c_s", i11);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.f14730sk;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.dkl.hnj.hnj().aq() || (i10 = this.dse) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.dse;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void hnj() {
        this.mjg = SystemClock.elapsedRealtime();
        this.dnm = 0;
        this.f14730sk = 0;
        this.qor = 0;
        this.orl = 0;
        this.f14731ta = 0;
        this.dse = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public int compareTo(hnj hnjVar) {
        return hnjVar.qor - this.qor;
    }
}
