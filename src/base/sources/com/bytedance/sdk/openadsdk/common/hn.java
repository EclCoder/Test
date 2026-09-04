package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private final Map<as, Long> dkl = Collections.synchronizedMap(new HashMap());
    private final hnj gjv;
    private final Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f13295sk;
    private static final HashMap<String, hn> hnj = new HashMap<>();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final HashMap<String, hnj> f13294hn = new HashMap<>();

    private hn(Context context, String str) {
        this.qor = context;
        hnj hnjVar = f13294hn.get(str);
        this.gjv = hnjVar == null ? new hnj(str) : hnjVar;
        this.f13295sk = str;
    }

    public boolean gjv(String str) {
        return this.gjv.dse(str);
    }

    public String hn(String str) {
        try {
            String strHn = this.gjv.hn(str);
            if (TextUtils.isEmpty(strHn)) {
                return null;
            }
            return strHn;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void qor(String str) {
        this.gjv.dkl(str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        protected final String hnj;
        private final HashSet<String> dse = new HashSet<>();

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        String f13296hn = "material_data";
        String qor = "has_played";
        String gjv = "create_time";

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        String f13297sk = "in_use_process";
        String dkl = "req_id";

        public hnj(String str) {
            this.hnj = TextUtils.isEmpty(str) ? "" : str;
        }

        public void aq(String str) {
            try {
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(hnj(str));
                this.dse.remove(str);
            } catch (Throwable unused) {
            }
        }

        public void dkl(String str) {
            try {
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(hnj(str), this.f13297sk, com.bytedance.sdk.component.utils.eum.hn(com.bytedance.sdk.openadsdk.core.oj.hnj()));
                this.dse.add(str);
            } catch (Throwable unused) {
            }
        }

        public boolean dse(String str) {
            try {
                String strHnj = hnj(str);
                String strHn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn(strHnj, this.f13297sk, "");
                if (TextUtils.isEmpty(strHn)) {
                    return false;
                }
                if (strHn.equals(com.bytedance.sdk.component.utils.eum.hn(com.bytedance.sdk.openadsdk.core.oj.hnj())) && !this.dse.contains(str)) {
                    com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(strHnj, this.f13297sk, "");
                    return false;
                }
            } catch (Throwable unused) {
            }
            return true;
        }

        public long gjv(String str) {
            try {
                return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(hnj(str), this.gjv, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public String hn(String str) {
            try {
                return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn(hnj(str), this.f13296hn, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        protected String hnj(String str) {
            if (TextUtils.isEmpty(str)) {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            return this.hnj + "_cache_" + str;
        }

        public String qor(String str) {
            try {
                return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn(hnj(str), this.dkl, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean sk(String str) {
            try {
                return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(hnj(str), this.qor, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public void hnj(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strHnj = hnj(codeId);
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(strHnj, this.qor, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(strHnj, this.gjv, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(strHnj, this.f13296hn, str);
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(strHnj, this.f13297sk, "");
                com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj(strHnj, this.dkl, str2);
                this.dse.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static hn hnj(String str) {
        hn hnVar;
        HashMap<String, hn> map = hnj;
        hn hnVar2 = map.get(str);
        if (hnVar2 != null) {
            return hnVar2;
        }
        synchronized (hn.class) {
            try {
                hnVar = map.get(str);
                if (hnVar == null) {
                    hnVar = new hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), str);
                    map.put(str, hnVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hnVar;
    }

    private String hn() {
        return CacheDirFactory.getICacheDir(0).hnj();
    }

    public static void hnj(String str, hnj hnjVar) {
        f13294hn.put(str, hnjVar);
    }

    public void hnj(String str, as asVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strQor = this.gjv.qor(str);
        String strJp = asVar != null ? asVar.jp() : "";
        if (TextUtils.isEmpty(strQor) || TextUtils.isEmpty(strJp) || strQor.equals(strJp)) {
            this.gjv.aq(str);
        }
    }

    public void hnj() {
        String str;
        File[] fileArrListFiles;
        try {
            boolean zDse = com.bytedance.sdk.openadsdk.core.ta.dse(this.f13295sk);
            if (zDse) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            File file = new File(this.qor.getDataDir(), str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.hn.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(hn.this.f13295sk);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zDse) {
                        try {
                            com.bytedance.sdk.component.utils.dse.qor(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.qor.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(hn());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.dse.qor(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void hnj(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        as asVarDkl;
        if ((hnjVar != null && hnjVar.dkl() != null && hnjVar.dkl().era()) || hnjVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (asVarDkl = hnjVar.dkl()) == null || asVarDkl.sgl() == 2) {
            return;
        }
        try {
            this.gjv.hnj(adSlot, hnjVar.dnm(), hnjVar.hn());
        } catch (Throwable unused) {
        }
    }

    public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, boolean z10) {
        if (hnjVar == null || !hnjVar.sk()) {
            return false;
        }
        if (z10) {
            Iterator<as> it = hnjVar.gjv().iterator();
            while (it.hasNext()) {
                if (!hnj(it.next())) {
                    it.remove();
                }
            }
        }
        return hnjVar.sk();
    }

    public String hnj(String str, long j10) {
        long jGjv = this.gjv.gjv(str);
        boolean zSk = this.gjv.sk(str);
        if (System.currentTimeMillis() - jGjv >= j10 || zSk) {
            return null;
        }
        return hn(str);
    }

    private boolean hnj(as asVar) {
        if (asVar != null) {
            return hqh.qor(asVar) || asVar.pwt() != null;
        }
        return false;
    }
}
