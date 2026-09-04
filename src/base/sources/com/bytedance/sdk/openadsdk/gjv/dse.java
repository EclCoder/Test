package com.bytedance.sdk.openadsdk.gjv;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14347hn;
    private long hnj;
    private long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f14348sk;

    public void gjv(long j10) {
        if (this.gjv <= 0) {
            this.gjv = j10;
        }
    }

    public void hn(long j10) {
        if (this.f14347hn <= 0) {
            this.f14347hn = j10;
        }
    }

    public void hnj(long j10) {
        if (this.hnj <= 0) {
            this.hnj = j10;
        }
    }

    public void qor(long j10) {
        if (this.qor <= 0) {
            this.qor = j10;
        }
    }

    public void sk(long j10) {
        if (this.f14348sk <= 0) {
            this.f14348sk = j10;
        }
    }

    public JSONObject hn() {
        return hnj((JSONObject) null);
    }

    public boolean hnj() {
        return this.hnj > 0;
    }

    public void hnj(long j10, float f10) {
        if (f10 > 0.0f) {
            hnj(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            hnj(j10);
            hn(j10);
        }
        if (d10 >= 0.5d) {
            hnj(j10);
            hn(j10);
            qor(j10);
        }
        if (d10 >= 0.75d) {
            hnj(j10);
            hn(j10);
            qor(j10);
            gjv(j10);
        }
        if (f10 >= 1.0f) {
            hnj(j10);
            hn(j10);
            qor(j10);
            gjv(j10);
            sk(j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public JSONObject hnj(JSONObject jSONObject) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j10 = this.hnj;
                if (j10 > 0) {
                    jSONObject.put("show_start", j10);
                    j11 = this.f14347hn;
                    if (j11 > 0) {
                        jSONObject.put("show_firstQuartile", j11);
                        j12 = this.qor;
                        if (j12 > 0) {
                            jSONObject.put("show_mid", j12);
                            j13 = this.gjv;
                            if (j13 > 0) {
                                jSONObject.put("show_thirdQuartile", j13);
                                j14 = this.f14348sk;
                                if (j14 > 0) {
                                    jSONObject.put("show_full", j14);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            j10 = this.hnj;
            if (j10 > 0) {
                jSONObject.put("show_start", j10);
                j11 = this.f14347hn;
                if (j11 > 0) {
                    jSONObject.put("show_firstQuartile", j11);
                    j12 = this.qor;
                    if (j12 > 0) {
                        jSONObject.put("show_mid", j12);
                        j13 = this.gjv;
                        if (j13 > 0) {
                            jSONObject.put("show_thirdQuartile", j13);
                            j14 = this.f14348sk;
                            if (j14 > 0) {
                                jSONObject.put("show_full", j14);
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
