package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35064a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35065b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35066c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35067d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35068e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35069f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35070g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35071h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35072i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0480a> f35073j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0480a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WindVaneWebView f35074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f35075b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f35074a = windVaneWebView;
        }

        public WindVaneWebView b() {
            return this.f35074a;
        }

        public boolean c() {
            return this.f35075b;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f35074a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f35074a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public void a(boolean z10) {
            this.f35075b = z10;
        }
    }

    public static void a(String str, C0480a c0480a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f35071h.put(str, c0480a);
                return;
            } else {
                f35070g.put(str, c0480a);
                return;
            }
        }
        if (z11) {
            f35073j.put(str, c0480a);
        } else {
            f35072i.put(str, c0480a);
        }
    }

    public static C0480a b(String str) {
        if (f35070g.containsKey(str)) {
            return f35070g.get(str);
        }
        if (f35071h.containsKey(str)) {
            return f35071h.get(str);
        }
        if (f35072i.containsKey(str)) {
            return f35072i.get(str);
        }
        if (f35073j.containsKey(str)) {
            return f35073j.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0480a> entry : f35070g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f35070g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0480a> entry : f35071h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f35071h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (f35070g.containsKey(str)) {
            f35070g.remove(str);
        }
        if (f35072i.containsKey(str)) {
            f35072i.remove(str);
        }
        if (f35071h.containsKey(str)) {
            f35071h.remove(str);
        }
        if (f35073j.containsKey(str)) {
            f35073j.remove(str);
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f35070g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f35070g.remove(str2);
                }
            }
        } else {
            f35070g.clear();
        }
        f35071h.clear();
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0480a> concurrentHashMap = f35065b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0480a> concurrentHashMap2 = f35068e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0480a> concurrentHashMap3 = f35064a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0480a> concurrentHashMap4 = f35067d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0480a> concurrentHashMap5 = f35066c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0480a> concurrentHashMap6 = f35069f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f35072i.clear();
        f35073j.clear();
    }

    public static C0480a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0480a> concurrentHashMap = f35064a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f35064a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0480a> concurrentHashMap2 = f35067d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f35067d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0480a> concurrentHashMap3 = f35066c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f35066c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0480a> concurrentHashMap4 = f35069f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f35069f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0480a> concurrentHashMap5 = f35065b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f35065b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0480a> concurrentHashMap6 = f35068e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f35068e.get(requestIdNotice);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0480a c0480a) {
        try {
            if (i10 == 94) {
                if (f35068e == null) {
                    f35068e = new ConcurrentHashMap<>();
                }
                f35068e.put(str, c0480a);
            } else if (i10 == 287) {
                if (f35069f == null) {
                    f35069f = new ConcurrentHashMap<>();
                }
                f35069f.put(str, c0480a);
            } else if (i10 != 288) {
                if (f35064a == null) {
                    f35064a = new ConcurrentHashMap<>();
                }
                f35064a.put(str, c0480a);
            } else {
                if (f35067d == null) {
                    f35067d = new ConcurrentHashMap<>();
                }
                f35067d.put(str, c0480a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0480a c0480a) {
        try {
            if (i10 == 94) {
                if (f35065b == null) {
                    f35065b = new ConcurrentHashMap<>();
                }
                f35065b.put(str, c0480a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f35066c == null) {
                    f35066c = new ConcurrentHashMap<>();
                }
                f35066c.put(str, c0480a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
