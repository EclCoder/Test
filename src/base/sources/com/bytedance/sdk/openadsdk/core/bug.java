package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug {
    private static final AtomicInteger hnj = new AtomicInteger(0);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final AtomicBoolean f13579hn = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void gjv() {
        if (hnj.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.ua.hnj().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bug.2
                @Override // java.lang.Runnable
                public void run() {
                    bug.hn(orl.hnj(oj.hnj()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void qor() {
        hnj.set(0);
    }

    public static void hn(final String str) {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ua.hn(new com.bytedance.sdk.component.aq.hn.qor("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.bug.1
            @Override // java.lang.Runnable
            public void run() {
                final String strXn = com.bytedance.sdk.openadsdk.utils.orp.xn();
                com.bytedance.sdk.openadsdk.jip.gjv.hnj(0, strXn);
                com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.1.1
                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                        hnjVar.hn("ipv6");
                        return hnjVar;
                    }
                });
                if (TextUtils.isEmpty(strXn)) {
                    com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, strXn, -1, "url is null");
                    com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", "", -2, "url is null", null, null);
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.1.2
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("ipv6");
                            return hnjVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
                try {
                    gjvVarHn.qor(strXn);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.tgn.hnj(oj.hnj(), 0L));
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("device_id", Long.parseLong(str));
                    }
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.gjv.hnj.hnj.hnj().hn());
                    JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new tu(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                    if (jSONObjectEncryptType4 == null || jSONObjectEncryptType4.optInt("cypher") != 4) {
                        tgn.hn(false);
                    } else {
                        tgn.hn(true);
                        gjvVarHn.hn("x-pgli18n", "4");
                        gjvVarHn.hn("Content-Type", "application/json; charset=utf-8");
                    }
                    if (bug.hn(jSONObjectEncryptType4)) {
                        jSONObject = jSONObjectEncryptType4;
                    }
                    gjvVarHn.hn("Content-Type", "application/json; charset=utf-8");
                    gjvVarHn.hn(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.orp.gjv());
                    gjvVarHn.hnj(jSONObject);
                    gjvVarHn.hnj(6);
                    gjvVarHn.hn("send_i_p_v6");
                    gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.bug.1.3
                        @Override // com.bytedance.sdk.component.dse.hnj.hnj
                        public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                            if (hnVar.dkl()) {
                                bug.hn(hnVar.gjv(), strXn);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, strXn, hnVar.hnj(), hnVar.hn());
                            com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", strXn, hnVar.hnj(), hnVar.hn(), null, null);
                            com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.1.3.1
                                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                    hnjVar.hn("ipv6");
                                    return hnjVar;
                                }
                            });
                            bug.gjv();
                        }

                        @Override // com.bytedance.sdk.component.dse.hnj.hnj
                        public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, strXn, 1, iOException.getMessage());
                                com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", strXn, -1, iOException.getMessage(), null, null);
                                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.1.3.2
                                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                        hnjVar.hn("ipv6");
                                        return hnjVar;
                                    }
                                });
                            }
                            bug.gjv();
                        }
                    });
                } catch (Exception e10) {
                    com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, strXn, -2, e10.getMessage());
                    com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", strXn, -3, e10.getMessage(), null, null);
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.1.4
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("ipv6");
                            return hnjVar;
                        }
                    });
                    com.bytedance.sdk.component.utils.apu.qor("build ipv6 request failed:" + e10.getMessage(), new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements com.bytedance.sdk.component.utils.tgn.hnj {
        private static final AtomicBoolean hnj = new AtomicBoolean(false);

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private static volatile long f13581hn = -1;

        private hnj() {
        }

        public static void hnj() {
            if (hnj.compareAndSet(false, true)) {
                f13581hn = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.tgn.hnj(new hnj(), oj.hnj());
            }
        }

        public void hn() {
            com.bytedance.sdk.component.utils.tgn.hnj(this);
        }

        @Override // com.bytedance.sdk.component.utils.tgn.hnj
        public void hnj(Context context, Intent intent, boolean z10, int i10) {
            if (System.currentTimeMillis() - f13581hn >= 2000 && i10 != 0) {
                bug.qor();
                bug.hn(orl.hnj(oj.hnj()));
                hn();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("cypher") != 4) {
                com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, str2, 1, "cypher type error");
                com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", str2, -4, "cypher type error", null, null);
                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.3
                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                        hnjVar.hn("ipv6");
                        return hnjVar;
                    }
                });
                return;
            }
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            if (pairDecryptType4.second != null) {
                JSONObject jSONObject2 = new JSONObject((String) pairDecryptType4.second);
                String strOptString = jSONObject2.optString("ip_type");
                int iHashCode = strOptString.hashCode();
                if (iHashCode != 3239397) {
                    if (iHashCode != 3239399) {
                        if (iHashCode == 1959784951 && strOptString.equals("invalid")) {
                            return;
                        }
                    } else if (strOptString.equals("ipv6")) {
                        if (jSONObject2.has("ip")) {
                            String strOptString2 = jSONObject2.optString("ip");
                            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", "key_ipv4");
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                            com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(map);
                            com.bytedance.sdk.openadsdk.jip.gjv.hnj(1, str2);
                            com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.5
                                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                    hnjVar.hn("ipv6");
                                    return hnjVar;
                                }
                            });
                            return;
                        }
                        com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, str2, 4, "no ip");
                        com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", str2, -6, "no ip", null, null);
                        com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.6
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar.hn("ipv6");
                                return hnjVar;
                            }
                        });
                        return;
                    }
                } else if (strOptString.equals("ipv4")) {
                    if (jSONObject2.has("ip")) {
                        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", "key_ipv4", jSONObject2.optString("ip"));
                        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                        com.bytedance.sdk.openadsdk.jip.gjv.hnj(1, str2);
                        com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.7
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar.hn("ipv6");
                                return hnjVar;
                            }
                        });
                        return;
                    }
                    com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, str2, 4, "no ip");
                    com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", str2, -6, "no ip", null, null);
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.8
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("ipv6");
                            return hnjVar;
                        }
                    });
                    return;
                }
                com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, str2, 3, "no ip type ");
                com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", str2, -7, "no ip type ", null, null);
                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.9
                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                        hnjVar.hn("ipv6");
                        return hnjVar;
                    }
                });
                return;
            }
            int iIntValue = ((Integer) pairDecryptType4.first).intValue();
            com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, str2, 2, "decrypt failed ".concat(String.valueOf(iIntValue)));
            com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(iIntValue)), null, null);
            com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.4
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("ipv6");
                    return hnjVar;
                }
            });
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.jip.gjv.hnj(-1, str2, 2, "decrypt failed, wrong data ");
            com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("ipv6", str2, -8, "decrypt failed, wrong data ", null, null);
            com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.10
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("ipv6");
                    return hnjVar;
                }
            });
        }
    }

    public static void hnj(String str) {
        AtomicBoolean atomicBoolean = f13579hn;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.oj.aq(oj.hnj())) {
                atomicBoolean.set(false);
            } else {
                hnj.hnj();
                hn(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hn(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }
}
