package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.Objects;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hn {
    public static void hnj(hnj hnjVar, Intent intent, Bundle bundle) {
        hnj(intent, hnjVar);
        hnj(bundle, hnjVar);
    }

    public static as hnj(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar) {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarHn = hqh.hnj().hn(hqh.hnj(intent));
        as asVarOjm = hnjVarHn != null ? hnjVarHn.ojm() : null;
        if (hnVar != null) {
            hnVar.hnj(bundle);
        }
        hqh.hnj().sk();
        if (bundle != null) {
            try {
                asVarOjm = hqh.hnj().hnj(bundle.getInt("meta_index", -1));
                Objects.toString(asVarOjm);
            } catch (Throwable th2) {
                apu.hnj("TTAD.RFDM", "", th2);
            }
        }
        if (asVarOjm != null) {
            asVarOjm.hnj(asVarOjm.fr(), 7);
        }
        return asVarOjm;
    }

    public static void hnj(Intent intent, hnj hnjVar) {
        if (intent == null) {
            return;
        }
        hnjVar.eum.qor(intent.getBooleanExtra("video_is_cached", false));
        hnjVar.f13450cm = intent.getStringExtra("multi_process_listener_key");
        hnjVar.f13458ka = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void hnj(Bundle bundle, hnj hnjVar) {
        if (bundle == null) {
            return;
        }
        hnjVar.f13450cm = bundle.getString("multi_process_listener_key");
        hnjVar.eum.qor(bundle.getBoolean("video_is_cached", false));
        hnjVar.dzo = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            hnjVar.eum.hn(bundle.getLong("video_current", 0L));
        }
        hnjVar.hnj(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void hnj(hnj hnjVar, Bundle bundle, int i10) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i10);
            bundle.putString("multi_process_listener_key", hnjVar.f13450cm);
            bundle.putBoolean("video_is_cached", hnjVar.eum.ul());
            bundle.putLong("video_current", hnjVar.eum.orl());
            bundle.putBoolean("is_mute", hnjVar.dzo);
            bundle.putBoolean(SVWsZyNSAChGIA.UaMEIEDYh, hnjVar.izk);
        } catch (Throwable th2) {
            apu.hnj("TTAD.RFDM", "onSaveInstanceState: ", th2);
        }
    }

    public static void hnj(as asVar, Intent intent, Bundle bundle, int i10) {
        if (bundle == null || asVar == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i10);
            if (intent != null) {
                bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
            }
        } catch (Throwable th2) {
            apu.hnj("TTAD.RFDM", "onSaveInstanceState: ", th2);
        }
    }

    public static void hnj(Intent intent, Activity activity, boolean z10, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, String str) {
        int rotation;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e10) {
                apu.hnj("TTAD.RFDM", "", e10);
                rotation = 0;
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z10);
            hqh.hnj().sk();
            intent.putExtra("meta_index", hqh.hnj().hnj(hnjVar));
            intent.putExtra("single_process_listener_key", str);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z10);
        hqh.hnj().sk();
        intent.putExtra("meta_index", hqh.hnj().hnj(hnjVar));
        intent.putExtra("single_process_listener_key", str);
    }
}
