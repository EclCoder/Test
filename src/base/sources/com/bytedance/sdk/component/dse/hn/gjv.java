package com.bytedance.sdk.component.dse.hn;

import android.text.TextUtils;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dkl;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.fc;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.bytedance.sdk.component.hn.hnj.ojm;
import com.bytedance.sdk.component.hn.hnj.orl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends qor {
    orl hnj;

    public gjv(dnm dnmVar) {
        super(dnmVar);
        this.hnj = null;
    }

    private byte[] dkl(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(str.getBytes("utf-8"));
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        return byteArray;
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                } catch (IOException unused6) {
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException unused7) {
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        byteArray = byteArrayOutputStream.toByteArray();
        return byteArray;
    }

    public void sk(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.hnj = orl.hnj(ojm.hnj("application/json; charset=utf-8"), str);
    }

    public void hnj(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = "{}";
        }
        this.hnj = orl.hnj(ojm.hnj("application/json; charset=utf-8"), string);
    }

    public void hnj(String str, byte[] bArr) {
        this.hnj = orl.hnj(ojm.hnj(str), bArr);
    }

    public void hnj(final com.bytedance.sdk.component.dse.hnj.hnj hnjVar) {
        try {
            bug.hnj hnjVar2 = new bug.hnj();
            if (TextUtils.isEmpty(this.aq)) {
                hnjVar.hnj(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.f12835sk)) {
                hnjVar2.hnj(this.f12835sk);
            }
            int i10 = this.dkl;
            if (i10 > 0) {
                hnjVar2.hnj(i10);
            }
            hnjVar2.hn(this.aq);
            if (this.hnj == null) {
                if (hnjVar != null) {
                    hnjVar.hnj(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                hn(hnjVar2);
                hnjVar2.hnj((Object) gjv());
                hnj(hnjVar2);
                this.qor.hnj(hnjVar2.hnj(this.hnj).hn()).hnj(new com.bytedance.sdk.component.hn.hnj.qor() { // from class: com.bytedance.sdk.component.dse.hn.gjv.1
                    @Override // com.bytedance.sdk.component.hn.hnj.qor
                    public void hnj(com.bytedance.sdk.component.hn.hnj.hn hnVar, IOException iOException) {
                        com.bytedance.sdk.component.dse.hnj.hnj hnjVar3 = hnjVar;
                        if (hnjVar3 != null) {
                            hnjVar3.hnj(gjv.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.sdk.component.hn.hnj.dkl] */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.dse.hnj.hnj] */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v9 */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.dse.hn] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.dse.hn] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.component.hn.hnj.qor
                    public void hnj(com.bytedance.sdk.component.hn.hnj.hn hnVar, mjg mjgVar) {
                        Throwable th2;
                        ?? r10;
                        ?? hnVar2;
                        com.bytedance.sdk.component.dse.hnj.hnj hnjVar3 = hnjVar;
                        if (hnjVar3 != null) {
                            if (mjgVar == null) {
                                hnjVar3.hnj(gjv.this, new IOException("No response"));
                                return;
                            }
                            gjv.this.hnj(mjgVar.ojm());
                            ?? r11 = 0;
                            IOException iOException = null;
                            try {
                                HashMap map = new HashMap();
                                ?? Dse = mjgVar.dse();
                                if (Dse != 0) {
                                    hnVar2 = 0;
                                    while (hnVar2 < Dse.hnj()) {
                                        String strHnj = Dse.hnj(hnVar2);
                                        String strHn = Dse.hn(hnVar2);
                                        map.put(strHnj, strHn);
                                        if (strHnj != null && strHnj.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strHn == null ? "" : strHn.toLowerCase());
                                        }
                                        hnVar2++;
                                    }
                                }
                                fc fcVarDkl = mjgVar.dkl();
                                try {
                                    if (com.bytedance.sdk.component.dse.qor.hnj.hnj(map)) {
                                        byte[] bArrGjv = fcVarDkl.gjv();
                                        com.bytedance.sdk.component.dse.hn hnVar3 = new com.bytedance.sdk.component.dse.hn(mjgVar.gjv(), mjgVar.qor(), mjgVar.sk(), map, null, mjgVar.hn(), mjgVar.hnj());
                                        hnVar3.hnj(bArrGjv);
                                        hnVar2 = hnVar3;
                                    } else if (gjv.this.ojm) {
                                        byte[] bArrGjv2 = fcVarDkl.gjv();
                                        gjv gjvVar = gjv.this;
                                        com.bytedance.sdk.component.dse.hn hnVar4 = new com.bytedance.sdk.component.dse.hn(mjgVar.gjv(), mjgVar.qor(), mjgVar.sk(), map, new String(bArrGjv2, gjvVar.hnj(gjvVar.hnj(fcVarDkl))), mjgVar.hn(), mjgVar.hnj());
                                        hnVar4.hnj(bArrGjv2);
                                        hnVar2 = hnVar4;
                                    } else if (fcVarDkl != null) {
                                        hnVar2 = new com.bytedance.sdk.component.dse.hn(mjgVar.gjv(), mjgVar.qor(), mjgVar.sk(), map, fcVarDkl.hn(), mjgVar.hn(), mjgVar.hnj());
                                    } else {
                                        throw new IOException(mjgVar.sk());
                                    }
                                    gjv.this.hnj((com.bytedance.sdk.component.dse.hn) hnVar2, mjgVar);
                                    r10 = hnVar2;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    r11 = hnVar2;
                                    r10 = r11;
                                    iOException = new IOException(th2);
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                            if (r10 != 0) {
                                hnjVar.hnj(gjv.this, r10);
                                return;
                            }
                            com.bytedance.sdk.component.dse.hnj.hnj hnjVar4 = hnjVar;
                            if (hnjVar4 instanceof com.bytedance.sdk.component.dse.hnj.hn) {
                                com.bytedance.sdk.component.dse.hnj.hn hnVar5 = (com.bytedance.sdk.component.dse.hnj.hn) hnjVar4;
                                gjv gjvVar2 = gjv.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                hnVar5.hnj(gjvVar2, iOException, new com.bytedance.sdk.component.dse.hn(mjgVar.gjv(), mjgVar.qor(), mjgVar.sk(), null, null, mjgVar.hn(), mjgVar.hnj()));
                                return;
                            }
                            gjv gjvVar3 = gjv.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            hnjVar4.hnj(gjvVar3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            hnjVar.hnj(this, new IOException(th2.getMessage()));
        }
    }

    public com.bytedance.sdk.component.dse.hn hnj() {
        com.bytedance.sdk.component.dse.hn hnVar;
        try {
            bug.hnj hnjVar = new bug.hnj();
            if (TextUtils.isEmpty(this.aq)) {
                return new com.bytedance.sdk.component.dse.hn(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            hnjVar.hn(this.aq);
            if (this.hnj == null) {
                return new com.bytedance.sdk.component.dse.hn(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            hn(hnjVar);
            hnjVar.hnj((Object) gjv());
            hnj(hnjVar);
            mjg mjgVarHn = this.qor.hnj(hnjVar.hnj(this.hnj).hn()).hn();
            if (mjgVarHn == null) {
                return null;
            }
            hnj(mjgVarHn.ojm());
            HashMap map = new HashMap();
            dkl dklVarDse = mjgVarHn.dse();
            if (dklVarDse != null) {
                for (int i10 = 0; i10 < dklVarDse.hnj(); i10++) {
                    String strHnj = dklVarDse.hnj(i10);
                    String strHn = dklVarDse.hn(i10);
                    map.put(strHnj, strHn);
                    if (strHnj != null && strHnj.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strHn == null ? "" : strHn.toLowerCase());
                    }
                }
            }
            fc fcVarDkl = mjgVarHn.dkl();
            if (com.bytedance.sdk.component.dse.qor.hnj.hnj(map)) {
                byte[] bArrGjv = fcVarDkl.gjv();
                hnVar = new com.bytedance.sdk.component.dse.hn(mjgVarHn.gjv(), mjgVarHn.qor(), mjgVarHn.sk(), map, null, mjgVarHn.hn(), mjgVarHn.hnj());
                hnVar.hnj(bArrGjv);
            } else if (this.ojm) {
                byte[] bArrGjv2 = fcVarDkl.gjv();
                hnVar = new com.bytedance.sdk.component.dse.hn(mjgVarHn.gjv(), mjgVarHn.qor(), mjgVarHn.sk(), map, new String(bArrGjv2, hnj(hnj(fcVarDkl))), mjgVarHn.hn(), mjgVarHn.hnj());
                hnVar.hnj(bArrGjv2);
            } else if (fcVarDkl != null) {
                hnVar = new com.bytedance.sdk.component.dse.hn(mjgVarHn.gjv(), mjgVarHn.qor(), mjgVarHn.sk(), map, fcVarDkl.hn(), mjgVarHn.hn(), mjgVarHn.hnj());
            } else {
                throw new IOException(mjgVarHn.sk());
            }
            hnj(hnVar, mjgVarHn);
            return hnVar;
        } catch (Throwable th2) {
            return new com.bytedance.sdk.component.dse.hn(false, 5001, th2.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void hnj(String str, boolean z10) {
        if (z10) {
            hnj("application/json; charset=utf-8", dkl(str));
            hn("Content-Encoding", "gzip");
        } else {
            sk(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset hnj(ojm ojmVar) {
        try {
            return ojmVar != null ? ojmVar.hnj(com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj) : com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ojm hnj(fc fcVar) {
        try {
            return fcVar.sk();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.component.dse.hn hnVar, mjg mjgVar) {
        if (hnVar == null || mjgVar == null) {
            return;
        }
        hnVar.hnj(mjgVar.aq());
    }
}
