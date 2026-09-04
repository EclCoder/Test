package com.apm.insight;

import android.text.TextUtils;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOOMCallback f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICrashCallback f10501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10502c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f10502c = str;
        this.f10501b = iCrashCallback;
    }

    public final void a(CrashType crashType, Throwable th2, Thread thread, long j10, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th3;
        Thread thread2;
        long j11;
        if (this.f10500a == null || jSONArray == null) {
            return;
        }
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", "aid"), this.f10502c)) {
                crashType2 = crashType;
                th3 = th2;
                thread2 = thread;
                j11 = j10;
                this.f10500a.onCrash(crashType2, th3, thread2, j11);
            } else {
                crashType2 = crashType;
                th3 = th2;
                thread2 = thread;
                j11 = j10;
            }
            i10++;
            crashType = crashType2;
            th2 = th3;
            thread = thread2;
            j10 = j11;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(CrashType crashType, Throwable th2, Thread thread, long j10) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f10502c = str;
        this.f10500a = iOOMCallback;
    }

    public final void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.f10501b == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", "aid"), this.f10502c)) {
                this.f10501b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(CrashType crashType, String str, String str2, String str3) {
        d dVarA;
        if (this.f10501b == null || (dVarA = d.a(this.f10502c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f10501b.onCrash(crashType, str, null);
    }
}
