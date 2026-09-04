package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.vf;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hnj();

        void hnj(boolean z10, int i10);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0202hnj {
        void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, View view);
    }

    public static void hn(mjg mjgVar) {
        hnj(mjgVar);
        mjgVar.hnj().f13454gm.hnj(qor(mjgVar));
    }

    private static com.bytedance.sdk.openadsdk.component.reward.top.hn qor(final mjg mjgVar) {
        final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarHnj = mjgVar.hnj();
        final String strHn = mjgVar.hn();
        final hn hnVarGjv = mjgVar.gjv();
        final jip jipVarDkl = mjgVar.dkl();
        final boolean zSk = mjgVar.sk();
        return new com.bytedance.sdk.openadsdk.component.reward.top.hn() { // from class: com.bytedance.sdk.openadsdk.common.hnj.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void gjv(View view) {
                if (mjgVar.hnj() == null || mjgVar.dse() == null) {
                    return;
                }
                mjgVar.dse().hnj(mjgVar.hnj(), view);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hn(View view) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.qor qorVar;
                com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = hnjVarHnj;
                if (hnjVar == null || (qorVar = hnjVar.f13466vf) == null || (hnVar = hnjVar.f13460qb) == null) {
                    return;
                }
                qorVar.hnj(hnVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view) {
                if (hnj.hn(jipVarDkl, hnjVarHnj, false, strHn)) {
                    return;
                }
                if (zSk && hnj.hn(hnjVarHnj, strHn, hnVarGjv)) {
                    return;
                }
                hnj.hnj(hnjVarHnj);
                hnj.hnj(hnjVarHnj, hnVarGjv);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void qor(View view) {
                com.bytedance.sdk.openadsdk.component.reward.view.dnm dnmVar;
                View viewTa;
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = hnjVarHnj;
                if (hnjVar == null || (dnmVar = hnjVar.f13464ua) == null || (viewTa = dnmVar.ta()) == null) {
                    return;
                }
                viewTa.performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.hn
            public void hnj(View view, String str) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = hnjVarHnj;
                if (hnjVar == null) {
                    return;
                }
                hnj.hnj(hnjVar, hnjVar.f13460qb, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hn(jip jipVar, com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, boolean z10, String str) {
        if (jipVar == null) {
            return false;
        }
        if (!jipVar.hnj(hqh.qor(hnjVar.f13456hn), z10, null) && (hnjVar.f13463th instanceof com.bytedance.sdk.openadsdk.activity.single.sk)) {
            return ((com.bytedance.sdk.openadsdk.activity.single.sk) hnjVar.f13463th).aq();
        }
        return true;
    }

    public static void hnj(final mjg mjgVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.dnm dnmVar;
        final View viewTa;
        final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVarHnj = mjgVar.hnj();
        if (hnjVarHnj == null || (dnmVar = hnjVarHnj.f13464ua) == null || (viewTa = dnmVar.ta()) == null) {
            return;
        }
        final String strHn = mjgVar.hn();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.hnj.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (hnj.hn(hnjVarHnj, viewTa)) {
                    return;
                }
                hnjVarHnj.nyv.eum();
                hnjVarHnj.pty.dnm();
                hnjVarHnj.tgn.dkl();
                jip jipVarDkl = mjgVar.dkl();
                if (jipVarDkl == null || !hqh.gjv(hnjVarHnj.f13456hn)) {
                    mjgVar.qor().run();
                    return;
                }
                boolean zHn = hnj.hn(jipVarDkl, hnjVarHnj, true, strHn);
                if (!(hnjVarHnj.f13463th instanceof com.bytedance.sdk.openadsdk.activity.single.sk) || zHn) {
                    return;
                }
                mjgVar.qor().run();
            }
        };
        viewTa.setOnClickListener(onClickListener);
        viewTa.setTag(viewTa.getId(), onClickListener);
    }

    private static void qor(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        as asVar;
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        if (hnjVar == null || (asVar = hnjVar.f13456hn) == null || (gjvVarFvx = asVar.fvx()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj = gjvVarFvx.hnj();
        long jOrl = hnjVar.eum.orl();
        if (hnjVar.dzo) {
            gjvVarHnj.aq(jOrl);
        } else {
            gjvVarHnj.ojm(jOrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hn(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, String str, hn hnVar) {
        if (hnjVar.f13463th instanceof com.bytedance.sdk.openadsdk.activity.single.sk) {
            hnVar.hnj();
            return true;
        }
        boolean zAq = hqh.aq(hnjVar.f13456hn);
        boolean zDkl = hqh.dkl(hnjVar.f13456hn);
        boolean zSk = hqh.sk(hnjVar.f13456hn);
        if (!zDkl && (!zSk || !hnjVar.as.gjv(com.bytedance.sdk.openadsdk.component.reward.hnj.aq.f13430hn))) {
            if (com.bytedance.sdk.openadsdk.core.model.apu.hnj(hnjVar.f13456hn) && !hnjVar.orl.get()) {
                hnVar.hnj();
                return true;
            }
            hnjVar.f13454gm.gjv(false);
            return false;
        }
        if (zAq) {
            hnjVar.as.ojm();
        } else {
            View viewTa = hnjVar.f13464ua.ta();
            if (viewTa != null) {
                viewTa.performClick();
            } else {
                hnVar.hnj();
            }
        }
        return true;
    }

    public static void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.gjv.sk.hn.fc.hnj();
        hnjVar2.hn(hnjVar.eum.orl());
        hnjVar2.gjv(hnjVar.eum.tgn());
        hnjVar2.qor(hnjVar.eum.uua());
        hnjVar2.qor(3);
        hnjVar2.gjv(hnjVar.eum.tu());
        hnjVar2.hnj(hnjVar.eum.hn());
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(hnjVar.eum.aq(), hnjVar2, hnjVar.eum.sk());
        vf.qor(hnjVar.dkl);
        hnjVar.eum.hnj(FreeSpaceBox.TYPE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hn(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, View view) {
        if (!hnjVar.nyv.apu() || (!hnjVar.dy && !hnjVar.ojm.get())) {
            return false;
        }
        boolean zOrl = hnjVar.pty.orl();
        hnjVar.nyv.dkl(zOrl);
        hnjVar.f13464ua.dkl(8);
        if (view instanceof com.bytedance.sdk.openadsdk.core.dkl.gjv) {
            ((com.bytedance.sdk.openadsdk.core.dkl.gjv) view).setImageResource(wu.gjv(hnjVar.jbd, "tt_close_btn"));
        }
        hnjVar.f13453ff.sendEmptyMessageDelayed(Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE, 5000L);
        return !as.qor(hnjVar.f13456hn) || zOrl;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    public static void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, hn hnVar) {
        if (hnjVar.qor) {
            if (com.bytedance.sdk.openadsdk.core.model.apu.qor(hnjVar.f13456hn)) {
                com.bytedance.sdk.openadsdk.component.reward.view.qor qorVarHnj = hnjVar.f33do.hnj();
                if (qorVarHnj == null || qorVarHnj.gjv != 0) {
                    hnVar.hnj(true, 4);
                } else {
                    hnVar.hnj();
                }
            } else {
                hnVar.hnj(true, 4);
                if (com.bytedance.sdk.openadsdk.core.model.apu.hnj(hnjVar.f13456hn) && !hnjVar.orl.get()) {
                    hnVar.hnj();
                }
            }
        } else {
            hnVar.hnj();
        }
        hn(hnjVar);
    }

    public static void hn(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        com.bytedance.sdk.openadsdk.core.model.gjv gjvVarFvx;
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj;
        if (hnjVar == null) {
            return;
        }
        as asVar = hnjVar.f13456hn;
        if (asVar != null && (gjvVarFvx = asVar.fvx()) != null && (gjvVarHnj = gjvVarFvx.hnj()) != null) {
            long jOrl = hnjVar.eum.orl();
            gjvVarHnj.dkl(jOrl);
            gjvVarHnj.sk(jOrl);
        }
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(hnjVar.f13456hn, 5);
    }

    public static void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, com.bytedance.sdk.openadsdk.component.reward.hn.hn hnVar, String str) {
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar;
        if (hnjVar == null || hnjVar.f13460qb == null) {
            return;
        }
        hnjVar.dzo = !hnjVar.dzo;
        boolean z10 = hnjVar.f13463th instanceof com.bytedance.sdk.openadsdk.activity.single.sk;
        if (hnjVar.dy && !z10 && (ojmVar = hnjVar.f33do) != null && ojmVar.hnj() != null) {
            hnjVar.f33do.hnj().setSoundMute(hnjVar.dzo);
        }
        hnjVar.eum.hnj(hnjVar.dzo, str);
        hnjVar.nyv.sk(hnjVar.dzo);
        hnjVar.as.hn(hnjVar.dzo);
        if (z10) {
            return;
        }
        qor(hnjVar);
    }
}
