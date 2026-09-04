package com.bytedance.sdk.openadsdk.core.orl.hn;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends qor implements Comparable<hnj> {
    public long hnj;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.orl.hn.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0229hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final long f14111hn;
        private final String hnj;
        private qor.EnumC0230qor qor = qor.EnumC0230qor.TRACKING_URL;

        public C0229hnj(String str, long j10) {
            this.hnj = str;
            this.f14111hn = j10;
        }

        public hnj hnj() {
            return new hnj(this.f14111hn, this.hnj, this.qor, Boolean.FALSE);
        }
    }

    protected hnj(long j10, String str, qor.EnumC0230qor enumC0230qor, Boolean bool) {
        super(str, enumC0230qor, bool);
        this.hnj = j10;
    }

    public long hnj() {
        return this.hnj;
    }

    public String toString() {
        return super.toString();
    }

    public static int hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * 3600000) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean hnj(long j10) {
        return this.hnj <= j10 && !gjv();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public int compareTo(hnj hnjVar) {
        if (hnjVar == null) {
            return 1;
        }
        long j10 = this.hnj;
        long j11 = hnjVar.hnj;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }
}
