package com.bytedance.sdk.openadsdk.dse;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dkl;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.bytedance.sdk.component.hn.hnj.ojm;
import com.bytedance.sdk.component.hn.hnj.orl;
import com.bytedance.sdk.component.hn.hnj.qor;
import com.bytedance.sdk.component.hn.hnj.sk;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements INetWork {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected dnm f14334hn;
    protected dnm hnj;

    public hnj() {
        dnm.hnj hnjVar = new dnm.hnj();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.hnj = hnjVar.hnj(10L, timeUnit).hn(10L, timeUnit).qor(10L, timeUnit).hnj();
        this.f14334hn = new dnm.hnj().hnj(10L, timeUnit).hn(30L, timeUnit).qor(30L, timeUnit).hnj();
    }

    private Map<String, String> hnj(dkl dklVar) {
        if (dklVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < dklVar.hnj(); i10++) {
            map.put(dklVar.hnj(i10), dklVar.hn(i10));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) {
        mjg mjgVarHn = this.hnj.hnj(new bug.hnj().hnj().hn(str).hnj("gecko").hn()).hn();
        return new Response(hnj(mjgVarHn.dse()), mjgVarHn.qor() == 200 ? mjgVarHn.dkl().hn() : null, mjgVarHn.qor(), mjgVarHn.sk());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) {
        sk.hnj hnjVar = new sk.hnj();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                hnjVar.hnj((String) pair.first, (String) pair.second);
            }
        }
        mjg mjgVarHn = this.hnj.hnj(new bug.hnj().hn(str).hnj((orl) hnjVar.hnj()).hnj("gecko").hn()).hn();
        return new Response(hnj(mjgVarHn.dse()), mjgVarHn.qor() == 200 ? mjgVarHn.dkl().hn() : null, mjgVarHn.qor(), mjgVarHn.sk());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream) throws Throwable {
        Exception e10;
        Closeable closeable;
        Closeable closeable2 = null;
        int i10 = 0;
        try {
            try {
                try {
                    mjg mjgVarHn = this.f14334hn.hnj(new bug.hnj().hnj().hnj("gecko").hn(str).hn()).hn();
                    int iQor = mjgVarHn.qor();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(mjgVarHn.dkl().qor());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i11 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i11 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i11);
                            }
                        } catch (Exception e11) {
                            e10 = e11;
                            i10 = iQor;
                            throw new RuntimeException("downloadFile failed, code: " + i10 + ", url:" + str + ", caused by:" + e10.getMessage(), e10);
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable2 = closeable;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e13) {
                e10 = e13;
            }
        } catch (Throwable th3) {
            th = th3;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.hnj.hnj(new bug.hnj().hnj().hn(str).hnj("gecko").hn()).hnj(new qor() { // from class: com.bytedance.sdk.openadsdk.dse.hnj.1
            @Override // com.bytedance.sdk.component.hn.hnj.qor
            public void hnj(com.bytedance.sdk.component.hn.hnj.hn hnVar, mjg mjgVar) {
            }

            @Override // com.bytedance.sdk.component.hn.hnj.qor
            public void hnj(com.bytedance.sdk.component.hn.hnj.hn hnVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) {
        mjg mjgVarHn = this.hnj.hnj(new bug.hnj().hn(str).hnj(orl.hnj(ojm.hnj("application/json; charset=utf-8"), str2)).hnj("gecko").hn()).hn();
        return new Response(hnj(mjgVarHn.dse()), mjgVarHn.qor() == 200 ? mjgVarHn.dkl().hn() : null, mjgVarHn.qor(), mjgVarHn.sk());
    }
}
