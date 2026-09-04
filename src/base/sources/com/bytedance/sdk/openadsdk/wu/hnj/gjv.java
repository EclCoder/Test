package com.bytedance.sdk.openadsdk.wu.hnj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.orl.dkl;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile gjv f14782hn;
    private final Handler hnj;
    private int qor = 0;
    private int gjv = 2;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f14783sk = 3600000;
    private final ArrayList<hn> dkl = new ArrayList<>();

    private gjv() {
        ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.wu.hnj.gjv.1
            @Override // java.lang.Runnable
            public void run() {
                gjv.this.qor = sk.hnj("plb_pre_render_enable", 0);
                gjv.this.gjv = sk.hnj("plb_pre_render_max_count", 2);
                if (gjv.this.gjv <= 0 || gjv.this.gjv > 4) {
                    gjv.this.gjv = 2;
                }
                gjv.this.f14783sk = sk.hnj("plb_pre_render_alive_time", 3600000);
                if (gjv.this.f14783sk <= 0 || gjv.this.f14783sk > 3600000) {
                    gjv.this.f14783sk = 3600000;
                }
            }
        });
        this.hnj = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.gjv.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!(message.obj instanceof hn)) {
                    return false;
                }
                gjv.this.dkl.remove(message.obj);
                ((hn) message.obj).gjv();
                return true;
            }
        });
    }

    public static gjv hnj() {
        if (f14782hn == null) {
            synchronized (gjv.class) {
                try {
                    if (f14782hn == null) {
                        f14782hn = new gjv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f14782hn;
    }

    public boolean hn() {
        return this.qor == 1;
    }

    public void hnj(final as asVar) {
        if (hn() && asVar != null && hqh.dkl(asVar)) {
            final String strJp = asVar.jp();
            if (TextUtils.isEmpty(strJp)) {
                return;
            }
            ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.gjv.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (gjv.this.dkl.size() >= gjv.this.gjv) {
                            gjv.this.dkl.size();
                            hn hnVar = (hn) gjv.this.dkl.remove(0);
                            if (hnVar != null) {
                                gjv.this.hnj.removeMessages(hnVar.ojm().hashCode());
                                hnVar.gjv();
                            }
                        }
                        asVar.jip(true);
                        Context contextHnj = oj.hnj();
                        as asVar2 = asVar;
                        final hn hnVar2 = new hn(contextHnj, asVar2, asVar2.zf(), true, new FrameLayout(oj.hnj()), strJp);
                        gjv.this.dkl.add(hnVar2);
                        hnVar2.aq();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strJp.hashCode();
                        messageObtain.obj = hnVar2;
                        gjv.this.hnj.sendMessageDelayed(messageObtain, gjv.this.f14783sk);
                        hnVar2.hnj(new hnj.hn() { // from class: com.bytedance.sdk.openadsdk.wu.hnj.gjv.3.1
                            @Override // com.bytedance.sdk.openadsdk.wu.hnj.hnj.hn
                            public void hnj() {
                                gjv.this.hnj.removeMessages(strJp.hashCode());
                                gjv.this.dkl.remove(hnVar2);
                                hnVar2.gjv();
                            }
                        });
                        as asVar3 = asVar;
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar3, orp.qor(asVar3.aip().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
            });
        }
    }

    public hn hnj(as asVar, FrameLayout frameLayout, dkl dklVar) {
        hn hnVar;
        if (hn() && asVar.aip() != null && !TextUtils.isEmpty(asVar.aip().getBidAdm()) && hqh.dkl(asVar) && frameLayout != null) {
            String strJp = asVar.jp();
            if (TextUtils.isEmpty(strJp)) {
                return null;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= this.dkl.size()) {
                    i10 = -1;
                    hnVar = null;
                    break;
                }
                hnVar = this.dkl.get(i10);
                if (strJp.equals(hnVar.ojm())) {
                    break;
                }
                i10++;
            }
            if (hnVar != null) {
                this.hnj.removeMessages(strJp.hashCode());
                this.dkl.remove(i10);
                this.dkl.size();
                asVar.jip(true);
                hnVar.hnj(frameLayout, dklVar);
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, orp.qor(asVar.aip().getDurationSlotType()), "PL_use_pre_render", 1);
                return hnVar;
            }
        }
        return null;
    }
}
